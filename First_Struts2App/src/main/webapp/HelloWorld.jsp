<!-- This is the VIew of MVC -->
<%@ page contentType="text/html; charset = UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Hello World</title>
</head>

<body>
	Hello 
	<s:property value="firstName" />
	<!-- s:property with value = "firstName" is calling 
	getFirstName() method from action class i.e. HelloWorldAction class -->
</body>
</html>