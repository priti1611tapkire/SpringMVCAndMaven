<%@page import="com.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
function editData() {
	alert("HI");
	document.myAction.action="edit";
	document.myAction.submit();
}
function deleteData() {
	alert("HI");
	document.myAction.action="del";
	document.myAction.submit();
}
function printData() {
	window.print();
}
function addRecord() {
	alert("Add");
	document.myAction.action="add";
	document.myAction.submit();
}
</script>
<%List<Student> slist1=(List<Student>)request.getAttribute("data"); %>
<body bgcolor="cyan">
<form name="myAction">
<h2>STUDENT DETAILS</h2>
<div style="text-align: center; margin-left:120px">
<table border="10">
<thead>
<tr style="color: pink">
<th>Select</th>
<th>Rollno</th>
<th>Name</th>
<th>Address</th>
<th>Username</th>
<th>Password</th>
<th>Edit</th>
<th>Delete</th>
<th>Print</th>
</tr>
</thead>
<tbody>
<%for(Student s:slist1){%>
<tr>
<td><input type="radio" name="rollno" value="<%=s.getRollno()%>"></td>
<td><%=s.getRollno() %></td>
<td><%=s.getName() %></td>
<td><%=s.getAddr() %></td>
<td><%=s.getUname() %></td>
<td><%=s.getPass() %></td>
 <td><input type="button" onclick="editData()" value="Edit"></td>   
 <td><input type="button" onclick="deleteData()" value="Delete"></td>   
 <td><input type="button" onclick="printData()" value="Print"></td> 
<% }%>
</tr>
<td><input type="button" onclick="addRecord()" value="Add"></td> 
</tbody>
</table>
</div>
</form>
</body>
</html>