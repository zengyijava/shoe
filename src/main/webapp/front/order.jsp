<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%--  
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
--%>
<script type="text/javascript" src="js/jquery-1.12.4.min.js"></script>
<script type="text/javascript">
$(function(){
	$.get('../cart/findByMno',null,function(data){
		console.log(data);
		//alert(1);
		showCart(data);
	});
});

function showCart(data){
	str='';
	var totalPrice=0;
	$.each(data,function(index,item){
		totalPrice+=(item.price*item.num);
		str='<strong><span style="color: rgb(255, 102, 0); font-size: 30px;">'+totalPrice+'</span></strong>';
	});
	$('#total').html('').append(str);
}
		
</script>

<%
Date now = new Date();
DateFormat df = new SimpleDateFormat("yyyyMMdd");
String s1 = df.format(now)+ System.nanoTime();
String s2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>支付</title>
<style type="text/css">
.hhh {
	background: url(images/zfb.png);
	height: 500px;
	background-repeat: no-repeat;
	margin-top: 10px;
	margin-left: 500px;
}
</style>  
<link rel="stylesheet" href="css/bootstrap.min.css" />
</head>
<body>
	<script type="text/javascript" src="js/jquery-2.0.3.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	
	<div style="margin-left: 650px; margin-top: 160px">
		<table>
			<td style="width: 400px">订单编号:<%=s1 %></td>
			<td style="width: 400px">创建时间:<%=s2 %></td>
		</table>
	</div>

	<div class="hhh">
		<br> <br> <br> <br> <br>
		<div style="margin-left: 355px" id="total">
			<strong><span
				style="color: rgb(255, 102, 0); font-size: 30px;">总金额</span></strong>
		</div>
	</div>
	


</body>
</html>