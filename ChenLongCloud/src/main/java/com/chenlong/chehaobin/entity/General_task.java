package com.chenlong.chehaobin.entity;

public class General_task {
	private String ID;//主键
	private String task_nam;//项目名称
	private String task_ID;//项目ID
	private String task_datetime;//立项时间
	private String staff_list_ID; //项目人员组成
	private String structure_list_ID;//项目流程结构
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getTask_nam() {
		return task_nam;
	}
	public void setTask_nam(String task_nam) {
		this.task_nam = task_nam;
	}
	public String getTask_ID() {
		return task_ID;
	}
	public void setTask_ID(String task_ID) {
		this.task_ID = task_ID;
	}
	public String getTask_datetime() {
		return task_datetime;
	}
	public void setTask_datetime(String task_datetime) {
		this.task_datetime = task_datetime;
	}

	public String getStaff_list_ID() {
		return staff_list_ID;
	}
	public void setStaff_list_ID(String staff_list_ID) {
		this.staff_list_ID = staff_list_ID;
	}
	
	
	
	
	
	
	
}
