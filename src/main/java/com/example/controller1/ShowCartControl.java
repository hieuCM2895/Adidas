package com.example.controller1;

import com.example.model.Product;
import com.example.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@WebServlet(urlPatterns = {"/home/print"})
public class ShowCartControl extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        Cookie arr[] = req.getCookies();
        List<Product> list = new ArrayList<>();

        ProductService productService = new ProductService();
        for (Cookie o : arr) {
            if (o.getName().equals("cart")) {
                String txt[] = o.getValue().split("-");
                Set<Integer> listNumber = new HashSet<>();
                for (String s : txt) {
                    if (s.equals("")) {
                        continue;
                    }
                    if (!listNumber.contains(Integer.parseInt(s))) {
                        listNumber.add(Integer.parseInt(s));
                        list.add(productService.findProductById(Integer.parseInt(s)));
                    } else {
                        for (Product listP : list) {
                            if (listP.getId() == Integer.parseInt(s)) {
                                listP.setAmount(listP.getAmount() + 1);
                            }
                        }
                    }
                }
            }
        }

        double total = 0;
        for (Product o : list) {
            total = total + o.getAmount() * o.getPrice();
        }

        req.setAttribute("list", list);
        req.setAttribute("total", total);
        req.setAttribute("tax", 0.1 * total);
        req.setAttribute("sum", (long) 1.1 * total);
        req.getRequestDispatcher("/CartProduct.jsp").forward(req, resp);

    }

}
