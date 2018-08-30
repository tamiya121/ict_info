<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>

<body>
<div id="wrapper">
	<div id="page-content-wrapper">
	<table class="table table-bordered table-hover">
				<thead>
					<tr>
						<th>메뉴번호</th>
						<th>메뉴이름</th>
						<th>메뉴가격</th>
						<th>메뉴설명</th>					
					</tr>
				</thead>
				<tbody>
					<c:if test="${empty mList}">
						<tr>
							<td colspan="4">등록된 메뉴가 없습니다.</td>
						</tr>
					</c:if>
					<c:forEach items="${mList}" var="mei">
						<tr>
							<td>${mei.meiNum}</td>
							<td><a href="/menu2/menuView?meiNum=${mei.meiNum}">${mei.meiName}</a></td>
							<td>${mei.meiPrice}</td>	
							<td>${mei.meiDesc}</td>												
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div>
			<button data-page="/views/menu2/menuInsert">메뉴등록</button>
			</div>
	</div>
</div>
