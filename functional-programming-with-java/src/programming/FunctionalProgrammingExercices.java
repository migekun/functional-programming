package programming;

import java.util.List;

public class FunctionalProgrammingExercices {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 3, 5, 67, 12, 6, 8, 4);

		//printOddNumbersInListFunctionalLambda(numbers);
		
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		courses.stream().forEach(System.out::println);
		System.out.println("-------------------");
		courses.stream().filter(course->course.contains("Spring")).forEach(System.out::println);
		System.out.println("-------------------");
		courses.stream().filter(course->course.length() > 4).forEach(System.out::println);
		System.out.println("-------------------");
		courses.stream().map(course -> course.length()).forEach(System.out::println);
		
		
		System.out.println("-------------------");
		printSquareOfEvenNumbersInListFunctional(numbers);
		System.out.println("-------------------");
		printCuveOfOddNumbersInListFunctional(numbers);
	}


	private static void printOddNumbersInListFunctionalLambda(List<Integer> numbers) {
		numbers.stream().filter(a -> a % 2 != 0).forEach(System.out::println);
	}
	
	private static void printSquareOfEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
			.filter(a -> a % 2 == 0)
			.map(n -> n * n)
			.forEach(System.out::println);
	}
	private static void printCuveOfOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
			.filter(a -> a % 2 != 0)
			.map(n -> n * n * n)
			.forEach(System.out::println);
	}



}
