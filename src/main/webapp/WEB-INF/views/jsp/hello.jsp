<%@taglib  uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Sample Application for Demo</title>
 
<spring:url value="/resources/core/css/hello.css" var="coreCss" />
<spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${coreCss}" rel="stylesheet" />
</head>
 
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container">	
	<div class="navbar-header">
		<a class="navbar-brand" href="#">Demo to show Static Testing</a>
	</div>
  </div>
</nav>
 
<div class="jumbotron">
  <div class="container">
	<h1>${title}</h1>
	<p>
		<c:if test="${not empty name}">
			Hello ${name}
			<br/>
			<a class="btn btn-primary btn-lg" href="#" role="button"><img src="/StaticWebCode/resources/core/logo/Prashant.jpg" height="200" width="200"/></a>
		
		</c:if>
 
		<c:if test="${empty name}">
			Welcome Welcome!
			<br/>
			<a class="btn btn-default" href="#" role="button"><img src="/StaticWebCode/resources/core/logo/Unknown.png" height="200" width="200"/></a>
		</c:if>
    </p>

	</div>
</div>
 
<div class="container">
 
  <div class="row">
	<div class="col-md-4">
		<h2>Agile Testing Alliance</h2>
		<br/>
		<p>
			<a class="btn btn-default" id="q" href="https://agiletestingalliance.org"  role="button"> <img src="/StaticWebCode/resources/core/logo/ATA.jpg"/></a>
		</p>
	</div>
	<div class="col-md-4">
		<h2>DevOps++ Alliance</h2>
		<br/>
		<p>
			<a class="btn btn-default" id="r" href="http://devopsppalliance.org/" role="button"> <img src="/StaticWebCode/resources/core/logo/download.png"/> </a>
		</p>
	</div>
	<div class="col-md-4">
		<h2>Certified Professional DevOps Foundation</h2>
		<p>
			<a class="btn btn-default" id="s" href="http://cpdof.devopsppalliance.org/" role="button"> <img src="/StaticWebCode/resources/core/logo/CPDOF.JPG"/> </a>
		</p>
	</div>
  </div>
 
 
  <hr>
  
  <div>
  	This page has been visited by ${counter} persons  
  </div>
</div>

 
<spring:url value="/resources/core/css/hello.js" var="coreJs" />
<spring:url value="/resources/core/css/bootstrap.min.js" var="bootstrapJs" />
 
<script src="${coreJs}"></script>
<script src="${bootstrapJs}"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
 
</body>
</html>
