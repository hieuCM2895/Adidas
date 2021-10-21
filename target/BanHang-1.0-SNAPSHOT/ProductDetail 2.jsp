<%--
  Created by IntelliJ IDEA.
  User: caohieu
  Date: 17/10/2021
  Time: 19:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <link rel="stylesheet" href="./css/styles.css"/>
    <title>Boy’s T-Shirt - Codevo</title>
</head>

<body>
<!-- Navigation -->
<jsp:include page="common/Navigation.jsp"></jsp:include>
<!-- Product Details -->
<section class="section product-detail">
    <div class="details container-md">
        <div class="left">
            <div class="main">
                <img src="./images/pic1.jpg" alt="">
            </div>
        </div>
        <div class="right">
            <span>Home/T-shirt</span>
            <h1>Boy’s T-Shirt By Handsome</h1>
            <div class="price">$50</div>
            <form>
                <div>
                    <select>
                        <option value="Select Size" selected disabled>Select Size</option>
                        <option value="1">32</option>
                        <option value="2">37</option>
                        <option value="3">42</option>
                        <option value="4">44</option>
                    </select>
                    <span><i class='bx bx-chevron-down'></i></span>
                </div>
            </form>

            <form class="form">
                <input type="text" placeholder="1">
                <a href="cart.html" class="addCart">Add To Cart</a>
            </form>
            <h3>Product Detail</h3>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Vero minima delectus nulla voluptates nesciunt
                quidem laudantium, quisquam voluptas facilis dicta in explicabo, laboriosam ipsam suscipit!</p>
        </div>
    </div>
</section>

<!-- Related -->
<section class="section featured">
    <div class="top container">
        <h1>Related Products</h1>
        <a href="#" class="view-more">View more</a>
    </div>

    <div class="product-center container">
        <div class="product">
            <div class="product-header">
                <img src="./images/pic1.jpg" alt="">
                <ul class="icons">
                    <span><i class="bx bx-heart"></i></span>
                    <span><i class="bx bx-shopping-bag"></i></span>
                    <span><i class="bx bx-search"></i></span>
                </ul>
            </div>
            <div class="product-footer">
                <a href="#"><h3>Boy’s T-Shirt</h3></a>
                <div class="rating">
                    <i class="bx bxs-star"></i>
                    <i class="bx bxs-star"></i>
                    <i class="bx bxs-star"></i>
                    <i class="bx bxs-star"></i>
                    <i class="bx bx-star"></i>
                </div>
                <h4 class="price">$50</h4>
            </div>
        </div>
        <div class="product">
            <div class="product-header">
                <img src="./images/pic2.jpg" alt="">

                <ul class="icons">
                    <span><i class="bx bx-heart"></i></span>
                    <span><i class="bx bx-shopping-bag"></i></span>
                    <span><i class="bx bx-search"></i></span>
                </ul>
            </div>
            <div class="product-footer">
                <a href="#"><h3>Boy’s T-Shirt</h3></a>
                <div class="rating">
                    <i class="bx bxs-star"></i>
                    <i class="bx bxs-star"></i>
                    <i class="bx bxs-star"></i>
                    <i class="bx bxs-star"></i>
                    <i class="bx bx-star"></i>
                </div>
                <h4 class="price">$50</h4>
            </div>
        </div>
        <div class="product">
            <div class="product-header">
                <img src="./images/pic3.jpg" alt="">

                <ul class="icons">
                    <span><i class="bx bx-heart"></i></span>
                    <span><i class="bx bx-shopping-bag"></i></span>
                    <span><i class="bx bx-search"></i></span>
                </ul>
            </div>
            <div class="product-footer">
                <a href="#"><h3>Boy’s T-Shirt</h3></a>
                <div class="rating">
                    <i class="bx bxs-star"></i>
                    <i class="bx bxs-star"></i>
                    <i class="bx bxs-star"></i>
                    <i class="bx bxs-star"></i>
                    <i class="bx bx-star"></i>
                </div>
                <h4 class="price">$50</h4>
            </div>
        </div>
        <div class="product">
            <div class="product-header">
                <img src="./images/pic4.jpg" alt="">

                <ul class="icons">
                    <span><i class="bx bx-heart"></i></span>
                    <span><i class="bx bx-shopping-bag"></i></span>
                    <span><i class="bx bx-search"></i></span>
                </ul>
            </div>
            <div class="product-footer">
                <a href="#"><h3>Boy’s T-Shirt</h3></a>
                <div class="rating">
                    <i class="bx bxs-star"></i>
                    <i class="bx bxs-star"></i>
                    <i class="bx bxs-star"></i>
                    <i class="bx bxs-star"></i>
                    <i class="bx bx-star"></i>
                </div>
                <h4 class="price">$50</h4>
            </div>
        </div>
    </div>
</section>

<!-- Footer -->
<jsp:include page="/common/Footer.jsp"></jsp:include>
<!-- End Footer -->

<!-- GSAP -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/3.5.1/gsap.min.js"></script>
<!-- Custom Script -->
<script src="./js/index.js"></script>
</body>

</html>
