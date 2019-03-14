<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign up with Jsp</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/global.css" />"
	rel="stylesheet">

<script src="<c:url value="/resources/js/npm.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
	<form action="register" method="post">
		<div class="container-fluid">
			<div class="row">

				<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"></div>
				<div class="col-lg-6 col-md-6 col-sm-6 col xs-12">

					<div class="jumbotron">

						<h1 class="text-center">Sign Up</h1>
						<br>
						<p class="text-denger">${error}</p>

						<div class="form-group">

							<label class="control-Label" for="first">First Name</label> <input
								type="text" name="first" class="form-control"
								placeholder="Enter First Name" required>


						</div>
						<div class="form-group">

							<label class="control-Label" for="last">Last Name</label> <input
								type="text" name="last" class="form-control text"
								placeholder="Enter Last Name" required>


						</div>

						<div class="form-group">

							<label class="control-Label" for="Secutity Question">Secutity
								Question</label> <select class="form-control text">
								<option value="What is your Father's Middle Name?">What
									is your Father's Middle Name?</option>
								<option value="What is your Pet's Name?">What is your
									Pet's Name?</option>
								<option value="What is your Nickname?">What is your
									Nickname?</option>
								<option value="What is your House Number">What is your
									House Number?</option>
								<option value="What is your Favorite Movie Name?">What
									is your Favorite Movie Name?</option>
							</select>
						</div>


						<div class="form-group">
							<label class="control-Label" for="answer">Your Answer</label> <br>
							<input type="text" name="answer" class="form-control"
								placeholder="Enter Your Answer" required>
						</div>


						<div class="form-group">
							<label class="control-Label" for="Gender">Gender</label> <select
								class="form-control text">
								<option value="Male">Male</option>
								<option value="Female">Female</option>

							</select>
						</div>
						
						<div class="form-group">
							<label class="control-Label" for="BDate">Date Of Birth</label>
							<form:input type="Date" path="BDate" class="form-control" placeholder="BirthDate" required />
						</div>
						
						<div class="form-group">
							<label class="control-Label" for="email id">Email id</label> <input
								type="email" name="email id" class="form-control"
								placeholder="Enter Email Id" required>

						</div>
						<div class="form-group">
							<label class="control-Label" for="mobile no">Mobile No</label> <input
								type="text" name="mobile no" class="form-control "
								placeholder="Enter Mobile no" required>

						</div>
					</div>
					<div class="pull-right">
						<button type="submit" class="bn btn-outline-dark">Register</button>
						<button type="reset" class="bn btn-outline-dark">Cancel</button>
					</div>


				</div>
				<div class="col-lg-3 col-md-3 col-xs-12"></div>
			</div>
		</div>






	</form>
	</fieldset>

</body>
</html>