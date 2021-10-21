package com.example.controller1;

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

@WebServlet(urlPatterns = {"/home/detail"})
public class DetailProductControl extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int productId = Integer.parseInt(req.getParameter("id"));

        ProductService productService = new ProductService();
        Product product = productService.findProductById(productId);

        int categoryId = (int) productService.findCategoryIdByProductId(productId);
        List<Product> listP = productService.searchProductByCategoryId(categoryId,
                1,3);

        req.setAttribute("P", product);
        req.setAttribute("listP", listP);

        req.getRequestDispatcher("../ProductDetail.jsp").forward(req, resp);

    }
}
