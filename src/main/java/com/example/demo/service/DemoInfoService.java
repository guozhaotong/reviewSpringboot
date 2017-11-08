package com.example.demo.service;

import com.example.demo.entity.DemoInfo;

/**
 * @author 郭朝彤
 * @date 2017/11/8.
 */
public interface DemoInfoService {

    public DemoInfo findById(long id);

    public void deleteFromCache(long id);

    void test();
}
