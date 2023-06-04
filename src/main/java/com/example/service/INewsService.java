package com.example.service;

import com.example.model.news;

import java.util.List;

public interface INewsService {
  void insertNews(news n );
    news viewNews(int id);
    List<news> getAll();
    void updateNews(int id, news n);
    void deleteNews(int id);
}
