<html>
<head>
    <style>
        header {
            padding: 156px 0 100px;
        }

        section {
            padding: 150px 0;
        }
    </style>
</head>
<jsp:useBean id="user" class="kz.iitu.hotelSystem.entity.users.User" scope="session"/>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top mb-6">
    <a class="navbar-brand" href="#">Hotel System</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/rooms/allRooms">Rooms</a>
            </li>
        </ul>
    </div>

    <div class="float-right">
        <ul class="navbar-nav ml-auto">
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/admin/allUsersList">UserList</a>
            </li>
                <% if (user.getUsername() != null) { %>
            <li class="nav-item">
                <a class="nav-link" href="#"><%=user.getFullName()%></a>
            </li>

            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/logout">logout</a>
            </li>
                <%}%>
            <% if (user.getUsername() == null) { %>
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/login">Login</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/newUser">Register</a>
            </li>
            <%}%>
        </ul>
    </div>
<%--    <% }--%>
<%--        if (user.getEmail() == null) { %>--%>

<%--    <div class="float-right">--%>
<%--        <ul class="navbar-nav ml-auto">--%>
<%--            <li class="nav-item">--%>
<%--                <a class="nav-link" href="Login.jsp">Login</a>--%>
<%--            </li>--%>
<%--            <li class="nav-item">--%>
<%--                <a class="nav-link" href="Register.jsp">Register</a>--%>
<%--            </li>--%>
<%--        </ul>--%>
<%--    </div>--%>
<%--    <% } %>--%>




</nav>
</body>
</html>