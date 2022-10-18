<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>My Shop</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
	crossorigin="anonymous">
</head>
<body>
	<a href="https://front.codes/" class="logo" target="_blank"> <img
		src="https://assets.codepen.io/1462889/fcy.png" alt="">
	</a>

	<div class="section">
		<div class="container">
			<div class="row full-height justify-content-center">
				<div class="col-12 text-center align-self-center py-5">
					<div class="section pb-5 pt-5 pt-sm-2 text-center">
						<h6 class="mb-0 pb-3">
							<span>Log In </span><span>Sign Up</span>
						</h6>
						<input class="checkbox" type="checkbox" id="reg-log"
							name="reg-log" /> <label for="reg-log"></label>
						<div class="card-3d-wrap mx-auto">
							<div class="card-3d-wrapper">
								<div class="card-front">
									<div class="center-wrap">
										<div class="section text-center">
											<h4 class="mb-4 pb-3">Log In</h4>
											<form class="form-group login-form">
												<input type="email" name="logemail"
													class="form-style email mt-2" placeholder="Your Email"
													id="email" autocomplete="off"> <input
													type="password" name="logpass"
													class="form-style password mt-2"
													placeholder="Your Password" id="password"
													autocomplete="off">

											</form>
											<button href="#" class="btn mt-4 login-b">submit</button>
											<p class="mb-0 mt-4 text-center">
												<a href="#0" class="link">Forgot your password?</a>
											</p>
										</div>
									</div>
								</div>
								<div class="card-back">
									<div class="center-wrap">
										<div class="section text-center">
											<h4 class="mb-4 pb-3">Sign Up</h4>
											<form class="form-group registr-form">
												<input type="text" name="logname"
													class="form-style firstName" placeholder="Your First Name"
													id="firstName" autocomplete="off"> <input
													type="email" name="logemail"
													class="form-style lastName mt-2"
													placeholder="Your Last Name" id="lastName"
													autocomplete="off"> <input type="email"
													name="logemail" class="form-style email mt-2"
													placeholder="Your Email" id="email" autocomplete="off">
												<input type="password" name="logpass"
													class="form-style password mt-2"
													placeholder="Your Password" id="password"
													autocomplete="off">
											</form>

											<button href="#" class=" registr-b btn mt-4 ">submit</button>

											<!-- <a href="#" class="btn mt-4">submit</a> -->
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="alert alert-success alertic" role="alert">Success!
					</div>
				</div>
			</div>
		</div>
	</div>

	<link rel="stylesheet" href="css/login1.css">
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/css/bootstrap.min.css"></script>
	<script
		src="https://unicons.iconscout.com/release/v2.1.9/css/unicons.css"></script>
	<script src="js/login1.js"></script>


	<%-- <jsp:include page="footer.jsp"></jsp:include> --%>

</body>
</html>



