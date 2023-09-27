package encapsulation;


	public class Virat {
	    public static void main(String[] args) {
	        Person person = new Person();

	        // Set the name and age using the setter methods
	        person.setName("arjun tahir");
	        person.setAge(25);

	        // Get the name and age using the getter methods
	        String name = person.getName();
	        int age = person.getAge();

	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}
