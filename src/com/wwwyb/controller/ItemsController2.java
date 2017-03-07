package com.wwwyb.controller;

import com.wwwyb.po.Items;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wu on 17-3-3.
 */
public class ItemsController2 implements HttpRequestHandler {
    @Override
    public void handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
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
        httpServletRequest.setAttribute("itemsList",itemsList);
        httpServletRequest.getRequestDispatcher("WEB-INF/jsp/ItemsList.jsp").forward(httpServletRequest,httpServletResponse);
    }
}
