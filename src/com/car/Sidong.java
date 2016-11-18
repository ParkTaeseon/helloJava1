package com.car;

public class Sidong {
	
	public void engineStartStop(int engineOnOff){
		
		Engine eng1 = new Engine();
		
		if(engineOnOff == 1 && eng1.engineStatus == 0 ){
			eng1.start_stopEngine(true);
		}
	}
}
