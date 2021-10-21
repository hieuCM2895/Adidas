package com.example.controller;

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

@WebServlet(urlPatterns = {"/search"})
public class SearchControl extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        String txtSearch = req.getParameter("txt");

        ProductService productService = new ProductService();
        List<Product> listOfProduct = productService.searchProductByName(txtSearch);

        CategoryService categoryService = new CategoryService();
        List<Category> listC = categoryService.findAllCategory();

        Product newProduct = productService.findNewProduct();

        req.setAttribute("listP", listOfProduct);
        req.setAttribute("listC", listC);
        req.setAttribute("last", newProduct);
        req.setAttribute("search", txtSearch);

        req.getRequestDispatcher("Home.jsp").forward(req, resp);

    }
}
