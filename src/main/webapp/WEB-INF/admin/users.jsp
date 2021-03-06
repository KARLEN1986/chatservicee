<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Chat Service</title>

    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="container">
    <h1>Chat Service</h1>
    <hr/>

    <h3>Users: <a href="/admin/users/add" userType="button" class="btn btn-primary btn-sm">ADD</a></h3>

    <c:if test="${empty userList}">
        <div class="alert alert-warning" role="alert">
            <span class="glyphicon glyphicon-info-sign" aria-hidden="true"></span>User List is empty，create <a
                href="/admin/users/add"
                userType="button"
                class="btn btn-primary btn-sm">User</a>
        </div>
    </c:if>

    <c:if test="${!empty userList}">
        <table class="table table-bordered table-striped">
            <tr>
                <th>Image</th>
                <th>ID</th>
                <th>nickname</th>
                <th>full name</th>
                <th>password</th>
                <th>actions</th>
            </tr>

            <c:forEach items="${userList}" var="user">
                <tr>
                    <td>
                        <c:if test="${user.profilePic != null}">
                            <img src="/getImage?filename=${user.profilePic}" width="100"/>
                        </c:if>
                    </td>
                    <td>${user.id}</td>
                    <td>${user.nickname}</td>
                    <td>${user.firstName} ${user.lastName}</td>
                    <td>${user.password}</td>
                    <td>
                        <a href="/admin/users/show/${user.id}" userType="button" class="btn btn-sm btn-success">View</a>
                        <a href="/admin/users/update/${user.id}" userType="button" class="btn btn-sm btn-warning">Update</a>
                        <a href="/admin/users/delete/${user.id}" userType="button" class="btn btn-sm btn-danger">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
</div>

<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>