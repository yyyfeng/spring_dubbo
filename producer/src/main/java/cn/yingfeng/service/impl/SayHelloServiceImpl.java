package cn.yingfeng.service.impl;

import cn.yingfeng.service.SayHelloService;
import org.springframework.stereotype.Component;

@Component("sayHelloService")
public class SayHelloServiceImpl implements SayHelloService {
    public String sayHello(String str) {
        return "test:"+str;
    }
}
