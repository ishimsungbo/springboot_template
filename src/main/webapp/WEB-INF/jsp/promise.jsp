<%--
  Created by IntelliJ IDEA.
  User: Min A
  Date: 2023-07-09
  Time: 오전 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Title</title>
</head>
<link rel="stylesheet" href="/resources/css/bootstrap.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript" src="/resources/js/bootstrap.js"></script>
<body>
  <h1>자바스크립트 프로미스 테스트</h1>

  <button class="btn btn-primary" type="submit">Button</button>
  <input class="btn btn-primary" type="button" value="Input">
  <input class="btn btn-primary" type="submit" value="Submit">
  <input class="btn btn-info" type="reset" value="Reset">

  <button class="btn btn-danger" onclick="doAction()">Placeholderw정보가져오기</button>
  <script>
      function print() {
          console.log("something working");
      }

        function doAction(){
            fetch('https://jsonplaceholder.typicode.com/posts/1')
                .then((response) => response.json())
                .then((json) => console.log(json))
                .then(print());
        }


  </script>

</body>
</html>
