<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<script
  src="https://code.jquery.com/jquery-3.4.1.min.js"
  integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
  crossorigin="anonymous"></script>
<script type="text/javascript"
    src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.0/dist/jquery.validate.min.js"></script>
<meta charset="utf-8">
<title>Cinema Online</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/static/css/style.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body
background="${pageContext.request.contextPath}/resources/images/backgroundimagelogin.jpg">
<div id="header">
			<jsp:include page="header.jsp"></jsp:include>
		</div>
    <div style="color: #0e298c; background-color: rgb(255, 255, 255, 0.5); width: 400px; text-align: center;margin: auto; margin-top: 250px;
 	 border: 1px solid blue; padding: 20px; border-radius: 20px; font-weight: bold;">
        <h2>Login</h2>
        
        <div class="container">
        <form action="login" method="post">
            <label for="email">Email:</label><br>
            <input name="email" size="30" />
            <br><br>
            <label for="password">Password:</label><br>
            <input type="password" name="password" size="30" />
            <br>${message}
            <br><br>           
            <button class="btn-success" type="submit">Login</button>
        </form>
    </div>
   </div>
   
</body>
<script type="text/javascript">
 
    $(document).ready(function() {
        $("#loginForm").validate({
            rules: {
                email: {
                    required: true,
                    email: true
                },
         
                password: "prego inserire la password",
            },
             
            messages: {
                email: {
                    required: "Email obbligatoria",
                    email: "Prego inserire un indirizzo email valido"
                },
                 
                password: "prego inserire la password"
            }
        });
 
    });
</script>

</html>
