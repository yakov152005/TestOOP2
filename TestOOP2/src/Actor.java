public class Actor {
	private String name;
	private int age;
	private int acts;

	public Actor (String name, int age, int acts){
		this.name = name;
		this.age = age;
		this.acts = acts;
	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getActs() {
		return acts;
	}
}
