package com.example.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = {"/cart"})
public class CartProductControl extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");
        String productId = req.getParameter("id");
        Cookie arr[] = req.getCookies();
        String txt = "";
        for (Cookie o : arr) {
            if (o.getName().equals("id")) {
                txt = txt + o.getValue();
                o.setMaxAge(0);
                resp.addCookie(o);
            }
        }
        if (txt.isEmpty()) {
            txt = productId;
        } else {
            txt = txt + "-" + productId;
        }
        Cookie c = new Cookie("id", txt);
        c.setMaxAge(60 * 60 * 24);
        resp.addCookie(c);
        resp.sendRedirect("print");

    }

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        resp.setCharacterEncoding("UTF-8");
//        req.setCharacterEncoding("UTF-8");
//        String productId = req.getParameter("id");
//        HttpSession session = req.getSession();
//
//        List<BillProduct> listB = (List<BillProduct>) session.getAttribute("list");
//        ProductService productService = new ProductService();
//        Product product = productService.findProductById(Integer.parseInt(productId));
//
//        if (listB == null) {
//            listB = new ArrayList<>();
//            BillProduct billProduct = new BillProduct();
//            billProduct.setProduct(product);
//            billProduct.setUnitPrice(product.getPrice());
//            billProduct.setQuantity(1);
//            listB.add(billProduct);
//        } else {
//            int count = 0;
//            for (BillProduct billProduct : listB) {
//                if (billProduct.getProduct() == product) {
//                    billProduct.setQuantity(billProduct.getQuantity() + 1);
//                    count++;
//                }
//            }
//            if (count == 0) {
//                BillProduct billProduct = new BillProduct();
//                billProduct.setProduct(product);
//                billProduct.setQuantity(1);
//                billProduct.setUnitPrice(product.getPrice());
//                listB.add(billProduct);
//            }
//        }
//        session.setAttribute("list", listB);
//        resp.sendRedirect("print");
//
//    }

}
