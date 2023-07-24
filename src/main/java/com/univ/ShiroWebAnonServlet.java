package com.univ;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author univ
 * date 2023/7/24
 */
@WebServlet(name ="shiro-web-anon", urlPatterns = {"/anon"})
public class ShiroWebAnonServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("ShiroWebAnonServlet");
    }

}
