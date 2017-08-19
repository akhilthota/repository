<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">


<title>Registration</title>

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

<body style="margin-left: -70px;">

	<section id="container" class="">
		<!--header start-->
		<header class="header white-bg">

			<!--logo start-->
			<!--sidebar end-->
			<!--main content start-->
			<section id="main-content">

				<!-- page start-->


				<section class="panel"
					style="margin-left: -170px; margin-top: 50px;">
						<h3>REGISTRATION</h3>
					<div class="panel-body">
						<div class="stepy-tab">
							<ul id="default-titles" class="stepy-titles clearfix">
								<li id="default-title-0" class="current-step">
									<div>Step 1</div>
								</li>
								<li id="default-title-1" class="#active">
									<div>Step 2</div>
								</li>
								<li id="default-title-2" class="">
									<div>Step 3</div>
								</li>
							</ul>
						</div>
						<form:form class="form-horizontal" id="default"
							action="validateRegistration" method="post"
							modelAttribute="registrationBO">
							<fieldset title="Step1" class="step" id="default-step-0">
								<legend> </legend>
								<div class="form-group">
									<label class="col-lg-2 control-label">Full Name</label>
									<div class="col-lg-10">
										<input type="text" class="form-control"
											placeholder="Full Name">
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-2 control-label">User Type</label>

									<div class="col-lg-10">
										<select class="form-control m-bot15">
											<option>STUDENT</option>
											<option>FACULTY</option>
											<option>PARENT</option>
										</select>
									</div>
								</div>

							</fieldset>
							<fieldset title="Step 2" class="step" id="default-step-1">
								<legend> </legend>
								<div class="form-group"></div>
								<div class="form-group"></div>
								<div class="form-group"></div>

							</fieldset>
							<fieldset title="Step 3" class="step" id="default-step-2">
								<legend> </legend>
								<div class="form-group"></div>
								<div class="form-group"></div>
								<div class="form-group"></div>
								<div class="form-group"></div>
								<div class="form-group"></div>
								<div class="form-group"></div>
							</fieldset>
							<input type="submit" class="finish btn btn-danger" value="Finish" />
						</form:form>
					</div>
				</section>
				</div>
				</div>
				<!-- page end-->
			</section>
	</section>
	<!--main content end-->
	<!--footer start-->
	<footer class="site-footer">
		<div class="text-center">
			2017 &copy cfms; <a href="#" class="go-top"> <i
				class="fa fa-angle-up"></i>
			</a>
		</div>
	</footer>
	<!--footer end-->
	</section>

	<!-- js placed at the end of the document so the pages load faster -->
	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script class="include" type="text/javascript"
		src="js/jquery.dcjqaccordion.2.7.js"></script>
	<script src="js/jquery.scrollTo.min.js"></script>
	<script src="js/jquery.nicescroll.js" type="text/javascript"></script>
	<script src="js/respond.min.js"></script>


	<!--common script for all pages-->
	<script src="js/common-scripts.js"></script>

	<!--script for this page-->
	<script src="js/jquery.stepy.js"></script>


	<script>

      //step wizard

      $(function() {
          $('#default').stepy({
              backLabel: 'Previous',
              block: true,
              nextLabel: 'Next',
              titleClick: true,
              titleTarget: '.stepy-tab'
          });
      });
  </script>


</body>
</html>
