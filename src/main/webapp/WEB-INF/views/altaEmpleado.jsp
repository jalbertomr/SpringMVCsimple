<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alta Empleado</title>
</head>
<body>
	<div id="agregaEmpleado">
		<h4>Lista de Empleados</h4>
		<form action="altaEmpleado" method="post">
			<label>Empleado Id:</label><input type="text" name="empId" /></br> 
			<label>Empleado	Nombre:</label><input type="text" name="nombre" /></br> 
			<label>Empleado	Designacion:</label><input type="text" name="designacion" /></br>
			 <label>Empleado Sueldo:</label><input type="text" name="sueldo" /> </br>
			 <input type="submit" name="add" />
		</form>
	</div>
</body>
</html>