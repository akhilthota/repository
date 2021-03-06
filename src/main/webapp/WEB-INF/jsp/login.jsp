<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">





<title>Login</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap-reset.css" rel="stylesheet">
<!--external css-->
<link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
<!-- Custom styles for this template -->
<link href="css/style.css" rel="stylesheet">
<link href="css/style-responsive.css" rel="stylesheet" />

<!-- HTML5 shim and Respond.js IE8 support of HTML5 tooltipss and media queries -->
<!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->
</head>

<body class="login-body"
	style="background-color: #fdf5e6; opacity: 0.9; z-index: -1;">

	<div class="container" style="margin-top: 50px;">

		<fieldset>
			<form:form class="form-signin" action="validateLogin" method="post"
				modelAttribute="loginBO" style="z-index:1;opacity">
				<h2 class="form-signin-heading" style="color: white">sign in
					now</h2>
				<div class="login-wrap">
					<form:input type="text" class="form-control" placeholder="User ID"
						path="userName"/>
						<form:input type="password" class="form-control" path="password"
							placeholder="Password"/>
						<br>
						<span class="pull-right"> <a data-toggle="modal"
							href="#myModal"> Forgot Password?</a>

						</span>
						<br>
						<br>
						<center>
							<button class="btn btn-danger" type="submit"
								style="padding-left: 10px; padding-right: 10px;">Sign
								in</button>
							<br>
						</center>

						<br>
						<br>
						<div class="registration">
							Don't have an account yet? <a class="" href="registration">
								Create an account </a><br> <br>
						</div>
				</div>

				<!-- Modal -->
				<div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog"
					tabindex="-1" id="myModal" class="modal fade">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">&times;</button>
								<h4 class="modal-title">Forgot Password ?</h4>
							</div>
							<div class="modal-body">
								<p>Enter your e-mail address below to reset your password.</p>
								<input type="text" name="email" placeholder="Email"
									autocomplete="off" class="form-control placeholder-no-fix">

							</div>
							<div class="modal-footer">
								<button data-dismiss="modal" class="btn btn-default"
									type="button">Cancel</button>
								<button class="btn btn-success" type="button">Submit</button>
							</div>
						</div>
					</div>
				</div>
				<!-- modal -->

			</form:form>
		</fieldset>
	</div>



	<!-- js placed at the end of the document so the pages load faster -->
	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>


</body>
</html>
