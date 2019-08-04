<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Empleado Agregado</title>
</head>
<body>
	<div id="EmpleadoAgregado">
		<h3>El Empleado "${empleado.nombre}" ha sido agregado.  </h3>
		<h3>Con id [${empleado.empId}] Designacion "${empleado.designacion}"</h3>
		<h3>con Sueldo ${empleado.sueldo}</h3>
	</div>
</body>
</html>