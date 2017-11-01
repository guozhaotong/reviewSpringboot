package com.example.demo.Repository;

import com.example.demo.Entity.Demo;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author 郭朝彤
 * @date 2017/11/1.
 */
@Repository
public class DemoDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    /**
     *通过id获取demo对象.
     *@param id
     *@return
     */
    public Demo getById(long id){
        String sql = "select *from Demo where id=?";
        RowMapper<Demo> rowMapper = new BeanPropertyRowMapper<Demo>(Demo.class);
        return jdbcTemplate.queryForObject(sql,rowMapper,id);
    }
}
