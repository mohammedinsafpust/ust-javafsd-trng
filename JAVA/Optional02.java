package Optional;

import java.util.Optional;

public class Optional02 {
	public static void main(String[] args) {
		Optional<Object>objOptional=Optional.ofNullable(null);
		System.out.println(objOptional.isPresent());
		//output false
		Optional<String>strOptional=Optional.ofNullable("one");
		System.out.println(strOptional.isPresent());
		//output true
	}
}
