<%@page import="tarefas.ListarTarefasAdicionadas"%>
<%@page import="tarefas.Registro"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <style>
    	body{
    		 background-image: url(http://thekitemap.com/images/feedback-img.jpg)!important; 
    		 background-repeat: no-repeat!important;
    		 background-size: cover!important;
			 height:100%!important;
    		 color: white;
    		 font-size: 20px
    	}
    	table{
    		background-color: gray;
    	}
    	th {
    		padding: 2px 25px;
    		border: 1px solid white;
		}
    	td {
    		padding: 2px 25px;
    		border: 1px solid white;
		}
    	.col{
    		margin-top: 200px;
    		display: flex;
    		align-items: center;
    		justify-content: center;
    	}
    </style>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col ">
				<table>
					<thead>
						<th>Nome da tarefa:</th>
				        <th>Descrição Tarefa:</th>
				        <th>Data:</th>
					</thead>
				    <%
				    List<Registro> registros = ListarTarefasAdicionadas.obterTarefas();
				    for(Registro i: registros){
				    %>
    
        			<tr>
			            <td> <% out.append(i.getTarefa()); %></td>
			            <td>  <% out.append(i.getDescricaoTarefa()); %></td>
			            <td> <% out.append(i.getData()); }%> </td>
       				 </tr>
    		</table>
		</div>
	</div>
</div>
	

</body>
</html>
