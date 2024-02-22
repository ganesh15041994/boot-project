<html>
<body>
<h2>Hello World!</h2>
<%@ page import="java.util.*" %>
<h1>Ganesh</h1>
<%

String name=(String)request.getAttribute("name");
Integer id = (Integer) request.getAttribute("id");
List <String> list = (List<String>)request.getAttribute("f");



%>

<h1>Id is <%=id %></h1>
<h1><%=name %></h1>

<%
for(String v:list)
{
	%>
<h1><%=v %></h1>
<%
}
%>
 
</body>
</html>
