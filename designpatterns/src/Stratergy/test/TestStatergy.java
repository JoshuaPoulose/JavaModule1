package Stratergy.test;

import Stratergy.context.SocialMediaContext;
import Stratergy.impl.FacebookStatergy;
import Stratergy.impl.GooglePlusStratergy;
import Stratergy.impl.OrkutStatergy;
import Stratergy.impl.TwitterStatergy;

public class TestStatergy {
	public static void main(String[] args) {
		// Creating social Media Connect Object for connecting with friend by
	    // any social media strategy.
	    SocialMediaContext context = new SocialMediaContext();
	 
	    // Setting Facebook strategy.
	    context.setSocialmediaStrategy(new FacebookStatergy());
	    context.connect("James Gosling");
	 
	    System.out.println("====================");
	 
	    // Setting Twitter strategy.
	    context.setSocialmediaStrategy(new TwitterStatergy());
	    context.connect("Rod Johnson");
	 
	    System.out.println("====================");
	 
	    // Setting GooglePlus strategy.
	    context.setSocialmediaStrategy(new GooglePlusStratergy());
	    context.connect("Larry Page");
	 
	    System.out.println("====================");
	 
	    // Setting Orkut strategy.
	    context.setSocialmediaStrategy(new OrkutStatergy());
	    context.connect("Sundar");
	}

}
