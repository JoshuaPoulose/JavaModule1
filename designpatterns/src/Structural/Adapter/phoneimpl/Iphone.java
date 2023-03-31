package Structural.Adapter.phoneimpl;

import Structural.Adapter.Phoneifaces.LightningPhone;

public class Iphone implements LightningPhone {
	private boolean connector;

	@Override
	public void recharge() {
		// TODO Auto-generated method stub
		if(connector) {
			System.out.println("Recahrge started");
			System.out.println("recharge finished");
		}
		else {
			System.out.println("connect LightingPhone first");
		}
	}

	@Override
	public void useLightning() {
		// TODO Auto-generated method stub
		connector=true;
		System.out.println("LightingPhone connected");
	}

}
