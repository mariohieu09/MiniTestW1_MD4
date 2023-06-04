package com.example.model;

import com.example.service.INewsService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class newsService implements INewsService {
    private static Map<Integer, news> list= new HashMap<Integer, news>();
    static {
        list.put(1, new news(1, "HaNoiMoi", "Hà Nội - Thành phố của các ngọn đồi và những kỷ vật lịch sử\n" +
                "\n" +
                "Hà Nội là thủ đô và là trung tâm chính trị, văn hóa và kinh tế của Việt Nam. Với một lịch sử lâu đời và những di sản văn hóa phong phú, Hà Nội là một trong những điểm đến hấp dẫn của du khách trong và ngoài nước.\n" +
                "\n" +
                "Thành phố này có nhiều điểm tham quan, nổi tiếng nhất trong số đó là Hồ Gươm, một hồ nước lớn giữa trung tâm thành phố. Hồ Gươm được xem là biểu tượng của Hà Nội, với những câu chuyện lịch sử và truyền thuyết liên quan đến nó. Đây cũng là nơi để người dân đến tập thể dục, thư giãn và thưởng thức cảnh quan đẹp.\n" +
                "\n" +
                "Ngoài ra, Hà Nội còn có nhiều di tích và kiến trúc lịch sử như Văn Miếu - Quốc Tử Giám, một ngôi đền thờ Confucius và các học giả, là nơi để tôn vinh các học giả và giáo sư của đất nước. Cung điện Hoàng Thành, nơi cư trú của các vị hoàng đế triều Nguyễn từ thế kỷ thứ 18 đến thế kỷ thứ 20, cũng là một điểm đến thú vị cho du khách.", LocalDate.of(2019, 5, 12)));
        list.put(2, new news(2, "HaNoiCu", "Ngoài ra, Hà Nội còn có nhiều sự kiện văn hóa và giải trí quan trọng như Festival Huế - Hà Nội, Lễ hội ánh sáng Hà Nội, Lễ hội hoa đào và Lễ hội mùa thu. Những sự kiện này thu hút đông đảo du khách đến tham gia và trải nghiệm văn hóa đặc trưng của thành phố.", LocalDate.of(2020, 3, 11)));
        list.put(3, new news(3, "HaNoiOi", "Tuy nhiên, thành phố Hà Nội cũng đang đối mặt với nhiều thách thức như ô nhiễm môi trường, tắc đường và tăng trưởng không bền vững. Do đó, các chính sách và biện pháp bảo vệ môi trường và phát triển bền vững cần được đưa ra để bảo vệ và phát triển thành phố.\n" +
                "\n" +
                "Trong kết luận, Hà Nội là một thành phố đầy sức hút và thu hút đông đảo du khách đến tham quan và trải nghiệm. Với các di sản văn hóa lâu đời, các điểm tham quan nổi tiếng và các đặc sản ẩm thực ngon miệng, Hà Nội là một điểm đến tuyệt vời cho du khách yêu thích văn hóa, lịch sử và ẩm thực. Tuy nhiên, thành phố còn đang đối mặt với nhiều thách thức và cần được đưa ra các biện pháp để bảo vệ và phát triển bền vững.", LocalDate.of(2021, 9, 20)));
        list.put(4, new news(4, "HnoiMoi", "Ngoài ra, Hà Nội còn có nhiều di tích và kiến trúc lịch sử như Văn Miếu - Quốc Tử Giám, một ngôi đền thờ Confucius và các học giả, là nơi để tôn vinh các học giả và giáo sư của đất nước. Cung điện Hoàng Thành, nơi cư trú của các vị hoàng đế triều Nguyễn từ thế kỷ thứ 18 đến thế kỷ thứ 20, cũng là một điểm đến thú vị cho du khách.", LocalDate.of(2022, 4, 9)));
        list.put(5, new news(5, "Bun Cha", "Rất tuyệt vời, chủ đề về Hà Nội là một chủ đề rất thú vị. Dưới đây là bài văn dài 1000 từ của tôi về thành phố Hà Nội.", LocalDate.now()));

    }
    @Override
    public void insertNews(news n) {
        list.put(n.getId(), n);
    }

    @Override
    public news viewNews(int id) {
        return list.get(id);
    }

    @Override
    public List<news> getAll() {
        return new ArrayList<>(list.values());
    }

    @Override
    public void updateNews(int id, news n) {
        list.put(id, n);
    }

    @Override
    public void deleteNews(int id) {
        list.remove(id);
    }
}
