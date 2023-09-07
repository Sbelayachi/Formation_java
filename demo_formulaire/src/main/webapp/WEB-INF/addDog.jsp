<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 07/09/2023
  Time: 09:40
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add a Dog</title>
</head>
<body>
<main>
    <form action="form" method="post">
        <div>
            <label for="name">Name: </label>
            <input type="text" name="name" id="name">
        </div>
        <div>
            <label for="color">Color: </label>
            <input type="color" name="color" id="color">
        </div>
        <div>
            <label for="age">Age: </label>
            <input type="number" min="0" max="200" step="0.5" name="age" id="age">
        </div>
        <div>
            <label for="weight">Poids: </label>
            <input type="number" min="1" max="200" step="0.5" name="weight" id="weight">
        </div>


        <hr>
<button>Envoi</button>
    </form>
</main>
</body>
</html>
