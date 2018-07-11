package com.camera.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;


public class RemoteController{
	
	private Logger logger = Logger.getLogger(RemoteController.class);
	private RemoteExecuteCommand rec;
	private FtpUtil fu;
	
	public RemoteController(){}
	
	public RemoteController(RemoteExecuteCommand rec, FtpUtil fu){
		this.rec = rec;
		this.fu = fu;
	}
	
	public RemoteController(String ip, String sshUserName, String sshPassword, String ftpUserName, String ftpPassword){
		rec = new RemoteExecuteCommand(ip, sshUserName, sshPassword);
		fu = new FtpUtil(ip, 21, ftpUserName, ftpPassword);
	}
	
	 /** 
     * 执行人脸识别脚本，上课结束后返回出现的标签
     * @param course 课程信息
     * @return 
     *      命令执行后返回的结果值，如果命令执行成功，返回一个int类型的List
     */  
	public List<Integer> runRF(double time){
		List<Integer> result = new ArrayList<Integer>();
		String command = "python3 /home/ubuntu/workspace/src/rf.py ";
		//command += course.getTime();
		command += time;
		
		//这里会执行一节课的时间
		String output = rec.execute(command);
		String[] rows = output.split("\n");
		if(rows[0] != ""){
			logger.info(rows[0]);
			String[] labels = rows[0].split(",");
			for(String label:labels){
				if("null".equals(label)){
					label = "555";
				}
				result.add(Integer.parseInt(label));
			}
		}
		return result;
	}
	
	 /** 
     * 通过ftp上传模型文件并合并
     * @param path 远程存放路径
	 * @param inputs 模型文件输入流
	 * @param labels 对应标签(学生id)
     * @return 
     *      命令执行后返回的结果值，如果命令执行失败，返回错误信息
     */  
	public String runXML(int n, List<InputStream> inputs, int[] labels){
		String csv = "";
		ByteArrayInputStream csvStream;
		String path = "/home/ubuntu/workspace/model/";
		for(int i = 0; i < n; i++){
			//ftp上传xml文件
			fu.uploadFile(path, "/", labels[i]+".xml", inputs.get(i));
			csv += labels[i]+".xml;"+labels[i]+"\n";
		}
		//上传csv文件
		csvStream = new ByteArrayInputStream(csv.getBytes());
		fu.uploadFile(path, "/", "at.csv", csvStream);
		
		//执行mergeXML.py
		String command = "python3 /home/ubuntu/workspace/src/mergeXML.py";
		String output = rec.execute(command);
		logger.error("上传文件的返回字符串----->" + output);
		return output;
	}

	public void setRec(RemoteExecuteCommand rec){
		this.rec = rec;
	}
	
	public RemoteExecuteCommand getRec(){
		return this.rec;
	}
	
	public void setFu(FtpUtil fu){
		this.fu = fu;
	}
	
	public FtpUtil getFu(){
		return this.fu;
	}
}
