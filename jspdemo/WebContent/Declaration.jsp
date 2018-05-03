<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>hello sir how are you </h1>

<%!

String makeitlower(String data){
	return data.toLowerCase();
}
%>

lower case values are : <%= makeitlower("Sahil NagPAL") %>

<%!

int addition(int a , int b){
	
	int c= a+b;
	return c;
	
}
%>
<br></br>

The addition is : <%=  addition(34, 65) %>

</body>
</html>