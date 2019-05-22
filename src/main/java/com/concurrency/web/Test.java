package com.concurrency.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: hxy
 * @Date:2019/5/21 17:57
 * @Description: 测试
 */
@RestController
@RequestMapping("test")
public class Test {
    @RequestMapping(value = "/test")
    public String test(){
        return "test";
    }
}
