public class MainEx1 {
	public static void main(String[] args) {
		Worker ceo = new Worker("yakov",28,null);
		Worker[] worker = {
				new Worker("eli", 24,ceo),
				new Worker("shilo", 21,ceo),
		};
		Worker[] worker2 = {
				new Worker("daniel", 23,worker[0]),
				new Worker("ido", 22,worker[0]),
				new Worker("amit", 28,worker[1]),
				new Worker("itay", 21,worker[1]),
		};
		Worker[] worker3 = {
				new Worker("SHAKED", 32,worker[0]),
				new Worker("LIAT", 41,worker[0]),
				new Worker("eden", 42,worker[1]),
				new Worker("noa", 19,worker[1])
		};
		ceo.addSubordinate(worker[0]);
		ceo.addSubordinate(worker[1]);

		worker[0].addSubordinate(worker2[0]);
		worker[0].addSubordinate(worker2[1]);
		worker[1].addSubordinate(worker2[2]);
		worker[1].addSubordinate(worker2[3]);

		worker[0].addSubordinate(worker3[0]);
		worker[0].addSubordinate(worker3[1]);
		worker[1].addSubordinate(worker3[2]);
		worker[1].addSubordinate(worker3[3]);

		System.out.println(ceo.countTotalManagedWorkers());
		System.out.println(ceo.isCEO());


	}
}
