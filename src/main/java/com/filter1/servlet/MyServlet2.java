/**
 *
 * @author : liuxiaoqiang
 * @date   :Mar 11, 2016 6:17:42 PM 
 * @version 1.0 
 *
 */
package com.filter1.servlet;

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/**
 * Servlet
 *
 * @author   单红宇(365384722)
 * @myblog  http://blog.csdn.net/catoop/
 * @create    2016年1月6日
 */
@WebServlet(urlPatterns="/xs/myservlet", description="Servlet的说明") // 不指定name的情况下，name默认值为类全路径，即org.springboot.sample.servlet.MyServlet2
public class MyServlet2 extends HttpServlet{
 
    private static final long serialVersionUID = -8685285401859800066L;
 
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(">>>>>>>>>>doGet2()<<<<<<<<<<<");
        doPost(req, resp);
    }
 
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(">>>>>>>>>>doPost2()<<<<<<<<<<<");
        resp.setContentType("text/html");  
        PrintWriter out = resp.getWriter();  
        out.println("");
        out.println("");
        out.println("");
        out.println("");
        out.println("");
        out.println("大家好，我的名字叫Servlet2");
        out.println("");
        out.println("");
        }
    }
