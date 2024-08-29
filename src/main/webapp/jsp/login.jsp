<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login.css">
    <style type="text/css">
    </style>
</head>
<body>
	<%@ include file="header.jsp" %>
    <div class="container"> 
        <form class="form-class" action="${pageContext.request.contextPath}/LoginServlet" autocomplete="off" method="post">
            <h3>LOGIN FORM</h3>
            <input type="email" placeholder="email" name="Email" required>
            <div class="message">
            <c:if test="${not empty emailError}">
                    <div class="error-message">
                        <p>${emailError}</p>
                    </div>
                </c:if>
            </div>
            <input type="password" placeholder="password" name="Password" required>
            <div class="message">
            <c:if test="${not empty passwordError}">
                    <div class="error-message">
                        <p>${passwordError}</p>
                    </div>
            </c:if>
            <%
            HttpServletRequest req=(HttpServletRequest) pageContext.getRequest();
            req.removeAttribute("emailError");
            req.removeAttribute("passwordError");
            %>
            </div>
            <button type="submit" id="loginBtn">LOGIN</button>
        </form>
        <a href="${pageContext.request.contextPath}/jsp/RegistrationForm.jsp" id="regisBtn" class="button">Register</a>
    </div>
</body>
</html>
