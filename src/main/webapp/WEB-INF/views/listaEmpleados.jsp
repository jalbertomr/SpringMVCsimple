<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Empleados</title>
</head>
<body>
	<div id="listaEmpleados">
		<h2>Lista de Empleados</h2>
		<ul>
			<c:forEach items="${listaEmpleados}" var="nextEmp">
				<li>
					<b>${nextEmp.empId}</b>
					<b>${nextEmp.nombre}</b>
					<b>${nextEmp.designacion}</b>
					<b>${nextEmp.sueldo}</b>
				</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>