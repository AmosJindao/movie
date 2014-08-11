<#import "/layout/layout.ftl" as layout />
<#escape x as x?html>
	<@layout.page title="電影管理" csses=[] scripts=[] >
		my name is ${name}
		<#noescape></#noescape>
	</@layout.page>
</#escape>
