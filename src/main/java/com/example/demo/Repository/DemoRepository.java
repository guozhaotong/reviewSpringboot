package com.example.demo.Repository;

import com.example.demo.Entity.Demo;
import org.springframework.data.repository.CrudRepository;

/**
 * @author 郭朝彤
 * @date 2017/10/31.
 */
public interface DemoRepository extends CrudRepository<Demo,Long> {

}