<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/static/css/style.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<meta charset="utf-8">
<title>Prenotazione Biglietti</title>
</head>
<body background="${pageContext.request.contextPath}/resources/images/backgroundimagehome.jpg">
<div id="header">
			<jsp:include page="header.jsp"></jsp:include>
		</div>
    <div style="text-align: center">
        <div class="benvenuto">Benvenuto ${visitatori.NOME} ${tempUser.cognome} </div>
        <h1>Prenota online il tuo biglietto</h1>
      
       
    	     <table class="table striped-table">
			  <thead>
			    <tr>
			      <th scope="col">TITOLO</th>
			      <th scope="col">CINEMA</th>
			      <th scope="col">ORARIO</th>
			    </tr>
			  </thead>
			  <tbody>
			    <tr>
			    <c:forEach var="tempInterventi" items="${interventi}">
			      <td>${film.TITOLO}</td>
			      <td>${cinema.NOME}</td>
			      <td>${biglietti.ORA_PROIEZIONE}</td>
			      </c:forEach>
			    </tr>
			    
			  </tbody>
			</table>
      	
        
        <div class="logout">
        <a href="/logout">Logout</a>
        </div>
        
   </div>
</body>
</html>