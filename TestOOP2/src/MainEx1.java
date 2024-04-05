public class MainEx1 {
	public static void main(String[] args) {
		Worker[] worker = {
				new Worker("yakov", 28,null),
				new Worker("shilo", 24,null),
				new Worker("daniel", 23,null),
				new Worker("ido", 22,null),
				new Worker("amit", 28,null),
				new Worker("itay", 21,null),
				new Worker("SHAKED", 32,null),
				new Worker("LIAT", 41,null)
		};
		worker[0].addSubordinate(worker[1]);
		worker[1].addSubordinate(worker[2]);
		worker[1].addSubordinate(worker[3]);
		worker[1].addSubordinate(worker[4]);
		worker[4].addSubordinate(worker[5]);
		worker[4].addSubordinate(worker[6]);
		worker[4].addSubordinate(worker[7]);
		System.out.println(worker[0].countTotalManagedWorkers());
		System.out.println(worker[0].isCEO());

	}
}
