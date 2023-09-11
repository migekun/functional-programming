package programming;

import java.util.List;

public class FunctionalProgramming {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,3,5,67,12,6,8,4);
		printAllNumbersInListStructures(numbers);
		System.out.println("------------------");
		printAllNumbersInListFunctional(numbers);
		System.out.println("------------------");
		printAllNumbersInListFunctionalSimple(numbers);
		System.out.println("------------------");
		printEvenNumbersInListStructures(numbers);
		System.out.println("------------------");
		printEvenNumbersInListFunctional(numbers);
		System.out.println("------------------");
		printEvenNumbersInListFunctionalLambda(numbers);
	}

	
	private static void printAllNumbersInListFunctionalSimple(List<Integer> numbers) {
		numbers.stream().forEach(System.out::println);
	}
	
	private static boolean isEven(int number) {
		return number % 2 == 0;
	}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
		.filter(FunctionalProgramming::isEven)
		.forEach(System.out::println);
	}
	private static void printEvenNumbersInListFunctionalLambda(List<Integer> numbers) {
		numbers.stream()
			.filter(a -> a % 2 == 0)
			.forEach(System.out::println);
	}


	private static void print(int number) {
		System.out.println(number);
	}
	
	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().forEach(FunctionalProgramming::print);		
	}

	private static void printAllNumbersInListStructures(List<Integer> numbers) {
	
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
	}
	
	private static void printEvenNumbersInListStructures(List<Integer> numbers) {
		
		for (Integer integer : numbers) {
			if (integer%2==0) {				
				System.out.println(integer);
			}
		}
	}
	

}
