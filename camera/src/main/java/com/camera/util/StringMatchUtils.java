package com.camera.util;

public class StringMatchUtils {

	public static String match(String permission){
		if(permission.equals("tectnology:select")){
			return "查询技术记录";
		}else if (permission.equals("tectnology:statics")) {
			return "修改技术记录";
		}else if (permission.equals("tectnology:update")) {
			return "统计技术记录";
		}else if (permission.equals("employ:statics")) {
			return "统计人事记录";
		}else if (permission.equals("employ:update")) {
			return "修改人事记录";
		}else if (permission.equals("employ:select")) {
			return "查询人事记录";
		}else if (permission.equals("sale:select")) {
			return "查询销售记录";
		}else if (permission.equals("sale:statics")) {
			return "统计销售记录";
		}else if (permission.equals("sale:update")) {
			return "修改销售记录";
		}else if (permission.equals("eco:select")) {
			return "查询财务记录";
		}else if (permission.equals("eco:statics")) {
			return "统计财务记录";
		}else if (permission.equals("eco:update")) {
			return "修改财务记录";
		}else if (permission.equals("chact:insert")) {
			return "增加一个角色";
		}else if (permission.equals("chact:update")) {
			return "修改角色信息";
		}else if (permission.equals("chact:delete")) {
			return "删除一个角色";
		}else if (permission.equals("user:insert")) {
			return "增加一个用户";
		}else if (permission.equals("user:update")) {
			return "更新个人情况";
		}else if (permission.equals("user:delete")) {
			return "统计技术记录";
		}else if (permission.equals("user:modify")) {
			return "修改用户信息";
		}else if (permission.equals("user:loginInfo")) {
			return "查询用户登录情况";
		}else{
			return null;
		}
	}
	
}
