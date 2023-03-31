package Structural.Adapter.phoneimpl;

import Structural.Adapter.Phoneifaces.MicroUsbPhone;

public class Android implements MicroUsbPhone {
	private boolean connector;

	@Override
	public void recharge() {
		// TODO Auto-generated method stub
		if(connector) {
			System.out.println("Recahrge started");
			System.out.println("recharge finished");
		}
		else {
			System.out.println("connect micro usb first");
		}

	}

	@Override
	public void useMicroUsb() {
		// TODO Auto-generated method stub
		connector=true;
		System.out.println("Micro usb connected");

	}

}
