package com.example.controller1;

import com.example.model.Product;
import com.example.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/home"})
public class HomePageControl extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ProductService productService = new ProductService();
        List<Product> listP = productService.searchProductByAmount(3);

        List<Product> listL = productService.searchLastProductByAmount(6);

        req.setAttribute("listP", listP);
        req.setAttribute("listL", listL);

        req.getRequestDispatcher("HomePage.jsp").forward(req, resp);

    }
}
