<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

	<head><link href="damasStyle.css" rel="stylesheet" type="text/css"></head>

	<body>

	<h1 class = "one"> Tablero de damas </h1>


	<div class="ajedrez">

	<% String ancho = request.getParameter("ancho"); %>
	<% for(int i=0 ; i<Integer.valueOf(ancho) ; i++){ %>

		<div class="anchura">
			<div> 1 </div>
		</div>

	<% } %>


	<% String alto = request.getParameter("alto"); %>
	<% for(int i=0 ; i<Integer.valueOf(alto) ; i++){ %>

		<div class="altura">
			<div> 2 </div>
		</div>

	<% } %>
	</div>
  	</body>
</html>