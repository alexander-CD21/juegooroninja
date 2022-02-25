<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Ninja Gold Game</title>
	</head>
	<body>
		
		<h1> Your Gold:<c:out value="${total1}"></c:out> </h1>
		
		<form action="/farm" method="post">
			<div>
				<h1>Farm</h1>
				<h2>(earns 10-20 gold)</h2>
				<button type="submit">
					Find Gold!
				</button>
			</div>		
		</form>
		
		<form action="/cave" method="post">
		<div>
			<h1>Cave</h1>
			<h2>(earns 5-10 gold)</h2>
			<button type="submit">
				Find Gold!
			</button>
		</div>
		</form>
		
		<form action="/house" method="post">
		<div>
			<h1>House</h1>
			<h2>(earns 2-5 gold)</h2>
			<button type="submit">
				Find Gold!
			</button>
		</div>		
		</form>
		
		<form action="/casino" method="post">
		<div>
			<h1>Casino!</h1>
			<h2>(earns/takes 0-50 gold)</h2>
			<button type="submit">
				Find Gold!
			</button>
		</div>			
		</form>
		
		<form action="/spa" method="post">
		<div>
			<h1>SPA!</h1>
			<h2>(takes 5-20 gold)</h2>
			<button type="submit">
				Find Gold!
			</button>
		</div>			
		</form>
		
		<div>
		<h2>Activities:</h2>
		<c:forEach var="emp" items="${alerta1}">
			<ul>
				<c:out value="${emp}"></c:out>
			</ul>
		</c:forEach>		
		</div>
		
		<form action="/reset" method="post">
		<div>
			<button type="submit">
			Reset
			</button>
		</div>		
		</form>
  		<!-- <p><c:out value="${exito1}"></c:out></p>
  		<p><c:out value="${exito2}"></c:out></p>
  		<p><c:out value="${exito3}"></c:out></p>
  		<p><c:out value="${exito4}"></c:out></p>
  		<p><c:out value="${exito5}"></c:out></p>-->
		
		
	</body>
</html>