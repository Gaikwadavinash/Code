<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%

String uName=request.getParameter("uName");
Long phNo=Long.parseLong(request.getParameter("phNo"));
out.println("UserName:"+uName+"<br>");

out.println("PhoneNo"+phNo+"<br>");
%>