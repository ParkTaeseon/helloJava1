package com.car;

public class Engine {
	
	int rpm;
	int engineStatus;
	
	public String start_stopEngine(boolean engineStatus ){
		if( engineStatus == true )
		{
			// 실제 엔진 거는 코드
			System.out.println("on");
			this.engineStatus = 1;
			return "on";
		}
		else
		{
			// 실제 엔진 끄는 코드
			System.out.println("off");
			this.engineStatus = 0;
			return "off";
		}
	}
	
	public void rpmComtrol(int oilOut){
		this.rpm = oilOut * 1000;
		System.out.println(this.rpm);
	}

}
