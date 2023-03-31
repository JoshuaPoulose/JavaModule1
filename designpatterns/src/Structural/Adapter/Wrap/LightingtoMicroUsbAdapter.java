package Structural.Adapter.Wrap;

import Structural.Adapter.Phoneifaces.LightningPhone;
import Structural.Adapter.Phoneifaces.MicroUsbPhone;

public class  LightingtoMicroUsbAdapter implements MicroUsbPhone {
    private final LightningPhone lightningPhone;

    public LightingtoMicroUsbAdapter(LightningPhone lightningPhone) {
        this.lightningPhone = lightningPhone;
    }

	@Override
	public void recharge() {
		// TODO Auto-generated method stub
		 lightningPhone.recharge();
		}

	@Override
	public void useMicroUsb() {
		// TODO Auto-generated method stub
		 System.out.println("MicroUsb connected");
	        lightningPhone.useLightning();

	}

}
