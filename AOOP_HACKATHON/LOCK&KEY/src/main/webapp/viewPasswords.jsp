<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
    <title>View Passwords</title>
</head>
<body>
    <h2>Stored Passwords</h2>
    <%
        ArrayList<String[]> passwords = (ArrayList<String[]>) session.getAttribute("passwords");
        if (passwords != null && !passwords.isEmpty()) {
    %>
        <table border="1">
            <tr>
                <th>Website</th>
                <th>Username</th>
                <th>Password</th>
            </tr>
            <%
                for (String[] entry : passwords) {
            %>
                <tr>
                    <td><%= entry[0] %></td>
                    <td><%= entry[1] %></td>
                    <td><%= entry[2] %></td>
                </tr>
            <%
                }
            %>
        </table>
    <%
        } else {
    %>
        <p>No passwords stored.</p>
    <%
        }
    %>
    <a href="index.jsp">Back to Home</a>
</body>
</html>
