package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author:WangQinhua
 * @Date: 2020/8/16 21:51
 */
@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        List<Items> items = itemsService.findItems();
        model.addAttribute("items", items);
        return "items";
    }
}
