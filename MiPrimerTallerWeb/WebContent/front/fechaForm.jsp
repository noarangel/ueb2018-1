<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<form method="post" action="/mptw/FechaServlet">
			<div Align="center">
				<h1>Ingrese su fecha de nacimiento</h1>
				<div Align="center">
					<table>
						<tr>
							<td>
								<label>Fecha</label>
							</td>
							<td>
								<input type="date" id="fecha"/>
							</td>							
						</tr>
						<tr align="center">
							<td colspan="2"><input type="submit" id="enviar" value="Calcular"/></td>
						</tr>
					</table>				
				</div>
			</div>
		</form>

	</body>
</html>