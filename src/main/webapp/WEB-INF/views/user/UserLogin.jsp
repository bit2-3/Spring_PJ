<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login</title>
</head>
<body>
	<h1 align="center">Login</h1>
	<form action="LoginAction.in" name=" LoginForm" method="post">
		<table align="center">
			<tr>
				<td align="center">아이디</td>
				<td><input type="text" required name="id" id="id" /></td>
			</tr>
			<tr>
				<td align="center">비밀번호</td>
				<td><input type="password" required name="password"
					id="password" /></td>
			</tr>
			<tr>
				<td><button align="center" type="submit" name="login">로그인</button></td>
			</tr>
		</table>
	</form>
</body>
</html>