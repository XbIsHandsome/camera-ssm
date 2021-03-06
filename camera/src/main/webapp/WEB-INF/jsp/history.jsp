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
<link href="../static/css/style.css" rel="stylesheet" />
<link href="../static/css/helper.css" rel="stylesheet" />
<link href="../static/assets/select2/select2.css" rel="stylesheet" />

</head>

<body>
	<div>&nbsp;</div>
	<div style="margin-top: 60px" class="wraper container-fluid">


		<div class="panel">
			<div class="panel-heading">
				<h3 class="panel-title">
					<b>历史课程信息查看</b>
				</h3>
			</div>
			<form action="/camera/history/showall">
				<div>
					<div>
						<c:import url="select.jsp" />
					</div>
							<button class="btn btn-success" type="submit">查找</button>
				</div>
			</form>
			<div class="panel-body">
				<table class="table table-bordered">
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
								<td><c:out value="${ h.coursename}" /></td>
								<td><c:out value="${ h.grade}" /> <c:out
										value="${ h.className}" /> <c:out value="${ h.number}" /></td>
								<td><c:out value="${ h.time}" /></td>
								<td><c:out value="${ h.place}" /></td>
								<td><c:out value="${ h.actualNum}" />/<c:out
										value="${ h.num}" /></td>
								<td><a
									href="/camera/history/historydetail?weekTime=${h.weekTime }&weekday=${h.weekday}&time=${h.time}
								&cid=${h.cid}&csid=${h.csid}&grade=${h.grade}&classname=${h.className}&number=${h.number}&place=${h.place}">查看详情</a></td>
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


	<!-- Examples -->
	<script src="../static/assets/magnific-popup/magnific-popup.js"></script>
	<script
		src="../static/assets/jquery-datatables-editable/jquery.dataTables.js"></script>
	<script src="../static/assets/datatables/dataTables.bootstrap.js"></script>
	<script
		src="../static/assets/jquery-datatables-editable/datatables.editable.init.js"></script>
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

</body>

</html>