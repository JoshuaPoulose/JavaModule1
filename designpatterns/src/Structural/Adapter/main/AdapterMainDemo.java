package Structural.Adapter.main;

import Structural.Adapter.Phoneifaces.LightningPhone;
import Structural.Adapter.Phoneifaces.MicroUsbPhone;
import Structural.Adapter.Wrap.LightingtoMicroUsbAdapter;
import Structural.Adapter.phoneimpl.Android;
import Structural.Adapter.phoneimpl.Iphone;

public class AdapterMainDemo {

	public static void rechargeMicroUsbPhone(MicroUsbPhone phone) {
		phone.useMicroUsb();
		phone.recharge();
	}

	public static void rechargeLightningPhone(LightningPhone phone) {
		phone.useLightning();
		phone.recharge();
	}

	public static void main(String[] args) {
		Android android = new Android();
		Iphone iPhone = new Iphone();
		
		boolean result = android instanceof MicroUsbPhone;
		System.out.println(result);
		

		System.out.println("Recharging android with MicroUsb");
		rechargeMicroUsbPhone(android);

		System.out.println("Recharging iPhone with Lightning");
		rechargeLightningPhone(iPhone);

				
	
	System.out.println("Recharging iPhone with MicroUsb");
	    rechargeMicroUsbPhone(new LightingtoMicroUsbAdapter(iPhone));// call goes to  line#11
	}
}

