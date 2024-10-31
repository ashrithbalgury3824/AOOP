<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%
    // Retrieve existing passwords from session or create a new list
    ArrayList<String[]> passwords = (ArrayList<String[]>) session.getAttribute("passwords");
    if (passwords == null) {
        passwords = new ArrayList<>();
    }

    // Get data from form and add it to the list
    String website = request.getParameter("website");
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if (website != null && username != null && password != null) {
        passwords.add(new String[] { website, username, password });
    }

    // Save the list back to the session
    session.setAttribute("passwords", passwords);
%>
<p>Password saved successfully!</p>
<a href="index.jsp">Back to Home</a>
