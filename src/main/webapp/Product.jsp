<%--
  Created by IntelliJ IDEA.
  User: caohieu
  Date: 17/10/2021
  Time: 13:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
    <link rel="stylesheet" href="../css/styles.css" />
    <title>Boy’s T-Shirt</title>
</head>

<body>
<!-- Navigation -->
<jsp:include page="common/Navigation.jsp"></jsp:include>

<!-- All Products -->
<section class="section all-products" id="products">
    <div class="top container">
        <h1>All Products</h1>
        <form>
            <select onchange="location = this.value;">
                <option value="1">Defualt Sorting</option>
                <option value="2">Sort By Price</option>
                <c:forEach items="${listC}" var="i">
                    <option name="id" value="../home/category?cid=${i.id}&id=1" ${i.id == cid ? "selected" : ""}>${i.name}</option>
                </c:forEach>
            </select>
            <span><i class='bx bx-chevron-down'></i></span>
        </form>
    </div>

    <div class="product-center container">
        <c:forEach items="${listP}" var="o">
        <div class="product">
            <div class="product-header">
                <img src="${o.image}" alt="">
                <ul class="icons">
                    <span><i class="bx bx-heart"></i></span>
                    <a href="cart.html"> <span><i class="bx bx-shopping-bag"></i></span>
                    </a>
                    <span><i class="bx bx-search"></i></span>
                </ul>
            </div>
            <div class="product-footer">
                <a href="../home/detail?id=${o.id}">
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

<section class="pagination">
    <div class=" container">
        <c:if test="${cid == null}">
        <a href="../home/paging?id=${tag > 1 ? (tag - 1) : tag}"><span><i class="bx bx-left-arrow-alt"></i></span></a>
        </c:if>
        <c:if test="${cid != null}">
            <a href="../home/category?cid=${cid}&id=${tag > 1 ? (tag - 1) : tag}"><span><i class="bx bx-left-arrow-alt"></i></span></a>
        </c:if>
        <c:forEach begin="1" end="${numberPage}" var="i">
            <a href="../home/paging?id=${i}"><span style=" ${tag == i ? "background: rgb(39, 179, 235); color: white;" : ""}">${i}</span></a>
        </c:forEach>
        <c:if test="${cid == null}">
        <a href="../home/paging?id=${tag < numberPage ? (tag + 1) : tag}"><span><i class="bx bx-right-arrow-alt"></i></span></a>
        </c:if>
        <c:if test="${cid != null}">
            <a href="../home/category?cid=${cid}&id=${tag < numberPage ? (tag + 1) : tag}"><span><i class="bx bx-right-arrow-alt"></i></span></a>
        </c:if>
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
