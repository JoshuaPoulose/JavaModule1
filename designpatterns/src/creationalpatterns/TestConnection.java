package creationalpatterns;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con1=Connection.getConnection();
		Connection con2=Connection.getConnection();
		
		if(con1.hashCode()==con2.hashCode()) {
			System.out.println("connection is singleton");
		}
		else
			System.out.println("not singleton");
	}

}
