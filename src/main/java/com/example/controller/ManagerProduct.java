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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/manager/paging"})
public class ManagerProduct extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ProductService productService = new ProductService();

        HttpSession session = req.getSession();
        Account account = (Account) session.getAttribute("acc");

        String currentNumberPage = req.getParameter("id");
        if (currentNumberPage == null) {
            currentNumberPage = "1";
        }

        List<Product> listP = productService.searchProductByAccountID(account.getId(), Integer.parseInt(currentNumberPage), 5);
        long total = productService.getNumberPage(account.getId());

        long countPage = total / 5;
        if (total % 5 != 0) {
            countPage++;
        }

        CategoryService categoryService = new CategoryService();
        List<Category> listC = categoryService.findAllCategory();

        req.setAttribute("listC", listC);
        req.setAttribute("listP", listP);
        req.setAttribute("tag", Integer.parseInt(currentNumberPage));
        req.setAttribute("numberPage", countPage);
        req.setAttribute("total", total);

        req.getRequestDispatcher("/WEB-INF/ManagerProduct.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
