<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript" src="/script.js"></script>
<script type="text/javascript">
	var request;
	function idVaild() {
		var chk = document.mem_reg.id.value;
		request = openRequest();
		request.open("GET", "/mem/chk.it?chk=" + chk, true);
		request.onreadystatechange = idavailable;
		request.send(null);
	}
	function idavailable() {
		if (request.readyState == 4 && request.status == 200) {
			document.getElementById("ids").innerHTML = request.responseText;
		}
	}
</script>
<div align="left" style="margin-left: 70; margin-right: 70">
	<h2>회원가입</h2>
	<form action="/mem/reg.it" method="post" name="mem_reg">
		<ul style="list-style: none">
			<li>아이디 : <input type="text" name="id" maxlength="20"
				placeholder="아이디" onblur="idVaild()" />
				<span id="ids"></span></li>
			<li>비밀번호 : <input type="password" name="pass" maxlength="20"
				placeholder="비밀번호" /></li>
			<li>비밀번호 재확인 : <input type="password" name="repass"
				maxlength="20" placeholder="비밀번호재확인" /></li>
			<li>이름 : <input type="text" name="name" maxlength="20"
				placeholder="이름" /></li>
			<li>성별 : <input type="radio" name="gender" value="남자" />남자 <input
				type="radio" name="gender" value="여자" />여자
			</li>
			<li>본인확인 이메일 : <input type="text" name="email" maxlength="100"
				placeholder="본인확인 이메일" /></li>
			<li>주소 : <input type="text" name="address" maxlength="100"
				size="40" placeholder="주소" /></li>
		</ul>
		<hr />
		<input type="submit" title="회원가입" alt="회원가입" value="가입하기" />
	</form>
</div>