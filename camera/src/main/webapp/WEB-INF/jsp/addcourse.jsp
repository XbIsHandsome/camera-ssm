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

<title>智慧课堂-课程管理</title>

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

<!-- Plugins css-->
<link href="../static/assets/tagsinput/jquery.tagsinput.css"
	rel="stylesheet" />
<link href="../static/assets/toggles/toggles.css" rel="stylesheet" />
<link href="../static/assets/timepicker/bootstrap-timepicker.min.css"
	rel="stylesheet" />
<link href="../static/assets/timepicker/bootstrap-datepicker.min.css"
	rel="stylesheet" />
<link rel="stylesheet" type="text/css"
	href="../static/assets/colorpicker/colorpicker.css" />
<link rel="stylesheet" type="text/css"
	href="../static/assets/jquery-multi-select/multi-select.css" />
<link rel="stylesheet" type="text/css"
	href="../static/assets/select2/select2.css" />

<!-- Custom styles for this template -->
<link href="../static/css/style.css" rel="stylesheet">
<link href="../static/css/helper.css" rel="stylesheet">


<!-- HTML5 shim and Respond.js IE8 support of HTML5 tooltipss and media queries -->
<!--[if lt IE 9]>
          <script src="../static/js/html5shiv.js"></script>
          <script src="../static/js/respond.min.js"></script>
        <![endif]-->

<style type="text/css">
	.error{
		color:red;
	}
</style>
</head>


<body>
	<div style="margin-top: 40px" class="wraper container-fluid"></div>
	<div class="wraper container-fluid">


		<div class="row">
			<div class="col-sm-12">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							<b>添加课程</b>
						</h3>
					</div>
					<div class="panel-body">
						<div class=" form">
							<form class="cmxform form-horizontal tasi-form" id="commentForm"
								method="post" action="/camera/course/addCourse"
								novalidate="novalidate">
								<div class="form-group ">
									<label for="coursename" class="control-label col-lg-2">课程名称</label>
									<div class="col-lg-10">
										<input class=" form-control" id="coursename" name="coursename"
											type="text" required="true" aria-required="true">
									</div>
								</div>
								<div class="form-group ">
									<label class="control-label col-lg-2">上课时间</label>
									<div class="col-lg-10">
										<c:import url="select2.jsp"></c:import>
									</div>
								</div>
								<div class="form-group ">
									<label for="place" class="control-label col-lg-2">上课地点</label>
									<div class="col-lg-10">
										<input class="form-control " id="place" type="text"
											name="place" required="true" aria-required="true">
									</div>
								</div>
								<div class="form-group">
									<label for="cid" class="control-label col-lg-2">班&nbsp;&nbsp;&nbsp;级</label>
									<div class="col-lg-10">
										<label class="col-sm-3 control-label" style="width: 10%">&nbsp;</label>
										<div class="form-group">
											<div class="col-md-9">
												<select class="select2-container select2" name="cid"
													required="true" id="cid">
													<c:forEach items="${mapClassNames }" var="classname"
														varStatus="status">
														<option value="${classname.key} "><c:out
																value="${classname.value}" /></option>
													</c:forEach>
												</select>
											</div>
										</div>
									</div>
								</div>
								<!-- form-group -->
								<div class="form-group ">
									<label for="ccomment" class="control-label col-lg-2">授课老师</label>
									<div class="col-lg-10">
										<input class="form-control " id="teacher" type="text"
											name="teacher" required="true" aria-required="true">
									</div>
								</div>
								<div class="form-group">
									<div class="col-lg-offset-2 col-lg-10" align="center">
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

	<script src="../static/assets/tagsinput/jquery.tagsinput.min.js"></script>
	<script src="../static/assets/toggles/toggles.min.js"></script>
	<script src="../static/assets/timepicker/bootstrap-timepicker.min.js"></script>
	<script src="../static/assets/timepicker/bootstrap-datepicker.js"></script>
	<script type="text/javascript"
		src="../static/assets/colorpicker/bootstrap-colorpicker.js"></script>
	<script type="text/javascript"
		src="../static/assets/jquery-multi-select/jquery.multi-select.js"></script>
	<script type="text/javascript"
		src="../static/assets/jquery-multi-select/jquery.quicksearch.js"></script>
	<script
		src="../static/assets/bootstrap-inputmask/bootstrap-inputmask.min.js"
		type="text/javascript"></script>
	<script type="text/javascript"
		src="../static/assets/spinner/spinner.min.js"></script>
	<script src="../static/assets/select2/select2.min.js"
		type="text/javascript"></script>


	<script src="../static/js/jquery.app.js"></script>
	<script type="text/javascript">
		function createXmlHttp() {
			var xmlHttp;
			try { // Firefox, Opera 8.0+, Safari
				xmlHttp = new XMLHttpRequest();
			} catch (e) {
				try {// Internet Explorer
					xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
				} catch (e) {
					try {
						xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
					} catch (e) {
					}
				}
			}

			return xmlHttp;
		}

		function checkProductCount(coursename) {
			//alert("执行了...."+pid);
			//1、获得异步交互对象
			var xhr = createXmlHttp();
			//2、设置监听xhr.onreadystatechange
			xhr.onreadystatechange = function() {
				if (xhr.readyState == 4) {
					if (xhr.status == 200) {
						//alert("返回了...");
						document.getElementById("show_Count").innerHTML = xhr.responseText;
					}
				}
			};
			//alert("到打开连接了...");
			//3、打开连接
			xhr.open("GET",
					"http://172.16.40.97:8888/camera/course/isRepeated?time="
							+ new Date().getTime() + "&coursename="
							+ coursename, true);
			// 4.发送
			//alert("发送了..."+"${pageContext.request.contextPath}/product_findStockByPid.action?time="
			//		+ new Date().getTime() + "&color="
			//		+ color+"&size="+size+"&pid="+pid);
			xhr.send(null);

		}
	</script>
	<script>
		jQuery(document)
				.ready(
						function() {

							// Tags Input
							jQuery('#tags').tagsInput({
								width : 'auto'
							});

							// Form Toggles
							jQuery('.toggle').toggles({
								on : true
							});

							// Time Picker
							jQuery('#timepicker').timepicker({
								defaultTIme : false
							});
							jQuery('#timepicker2').timepicker({
								showMeridian : false
							});
							jQuery('#timepicker3').timepicker({
								minuteStep : 15
							});

							// Date Picker
							jQuery('#datepicker').datepicker();
							jQuery('#datepicker-inline').datepicker();
							jQuery('#datepicker-multiple').datepicker({
								numberOfMonths : 3,
								showButtonPanel : true
							});
							//colorpicker start

							$('.colorpicker-default').colorpicker({
								format : 'hex'
							});
							$('.colorpicker-rgba').colorpicker();

							//multiselect start

							$('#my_multi_select1').multiSelect();
							$('#my_multi_select2').multiSelect({
								selectableOptgroup : true
							});

							$('#my_multi_select3')
									.multiSelect(
											{
												selectableHeader : "<input type='text' class='form-control search-input' autocomplete='off' placeholder='search...'>",
												selectionHeader : "<input type='text' class='form-control search-input' autocomplete='off' placeholder='search...'>",
												afterInit : function(ms) {
													var that = this, $selectableSearch = that.$selectableUl
															.prev(), $selectionSearch = that.$selectionUl
															.prev(), selectableSearchString = '#'
															+ that.$container
																	.attr('id')
															+ ' .ms-elem-selectable:not(.ms-selected)', selectionSearchString = '#'
															+ that.$container
																	.attr('id')
															+ ' .ms-elem-selection.ms-selected';

													that.qs1 = $selectableSearch
															.quicksearch(
																	selectableSearchString)
															.on(
																	'keydown',
																	function(e) {
																		if (e.which === 40) {
																			that.$selectableUl
																					.focus();
																			return false;
																		}
																	});

													that.qs2 = $selectionSearch
															.quicksearch(
																	selectionSearchString)
															.on(
																	'keydown',
																	function(e) {
																		if (e.which == 40) {
																			that.$selectionUl
																					.focus();
																			return false;
																		}
																	});
												},
												afterSelect : function() {
													this.qs1.cache();
													this.qs2.cache();
												},
												afterDeselect : function() {
													this.qs1.cache();
													this.qs2.cache();
												}
											});

							//spinner start
							$('#spinner1').spinner();
							$('#spinner2').spinner({
								disabled : true
							});
							$('#spinner3').spinner({
								value : 0,
								min : 0,
								max : 10
							});
							$('#spinner4').spinner({
								value : 0,
								step : 5,
								min : 0,
								max : 200
							});
							//spinner end

							// Select2
							jQuery(".select2").select2({
								width : '100%'
							});
						});
	</script>


	<script
		src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
	<script
		src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/localization/messages_zh.js"></script>
	<script type="text/javascript">
		$.validator.setDefaults({
			submitHandler : function() {
				$("#commentForm").submit();

			}
		});
		$().ready(function() {
			// 在键盘按下并释放及提交后验证提交表单
			$("#commentForm").validate({
				rules : {
					coursename : "required",
					teacher : "required",
					place : "required",
					cid : "required",
				},
				messages : {
					coursename : "请输入课程名称",
					teacher : "请输入任课老师名称",
					place : "请输入上课地点",
					cid : "请选择班级",
				}
			});
		});
	</script>
</body>

<!-- Mirrored from coderthemes.com/velonic_3.0/admin_3/form-validation.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 29 May 2016 14:52:40 GMT -->
</html>