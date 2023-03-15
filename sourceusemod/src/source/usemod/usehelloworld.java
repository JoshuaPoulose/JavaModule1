package source.usemod;
import source.mod.helloworld;

public class usehelloworld {
	public static void main(String[] args) {
		
		try {
			helloworld world=new helloworld();
			world.message();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
