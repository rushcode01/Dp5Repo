package com.overrriding;
class Device{
	String deviceType;
	int deviceId;
	
	public void deviceInfo(String deviceType,int deviceId) {
		this.deviceType = deviceType;
		this.deviceId = deviceId;
	}
	public void show() {
		System.out.println(deviceId + " " + deviceType);
	}
}

class Computer extends Device{
	public void deviceInfo(String deviceType,int deviceId) {
//		
		this.deviceType = deviceType;
		this.deviceId = deviceId;
	}
	public void show() {
		System.out.println(deviceId + " " + deviceType);
	}
	
}

class GamingPc extends Computer{
	int ram = 16;
	public void show () {
		super.deviceInfo("Striming",124);
		System.out.println(super.deviceType + " "+this.ram);
	}
}
public class ThisSuperDemo {
	public static void main(String[] args) {
 Computer c1 = new Computer();
 c1.deviceInfo("Gaming", 3231);
 c1.show();
 Device d1 = new Device();
 d1.deviceInfo("WorkStation", 2421);
 d1.show();
 GamingPc g1 = new GamingPc();
 g1.show();
	}
}
