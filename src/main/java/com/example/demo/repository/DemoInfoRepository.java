package com.example.demo.repository;

import com.example.demo.entity.DemoInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * @author 郭朝彤
 * @date 2017/11/8.
 */
public interface DemoInfoRepository extends CrudRepository<DemoInfo,Long> {
}
