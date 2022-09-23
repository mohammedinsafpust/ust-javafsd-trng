package Optional;

import java.util.Optional;

public class Optional04 {
	public static void main(String[] args) {
		Optional<String> str =Optional.of("one");
		//Optional containing string value
		System.out.println(str.orElse("defaultvalue"));
		//Output one
		Optional<String>str1=Optional.empty();
		//Empty Optional object
		System.out.println(str1.orElse("defaultvalue"));//defaultvalue is returned
	}
}
