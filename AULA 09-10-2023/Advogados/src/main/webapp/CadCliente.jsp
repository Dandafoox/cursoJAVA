<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Cadastro de Cliente </title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

</head>
<body>
 <div class ="container">
		
		<form action = "novocliente" method ="">
			  <div class="form-group">
			    <label for="idcliente">Código do Cliente</label>
			    <input type="text" class="form-control" id="" name = "idcliente">
			  </div>
			  
			  <div class="form-group">
			    <label for="nome"> Nome </label>
			    <input type="text" class="form-control" id="" name= "nome">
			  </div>
			  
			  <div class="form-group">
			    <label for="telefone"> Telefone </label>
			    <input type="text" class="form-control" id="" name="telefone">
			  </div>
			  
			  <div class = "form group">
			   <input type ="submit" class = "btn btn-primary" value ="Enviar">
			  </div>
			  
		</form>
</div>










<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>