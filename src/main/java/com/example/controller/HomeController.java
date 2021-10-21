package com.example.controller;

import com.example.model.Category;
import com.example.model.Product;
import com.example.service.CategoryService;
import com.example.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/product")
public class HomeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ProductService productService = new ProductService();
        List<Product> listP = productService.findAllProduct();

        CategoryService categoryService = new CategoryService();
        List<Category> listC = categoryService.findAllCategory();

        Product newProduct = productService.findNewProduct();

        Cookie arr[] = req.getCookies();
        int amount = 0;
        for (Cookie o : arr) {
            if (o.getName().equals("id")) {
                String[] txt = o.getValue().split("-");
                for (String s : txt) {
                    if (!s.equals("")) {
                        amount++;
                    }
                }
            }
        }

        req.setAttribute("listP", listP);
        req.setAttribute("listC", listC);
        req.setAttribute("last", newProduct);
        req.setAttribute("amount", amount);
        // 404 đường dẫn url
        // 500 lỗi jsp

        req.getRequestDispatcher("Home.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
