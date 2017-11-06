<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Lista de Alunos Cadastrados</title>
</head>
<body>
	<h2>Lista de Alunos Cadastrados</h2>
 
	<c:if test="${not empty alunos}">
		<table>
			<tr>
				<td>Nome</td>
				<td>CPF</td>
				<td>Telefone</td>
				<td>Endereço</td>
				<td>Descrição</td>
				<td>Profissão</td>
				<td>RG</td>
				<td>Data de Nascimento</td>
				
			</tr>
 
		
			<c:forEach var="listValue" items="${alunos}">
				
				<tr>
					<td>${listValue.nome}</td>
					<td>${listValue.cpf}</td>
					<td>${listValue.telefone}</td>
					<td>${listValue.endereco}</td>
					<td>${listValue.descricao}</td>
					<td>${listValue.profissao}</td>
					<td>${listValue.rg}</td>
					<td><fmt:formatDate pattern="dd/MM/yyyy" value="${listValue.dataNascimento}" /></td>
				</tr>
			</c:forEach>
		
		</table>
 
	</c:if>
	<a href="/faculdadeFean/aluno">Cadastro</a>
	
</body>
</html>