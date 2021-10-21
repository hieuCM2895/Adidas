package com.example.controller;

import com.example.dao.CategoryDAOImpl;
import com.example.dao.ProductDAOImpl;
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

@WebServlet(urlPatterns = {"/manager/edit"})
public class EditProductControl extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String image = req.getParameter("image");
        String price = req.getParameter("price");
        String title = req.getParameter("title");
        String description = req.getParameter("description");
        String category = req.getParameter("category");

        ProductService productService = new ProductService();

        CategoryDAOImpl categoryDAO = new CategoryDAOImpl();
        ProductDAOImpl productDAO = new ProductDAOImpl();

        Product product = productDAO.findById(Product.class, Integer.parseInt(id));
        product.setName(name);
        product.setTitle(title);
        product.setPrice(Double.parseDouble(price));
        product.setDescription(description);
        product.setImage(image);
        product.setCategory(categoryDAO.findById(Category.class, Integer.parseInt(category)));

        productService.updateProduct(product);

        String tag = req.getParameter("tag");
        req.getRequestDispatcher("paging?id=" + tag).forward(req, resp);

    }
}
