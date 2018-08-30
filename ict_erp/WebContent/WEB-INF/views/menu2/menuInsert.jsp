<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<body>
<script>
var cnt=${ms};
if(cnt==1){
	location.href="/menu2/menuList";
}
</script>
<div id="wrapper">
	<div id="page-content-wrapper">
	<form action="/menu2/menuInsert" method="post">
		<table class="table table-bordered">
				
					<tr>
						<th>메뉴이름</th>
						<td><input type="text" name="meiName"></td>
					</tr>
					<tr>
						<th>메뉴가격</th>
						<td><input type="text" name="meiPrice"></td>
					</tr>
					<tr>
						<th>메뉴설명</th>
						<td><input type="text" name="meiDesc"></td>
					</tr>
					<tr>
						<td colspan="2"><button>메뉴추가</button></td>
					</tr>
				</table>
				</form>			
	</div>
</div>