package Optional;

import java.util.Optional;

public class Optional05 {
	public static void main(String[] args) {
		Optional<String>emptyOption=Optional.empty();
		Optional<String>strOption=Optional.of("one");
		System.out.println(emptyOption.orElseGet(()->"optional null orElseGet"));
		System.out.println(strOption.orElseGet(()->"Optional value orElseGet"));
		
	}
}
