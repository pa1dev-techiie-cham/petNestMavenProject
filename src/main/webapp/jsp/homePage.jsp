<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pet nest home page</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/homePage.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/homePage.js"></script>
</head>
<body>
	<%@ include file="/jsp/header.jsp"%>
    <div class="petExpo">
        <div class="petType">
            <div class="expoTitle">DOGS</div>
            <div class="petCarousel">
                <div class="petCard">
                    <div class="petImage"><img src="${pageContext.request.contextPath}/assets/dogs/dog1.jfif" alt="dog1"></div>
                    <div class="info">
                        <p><b>Name :</b> Leo </p>
                        <p><b>Breed :</b> Golden Retrievers </p>
                        <p><b>Gender :</b> Female </p>
                        <p><b>Description :</b> Intelligent, kind, trustworthy, confident, friendly, reliable</p>
                        <b>&#8377;10,000</b>

                    </div>
                    <button type="button">add to cart</button>
                </div>
                <div class="petCard">
                    <div class="petImage"><img src="${pageContext.request.contextPath}/assets/dogs/dog1.jfif" alt="dog2"></div>
                    <div class="info">
                        <p><b>Name :</b> Charlie </p>
                        <p><b>Breed :</b> Pug </p>
                        <p><b>Gender :</b> Male </p>
                        <p><b>Description :</b> Charming, playful, docile, clever, friendly, loving</p>
                        <b>&#8377;10,000</b>
                    </div>
                    <button type="button">add to cart</button>
                </div>
                <div class="petCard">
                    <div class="petImage"><img src="${pageContext.request.contextPath}/assets/dogs/dog1.jfif" alt="dog2"></div>
                    <div class="info">
                        <p><b>Name :</b> CHIMki</p>
                        <p><b>Breed :</b> ada grama simham</p>
                        <p><b>Gender :</b> Male </p>
                        <p><b>Description :</b> bidda dosti chesthy pranam estha,dushman aety kcpd ey</p>
                        <b>&#8377;10,000</b>
                    </div>
                    <button type="button">add to cart</button>
                </div>
                <div class="petCard">
                    <div class="petImage"><img src="${pageContext.request.contextPath}/assets/dogs/dog1.jfif" alt="" ></div>
                    <div class="info">
                        <p><b>Name :</b> CHIMki</p>
                        <p><b>Breed :</b> ada grama simham</p>
                        <p><b>Gender :</b> Female </p>
                        <p><b>Description :</b> bidda dosti chesthy pranam estha,dushman aety kcpd ey</p>
                        <b>&#8377;10,000</b>
                    </div>
                    <button type="button">add to cart</button>
                </div>
                <div class="petCard">
                    <div class="petImage"><img  src="${pageContext.request.contextPath}/assets/dogs/dog1.jfif" alt="" ></div>
                    <div class="info">
                        <p><b>Name :</b> CHIMki</p>
                        <p><b>Breed :</b> ada grama simham</p>
                        <p><b>Gender :</b> Female </p>
                        <p><b>Description :</b> bidda dosti chesthy pranam estha,dushman aety kcpd ey</p>
                        <b>&#8377;10,000</b>
                    </div>
                    <button type="button">add to cart</button>
                </div>
            </div>
        </div>
        <div class="petType">
            <div class="expoTitle">CATS</div>
            <div class="petCarousel">
                <div class="petCard">
                    <div class="petImage"><img src="${pageContext.request.contextPath}/assets/cats/cat1.jfif" alt="dog1"></div>
                    <div class="info">
                        <p><b>Name :</b> CHIMki</p>
                        <p><b>Breed :</b> ada grama simham</p>
                        <p><b>Gender :</b> Male </p>
                        <p><b>Description :</b> bidda dosti chesthy pranam estha,dushman aety kcpd ey</p>
                        <b>&#8377;10,000</b>
                    </div>
                    <button type="button">add to cart</button>
                </div>
                <div class="petCard">
                    <div class="petImage"><img src="${pageContext.request.contextPath}/assets/cats/cat1.jfif" alt="dog2"></div>
                    <div class="info">
                        <p><b>Name :</b> CHIMki</p>
                        <p><b>Breed :</b> ada grama simham</p>
                        <p><b>Gender :</b> Female </p>
                        <p><b>Description :</b> bidda dosti chesthy pranam estha,dushman aety kcpd ey</p>
                        <b>&#8377;10,000</b>
                    </div>
                    <button type="button">add to cart</button>
                </div>
                <div class="petCard">
                        <div class="petImage"><img src="${pageContext.request.contextPath}/assets/cats/cat1.jfif" alt="dog2"></div>
                        <div class="info">
                            <p><b>Name :</b> CHIMki</p>
                            <p><b>Breed :</b> ada grama simham</p>
                            <p><b>Gender :</b> Male </p>
                            <p><b>Description :</b> bidda dosti chesthy pranam estha,dushman aety kcpd ey</p>
                            <b>&#8377;10,000</b>
                        </div>
                        <button type="button">add to cart</button>
                </div>
                <div class="petCard">
                    <div class="petImage"><img src="${pageContext.request.contextPath}/assets/cats/cat1.jfif" alt="" ></div>
                    <div class="info">
                        <p><b>Name :</b> CHIMki</p>
                        <p><b>Breed :</b> ada grama simham</p>
                        <p><b>Gender :</b> Female </p>
                        <p><b>Description :</b> bidda dosti chesthy pranam estha,dushman aety kcpd ey</p>
                        <b>&#8377;10,000</b>
                    </div>
                    <button type="button">add to cart</button>
                </div>
                <div class="petCard">
                    <div class="petImage"><img src="${pageContext.request.contextPath}/assets/cats/cat1.jfif" alt=""></div>
                    <div class="info">
                        <p><b>Name :</b> CHIMki</p>
                        <p><b>Breed :</b> ada grama simham</p>
                        <p><b>Gender :</b> Male </p>
                        <p><b>Description :</b> bidda dosti chesthy pranam estha,dushman aety kcpd ey</p>
                        <b>&#8377;10,000</b>
                    </div>
                    <button type="button">add to cart</button>
                </div>
            </div>
        </div>
    </div>
    <footer class="footer">
        <div class="container">
            <div class="row">
                <div class="footer-col">
                    <h4>Quick Links</h4>
                    <ul>
                        <li><a href="PetStore.html">Petstore</a></li>
                        <li><a href="Login.html">Login</a></li>
                        <li><a href="Registration.html">Register</a></li>
                        <li><a href="#">Pet care</a></li>
                    </ul>
                </div>
                <div class="footer-col">
                    <h4>Our Services</h4>
                    <ul>
                        <li><a href="#">Home Delivery</a></li>
                        <li><a href="#">Multiple payment options</a></li>
                        <li><a href="#">Pet caring awareness</a></li>
                        <li><a href="#">Rescue awareness</a></li>
                    </ul>
                </div>
                <div class="footer-col">
                    <h4>Account</h4>
                    <ul>
                        <li><a href="#">About us</a></li>
                        <li><a href="#">Contact us</a></li>
                        <li><a href="#">Privacy Policy</a></li>
                        <li><a href="#">Terms and Conditions</a></li>
                    </ul>
                </div>

                <div class="footer-col">
                    <h4>About us</h4>
                    <p>PetNest is a free intermediate platform for users and pet sellers. Whether you're buying or
                        selling pets such as dogs, cats, birds, fish, and more, you can do it online with us.</p>
                </div>
            </div>
        </div>
    </footer>
</body>
</html>