<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h2>
	<c:choose>
		<c:when test="${rst eq 1 }">
			가입이 정상적으로 처리되었습니다.
		</c:when>
		<c:otherwise>
			가입 처리중 오류 발생하엿습니다.
		</c:otherwise>
	</c:choose>
</h2>