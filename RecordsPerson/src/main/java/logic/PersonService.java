package logic;

import java.util.List;

import data.Person;

public class PersonService {
	public long getDistinctAmountFirstNames(List<Person> persons) {
		return persons.stream()
				.map(Person::name)
				.distinct()
				.count();
	}
}
