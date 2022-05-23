<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 23/05/2022
  Time: 6:12 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Simple Dictionary</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
  </head>
  <body>
  <h2>Vietnam Dictionary</h2>
  <form action="/dictionary.jsp" method="post">
    <input type ="text" name="search" placeholder="Enter your word: "/>
    <input type="submit" id="sub" value = "Search"/>
  </form>
  </body>
</html>
