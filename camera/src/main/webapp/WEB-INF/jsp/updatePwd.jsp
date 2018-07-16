<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    
<!-- Mirrored from coderthemes.com/velonic_3.0/admin_3/recoverpw.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 29 May 2016 14:53:39 GMT -->
<head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <link rel="shortcut icon" href="img/favicon_1.ico">

        <title>智慧课堂密码修改</title>

        


        <!-- Bootstrap core CSS -->
        <link href="../static/css/bootstrap.min.css" rel="stylesheet">
        <link href="../static/css/bootstrap-reset.css" rel="stylesheet">

        <!--Animation css-->
        <link href="../static/css/animate.css" rel="stylesheet">

        <!--Icon-fonts css-->
        <link href="../static/assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
        <link href="../static/assets/ionicon/css/ionicons.min.css" rel="stylesheet" />

        <!--Morris Chart CSS -->
        <link rel="stylesheet" href="../static/assets/morris/morris.css">


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

        <div class="wrapper-page animated fadeInDown">
            <div class="panel panel-color panel-primary">

                <form method="post" action="/camera/user/updatePwd" role="form" class="text-center"> 
                    <div class="alert alert-info alert-dismissable">
                        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
                      	  请输入<b>新密码 </b>
                    </div>
                    <div class="form-group m-b-0"> 
                        <div class="input-group"> 
                            <input type="password" class="form-control" placeholder="新密码" name="user_repass"> 
                            <input type="password" class="form-control" placeholder="确认密码" name="pwd"> 
                            <span class="input-group-btn"> <button type="submit" class="btn btn-primary">提交</button> </span> 
                        </div> 
                    </div> 
                    
                </form>

                                        
                
            </div>
        </div>

        




        <!-- js placed at the end of the document so the pages load faster -->
        <script src="../static/js/jquery.js"></script>
        <script src="../static/js/bootstrap.min.js"></script>
        <script src="../static/js/pace.min.js"></script>
        <script src="../static/js/wow.min.js"></script>
        <script src="../static/js/jquery.nicescroll.js" type="text/javascript"></script>
            

        <!--common script for all pages-->
        <script src="../static/js/jquery.app.js"></script>

    
    </body>

<!-- Mirrored from coderthemes.com/velonic_3.0/admin_3/recoverpw.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 29 May 2016 14:53:39 GMT -->
</html>
