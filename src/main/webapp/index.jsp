<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
    <title>Product List</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style>
        .a {
            width: 160px;
            height: 200px;
            border: 1px solid black;
            padding: 5px;
            margin: 10px;
            float: left;
            text-align: center;
        }
        .hinh {
            width: 80px;
            height: 100px;
        }
    </style>
</head>

<body>
<p><a href="${pageContext.request.contextPath}/ShoppingCart.jsp">View Cart</a></p>

<c:forEach items="${ds}" var="sp">
    <div class="a">
        <form name="modelDetail" method="POST" action="${pageContext.request.contextPath}/CartController">
                ${sp.model} <br />
            <img src='/ShoppingCartJSPSession${sp.imgURL}' class="hinh" alt="Product Image"> <br />
            Price: ${sp.price} <br />
            <input type="text" size="2" value="1" name="quantity"><br>
            <input type="hidden" name="modelNo" value="${sp.id}">
            <input type="hidden" name="price" value="${sp.price}">
            <input type="hidden" name="description" value="${sp.model}">
            <input type="hidden" name="action" value="add">
            <input type="submit" name="addToCart" value="Add To Cart">
        </form>
    </div>
</c:forEach>

</body>
</html>
