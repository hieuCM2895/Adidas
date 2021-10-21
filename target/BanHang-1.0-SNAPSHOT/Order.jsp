<%--
  Created by IntelliJ IDEA.
  User: caohieu
  Date: 16/10/2021
  Time: 18:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
    <meta charset='utf-8'>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <title>Snippet - BBBootstrap</title>
    <link href='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css' rel='stylesheet'>
    <link href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css' rel='stylesheet'>
    <script type='text/javascript' src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
    <style>

    body {
        background: linear-gradient(110deg, #BBDEFB 60%, #42A5F5 60%);
        min-width: 530px;
    }

    .shop {
        font-size: 10px
    }

    .space {
        letter-spacing: 0.8px !important
    }

    .second a:hover {
        color: rgb(92, 92, 92)
    }

    .active-2 {
        color: rgb(92, 92, 92)
    }

    .breadcrumb>li+li:before {
        content: "" !important
    }

    .breadcrumb {
        padding: 0px;
        font-size: 10px;
        color: #aaa !important
    }

    .first {
        background-color: white
    }

    a {
        text-decoration: none !important;
        color: #aaa
    }

    .btn-lg,
    .form-control-sm:focus,
    .form-control-sm:active,
    a:focus,
    a:active {
        outline: none !important;
        box-shadow: none !important
    }

    .form-control-sm:focus {
        border: 1.5px solid #4bb8a9
    }

    .btn-group-lg>.btn,
    .btn-lg {
        padding: .5rem 0.1rem;
        font-size: 1rem;
        border-radius: 0;
        color: white !important;
        background-color: #4bb8a9;
        height: 2.8rem !important;
        border-radius: 0.2rem !important
    }

    .btn-group-lg>.btn:hover,
    .btn-lg:hover {
        background-color: #26A69A
    }

    .btn-outline-primary {
        background-color: #fff !important;
        color: #4bb8a9 !important;
        border-radius: 0.2rem !important;
        border: 1px solid #4bb8a9
    }

    .btn-outline-primary:hover {
        background-color: #4bb8a9 !important;
        color: #fff !important;
        border: 1px solid #4bb8a9
    }

    .card-2 {
        margin-top: 40px !important
    }

    .card-header {
        background-color: #fff;
        border-bottom: 0px solid #aaaa !important
    }

    p {
        font-size: 13px
    }

    .small {
        font-size: 9px !important
    }

    .form-control-sm {
        height: calc(2.2em + .5rem + 2px);
        font-size: .875rem;
        line-height: 1.5;
        border-radius: 0
    }

    .cursor-pointer {
        cursor: pointer
    }

    .boxed {
        padding: 0px 8px 0 8px;
        background-color: #4bb8a9;
        color: white
    }

    .boxed-1 {
        padding: 0px 8px 0 8px;
        color: black !important;
        border: 1px solid #aaaa
    }

    .bell {
        opacity: 0.5;
        cursor: pointer
    }

    .img1 {
        position: relative;
        right: 20px;
    }

    @media (max-width: 960px) {
        .breadcrumb-item+.breadcrumb-item {
            padding-left: 0
        }

        .respond1 {
            align-items: center;
            text-align: center;
        }

        .mb-0, .my-0 {
            margin-bottom: 0!important;
            width: 200px;
        }
    }

    </style>

</head>
<body oncontextmenu='return false' class='snippet-body'>
<div class=" container-fluid my-5 ">
    <div class="row justify-content-center ">
        <div class="col-xl-10">
            <div class="card shadow-lg ">
                <div class="row p-2 mt-3 justify-content-between mx-sm-2">
                    <div class="col">
                        <p class="text-muted space mb-0 shop"> Shop </p>
                        <p class="text-muted space mb-0 shop">Store Locator</p>
                    </div>
                    <div class="col">
                        <div class="row justify-content-start ">
                            <div class="col"> <img class="irc_mi img-fluid cursor-pointer img1" src="https://i.imgur.com/jFQo2lD.png" width="70" height="70"> </div>
                        </div>
                    </div>
                    <div class="col-auto"> <img class="irc_mi img-fluid bell" src="https://i.imgur.com/uSHMClk.jpg" width="30" height="30"> </div>
                </div>
                <div class="row mx-auto justify-content-center text-center">
                    <div class="col-12 mt-3 ">
                        <nav aria-label="breadcrumb" class="second ">
                            <ol class="breadcrumb indigo lighten-6 first ">
                                <li class="breadcrumb-item font-weight-bold "><a class="black-text text-uppercase " href="product"><span class="mr-md-3 mr-1">BACK TO SHOP</span></a><i class="fa fa-angle-double-right " aria-hidden="true"></i></li>
                                <li class="breadcrumb-item font-weight-bold"><a class="black-text text-uppercase" href="print"><span class="mr-md-3 mr-1">SHOPPING BAG</span></a><i class="fa fa-angle-double-right text-uppercase " aria-hidden="true"></i></li>
                                <li class="breadcrumb-item font-weight-bold"><a class="black-text text-uppercase active-2" href="#"><span class="mr-md-3 mr-1">CHECKOUT</span></a></li>
                            </ol>
                        </nav>
                    </div>
                </div>
                <div class="row justify-content-around">
                    <div class="col-lg-5">
                        <div class="card border-0">
                            <div class="card-header pb-0">
                                <h2 class="card-title space respond1">Checkout</h2>
                                <p class="card-text text-muted mt-4 space respond1">SHIPPING DETAILS</p>
                                <hr class="my-0">
                            </div>
                            <div class="card-body">
                                <div class="form-group"> <label for="NAME" class=" text-muted mb-1">Your Name</label><input type="text" class="form-control form-control-sm" name="NAME" aria-describedby="helpId" value="${acc.fullName}" placeholder="Your Name"></div>
                                <div class="form-group"> <label for="NAME" class="text-muted mb-1">Email</label> <input type="text" class="form-control form-control-sm" name="NAME" aria-describedby="helpId" placeholder="Email" value="${acc.email}"> </div>
                                <div class="form-group"> <label for="NAME" class="text-muted mb-1">Address</label> <input type="text" class="form-control form-control-sm" name="NAME" aria-describedby="helpId" placeholder="Address" value="${acc.address}"> </div>
                                <div class="form-group"> <label for="NAME" class="text-muted mb-1">Number Phone</label> <input type="text" class="form-control form-control-sm" name="NAME" aria-describedby="helpId" placeholder="Number Phone" value="${acc.numberPhone}"> </div>
                                <div class="row no-gutters">
                                    <div class="col-sm-6 pr-sm-2">
                                        <div class="form-group"> <label for="NAME" class="small text-muted mb-1">VALID THROUGH</label> <input type="text" class="form-control form-control-sm" name="NAME"aria-describedby="helpId" placeholder="06/21"> </div>
                                    </div>
                                    <div class="col-sm-6">
                                        <div class="form-group"> <label for="NAME" class="small text-muted mb-1">CVC CODE</label> <input type="text" class="form-control form-control-sm" name="NAME" id="NAME" aria-describedby="helpId" placeholder="183"> </div>
                                    </div>
                                </div>
                                <div class="row mb-md-5">
                                    <div class="col"> <button type="button" name="" id="" class="btn btn-lg btn-block ">PURCHASE</button> </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-5">
                        <div class="card border-0 ">
                            <div class="card-header card-2">
                                <p class="card-text text-muted mt-md-4 mb-2 space">YOUR ORDER <span class=" small text-muted ml-2 cursor-pointer">EDIT SHOPPING BAG</span> </p>
                                <hr class="my-2">
                            </div>
                            <div class="card-body pt-0">
                                <c:forEach items="${list}" var="o">
                                <div class="row justify-content-between">
                                    <div class="col-auto col-md-7">
                                        <div style="margin: 6px" class="media flex-sm-row"> <img class=" img-fluid" src="${o.image}" width="62" height="62">
                                            <div class="media-body my-auto">
                                                <div class="row ">
                                                    <div class="col-auto">
                                                        <p class="mb-0" style="margin-left: 15px;">${o.name}</p><small class="text-muted"></small>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class=" pl-0 flex-sm-col col-auto my-auto">
                                        <p class="boxed-1" style="margin-top: 7px">${o.amount}</p>
                                    </div>
                                    <div style="display: inline-flex; justify-items: center; align-items: center" class="pl-0 flex-sm-col col-auto my-auto ">
                                        <p style="margin-top: 7px"><b>${o.price} $</b></p>
                                    </div>
                                </div>
                                </c:forEach>
                                <hr class="my-2">
                                <div class="row ">
                                    <div class="col">
                                        <div class="row justify-content-between">
                                            <div class="col-4">
                                                <p class="mb-1"><b>Subtotal</b></p>
                                            </div>
                                            <div class="flex-sm-col col-auto">
                                                <p class="mb-1"><b>${total} $</b></p>
                                            </div>
                                        </div>
                                        <div class="row justify-content-between">
                                            <div class="col">
                                                <p class="mb-1"><b>VAT</b></p>
                                            </div>
                                            <div class="flex-sm-col col-auto">
                                                <p class="mb-1"><b>${vat} $</b></p>
                                            </div>
                                        </div>
                                        <div class="row justify-content-between">
                                            <div class="col-4">
                                                <p><b>Total</b></p>
                                            </div>
                                            <div class="flex-sm-col col-auto">
                                                <p class="mb-1"><b>${sum} $</b></p>
                                            </div>
                                        </div>
                                        <hr class="my-0">
                                    </div>
                                </div>
                                <div class="row mb-5 mt-4 ">
                                    <div class="col-md-7 col-lg-6 mx-auto"><button type="button" class="btn btn-block btn-outline-primary btn-lg">ADD GIFT CODE</button></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script type='text/javascript' src='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js'></script>
<script type='text/javascript'></script>
</body>
</html>
