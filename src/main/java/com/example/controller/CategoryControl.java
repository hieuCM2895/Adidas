package com.example.controller;

import com.example.model.Category;
import com.example.model.Product;
import com.example.service.CategoryService;
import com.example.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/category"})
public class CategoryControl extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String cateId = req.getParameter("id");

        if (cateId == null) {
            cateId = "1";
        }

        ProductService productService = new ProductService();
        List<Product> listOfProduct = productService.findListProductByCategoryID(Integer.parseInt(cateId));

        CategoryService categoryService = new CategoryService();
        List<Category> listC = categoryService.findAllCategory();

        Product newProduct = productService.findNewProductByCategoryId(Integer.parseInt(cateId));

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

        req.setAttribute("amount", amount);
        req.setAttribute("listP", listOfProduct);
        req.setAttribute("listC", listC);
        req.setAttribute("last", newProduct);
        req.setAttribute("tag", cateId);

        req.getRequestDispatcher("Home.jsp").forward(req, resp);

    }
}
