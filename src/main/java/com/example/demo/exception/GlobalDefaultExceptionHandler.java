package com.example.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 郭朝彤
 * @date 2017/10/31.
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public void defaultErrorHandler(HttpServletRequest req, Exception e) {
//      // If the exception is annotatedwith @ResponseStatusrethrow it and let
//      // the framework handle it -like the OrderNotFoundException example
//      // at the start of thispost.
//      // AnnotationUtils is aSpring Framework utility class.
//      if (AnnotationUtils.findAnnotation(e.getClass(),ResponseStatus.class) != null)
//          throw e;
//
//      // Otherwise setup and sendthe user to a default error-view.
//      ModelAndViewmav =new ModelAndView();
//     mav.addObject("exception", e);
//      mav.addObject("url",req.getRequestURL());
//     mav.setViewName(DEFAULT_ERROR_VIEW);
//      returnmav;

        //打印异常信息：
//        System.out.println(e.getCause().getMessage());
        e.printStackTrace();
        System.out.println("GlobalDefaultExceptionHandler.defaultErrorHandler()");

       /*
        *返回json数据或者String数据：
        *那么需要在方法上加上注解：@ResponseBody
        *添加return即可。
        */

       /*
        *返回视图：
        *定义一个ModelAndView即可，
        *然后return;
        *定义视图文件(比如：error.html,error.ftl,error.jsp);
        *
        */
    }

}
