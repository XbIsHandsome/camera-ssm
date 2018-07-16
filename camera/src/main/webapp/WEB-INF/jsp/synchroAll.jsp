<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
System.out.print(basePath);
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>智慧课堂-实时监控</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="..static/styles.css">
	-->
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

<!-- Plugins css -->
<link href="../static/assets/owl-carousel/owl.carousel.css"
	rel="stylesheet" />


<!-- Custom styles for this template -->
<link href="../static/css/style.css" rel="stylesheet">
<link href="../static/css/helper.css" rel="stylesheet">
</head>

<body>
	<div>&nbsp;</div>
	<div style="margin-top: 70px;margin-left: 30px">


		<!--Widget-1 -->
		<div class="row text-center">
			<c:forEach items="${classList }" var="myclass" varStatus="status">
				<a href="/camera/sycroh/showdetail?cid=${myclass.cid }&time=${myclass.time }&place=${myclass.place }">
					<div class="col-sm-6 col-md-3">
						<div class="panel">
							<div class="h3 text-top-blue">${myclass.coursename }
							</div>
							<span class="text-success">${myclass.grade }${myclass.className}${myclass.number }</span>
							<br>	
							<span class="text-success"> ${myclass.actualNum} /
								${myclass.num} </span>
							<div class="text-right">
								<i class="fa fa-user fa-2x text-mute"></i>
							</div>
						</div>
					</div>
					</a>
			</c:forEach>

		</div>
		<!-- end row -->

	</div>
	<!-- END Wraper -->

</body>
<!-- js placed at the end of the document so the pages load faster -->
<script src="../static/js/jquery.js"></script>
<script src="../static/js/bootstrap.min.js"></script>
<script src="../static/js/pace.min.js"></script>
<script src="../static/js/wow.min.js"></script>
<script src="../static/js/jquery.nicescroll.js" type="text/javascript"></script>

<!-- Counter-up -->
<script src="../static/js/waypoints.min.js" type="text/javascript"></script>
<script src="../static/js/jquery.counterup.min.js"
	type="text/javascript"></script>

<!-- skycons -->
<script src="../static/js/skycons.min.js" type="text/javascript"></script>

<!-- EASY PIE CHART JS -->
<script src="../static/assets/easypie-chart/easypiechart.min.js"></script>
<script src="../static/assets/easypie-chart/jquery.easypiechart.min.js"></script>
<script src="../static/assets/easypie-chart/example.js"></script>

<!-- sparkline -->
<script src="../static/assets/sparkline-chart/jquery.sparkline.min.js"
	type="text/javascript"></script>
<script src="../static/assets/sparkline-chart/chart-sparkline.js"
	type="text/javascript"></script>

<!-- KNOB JS -->
<!--[if IE]>
        <script type="text/javascript" src="../static/assets/jquery-knob/excanvas.js"></script>
        <![endif]-->
<script src="../static/assets/jquery-knob/jquery.knob.js"></script>

<!-- owl-carousel -->
<script src="../static/assets/owl-carousel/owl.carousel.js"></script>


<!-- Custom Script -->
<script src="../static/js/jquery.app.js"></script>

<script type="text/javascript">
            jQuery(document).ready(function($) {
                /* Counter Up */
                $('.counter').counterUp({
                    delay: 100,
                    time: 1200
                });

                //owl carousel
                $("#velonic-slider,#velonic-slider-2").owlCarousel({
                    navigation : true,
                    slideSpeed : 300,
                    paginationSpeed : 400,
                    singleItem : true,
                    autoPlay:true
                });
            });
            /* BEGIN SVG WEATHER ICON */
            if (typeof Skycons !== 'undefined'){
            var icons = new Skycons(
                {"color": "#fff"},
                {"resizeClear": true}
                ),
                    list  = [
                        "clear-day", "clear-night", "partly-cloudy-day",
                        "partly-cloudy-night", "cloudy", "rain", "sleet", "snow", "wind",
                        "fog"
                    ],
                    i;

                for(i = list.length; i--; )
                icons.set(list[i], list[i]);
                icons.play();
            };
        </script>