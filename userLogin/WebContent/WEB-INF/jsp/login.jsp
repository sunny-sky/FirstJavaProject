<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
	<script type="text/javascript">
		function realSysTime(clock){
			var now = new Date();
			var year = now.getFullYear();
			var month = now.getMonth();
			var date = now.getDate();
			var day = now.getDay();
			var hour = now.getHours();
			var minu = now.getMinutes();
			var sec = now.getSeconds();
			
			month = month + 1;
			var arr_week = new Array("星期日","星期一","星期二","星期三","星期四","星期五","星期六");
			var week = arr_week[day];
			var time = year+"年"+month+"月"+date+"日"+week+" "+hour+":"+minu+":"+sec;
			clock.innerText = "当前时间："+time;
		}
		
		window.onload = function(){
			window.setInterval("realSysTime(clock)",1000);
		}
	</script>
</head>
<body>
	<div id="clock">	
	</div>
	<center>
	<form name="form1" action="/userLogin/user/checkLogin" method="post" >
	<!-- <script>
		function check(){
			if(form1.username==""){
				alert("请输入用户名！");
				form.username.focus();
				return;
			}
			else if(form1.password==""){
				alert("请输入密码！");
				form.password.focus();
				return;
			}
			else{
				form1.submit();
			}
		}
	</script> -->
		<table>
			<tr>
				<td>用户名:</td>
				<td><input id="username" name="username" type="text"></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><input id="password" name="password" type="password"></td>
			</tr>
			<tr>
				<!-- <td><input type="button" class="btn_grey" value="登录" onclick="check()"></td> -->
				<td><input type="submit"  value="登录" ></td>
				<td><input type="button" value="注册" onclick="window.location.href='regist'"> </td>
			</tr>
		</table>
	</form>
	</center>
</body>
</html>