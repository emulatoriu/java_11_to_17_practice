package logic;

import java.util.List;

import data.Person;

public class Application {
	public static void main(String[] args) {
		Person max = new Person("1", "Max", 10);
		Person susi = new Person("2", "Susi", 11);
		
		System.out.println(max);
		System.out.println(susi);
		
		List<Person> persons = List.of(max, susi, max);
		System.out.println(persons);
		System.out.println(max.name());
		
		PersonService personService = new PersonService();
		long uniqueNamesCount = personService.getDistinctAmountFirstNames(persons);
		System.out.println(uniqueNamesCount);
	}
}
