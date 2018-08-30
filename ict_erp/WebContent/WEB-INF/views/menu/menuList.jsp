<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<body>
<div id="wrapper">
<jsp:include page="/WEB-INF/views/menu/left.jsp" />
	<div id="page-content-wrapper">
		<div class="container">
			<table class="table table-dorder">
				<thead>
					<tr>
						<th>번호</th>
						<th>메뉴명</th>
						<th>메뉴가격</th>
						<th>설명</th>
					</tr>
				</thead>
				<tbody id="menuTbody">
				<tr>
					<td>${ms.meiNum}</td>
					<td>${ms.meiName}</td>
					<td>${ms.meiPrice}</td>
					<td>${ms.meiDesc}</td>
				</tr>
			
			</tbody>
			</table>
		</div>
	</div>
</div>
<jsp:include page="/WEB-INF/views/menu/bottom.jsp" />