package com.lyk.wechart.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@Controller
public class HelloController {
    @ApiIgnore
    @ResponseBody
    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
    }
    @ApiIgnore
    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("host", "http://blog.didispace.com");
        return "index";
    }
}
