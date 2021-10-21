package com.example.controller;

import com.example.model.Account;
import com.example.model.Product;
import com.example.service.CategoryService;
import com.example.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = {"/manager/add"})
public class AddProductControl extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String image = req.getParameter("image");
        String price = req.getParameter("price");
        String title = req.getParameter("title");
        String description = req.getParameter("description");
        String category = req.getParameter("category");

        HttpSession session = req.getSession();
        Account account = (Account) session.getAttribute("acc");

        CategoryService categoryService = new CategoryService();
        ProductService productService = new ProductService();

        Product product = new Product();
        product.setName(name);
        product.setTitle(title);
        product.setPrice(Double.parseDouble(price));
        product.setDescription(description);
        product.setImage(image);
        product.setAccount(account);
        product.setCategory(categoryService.findCategoryById(Integer.parseInt(category)));

        productService.addNewProduct(product);

        String tag = req.getParameter("tag");
        req.getRequestDispatcher("paging?id=" + tag).forward(req, resp);

    }
}
