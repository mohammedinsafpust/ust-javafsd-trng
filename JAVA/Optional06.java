package Optional;

import java.util.Optional;

public class Optional06 {
	public static void main(String[] args) {
		Optional<String> strOptional = Optional.of("ONETWOTHREE");
		Optional<String> srOptional1=strOptional.map(String::toLowerCase);
		srOptional1.ifPresent(System.out::println);
	}

}
