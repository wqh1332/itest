package com.itheima.test;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author:WangQinhua
 * @Date: 2020/8/16 20:20
 */
public class TestService {
    @Test
    public void test01() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:application-service.xml");
        ItemsService bean = classPathXmlApplicationContext.getBean(ItemsService.class);
        List<Items> items = bean.findItems();
        System.out.println(items);
        System.out.println(items);
        System.out.println(items);
    }

    public static void main(String[] args) {
        System.out.println("hello world");
    }
}
