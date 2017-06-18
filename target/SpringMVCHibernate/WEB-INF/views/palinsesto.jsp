<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Palinsesto Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1>
	Aggiungi un Palinsesto
</h1>

<c:url var="addAction" value="/palinsesto/add" ></c:url>

<form:form action="${addAction}" commandName="palinsesto">
<table>
	<c:if test="${!empty palinsesto.nomepalinsesto}">
	<tr>
		<td>
			<form:label path="id">
				<spring:message text="ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="id" readonly="true" size="8"  disabled="true" />
			<form:hidden path="id" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="nomepalinsesto">
				<spring:message text="Inserisci il nome di un Palinsesto:"/>
			</form:label>
		</td>
		<td>
			<form:input path="nomepalinsesto" />
		</td> 
	</tr>
	
	<tr>
		<td colspan="2">
			<c:if test="${!empty palinsesto.nomepalinsesto}">
				<input type="submit"
					value="<spring:message text="Edit Palinsesto"/>" />
			</c:if>
			<c:if test="${empty palinsesto.nomepalinsesto}">
				<input type="submit"
					value="<spring:message text="Add Palinsesto"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
<br>
<h3>Palinsesto List</h3>
<c:if test="${!empty listPalinsesti}">
	<table class="tg">
	<tr>
		<th width="80">Palinsesto ID</th>
		<th width="120">Nome</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
		<th width="120">Vai alle Partite</th>
	</tr>
	<c:forEach items="${listPalinsesti}" var="palinsesto">
		<tr>
			<td>${palinsesto.id}</td>
			<td>${palinsesto.nomepalinsesto}</td>
			<td><a href="<c:url value='/edit/${palinsesto.id}' />" >Edit</a></td>
			<td><a href="<c:url value='/remove/${palinsesto.id}' />" >Delete</a></td>
			<td><a href="<c:url value="/index" />" >Lista Partite</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
