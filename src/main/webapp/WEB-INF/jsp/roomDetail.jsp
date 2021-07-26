<html>
<head>
    <title>Phone Detail</title>
    <%@include file="layout/head.jsp"%>
</head>
<body>
<%@include file="navbar.jsp"%>
<div class="container">
    <jsp:useBean id="Room" class="kz.iitu.hotelSystem.entity.rooms.Room" scope="request"/>

    <header class="jumbotron my-4">
        <img src="<%=Room.getImgLink()%>" alt="" height="200" width="200">
        <h1 class="display-3"><jsp:getProperty name="Room" property="shortDesc"/></h1>
        <p class="lead">Room Type: <jsp:getProperty name="Room" property="type"/></p>
        <p class="lead">Room Price: <jsp:getProperty name="Room" property="price"/></p>
        <a href="#" class="btn btn-primary btn-lg">Add to cart</a>
    </header>



</div>
<%@include file="layout/footer.jsp"%>
</body>
</html>