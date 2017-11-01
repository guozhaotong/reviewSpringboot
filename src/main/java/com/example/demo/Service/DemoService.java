package com.example.demo.Service;

import com.example.demo.Entity.Demo;
import com.example.demo.Repository.DemoDao;
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

    @Resource
    private DemoDao demoDao;

    public void save(Demo demo){
        demoRepository.save(demo);
    }

    public Demo getById(long id){
        //demoRepository.findOne(id);//在demoRepository可以直接使用findOne进行获取.
        return demoDao.getById(id);
    }
}
