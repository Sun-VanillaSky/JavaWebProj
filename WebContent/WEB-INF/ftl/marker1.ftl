<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>freemarker模板</title>
<style type="text/css">
th,td,tr,table{
	border: 1px black solid;
	
}
<#-- freemarker注释  -->
<-- HTML注释  -->
</style>
</head>
<body>

	<table>
		<tr>
			<th>属性</th><th>值</th>
		</tr>
		<tr>
			<td>姓名</td><td>${name}</td>
		</tr>
		<tr>
			<td>年龄</td><td>${age}</td>
		</tr>
		<tr>
			<td>性别</td><td>${gender}</td>
		</tr>
	</table>
	<#-- 对对象的取值  -->
	<p>${user.name}${user.id}</p>
	<p>${password!"没有的值，你咋取"}，${password!}</p>
	
	<ul>
		<li>${contextPath!""}</li>
		<li>${contextPath!""}</li>
	</ul>
	
</body>
</html>