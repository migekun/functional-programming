package programming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayingWithOptional {

	public static void main(String[] args) {
		List<String> fruits = List.of("apple", "banana", "pera", "pinapple", "cherry", "fresa", "granada", "momo", "ciruela");
		Predicate<? super String> predicate = fruit-> fruit.startsWith("b");
		Optional<String> fruit = fruits.stream().filter(predicate).findFirst();
		System.out.println(fruit);
		System.out.println(fruit.isEmpty());
		System.out.println(fruit.isPresent());
		System.out.println(fruit.get());
		
		Optional<String> optional = Optional.of("banana");
		Optional<String> empty = Optional.empty();
	}


}
