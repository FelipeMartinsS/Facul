<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Exibe Detalhes do Cliente</title>
</head>
<body>

<h2>Detalhes do Cliente Cadastrado</h2>
   <table>
    <tr>
        <td>Nome:</td>
        <td>${nome}</td>
    </tr>
    <tr>
        <td>CPF:</td>
        <td>${cpf}</td>
    </tr>
    <tr>
        <td>RG:</td>
        <td>${rg}</td>
    </tr>    
    <tr>
        <td>Sal�rio:</td>
        <td>${salario}</td>
    </tr>    
    <tr>
        <td>Endere�o:</td>
        <td>${endereco}</td>
    </tr>
    <tr>
        <td>Profiss�o:</td>
        <td>${profissao}</td>
    </tr>    
    <tr>
        <td>Telefone:</td>
        <td>${telefone}</td>
    </tr>
    <tr>
        <td>Descri��o:</td>
        <td>${descricao}</td>
    </tr>
    <tr>
        <td>Data de Nascimento:</td>
        <td>${dataNascimento}</td>
    </tr>    
</table>  
<a href="/faculdadeFean/cliente">Cadastro</a>
<a href="/faculdadeFean/listaClientes">Lista</a>

</body>
</html>