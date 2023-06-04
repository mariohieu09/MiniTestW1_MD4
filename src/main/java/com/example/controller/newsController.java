package com.example.controller;

import com.example.model.news;
import com.example.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/news")
public class newsController {
    @Autowired
    private INewsService newsService;

    @GetMapping("")
    public String home(Model model){
        List<news> list = newsService.getAll();
        model.addAttribute("list", list);
        return "/home";
    }
    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable int id, Model md){
        md.addAttribute("news",newsService.viewNews(id));
        return "/edit";

    }
    @PostMapping("/update")
    public String update(news news){
        news.setCreate_date(LocalDate.now());
        newsService.updateNews(news.getId(), news);
        return "redirect:/news";
    }
    @GetMapping("/create")
    public String showCreateForm(Model model){
        model.addAttribute("news", new news());
        return "/create";
    }
    @PostMapping("/save")
    public String save(news news){
        news.setCreate_date(LocalDate.now());
        news.setId((int)(Math.random() * 1000));
        newsService.insertNews(news);
        return "redirect:/news";
    }
    @GetMapping("/{id}/delete")
    public String showDeleteForm(@PathVariable int id, Model md){
        md.addAttribute("popo", newsService.viewNews(id));
        return "/delete";
    }
    @PostMapping("/remove")
    public String removeNews(news news){
        newsService.deleteNews(news.getId());
        return "redirect:/news";
    }
    @GetMapping("/{id}/view")
    public String viewNews(@PathVariable int id ,Model md){
        md.addAttribute("news", newsService.viewNews(id));
        return "/view";
    }
}
