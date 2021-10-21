package com.example.controller1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/home/change"})
public class AmountProductControl extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String amount = req.getParameter("amount");
        String productId = req.getParameter("id");

        if (Integer.parseInt(amount) <= 0) {
            amount = "1";
        }

        Cookie arr[] = req.getCookies();
        String result = "";

        for (Cookie o : arr) {
            if (o.getName().equals("cart")) {
                String txt[] = o.getValue().split("-");
                o.setMaxAge(0);
                resp.addCookie(o);
                int flag = 0;
                for (String s : txt) {
                    if (!s.equals(productId)) {
                        result += s + "-";
                    }
                    if (s.equals(productId) && flag == 0) {
                        flag++;
                        for (int i = 1; i <= Integer.parseInt(amount); i++) {
                            result = result + productId + "-" ;
                        }
                    }
                }
            }
        }

        Cookie c = new Cookie("cart", result);
        c.setMaxAge(60 * 60 * 24);
        resp.addCookie(c);
        resp.sendRedirect("print");

    }
}
