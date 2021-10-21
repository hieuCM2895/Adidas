package com.example.controller;

import com.example.model.Account;
import com.example.model.Category;
import com.example.model.Product;
import com.example.service.CategoryService;
import com.example.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/manager/loadProduct"})
public class LoadProductControl extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("pid");
        String page = req.getParameter("page");

        ProductService productService = new ProductService();
        Product product = productService.findProductById(Integer.parseInt(id));

        CategoryService categoryService = new CategoryService();
        List<Category> listC = categoryService.findAllCategory();

        req.setAttribute("P", product);
        req.setAttribute("C", listC);
        req.setAttribute("page", Integer.parseInt(page));
        req.setAttribute("Cid", product.getCategory().getId());

        req.getRequestDispatcher("/WEB-INF/EditProduct.jsp").forward(req, resp);

    }

}
