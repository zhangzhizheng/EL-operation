<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>request结果</h1>
${requestScope.Fruits.f1 }
${requestScope.Fruits.f2 }
<h1>session结果</h1>
<!-- 当要取得属性名称中包含一些特殊字符，如._等就要一定使用[]。
如果要从List、ArryList或数组里面取值，要用[] -->
${sessionScope.Fruits.f1}
${sessionScope.Fruits.f2}
${sessionScope.Fruits["f2"]}
</body>
</html>