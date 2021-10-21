<%--
  Created by IntelliJ IDEA.
  User: caohieu
  Date: 14/10/2021
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="col-sm-3">
    <div class="card bg-light mb-3">
        <div class="card-header bg-primary text-white text-uppercase"><i class="fa fa-list"></i> Categories
        </div>
        <ul class="list-group category_block">
            <form action="category" method="post">
            <c:forEach items="${listC}" var="o">
                <li class="list-group-item text-white ${tag == o.id ? "active" : ""}"><button
                       style="background: none; border: none; outline: none; cursor: pointer" type="submit"
                       name="id" value="${o.id}"
                       >${o.name}</button></li>
            </c:forEach>
            </form>
        </ul>
    </div>
    <div class="card bg-light mb-3">
        <div class="card-header bg-success text-white text-uppercase">Last product</div>
        <div class="card-body">
            <img class="img-fluid" src="${last.image}"/>
            <h5 class="card-title">${last.name}</h5>
            <p class="card-text">${last.description}</p>
            <p class="bloc_left_price">${last.price} $</p>
        </div>
    </div>
</div>
