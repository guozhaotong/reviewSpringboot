package com.example.demo;

import com.example.demo.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	HelloService helloService;


	@Test
	public void contextLoads() {
		System.out.println(111);
	}

	@Test
	public void test1(){
		System.out.println(helloService.getName());
	}

}
