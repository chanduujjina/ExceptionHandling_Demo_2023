package com.demo.exception.compiletime;

public class Sample {
	
    @Override
	public String toString() {
		return "Sample [name=" + name + ", type=" + type + "]";
	}

	private String name;
    
    private String type;
	
	public Sample(String name,String type) {
		this.name= name;
		this.type=type;
	}

}
