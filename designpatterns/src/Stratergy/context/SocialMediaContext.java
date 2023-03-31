package Stratergy.context;

import Stratergy.iface.SocialMediaStatergy;

public class SocialMediaContext {
	SocialMediaStatergy smStrategy;
	 
	  public void setSocialmediaStrategy(SocialMediaStatergy smStrategy) 
	  {
	    this.smStrategy = smStrategy;
	  }
	 
	  public void connect(String name) 
	  {
	    smStrategy.connectTo(name);
	  }
}
