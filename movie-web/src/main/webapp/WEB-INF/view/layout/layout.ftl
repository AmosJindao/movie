<#global basePath="${Request['getContextPath']}">
<#macro page title csses scripts >
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>	
	<head>
		<title>${title}</title>
		
		<link rel="icon" href="${basePath}/favicon.ico">  
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">  
        <meta http-equiv="pragma" content="no-cache">  
        <meta http-equiv="cache-control" content="no-cache">  
        <meta http-equiv="expires" content="0"> 
        <!-- 在移动设备浏览器上，通过为视口（viewport）设置 meta 属性为 user-scalable=no 可以禁用其缩放（zooming）功能。 -->
        <meta name="viewport" content="width=device-width, initial-scale=1 ">
		
		<#list csses as css>
			<link type="text/css" rel="stylesheet" href="${basePath}/${css}" />
		</#list>
		
		<!-- 新 Bootstrap 核心 CSS 文件 -->
		<link rel="stylesheet" href="/css/bootstrap/3.2.0/css/bootstrap.min.css">
		<!-- 可选的Bootstrap主题文件（一般不用引入）
		<link rel="stylesheet" href="/css/bootstrap/3.2.0/css/bootstrap-theme.min.css"> -->
		
		<link rel="stylesheet" href="/css/sticky-footer-navbar/sticky-footer-navbar.css">
		
		
		<script type="text/javascript">
			var basePath="${basePath}/";
		</script>
		
	</head>
	<body>
		<!-- Fixed navbar -->
		<div class="navbar navbar-default navbar-fixed-top" role="navigation">
	      <div class="container">
	        <div class="navbar-header">
	          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
	            <span class="sr-only">Toggle navigation</span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	          </button>
	          <a class="navbar-brand" href="#">Project name</a>
	        </div>
	        <div class="collapse navbar-collapse">
	          <ul class="nav navbar-nav">
	            <li class="active"><a href="#">Home</a></li>
	            <li><a href="#about">About</a></li>
	            <li><a href="#contact">Contact</a></li>
	            <li class="dropdown">
	              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <span class="caret"></span></a>
	              <ul class="dropdown-menu" role="menu">
	                <li><a href="#">Action</a></li>
	                <li><a href="#">Another action</a></li>
	                <li><a href="#">Something else here</a></li>
	                <li class="divider"></li>
	                <li class="dropdown-header">Nav header</li>
	                <li><a href="#">Separated link</a></li>
	                <li><a href="#">One more separated link</a></li>
	              </ul>
	            </li>
	          </ul>
	        </div><!--/.nav-collapse -->
	      </div>
	    </div>
	    
		<!-- Begin page content -->
		<div class="container">
	     
	  		<#nested />
	  		
	    </div>
		
	  	
	  	<div class="footer">
	      <div class="container">
	        <p class="text-muted">All Rights are reserved 2014</p>
	      </div>
	    </div>
	  	
	  	
	  	
	  	<!-- =============================javascript============================= -->
		<!-- Placed at the end of the document so the pages load faster -->	
		<script src="${basePath}/js/view/main.js"></script>
		<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
		<script src="/js/jquery/1.11.1/jquery.min.js"></script>
		<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
		<script src="/css/bootstrap/3.2.0/js/bootstrap.min.js"></script>
		<#list scripts as scr>
			<script type="text/javascript" src="${basePath}/${scr}" charset="UTF-8" ></script>
		</#list>
	</body>
 </html>
</#macro>