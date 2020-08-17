package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author:WangQinhua
 * @Date: 2020/8/16 19:37
 */
public class TestDao {
    @Test
    public void test01() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:application-mybatis.xml");
        ItemsDao itemsDao = (ItemsDao) classPathXmlApplicationContext.getBean(ItemsDao.class);
        List<Items> itmes = itemsDao.findItmes();
        System.out.println(itmes);

    }
}
