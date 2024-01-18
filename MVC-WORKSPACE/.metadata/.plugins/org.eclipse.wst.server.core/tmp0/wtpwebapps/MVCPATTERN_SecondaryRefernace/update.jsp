<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>updatepage</title>
</head>
<body>
<form action="update">
<input type="hidden" name="rollno" value=${s2.rollno}><br><br>
Name:-<input type="text" name="name" value=${s2.name}><br><br>
Address:-<input type="text" name="addr" value=${s2.addr}><br><br>
Username:<input type="text" name="uname" value=${s2.uname}><br><br>
Password: <input type="text" name="pass" value=${s2.pass}><br><br>
<input type="submit" value="update">

</form>

</body>
</html>