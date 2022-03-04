<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
     String name=request.getParameter("name");
     String pass=request.getParameter("pass");
     
     if(name!="name" && pass!="pass" )
     {
      %>
    <jsp:forward page="dashboard.jsp">
    <jsp:param value="<%name %>" name="user"/>
    </jsp:forward>
    
   <%}else{
	   %>
	   <jsp:forward page="index.jsp"></jsp:forward>
	   <jsp:param value="" name=""/>
   }
     
     

</body>
</html>