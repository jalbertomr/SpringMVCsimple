<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!-- 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
-->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alta Empleado</title>
</head>
<body>
	<div id="agregaEmpleado">
		<h4>Lista de Empleados</h4>
		<form:form action="altaEmpleado" method="post" commandName="empleado">
			<p><label>Empleado Id</label>
			<form:input path="empId"/> </p>
			<p><label>Empleado	Nombre</label>
			<form:input path="nombre" /></p>
			<p><label>Empleado	Designacion</label>
			<form:input path="designacion" /></p>
			<p><label>Empleado Sueldo</label>
			<form:input path="sueldo" /></p>
			 <input type="submit" name="add" />
		</form:form>
	</div>
</body>
</html>