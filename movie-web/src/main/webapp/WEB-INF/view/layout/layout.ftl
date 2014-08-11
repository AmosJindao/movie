<#global basePath="${Request['getContextPath']}">
<#macro page title csses scripts >
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>	
	<head>
		<title>${title}</title>
		
		<link rel="shortcut icon" href="${basePath}/favicon.ico">  
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">  
        <meta http-equiv="pragma" content="no-cache">  
        <meta http-equiv="cache-control" content="no-cache">  
        <meta http-equiv="expires" content="0"> 
		
		<#list csses as css>
			<link type="text/css" rel="stylesheet" href="${basePath}/${css}" />
		</#list>
		
		<script type="text/javascript">
			var basePath="${basePath}/";
		</script>
		
	</head>
	<body>
	  	<#nested />
	  	
	  	
	  	<!-- =============================javascript============================= -->
		<!-- Placed at the end of the document so the pages load faster -->	
		<script src="${basePath}/js/view/main.js"></script>
		<#list scripts as scr>
			<script type="text/javascript" src="${basePath}/${scr}" charset="UTF-8" ></script>
		</#list>
	</body>
 </html>
</#macro>