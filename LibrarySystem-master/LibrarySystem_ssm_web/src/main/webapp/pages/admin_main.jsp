<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>管理主页</title>
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <script src="../js/jquery-3.2.1.js"></script>
    <script src="../js/bootstrap.min.js" ></script>
    <script>
        $(function () {
            $('#header').load('admin_header.jsp');

            $('#center').load('admin_books.jsp');
        })
    </script>

</head>
<body background="../img/book2.jpg" style=" background-repeat:no-repeat ;
background-size:100% 100%;
background-attachment: fixed;">

<div id="header"></div>

<div id="center"></div>


</body>
</html>
