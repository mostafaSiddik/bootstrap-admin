<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta http-equiv="x-ua-compatible" content="ie=edge">

  <title>AdminLTE 3 | Starter</title>

  <!-- Font Awesome Icons -->
  <link rel="stylesheet" href='<spring:url value="/resources/plugins/fontawesome-free/css/all.min.css"/>'>
  <!-- Theme style -->
  <link rel="stylesheet" href='<spring:url value="/resources/css/adminlte.min.css"/>'>
  <!-- Google Font: Source Sans Pro -->
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
</head>
<body class="hold-transition login-page">
<div class="login-box">
  <div class="login-logo">
    <a href="../../index2.html"><b>Admin</b>LTE</a>
  </div>
  
	<!-- /.login-logo -->
  <div class="card">
    <div class="card-body login-card-body">
      <p class="login-box-msg">Sign in to start your session</p>
		
		<div id="message" style="display:none;" align="center">
			<font color="red"><label></label></font>
		</div>
		
      <form id="signInForm" action="login" method="post">
        <div class="input-group mb-3">
          <input id="email" type="email" class="form-control" placeholder="Email">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-envelope"></span>
            </div>
          </div>
        </div>
        <div class="input-group mb-3">
          <input id="pass" type="password" class="form-control" placeholder="Password">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-lock"></span>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-8">
            <div class="icheck-primary">
              <input type="checkbox" id="remember">
              <label for="remember">
                Remember Me
              </label>
            </div>
          </div>
          <!-- /.col -->
          <div class="col-4">
            <input type="button" id="signIn" value="Sign In" class="btn btn-primary btn-block">
          </div>
          <!-- /.col -->
        </div>
      </form>

      <p class="mb-1">
        <a href="forgot-password.html">Forgot password?</a>
      </p>
      <p class="mb-0">
        <a href="register.html" class="text-center">Register a new membership</a>
      </p>
    </div>
    <!-- /.login-card-body -->
  </div>
</div>
<!-- /.login-box -->
<!-- REQUIRED SCRIPTS -->

<!-- jQuery -->
<script src='<spring:url value="/resources/plugins/jquery/jquery.min.js"/>'></script>
<!-- Bootstrap 4 -->
<script src='<spring:url value="/resources/plugins/bootstrap/js/bootstrap.bundle.min.js"/>'></script>
<!-- AdminLTE App -->
<script src='<spring:url value="/resources/js/adminlte.min.js"/>'></script>

<script type="text/javascript">
	$("#signIn").click(function(){
		var url = $("#signInForm").attr("action");
		  $.post(url,
		  {
		    email: $("#email").val(),
		    password: $("#pass").val()
		  },
		  function(data, status){
		    if(status != "success") 
			    return false;
		    if(data.status == "success") {
				window.location.href = "/home";	
			} else {
				showErrorMessage(data.message);
			}
		  }).fail(function() {
			  $("#errorMessage").html(data.message);
		      $("#errorMessageDialog").dialog();
		  });
	});

	function showErrorMessage (message) {
		var lebel = $('#message label');
		lebel.text(message);
		$('#message').fadeIn('slow', function(){
            $('#message').delay(5000).fadeOut(); 
         });
	}
</script>

</body>
</html>
