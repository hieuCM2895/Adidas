<%--
  Created by IntelliJ IDEA.
  User: caohieu
  Date: 17/10/2021
  Time: 09:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <!-- Favicon -->
    <link rel="shortcut icon" href="./images/favicon.ico" type="image/x-icon">
    <!-- Box icons -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css" />

    <!-- Custom StyleSheet -->
    <link rel="stylesheet" href="./css/styles.css" />
    <title>Codevo - Ecommerce Website</title>
</head>

<body>
<!-- Header -->
<header id="home" class="header">
    <!-- Navigation -->
    <jsp:include page="common/Navigation.jsp"></jsp:include>

    <!-- Hero -->
    <img src="./images/4.png" alt="" class="hero-img" />

    <div class="hero-content">
        <h2><span class="discount">70% </span> SALE OFF</h2>
        <h1>
            <span>Summer Vibes</span>
            <span>mode on</span>
        </h1>
        <a class="btn" href="#">shop now</a>
    </div>
</header>

<!-- Main -->
<main>
    <section class="advert section">
        <div class="advert-center container">
            <div class="advert-box">
                <div class="dotted">
                    <div class="content">
                        <h2>
                            Girls <br />
                            Clothing
                        </h2>
                        <h4>Worlds Best Brands</h4>
                    </div>
                </div>
                <img src="./images/advert1.png" alt="">
            </div>

            <div class="advert-box">
                <div class="dotted">
                    <div class="content">
                        <h2>
                            Summer <br />
                            Clothing
                        </h2>
                        <h4>Worlds Best Brands</h4>
                    </div>
                </div>
                <img src="./images/advert2.png" alt="">
            </div>

            <div class="advert-box">
                <div class="dotted">
                    <div class="content">
                        <h2>
                            Boys <br />
                            Clothing
                        </h2>
                        <h4>Worlds Best Brands</h4>
                    </div>
                </div>
                <img src="./images/advert3.png" alt="">
            </div>
        </div>
    </section>

    <!-- Featured -->
    <section class="section featured">
        <div class="title">
            <h1>Featured Products</h1>
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
                    <a href="/BanHang_war_exploded/home/detail?id=${o.id}">
                        <h3>${o.name}</h3>
                    </a>
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

    <!--Latest -->
    <section class="section featured">
        <div class="title">
            <h1>Latest Products</h1>
        </div>

        <div class="product-center container">
            <c:forEach items="${listL}" var="o">
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
                        <a href="/BanHang_war_exploded/home/detail?id=${o.id}">
                            <h3>${o.name}</h3>
                        </a>
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

    <!-- Product Banner -->
    <section class="section">
        <div class="product-banner">
            <div class="left">
                <img src="./images/messi.png" alt="" />
            </div>
            <div class="right">
                <img src="./images/sport.jpeg" alt="" />
            </div>
        </div>
    </section>

    <!-- Testimonials -->
    <section class="section">
        <div class="testimonial-center container">
            <div class="testimonial">
                <span>&ldquo;</span>
                <p>
                    Lorem ipsum dolor sit, amet consectetur adipisicing elit. Debitis,
                    fugiat labore. Veritatis et omnis consequatur.
                </p>
                <div class="rating">
                    <i class="bx bxs-star"></i>
                    <i class="bx bxs-star"></i>
                    <i class="bx bxs-star"></i>
                    <i class="bx bxs-star"></i>
                    <i class="bx bx-star"></i>
                </div>
                <div class="img-cover">
                    <img src="./images/profile1.jpg" alt="" />
                </div>
                <h4>Will Smith</h4>
            </div>
            <div class="testimonial">
                <span>&ldquo;</span>
                <p>
                    Lorem ipsum dolor sit, amet consectetur adipisicing elit. Debitis,
                    fugiat labore. Veritatis et omnis consequatur.
                </p>
                <div class="rating">
                    <i class="bx bxs-star"></i>
                    <i class="bx bxs-star"></i>
                    <i class="bx bxs-star"></i>
                    <i class="bx bxs-star"></i>
                    <i class="bx bx-star"></i>
                </div>
                <div class="img-cover">
                    <img src="images/profile2.jpg" alt="" />
                </div>
                <h4>Will Smith</h4>
            </div>
            <div class="testimonial">
                <span>&ldquo;</span>
                <p>
                    Lorem ipsum dolor sit, amet consectetur adipisicing elit. Debitis,
                    fugiat labore. Veritatis et omnis consequatur.
                </p>
                <div class="rating">
                    <i class="bx bxs-star"></i>
                    <i class="bx bxs-star"></i>
                    <i class="bx bxs-star"></i>
                    <i class="bx bxs-star"></i>
                    <i class="bx bx-star"></i>
                </div>
                <div class="img-cover">
                    <img src="./images/profile3.jpg" alt="" />
                </div>
                <h4>Will Smith</h4>
            </div>
        </div>
    </section>

    <!-- Brands -->
    <section class="section">
        <div class="brands-center container">
            <div class="brand">
                <img src="./images/brand1.png" alt="" />
            </div>
            <div class="brand">
                <img src="./images/brand2.png" alt="" />
            </div>
            <div class="brand">
                <img src="./images/brand1.png" alt="" />
            </div>
            <div class="brand">
                <img src="./images/brand2.png" alt="" />
            </div>
            <div class="brand">
                <img src="./images/brand1.png" alt="" />
            </div>
            <div class="brand">
                <img src="./images/brand2.png" alt="" />
            </div>
        </div>
    </section>
</main>

<!-- Footer -->
<jsp:include page="/common/Footer.jsp"></jsp:include>
<!-- End Footer -->

<!-- GSAP -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/3.5.1/gsap.min.js"></script>
<!-- Custom Script -->
<script src="./js/index.js"></script>
</body>

</html>
