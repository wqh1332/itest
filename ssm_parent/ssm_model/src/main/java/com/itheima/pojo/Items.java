package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author:WangQinhua
 * @Date: 2020/8/16 18:11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Items {
    private Integer id;
    private String name;
    private Float price;
    private String pic;
    private Date createtime;
    private String detail;
}
