<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Remember Login with Jsp</title>
<link href="../../resources/css/bootstrap.css" rel="stylesheet"
	type="text/css">
<link href="../../resources/css/global.css" rel="stylesheet"
	type="text/css">

</head>
<body>
	<form action="login">
		<div class="container-fluid">
			<div class="row">

				<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"></div>
				<div class="col-lg-6 col-md-6 col-sm-6 col xs-12">

					<div class="jumbotron">

						<h1 class="text-center">Login</h1>
						<br>
						<p class="text-denger">${error}</p>
						<div class="form-group">

							<label class="control-Label" for="username">Username</label> <input
								type="text" name="username" class="form-control"
								placeholder="Username" required>

						</div>

						<div class="form-group">
							<label class="control-Label for="password">Password</label> <input
								type="password" name="password" class="form-control"
								placeholder="Password" required>
						</div>
						<input type="checkbox" name="remember"> Remember Me? <br>
						<br>
						<div class="pull-right">
							<button type="submit" class="bn btn-outline-dark">Login</button>
							<button type="reset" class="bn btn-outline-dark">Close</button>
						</div>
					</div>


				</div>
				<div class="col-lg-3 col-md-3 col-xs-12"></div>
			</div>
		</div>
	</form>
	<script type="text/javascript" src="../../resources/js/bootstrap.js"></script>


</body>
</html>