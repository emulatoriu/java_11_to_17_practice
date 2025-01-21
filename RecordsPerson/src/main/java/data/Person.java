package data;

public record Person(String id, String name, int age) {

	@Override
	public String toString() {
		return """
				
				Id: %s
				Name: %s
				Age: %d		
				""".formatted(id, name, age);
	}
	
}
