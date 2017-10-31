package com.example.demo.Service;

import com.example.demo.Entity.Demo;
import com.example.demo.Repository.DemoRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * @author 郭朝彤
 * @date 2017/10/31.
 */
@Service
public class DemoService {
    @Resource
    private DemoRepository demoRepository;

    @Transactional
    public void save(Demo demo){
        demoRepository.save(demo);
    }
}
