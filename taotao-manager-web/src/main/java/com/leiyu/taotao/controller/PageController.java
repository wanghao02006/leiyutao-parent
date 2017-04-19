package com.leiyu.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wh on 2017/4/19.
 */
@Controller
@RequestMapping("/")
public class PageController {

    @RequestMapping("")
    public String showIndex(){
        return "index";
    }

    @RequestMapping("{page}")
    public String showPages(@PathVariable String page){
        return page;
    }
}
