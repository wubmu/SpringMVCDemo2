package com.wwwyb.controller;

import com.wwwyb.po.Items;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wu on 17-3-3.
 */
@org.springframework.stereotype.Controller

public class ItemsController1 implements Controller {
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        //调用service查询数据库 查询商品列表，这里使用静态数据
        List<Items> itemsList=new ArrayList<Items>();
        //向List中填充静态数据
        Items item1=new Items();
        item1.setName("联想");
        item1.setPrice(5000f);
        item1.setDetail("不行");
        
        Items item2=new Items();
        item2.setName("苹果");
        item1.setPrice(10000f);
        item1.setDetail("太贵");

        itemsList.add(item1);
        itemsList.add(item2);
        //返回ModelAndView
        ModelAndView modelAndView=new ModelAndView();
        //相当于requset的setAttribut,在JSP通过itemsList取数据
        modelAndView.addObject("itmeslist",itemsList);
        //指定视图
        modelAndView.setViewName("WEB-INF/jsp/ItemsList.jsp");
        return modelAndView;
    }
}
