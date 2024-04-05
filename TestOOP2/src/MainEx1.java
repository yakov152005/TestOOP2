public class MainEx1 {
	public static void main(String[] args) {
		Worker[] worker = {
				new Worker("yakov", 28,"Yakov"),
				new Worker("shaliv", 24,"Yakov"),
				new Worker("daniel", 23,"Yakov"),
				new Worker("ido", 22,"Yakov"),
				new Worker("amit", 28,"Yakov"),
				new Worker("itay", 21,"Yakov"),
				new Worker("SHAKED", 32,"Yakov"),
				new Worker("LIAT", 41,"Yakov")
		};
		worker[0].addWorker(worker[1]);
		worker[1].addWorker(worker[2]);
		worker[1].addWorker(worker[3]);
		worker[1].addWorker(worker[4]);
		worker[4].addWorker(worker[5]);
		worker[4].addWorker(worker[6]);
		worker[4].addWorker(worker[7]);
		System.out.println(worker[0].countTotalManagedWorker());
		System.out.println(worker[1].isCEO());

	}
}
