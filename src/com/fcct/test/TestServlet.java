package com.fcct.test;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @Author ：风吹长亭
 * @Date ：Created in 2020/11/24 14:21
 * @Description ：
 */
@WebServlet(name = "TestServlet", urlPatterns = "/docker")
public class TestServlet extends javax.servlet.http.HttpServlet {

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.getWriter().println("<h1>hello docker!" + "</h1>");
    }
}
