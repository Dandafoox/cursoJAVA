<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import = "model.Advogado"%> 
 <%@page import ="java.util.ArrayList"%>  
 <% 
ArrayList<Advogado> lista = (ArrayList<Advogado>) request.getAttribute("advogado");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Relátorio de Causas</title>

<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

</head>
<body>
<div class= "container">

		<ul class="nav nav-tabs mt-3">
	  <li class="nav-item">
		    <a class="nav-link active" href="index.jsp"> Início </a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link" href="CadAdvogado.jsp">Cadastro Advogado</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link" href="CadCliente.jsp">Cadastro Cliente</a>
		  </li>
	</ul>
	


	<table class="table table-bordered ">
	
			<hr>
			<div class="card mt-3">
				<h5 class="card-header">Listagem de Causas</h5>
				
				  <thead>
					    <tr>
					      <th scope="col">Oab</th>
					      <th scope="col">Nome</th>
					      <th scope="col">Telefone</th>
					      <th scope="col">Causas</th>
					   </tr>
				  </thead>
  		</div>
  		
		  <tbody>
		 	 <div class="card-body">
				  	 <% 
				  				for(int i=0;i<lista.size();i++){  
				 		 %>  
				       
				    <tr>     
				      <td><%=lista.get(i).getOab() %></td>
				      <td><%=lista.get(i).getNome()%></td>
				      <td><%=lista.get(i).getTelefone()%></td>
				      <td><%=lista.get(i).getTipocausas()%></td>
				      
				      <td>
				      <a href="" >Editar</a> &nbsp;|&nbsp;
				      <a href="" >Apagar</a>
				      </td>
				      
				    </tr>
				    
				    <%} %>
			</div>	    
		  </tbody>
	</table>
</div>

  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>




</body>
</html>