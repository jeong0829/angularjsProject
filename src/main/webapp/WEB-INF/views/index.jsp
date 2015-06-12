<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- 컨텍스트 경로 --%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%-- 리소스 경로 --%>
<c:set var="resourcesPath" value="${contextPath}/resources" />
<%-- 스크립트 라이브러리 경로 --%>
<c:set var="libPath" value="${resourcesPath}/lib" />
<%-- 스크립트 경로 --%>
<c:set var="jsPath" value="${resourcesPath}/js" />    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>앵귤러JS 프로젝트</title>
</head>
<body ng-app="myApp">
	<div ng-controller="MainCtrl">
		<div ng-include="headerPath"></div>
		<div ng-include="leftPath"></div>
		<ng-view>
		</ng-view>
	</div>
	<script type="text/javascript" src="${libPath }/angularjs/angular.min.js"></script>
	<script type="text/javascript" src="${libPath }/angularjs/angular-route.min.js"></script>
	<script type="text/javascript" src="${jsPath }/app.js"></script>
</body>
</html>