package com.example.controller1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/home/cart"})
public class CartProductControl extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");
        String productId = req.getParameter("id");
        Cookie arr[] = req.getCookies();
        String txt = "";
        for (Cookie o : arr) {
            if (o.getName().equals("cart")) {
                txt = txt + o.getValue();
                o.setMaxAge(0);
                resp.addCookie(o);
            }
        }
        if (txt.isEmpty()) {
            txt = productId;
        } else {
            txt = txt + "-" + productId;
        }
        Cookie c = new Cookie("cart", txt);
        c.setMaxAge(60 * 60 * 24);
        resp.addCookie(c);
        resp.sendRedirect("print");

    }
}
