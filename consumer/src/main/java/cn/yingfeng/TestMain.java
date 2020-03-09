package cn.yingfeng;

import cn.yingfeng.service.SayHelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    private static final Logger logger = LoggerFactory.getLogger(TestMain.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"applicationContext-consumer.xml"});
        SayHelloService sayHelloService = context.getBean("sayHelloService", SayHelloService.class);
//        System.out.println(sayHelloService.sayHello("hello"));
        logger.error(sayHelloService.sayHello("英等"));
    }
}
