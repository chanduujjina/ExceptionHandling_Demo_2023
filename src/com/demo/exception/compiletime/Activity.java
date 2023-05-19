package com.demo.exception.compiletime;

public class Activity {
	
	@Override
	public String toString() {
		return "Activity [id=" + id + ", activityName=" + activityName + ", type=" + type + "]";
	}

	public Activity(int id, String activityName, String type) {
		super();
		this.id = id;
		this.activityName = activityName;
		this.type = type;
	}

	private int id;
	
	private String activityName;
	
	private String type;

}
