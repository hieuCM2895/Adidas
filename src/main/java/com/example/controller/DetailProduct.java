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

@WebServlet(urlPatterns = {"/detail"})
public class DetailProduct extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int productId = Integer.parseInt(req.getParameter("id"));

        ProductService productService = new ProductService();
        Product product = productService.findProductById(productId);

        CategoryService categoryService = new CategoryService();
        List<Category> listC = categoryService.findAllCategory();

        Category category = product.getCategory();
        int categoryId = category.getId();

        Product newProduct = productService.findNewProductByCategoryId(categoryId);

        req.setAttribute("p", product);
        req.setAttribute("listC", listC);
        req.setAttribute("tag", categoryId);
        req.setAttribute("last", newProduct);

        req.getRequestDispatcher("Detail.jsp").forward(req, resp);

    }
}
