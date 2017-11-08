package com.example.demo;

import com.example.demo.entity.Card;
import com.example.demo.entity.User;
import com.example.demo.repository.CareRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.HelloService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CareRepository careRepository;

    @Test
    public void test()  {

        // 创建测试数据
        careRepository.save(new Card(1, "aaabbbccc"));

        //保存
        Card care1 = new Card();
        care1.setCardId(1);
        userRepository.save(new User("Test1", 20, care1));

        //正向取数
        User user = userRepository.findByName("Test1");
        Card card = user.getCard();
        Assert.assertEquals("aaabbbccc", card.getCardNumber());

        //反向取数
        Card care = careRepository.findByCardNumber("aaabbbccc");
        User user_Temp = care.getUser();
        Assert.assertEquals("Test1", user_Temp.getName());

    }

}
