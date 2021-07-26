<%@ page import="kz.iitu.hotelSystem.entity.users.User" %>
<html>
<head>
    <title>Phone Store</title>
    <%@include file="layout/head.jsp"%>
</head>
<body>
<%@include file="navbar.jsp"%>
<jsp:useBean id="users" type="java.util.List<kz.iitu.hotelSystem.entity.users.User>" scope="request"/>

<section id="about">
    <div class="container">
        <table class="table">
            <thead class="thead-dark">
            <tr>
                <th scope="col">#</th>
                <th scope="col">Name</th>
                <th scope="col">Age</th>
                <th scope="col">Phone</th>
                <th scope="col">username</th>
                <th scope="col">Password</th>
            </tr>
            </thead>
            <tbody>
            <%for(User user1: users ){%>
            <tr>
                <th scope="row"><%=user1.getId()%></th>
                <td><%=user1.getFullName()%></td>
                <td><%=user1.getAge()%></td>
                <td><%=user1.getPhoneNumber()%></td>
                <td><%=user1.getUsername()%></td>
                <td><%=user1.getPassword()%></td>
            </tr>
            <%}%>
            </tbody>
        </table>


    </div>
</section>

<%@include file="layout/footer.jsp"%>
</body>
</html>