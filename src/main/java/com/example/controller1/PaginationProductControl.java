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

@WebServlet(urlPatterns = {"/home/paging"})
public class PaginationProductControl extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ProductService productService = new ProductService();

        String currentNumberPage = req.getParameter("id");
        if (currentNumberPage == null) {
            currentNumberPage = "1";
        }

        List<Product> listP = productService.searchProductByAccountID(Integer.parseInt(currentNumberPage),9);
        long total = productService.getNumberPageByProduct();

        long countPage = total / 9;
        if (total % 9 != 0) {
            countPage++;
        }

        CategoryService categoryService = new CategoryService();
        List<Category> listC = categoryService.findAllCategory();

        req.setAttribute("listC", listC);
        req.setAttribute("listP", listP);
        req.setAttribute("tag", Integer.parseInt(currentNumberPage));
        req.setAttribute("numberPage", countPage);

        req.getRequestDispatcher("/Product.jsp").forward(req, resp);

    }
}
