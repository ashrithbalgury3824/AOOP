<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Password</title>
</head>
<body>
    <h2>Add New Password</h2>
    <form action="savePassword.jsp" method="post">
        <label>Website:</label> <input type="text" name="website"><br>
        <label>Username:</label> <input type="text" name="username"><br>
        <label>Password:</label> <input type="text" name="password"><br>
        <input type="submit" value="Save">
    </form>
</body>
</html>
