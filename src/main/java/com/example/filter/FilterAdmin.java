package com.example.filter;

import com.example.model.Account;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(urlPatterns = {"/manager/*"})
public class FilterAdmin implements javax.servlet.Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest rep = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        HttpSession session = rep.getSession();
        Object obj = session.getAttribute("acc");
        if (obj != null) {
            Account account = (Account) obj;
            if (account.getIsSell() == 1) {
                chain.doFilter(request, response);
            } else {
                resp.sendRedirect("product");
            }
        } else {
            resp.sendRedirect("product");
        }

    }

    @Override
    public void destroy() {
        javax.servlet.Filter.super.destroy();
    }
}
