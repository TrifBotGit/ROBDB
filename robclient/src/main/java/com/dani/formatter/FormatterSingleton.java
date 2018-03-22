package com.dani.formatter;

public class FormatterSingleton {
	
	private static Formatter formatter;
	
	public static Formatter returnInstance(){
		if(formatter==null){
			formatter = new Formatter();
			return formatter;
		}else{
			return formatter;
		}
	}

}
