package optional;

import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null;
	//	Optional<String>optional=Optional.of(str);
			//System.out.println(optional.get());
		Optional<String>optional2=Optional.ofNullable(str);
		if(optional2.isPresent())
			System.out.println("value is present"+optional2.get());
		else
//			System.out.println("is null"+optional2.get());

			System.out.println("is null"+optional2.orElse(" str not initialized"));
	}

}
