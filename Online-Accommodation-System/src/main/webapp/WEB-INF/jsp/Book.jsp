<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Booking page with JSP</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/global.css" />"
	rel="stylesheet">

<script src="<c:url value="/resources/js/npm.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>

	<form:form action="addBooking" method="post" modelAttribute="Booking">
		<div class="container-fluid">
			<div class="row">

				<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"></div>
				<div class="col-lg-6 col-md-6 col-sm-6 col xs-12">

					<div class="jumbotron">

						<h1 class="text-center">Book</h1>
						<br>
						<p class="text-denger">${error}</p>


						<div class="form-group">

							<label class="control-Label" for="RoomType">Room type</label>
							<form:select type="text" class="form-control text"
								path="RoomType">
								<form:option value="SAC">Single AC</form:option>
								<form:option value="DAC">Double AC</form:option>
								<form:option value="SNAC">Single Non-AC</form:option>
								<form:option value="DNAC">Double Non-AC</form:option>

							</form:select>
						</div>

						<div class="form-group">
							<label class="control-Label" for="noOfRooms">Number Of Rooms</label>
							<form:input type="text" path="no_Of_Rooms" class="form-control"
								placeholder="enter no. of rooms to be booked" />
						</div>


						<div class="form-group">
							<label class="control-Label" for="Checking">Check IN</label>
							<form:input type="Date" path="CIND" class="form-control"
								placeholder="Checking" />
						</div>

						<div class="form-group">
							<label class="control-Label" for="Checkout">Check OUT</label>
							<form:input type="Date" path="COTD" class="form-control"
								placeholder="checkout" />
						</div>
					</div>
					<div class="pull-right">
						<button type="submit" class="bn btn-outline-dark">Next</button>

						<button type="reset" class="bn btn-outline-dark">Cancel</button>
					</div>


				</div>
				<div class="col-lg-3 col-md-3 col-xs-12"></div>
			</div>
		</div>
	</form:form>

</body>
</html>