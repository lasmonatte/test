<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<html>
<head>
<style type="text/css">
html {
	font-family: 맑은 고딕;
	-webkit-text-size-adjust: 100%;
	-ms-text-size-adjust: 100%;
}

body {
	margin: 0;
}

hr {
	height: 0;
	-webkit-box-sizing: content-box;
	-moz-box-sizing: content-box;
	box-sizing: content-box;
}

button, input, optgroup, select, textarea, li {
	margin: 0;
	font: inherit;
	color: inherit;
}
</style>
<title>saAn's</title>
</head>
<body>
	<div align="center">
		<div style="height: 10%">
			<tiles:insertAttribute name="header" />
		</div >
		<div style="height: 10%">
			<tiles:insertAttribute name="nav" />
		</div>
		<div style="height: 70%">
			<tiles:insertAttribute name="section" />
		</div>
		<div style="height: 10%"> 
			<tiles:insertAttribute name="footer" />
		</div>
	</div>
</body>
</html>