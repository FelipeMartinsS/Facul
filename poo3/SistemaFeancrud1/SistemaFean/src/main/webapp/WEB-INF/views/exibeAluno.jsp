<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Exibe Detalhes do Aluno</title>
</head>
<body>

<h2>Detalhes do Aluno Cadastrado</h2>
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
        <tr>
        <td>Av1:</td>
        <td>${av1}</td>
    </tr> 
        <tr>
        <td>av2</td>
        <td>${av2}</td>
    </tr> 
        <tr>
        <td>av3</td>
        <td>${av3}</td>
    </tr>     
</table>  
<a href="/faculdadeFean/aluno">Cadastro</a>
<a href="/faculdadeFean/listaAlunos">Lista</a>

</body>
</html>