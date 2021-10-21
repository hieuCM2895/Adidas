package com.example.controller;

import com.example.model.Account;
import com.example.service.AccountService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = {"/login"})
public class LoginControl extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("user");
        String password = req.getParameter("pass");

        AccountService accountService = new AccountService();
        Account account = accountService.loginByUserAndPassword(username, password);

        if (account != null) {
            HttpSession session = req.getSession();
            session.setAttribute("acc", account);
            resp.sendRedirect("product");
        } else {
            req.setAttribute("mess", "Invalid UserName or Password");
            req.getRequestDispatcher("Login.jsp").forward(req, resp);
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("Login.jsp").forward(req, resp);
    }
}
