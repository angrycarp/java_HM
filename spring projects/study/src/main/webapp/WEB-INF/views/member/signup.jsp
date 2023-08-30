<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
	<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
	<title>회원가입</title>
</head>
<body>
	<a class="nav-link" href="<c:url value='/signup' />">회원가입</a>
	<div class="container">
		<h1>회원가입</h1>
		<form action="<c:url value='/member/signup'/>" method="post">
			<div class="form-group">
				<label>아이디</label>
				<input type="text" class="form-control" name="me_id">
			</div>
			<div class="form-group">
				<label>비번</label>
				<input type="password" class="form-control" name="me_pw">
			</div>
			<div class="form-group">
				<label>이메일</label>
				<input type="email" class="form-control" name="me_email">
			</div>
			<button class="btn btn-outline-warning col-12">회원가입</button>
		</form>
	</div>	
</body>
</html>