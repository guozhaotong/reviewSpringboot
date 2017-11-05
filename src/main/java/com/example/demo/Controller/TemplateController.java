package com.example.demo.Controller;

/**
 * @author 郭朝彤
 * @date 2017/11/5.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class TemplateController {

    /**
     * 返回html模板.
     */
    @RequestMapping("/helloHtml")
    public String helloHtml(Model model) {
        model.addAttribute("hello", "fromTemplateController.helloHtml");
        return "/helloHtml";
    }

}