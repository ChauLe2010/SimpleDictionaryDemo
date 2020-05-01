<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/1/2020
  Time: 9:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Simple Dictionary</title>
    <style>
      input{
        padding: 3px;
        margin: 3px;
      }
    </style>
  </head>
  <body>
  <form method="post" action="/translate">
    <h1>Eng-Vie Dictionary: </h1>
    <input type="text" name="english">
    <br>
    <input type="submit" value="Translate">
  </form>
  </body>
</html>
