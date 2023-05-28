package com.demo.exception.runtimeExceptions;

public class Sample1 {
	
	
	private int id;
	private String sampleName;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSampleName() {
		return sampleName;
	}
	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}
	@Override
	public String toString() {
		return "Sample1 [id=" + id + ", sampleName=" + sampleName + "]";
	}
	public Sample1(int id, String sampleName) {
		super();
		this.id = id;
		this.sampleName = sampleName;
	}
	
}
