<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>

<head>
<meta charset="UTF-8" />
<title>历史课程查看</title>
<link href="../static/css/bootstrap.min.css" rel="stylesheet" />
<link href="../static/css/bootstrap-reset.css" rel="stylesheet" />
<!--Animation css-->
<link href="../static/css/animate.css" rel="stylesheet" />
<!--Icon-fonts css-->
<link href="../static/assets/font-awesome/css/font-awesome.css"
	rel="stylesheet" />
<link href="../static/assets/ionicon/css/ionicons.min.css"
	rel="stylesheet" />
<!-- Plugin Css-->
<link rel="stylesheet"
	href="../static/assets/magnific-popup/magnific-popup.css" />
<link rel="stylesheet"
	href="../static/assets/jquery-datatables-editable/datatables.css" />
<!-- Custom styles for this template -->
<link href="../static/css/style.css" rel="stylesheet" />
<link href="../static/css/helper.css" rel="stylesheet" />
</head>

<body>
	<div>&nbsp;</div>
	<div style="margin-top: 60px" class="wraper container-fluid">


		<div class="panel">

			<div class="panel-body">
				<table class="table table-bordered table-striped"
					id="datatable-editable">
					<thead>
						<tr>
							<th>课程名称</th>
							<th>班级信息</th>
							<th>上课时间</th>
							<th>上课地点</th>
							<th>到课情况</th>
							<th>操&nbsp;&nbsp;&nbsp;作</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${historyList }" var="h">
							<tr class="gradeX">
								<td><c:out value="${ h.coursename}"/></td>
								<td><c:out value="${ h.grade}"/>
									<c:out value="${ h.className}"/>
									<c:out value="${ h.number}"/></td>
								<td><c:out value="${ h.time}"/></td>
								<td><c:out value="${ h.place}"/></td>
								<td><c:out value="${ h.num}"/>/<c:out value="${ h.actualNum}"/></td>
								<td ><a href="/camera/history/historydetail" >查看详情</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<!-- end: page -->

		</div>
		<!-- end Panel -->


	</div>

	<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="../static/assets/../static/js/amazeui.ie8polyfill.min.js"></script>
<![endif]-->


	<!--[if (gte IE 9)|!(IE)]><!-->
	<script src="../static/js/jquery.js"></script>
	<script src="../static/js/bootstrap.min.js"></script>
	<script src="../static/js/pace.min.js"></script>
	<script src="../static/js/modernizr.min.js"></script>
	<script src="../static/js/wow.min.js"></script>
	<script src="../static/js/jquery.nicescroll.js" type="text/javascript"></script>


	<script src="../static/js/jquery.app.js"></script>

	<!-- Examples -->
	<script src="../static/assets/magnific-popup/magnific-popup.js"></script>
	<script src="../static/assets/jquery-datatables-editable/jquery.dataTables.js"></script>
	<script src="../static/assets/datatables/dataTables.bootstrap.js"></script>
	<script
		src="../static/assets/jquery-datatables-editable/datatables.editable.init.js"></script>

</body>

</html>