package com.example.demo.repository;

import com.example.demo.entity.Demo;
import org.springframework.data.repository.CrudRepository;

/**
 * @author 郭朝彤
 * @date 2017/10/31.
 */
public interface DemoRepository extends CrudRepository<Demo,Long> {

}