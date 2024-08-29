<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<meta charset="UTF-8">
		<title>pet nest home page</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/homePage.css">
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/homePage.js"></script>
	</head>
	<body>
		<div class="header">
        <div class="brandIcon"><a href="${pageContext.request.contextPath}/jsp/homePage.jsp">petNest</a></div>
        <div class="searchSection">
            <input type="text" placeholder="Search for pets...">
            <button>Search</button>
        </div>
        <div class="topRight">
            <div class="PetStore"><a href="PetStore.html">PetStore</a></div>
            <div class="FindYourPet"><a href="#">FindYourPet</a></div>
            <div class="FindHospital"><a href="#">FindHospital</a></div>
            <div class="GoToCart"><a href="${pageContext.request.contextPath}/cartServlet">Cart</a></div>
            <c:if test="${empty sessionScope.userName}">
            	<div class="Login"><a href="<%=request.getContextPath() %>/jsp/login.jsp">Login</a></div>
            	<div class="Sign up"><a href="<%=request.getContextPath()%>/jsp/RegistrationForm.jsp">Sign up</a></div>
            </c:if>
        	<c:if test="${not empty sessionScope.userName}">
            		<div class="profile"><a href="/jsp/profilePage.jsp">Hi, ${sessionScope.userName}</a></div>
            		<div class="logout"><a href="${pageContext.request.contextPath}/logoutServlet">logout</a></div>
            </c:if>
        </div>
    </div>
	</body>
</html>