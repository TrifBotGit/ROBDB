package com.dani.caller;

public class ServiceCallerSingleton {
	
	private static ServiceCaller caller;
	
	public static ServiceCaller returnInstance(){
		if(caller==null){
			caller = new ServiceCaller();
			return caller;
		}else{
			return caller;
		}
	}

}
