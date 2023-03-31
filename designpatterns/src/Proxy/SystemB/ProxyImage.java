package Proxy.SystemB;

import Proxy.SystemA.RealImage;
import Proxy.iface.Image;

public class ProxyImage implements Image {
	private final String filename;
	private RealImage image;

	public ProxyImage(String filename) {
		this.filename = filename;
	}

	public void showImage() {
		
		if (image == null) {
			image = new RealImage(filename);
		}
		image.showImage();
	}
}
