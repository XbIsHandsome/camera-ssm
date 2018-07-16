package com.camera.util;

import java.util.Calendar;
import java.util.Date;

/**
 * @author 许兵
 * @description 
 * @date 2018年7月12日,上午10:36:09
 */
public class TimeUtil {

	/**
	 * 计算给定两个日期之间的时间天数
	 * @param startDate 开始时间
	 * @param endDate 结束时间
	 * @return
	 */
	public static Integer countTwoDate(Date start, Date end) { 
		if(start != null && end != null) { 
			Calendar cal = Calendar.getInstance(); 
			cal.setTime(start); 
			long time1 = cal.getTimeInMillis(); 
			cal.setTime(end); 
			long time2 = cal.getTimeInMillis(); 
			long between_days = (time2-time1) / (1000*3600*24); 
			return Integer.parseInt(String.valueOf(between_days)); 
		} 
		return null; 
	}

	/**
	 * 计算两个给定日期之间的周数
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static Integer countTwoDayWeek(Date start, Date end) { 
		if(start != null && end != null)  { 
			Calendar cal= Calendar.getInstance(); 
			cal.setTime(start); 
			long time1 = cal.getTimeInMillis(); 
			cal.setTime(end); 
			long time2 = cal.getTimeInMillis(); 
			long between_days = (time2-time1)/(1000*3600*24); 
			Double days = Double.parseDouble(String.valueOf(between_days)); 
			if((days/7)>0 && (days/7)<=1){ 
				//不满一周的按一周算 
				return 1; 
			}else if(days/7>1){ 
				int day=days.intValue(); 
				if(day%7>0){ 
					return day/7+1; 
				}else{ 
					return day/7; 
				} 
			}else if((days/7) == 0){ 
				return 0; 
			}else{ 
				//负数返还null 
				return null; 
			} 
		} 
		return null; 
	}

	/**
	 * 计算当前距离给定日期之间的周数
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static Integer countCurrentDayWeek() { 
		Date start = new Date(new Date().getTime() - 8640000000l);
		Date end = new Date();
		if(start != null && end != null)  { 
			Calendar cal= Calendar.getInstance(); 
			cal.setTime(start); 
			long time1 = cal.getTimeInMillis(); 
			cal.setTime(end); 
			long time2 = cal.getTimeInMillis(); 
			long between_days = (time2-time1)/(1000*3600*24); 
			Double days = Double.parseDouble(String.valueOf(between_days)); 
			if((days/7)>0 && (days/7)<=1){ 
				//不满一周的按一周算 
				return 1; 
			}else if(days/7>1){ 
				int day=days.intValue(); 
				if(day%7>0){ 
					return day/7+1; 
				}else{ 
					return day/7; 
				} 
			}else if((days/7) == 0){ 
				return 0; 
			}else{ 
				//负数返还null 
				return null; 
			} 
		} 
		return null; 
	}
	
	
	public static  int countDayOfWeek(){
		return Calendar.DAY_OF_WEEK!=7?Calendar.DAY_OF_WEEK+1:1;
	}

	/**
	 * 判断当前是第几节课
	 */
	public static Integer countCurrentCourseTime(){
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		//第一节课
		if(c.get(Calendar.HOUR_OF_DAY) >= 8 ){
			if(c.get(Calendar.HOUR_OF_DAY) <= 9 && 
					c.get(Calendar.MINUTE) <= 40){
				return 1;
			}
		}
		//第二节课
		if(c.get(Calendar.HOUR_OF_DAY) >= 10 ){
			if(c.get(Calendar.HOUR_OF_DAY) <= 11 && 
					c.get(Calendar.MINUTE) < 40){
				return 2;
			}
		}
		//第三节课
		if(c.get(Calendar.HOUR_OF_DAY) >= 14 ){
			if(c.get(Calendar.HOUR_OF_DAY) <= 15 && 
					c.get(Calendar.MINUTE) <= 40){
				return 3;
			}
		}
		//第四节课
		if(c.get(Calendar.HOUR_OF_DAY) >= 16 ){
			if(c.get(Calendar.HOUR_OF_DAY) <= 17 && 
					c.get(Calendar.MINUTE) <= 40){
				return 4;
			}
		}

		//第五节课
		if(c.get(Calendar.HOUR_OF_DAY) >= 19 ){
			if (c.get(Calendar.HOUR_OF_DAY) <= 20 && 
					c.get(Calendar.MINUTE) <= 40){
				return 5;
			}
		}
		return 1;
	}

	/**
	 * 根据参数返回相应的文字信息
	 * @param time 第几节课
	 * @return
	 */
	public static String turnString(Integer time){
		String returnTime = null;
		switch (time){
		case 1: returnTime = "第一大节"; break;
		case 2: returnTime = "第二大节"; break;
		case 3: returnTime = "第三大节"; break;
		case 4: returnTime = "第四大节"; break;
		case 5: returnTime = "第五大节"; break;
		}
		return returnTime;
	}
	
	/**
	 * 根据传入参数返回相应的数字信息
	 * @param time 第几节课
	 * @return
	 */
	public static Integer turnInteger(String time){
		if(time != null && "".equals(time)){
			if("第一节课".equals(time)) return 1;
			else if("第二节课".equals(time)) return 2;
			else if("第三节课".equals(time)) return 3;
			else if("第四节课".equals(time)) return 4;
			else if("第五节课".equals(time)) return 5;
		}
		return 0;
	}

}
