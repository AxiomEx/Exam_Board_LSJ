<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 회원정보 수정 </title>
</head>
<body>
	
	<h1> 회원 수정 </h1>
	<form action="/memberUpdate" method="post">
	<input type="hidden" name="m_no" value="${dto.m_no}">
	회원 아이디 : ${dto.m_id} <br>
	회원 주소 : <input type="text" name="m_address" id="m_address" value="${dto.m_address}"> <br>
	회원 등록일 : ${dto.m_regDate} <br>
	<input type="submit" value="수정하기">
	</form>
	
	
	
	
</body>
</html>