<%--
  Created by IntelliJ IDEA.
  User: caohieu
  Date: 18/10/2021
  Time: 13:02
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
    <link rel="stylesheet" href="../css/styles.css" />
    <title>Your Cart</title>
</head>

<body>
<!-- Navigation -->
<jsp:include page="common/Navigation.jsp"></jsp:include>

<!-- Cart Items -->
<div class="container-md cart">
    <table>
        <tr>
            <th>Product</th>
            <th>Quantity</th>
            <th>Subtotal</th>
        </tr>
        <c:forEach items="${list}" var="o">
        <tr>
            <td>
                <div class="cart-info">
                    <img src="${o.image}" alt="">
                    <div>
                        <p>${o.name}</p>
                        <span>Price: ${o.price} $</span>
                        <br />
                        <form action="/BanHang_war_exploded/home/remove" method="post">
                            <button id="remove" name="id" value="${o.id}" type="submit">remove</button>
                        </form>
                    </div>
                </div>
            </td>
            <td id="center">
                <input onchange="changeAmount(${o.id}, value)" type="number" value="${o.amount}" min="1" />
            </td>
            <td>${o.price} $</td>
        </tr>
        </c:forEach>
    </table>

    <div class="total-price">
        <table>
            <tr>
                <td>Subtotal</td>
                <td>${total} $</td>
            </tr>
            <tr>
                <td>Tax</td>
                <td>${tax} $</td>
            </tr>
            <tr>
                <td>Total</td>
                <td>${sum} $</td>
            </tr>
        </table>
        <a href="../home/order" class="checkout btn">Proceed To Checkout</a>

    </div>

</div>

<!-- Footer -->
<jsp:include page="common/Footer.jsp"></jsp:include>
<!-- End Footer -->
<script type="text/javascript">

    function changeAmount(value1, value2) {
        window.location = "/BanHang_war_exploded/home/change?amount=" + value2 + "&id=" + value1;
    }

</script>
<!-- GSAP -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/3.5.1/gsap.min.js"></script>
<!-- Custom Script -->
<script src="../js/index.js"></script>

</body>

</html>
