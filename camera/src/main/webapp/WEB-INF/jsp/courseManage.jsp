<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<!-- Mirrored from coderthemes.com/velonic_3.0/admin_3/form-validation.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 29 May 2016 14:52:40 GMT -->
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<link rel="shortcut icon" href="img/favicon_1.ico">

<title>添加用户</title>

<!-- Bootstrap core CSS -->
<link href="../static/css/bootstrap.min.css" rel="stylesheet">
<link href="../static/css/bootstrap-reset.css" rel="stylesheet">

<!--Animation css-->
<link href="../static/css/animate.css" rel="stylesheet">

<!--Icon-fonts css-->
<link href="../static/assets/font-awesome/css/font-awesome.css"
	rel="stylesheet" />
<link href="../static/assets/ionicon/css/ionicons.min.css"
	rel="stylesheet" />


<!-- Custom styles for this template -->
<link href="../static/css/style.css" rel="stylesheet">
<link href="../static/css/helper.css" rel="stylesheet">


<!-- HTML5 shim and Respond.js IE8 support of HTML5 tooltipss and media queries -->
<!--[if lt IE 9]>
          <script src="../static/js/html5shiv.js"></script>
          <script src="../static/js/respond.min.js"></script>
        <![endif]-->


</head>


<body>
	<div style="margin-top: 40px" class="wraper container-fluid"></div>
	<div class="wraper container-fluid">


		<div class="row">
			<div class="col-sm-12">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							<b>添加用户信息</b>
						</h3>
					</div>
					<div class="panel-body">
						<div class=" form">
							<form class="cmxform form-horizontal tasi-form" id="commentForm"
								method="post" action="/xubing/test/registerUser"
								novalidate="novalidate">
								<div class="form-group ">
									<label for="cname" class="control-label col-lg-2">课程名称</label>
									<div class="col-lg-10">
										<input class=" form-control" id="cname" name="username"
											type="text" required="" aria-required="true">
									</div>
								</div>
								<div class="form-group ">
									<label for="cname" class="control-label col-lg-2">上课时间</label>
									<div class="col-lg-10">
										<c:import url="select.jsp"></c:import>
									</div>
								</div>
								<div class="form-group ">
									<label for="cemail" class="control-label col-lg-2">上课地点</label>
									<div class="col-lg-10">
										<input class="form-control " id="place" type="text"
											name="place" required="true" aria-required="true">
									</div>
								</div>
								<div class="form-group">
									<label for="cname" class="control-label col-lg-2">班&nbsp;&nbsp;&nbsp;级</label>
									<c:forEach items="${mapClassNames }" var="classname" varStatus="status">
										<div class="form-group">
											<div class="col-md-9">
												<select class="select2-container select2" name="cid">
													<option value="${classname.key} }"><c:out value="${classname.value}"/></option>
												</select>
											</div>
										</div>
									</c:forEach>
								</div>
								<!-- form-group -->
								<div class="form-group ">
									<label for="ccomment" class="control-label col-lg-2">授课老师</label>
									<div class="col-lg-10">
										<input class="form-control " id="teacher" type="text"
											name="place" required="true" aria-required="true">
									</div>
								</div>
								<div class="form-group">
									<div class="col-lg-offset-2 col-lg-10">
										<button class="btn btn-success" type="submit">保存</button>
										<button class="btn btn-default" type="button">取消</button>
									</div>
								</div>
							</form>
						</div>
						<!-- .form -->
					</div>
					<!-- panel-body -->
				</div>
				<!-- panel -->
			</div>
			<!-- col -->

		</div>
		<!-- End row -->



	</div>
	<!-- js placed at the end of the document so the pages load faster -->
	<script src="../static/js/jquery.js"></script>
	<script src="../static/js/bootstrap.min.js"></script>
	<script src="../static/js/pace.min.js"></script>
	<script src="../static/js/wow.min.js"></script>
	<script src="../static/js/jquery.nicescroll.js" type="text/javascript"></script>



	<script src="../static/js/jquery.app.js"></script>


</body>

<!-- Mirrored from coderthemes.com/velonic_3.0/admin_3/form-validation.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 29 May 2016 14:52:40 GMT -->
</html>