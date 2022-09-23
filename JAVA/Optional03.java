package Optional;

import java.util.Optional;

public class Optional03 {
	public static void main(String[] args) {
		String[] words=new String[10];
		Optional<String>checkNull=Optional.ofNullable(words[5]);
		if(checkNull.isPresent()) {
			String word=words[5].toLowerCase();
		}
		else
			System.out.println("word is null");
	}
}
