package Stratergy.impl;

import Stratergy.iface.SocialMediaStatergy;

public class TwitterStatergy implements SocialMediaStatergy {
	public void connectTo(String friendName) 
	  {
	    System.out.println(
	    "Connecting with " + friendName + " through Twitter");
	  }

}
