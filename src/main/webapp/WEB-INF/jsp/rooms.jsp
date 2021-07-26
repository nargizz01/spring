<html>
<head>
    <title>Phone Store</title>
    <%@include file="layout/head.jsp"%>
</head>
<body>
<%@include file="navbar.jsp"%>
<div class="container">

    <!-- Jumbotron Header -->
    <header class="jumbotron my-4">
        <h1 class="display-3">Welcome to Hotel!</h1>
        <p class="lead">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ipsa, ipsam, eligendi, in quo sunt possimus non incidunt odit vero aliquid similique quaerat nam nobis illo aspernatur vitae fugiat numquam repellat.</p>
        <a href="#" class="btn btn-primary btn-lg">Call to action!</a>
    </header>

    <jsp:useBean id="ph" type="java.util.List<kz.iitu.hotelSystem.entity.rooms.Room>" scope="request"/>
    <!-- Page Features -->


    <div class="row text-center">
        <%for(int i = 0; i<ph.size(); i++) {%>
        <div class="col-lg-3 col-md-6 mb-4">
            <div class="card h-100">
                <img class="card-img-top" src="<%=ph.get(i).getImgLink()%>" alt="">
                <div class="card-body">
                    <h4 class="card-title"><%=ph.get(i).getShortDesc()%></h4>
                    <p class="card-text"> <%=ph.get(i).getPrice()%></p>
                </div>
                <div class="card-footer">
                    <a href="${pageContext.request.contextPath}/rooms/getRoom?rid=<%=ph.get(i).getId()%>" class="btn btn-primary">Detail</a>
                </div>
            </div>
        </div>
        <%}%>


    </div>
    <!-- /.row -->

</div>
<%@include file="layout/footer.jsp"%>
</body>
</html>