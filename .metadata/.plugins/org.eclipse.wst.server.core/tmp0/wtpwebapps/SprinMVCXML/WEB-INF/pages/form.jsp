<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Contact</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp"
	crossorigin="anonymous">
</head>
<body>

	<div class="container mt-5">

		<form name="frm" action="frrm"  method="post">
		<%-- <h3 class="text-center">${Header}</h3>
		<p class="text-center">${dis}</p> --%>
		
		<h1 class="text-center">Registration</h1>
		<div class="mb-3">
				<label for="userName" class="form-label">Name</label> <input type="text" class="form-control"
					id="userName" placeholder="Ganesh Rathod" name="name">
			</div>
			<div class="mb-3">
				<label for="email" class="form-label">Email
					address</label> <input type="email" class="form-control"
					id="email"
					 placeholder="name@example.com" 
					 name="email">
			</div>
			  
			  <div class="mb-3">
				<label for="userPassword" class="form-label">Password
					</label> <input type="text" class="form-control"
					id="userPassword" placeholder="name@example.com" name="pass" >
			</div>
			<div class="container  text-center">
			<button type="submit" class="btn btn-success text-center">Sing Up</button>
			</div>
			  

		</form>


	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N"
		crossorigin="anonymous"></script>
</body>
</html>