<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/RegistrationFormStyle.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/javascript/RegistrationFormFunc.js" defer></script>
</head>
<body>
	<div class="mainContainer">
        <form action="<%= request.getContextPath()%>/RegistrationServlet"  enctype="multipart/form-data" method="post">
           <div class="center">Welcome to the Pet Registration Form</div>
            <div class="inputFieldRow">
                <label for="fullName">Full Name:</label>
                <input type="text" name="fullName" id="fullName" required>
            </div>
            <div class="inputFieldRow">
                <label for="emailAddress">Email Address:</label>
                <input type="email" name="emailAddress" id="emailAddress" required>
                <c:if test="${not empty emailChk}">
                        <p>${emailChk}</p>
                </c:if>
            </div>
            <div class="inputFieldRow">
                <label for="password">Password:</label>
                <input type="password" name="password" id="password" required>
                <p id="pwdError"></p>
            </div>
            <div class="inputFieldRow">
                <label for="confirmPassword">Confirm Password:</label>
                <input type="password" name="confirmPassword" id="confirmPassword" required>
                <p id="cpwd"></p>
            </div>
            <div class="inputFieldRow">
                <label for="phoneNumber">Phone Number:</label>
                <input type="tel" name="phoneNumber" id="phoneNumber" required>
                <p id="ph"></p>
            </div>
            <div class="dynamicFields">
                <label for="addPet">Do you want to add pets for sale?</label>
                <input type="button" name="addPet" id="addPet" value="Add Pet">
            </div>
            <div class="petUploadContainer" id="petUploadContainer">
            </div>
            <div class="inputFieldRow">
                <button type="submit" id="subBtn">Submit</button>
            </div>
        </form>
    </div>
</body>
</html>