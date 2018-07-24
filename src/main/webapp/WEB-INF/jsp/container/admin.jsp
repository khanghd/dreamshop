<%-- 
    Document   : admin
    Created on : Dec 21, 2017, 8:00:53 PM
    Author     : DuyKhang
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div>
    <p>admin page</p>
    <a href="<c:url value="/logout"/>">Logout</a><br/>

    <a href="<c:url value="/user/userpage"/>">User page</a>
</div>