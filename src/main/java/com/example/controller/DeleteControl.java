package com.example.controller;

import com.example.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/manager/delete")
public class DeleteControl extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String deleteId = req.getParameter("pid");
        ProductService productService = new ProductService();
        boolean result = productService.deleteProductById(Integer.parseInt(deleteId));
        String tag = req.getParameter("tag");
        if (result) {
            req.getRequestDispatcher("paging?id=" + tag).forward(req, resp);
        }

    }
}
