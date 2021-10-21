<%--
  Created by IntelliJ IDEA.
  User: caohieu
  Date: 17/10/2021
  Time: 19:21
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <!-- Favicon -->
    <link rel="shortcut icon" href="./images/favicon.ico" type="image/x-icon">

    <!-- Box icons -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css"/>

    <!-- Glidejs -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Glide.js/3.4.1/css/glide.core.css"/>
    <!-- Custom StyleSheet -->
    <link rel="stylesheet" href="../css/styles1.css"/>
<%--    <link rel="stylesheet" href="../css/styles.css"/>--%>
    <title>Boy’s T-Shirt - Codevo</title>

</head>

<body>
<!-- Navigation -->
<jsp:include page="/common/Navigation.jsp"></jsp:include>
<!-- Product Details -->
<section class="section product-detail">
    <div class="details container-md">
        <div class="left">
            <div class="main">
                <img src="${P.image}" alt="">
            </div>
        </div>
        <div class="right">
            <span><a style="cursor: pointer" onclick="history.back()"> <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-arrow-90deg-left" viewBox="0 0 16 16">
                <path fill-rule="evenodd" d="M1.146 4.854a.5.5 0 0 1 0-.708l4-4a.5.5 0 1 1 .708.708L2.707 4H12.5A2.5 2.5 0 0 1 15 6.5v8a.5.5 0 0 1-1 0v-8A1.5 1.5 0 0 0 12.5 5H2.707l3.147 3.146a.5.5 0 1 1-.708.708l-4-4z"/>
            </svg> Back </a></span>
            <span style="margin-left: 10px"><a href="/BanHang_war_exploded/home" style="cursor: pointer; text-decoration: underline"> Home</a></span>
            <span> / </span>
            <span><a href="/BanHang_war_exploded/home/paging" style="cursor: pointer; text-decoration: underline">Product</a></span>
            <h2 style="margin-bottom: 15px; margin-top: 10px">${P.name}</h2>
            <div class="price">${P.price} $</div>
            <form>
                <div>
                    <select>
                        <option value="Select Size" selected disabled>Select Size</option>
                        <option value="1">32</option>
                        <option value="2">42</option>
                        <option value="3">52</option>
                        <option value="4">62</option>
                    </select>
                    <span><i class='bx bx-chevron-down'></i></span>
                </div>
            </form>

            <form class="form">
                <input type="text" placeholder="1">
                <a href="/BanHang_war_exploded/home/cart?id=${P.id}" class="addCart">Add To Cart</a>
            </form>
            <h3>Product Detail</h3>
            <p>${P.title}</p>
        </div>
    </div>
</section>

<!-- Related -->
<section class="section featured">
    <div class="top container">
        <h1>Related Products</h1>
        <a href="/BanHang_war_exploded/home/paging" class="view-more">View more</a>
    </div>

    <div class="product-center container">
        <c:forEach items="${listP}" var="o">
        <div class="product">
            <div class="product-header">
                <img src="${o.image}" alt="">
                <ul class="icons">
                    <span><i class="bx bx-heart"></i></span>
                    <span><i class="bx bx-shopping-bag"></i></span>
                    <span><i class="bx bx-search"></i></span>
                </ul>
            </div>
            <div class="product-footer">
                <a href="/BanHang_war_exploded/home/detail?id=${o.id}"><h3>${o.name}</h3></a>
                <div class="rating">
                    <i class="bx bxs-star"></i>
                    <i class="bx bxs-star"></i>
                    <i class="bx bxs-star"></i>
                    <i class="bx bxs-star"></i>
                    <i class="bx bx-star"></i>
                </div>
                <h4 class="price">${o.price} $</h4>
            </div>
        </div>
        </c:forEach>
    </div>
</section>

<!-- Footer -->
<jsp:include page="/common/Footer.jsp"></jsp:include>
<!-- End Footer -->

<!-- GSAP -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/3.5.1/gsap.min.js"></script>
<!-- Custom Script -->
<script src="../js/index.js"></script>
</body>

</html>
