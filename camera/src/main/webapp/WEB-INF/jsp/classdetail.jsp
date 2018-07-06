<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>班级详情页</title>
<!-- Bootstrap core CSS -->
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta name="description" content="" />
<meta name="author" content="" />
<link href="../static/css/bootstrap.min.css" rel="stylesheet" />
<link href="../static/css/bootstrap-reset.css" rel="stylesheet" />

<!--Animation css-->
<link href="../static/css/animate.css" rel="stylesheet" />

<!--Icon-fonts css-->
<link href="../static/assets/font-awesome/css/font-awesome.css"
	rel="stylesheet" />
<link href="../static/assets/ionicon/css/ionicons.min.css"
	rel="stylesheet" />

<!-- Plugins css -->
<link href="../static/assets/owl-carousel/owl.carousel.css"
	rel="stylesheet" />
<link href="../static/assets/magnific-popup/magnific-popup.css"
	rel="stylesheet" />

<!-- Custom styles for this template -->
<link href="../static/css/style.css" rel="stylesheet" />
<link href="../static/css/helper.css" rel="stylesheet" />

</head>

<body>

<div style="margin-top: 70px">
	<div class="wraper container-fluid">
		<div class="panel">
			<div class="panel-body">
				<table class="table table-bordered" id="datatable-editable">
					<thead>
						<tr>
							<th>学号</th>
							<th>姓名</th>
							<th>电话号码</th>
							<th>时间</th>
							<th>上课地点</th>
							<th>上课状态</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${studentList }" var="student"
							varStatus="status">
							<tr>
								<td>${student.studentid }</td>
								<td>${student.studentname }</td>
								<td>${student.phone }</td>
								<td>${currentClass.time }</td>
								<td>${currentClass.place }</td>
								<td class="actions">
									<c:if test="${student.state } < 1">
										<span class="text-success"> 正常到课 </span>
									</c:if> <c:if test="${student.state }>1">
										<span class="text-danger"> 旷&nbsp;&nbsp;课 </span>
									</c:if></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>

		<!-- MODAL -->
		<div id="dialog" class="modal-block mfp-hide">
			<section class="panel panel-info panel-color"> <header
				class="panel-heading">
			<h2 class="panel-title">Are you sure?</h2>
			</header>
			<div class="panel-body">
				<div class="modal-wrapper">
					<div class="modal-text">
						<p>Are you sure that you want to delete this row?</p>
					</div>
				</div>

				<div class="row m-t-20">
					<div class="col-md-12 text-right">
						<button id="dialogConfirm" class="btn btn-primary">Confirm</button>
						<button id="dialogCancel" class="btn btn-default">Cancel</button>
					</div>
				</div>
			</div>

			</section>
		</div>
	</div>




	<!-- js placed at the end of the document so the pages load faster -->
	<script src="../static/js/jquery.js"></script>
	<script src="../static/js/bootstrap.min.js"></script>
	<script src="../static/js/pace.min.js"></script>
	<script src="../static/js/modernizr.min.js"></script>
	<script src="../static/js/wow.min.js"></script>
	<script src="../static/js/jquery.nicescroll.js" type="text/javascript"></script>


	<script src="../static/js/jquery.app.js"></script>

	<!-- Examples -->
	<script src="../static/assets/magnific-popup/magnific-popup.js"></script>

	<script src="../static/assets/datatables/dataTables.bootstrap.js"></script>
	<script
		src="../static/assets/jquery-datatables-editable/datatables.editable.init.js"></script>


</body>
</html>
