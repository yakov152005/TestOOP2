public class Worker {
	private String name;
	private int yearsOld;
	private Worker[] workers;
	private String manager;

	public Worker(String name, int yearsOld,String manager){
		this.name = name;
		this.yearsOld = yearsOld;
		this.manager = manager;
		workers = new Worker[0];
	}
	public void addWorker(Worker worker){
		Worker[] temp = new Worker[workers.length +1];
		for (int i = 0; i < workers.length; i++) {
			temp[i] = workers[i];
		}
		temp[workers.length] = worker;
		workers = temp;
	}
	public boolean isManager() {
		return workers.length >0;
	}

	public boolean isSeniorManager() {
		return isManager() && workers[0].isManager();
	}

	public boolean isMinorWorker(){
		if (workers.length ==0){
			return true;
		}
		return false;
	}

	public int countTotalManagedWorker() {
		int countWorker = 0;
		if (isManager()) {
			countWorker++; // סופר את המנהל עצמו
			for (int i = 0; i < workers.length; i++) {
				countWorker += workers[i].countTotalManagedWorker(); // סופר את העובדים מתחתיו
			}
		}
		return countWorker;
	}

	public String getName() {
		return name;
	}

	public boolean isCEO() {
		for (int i = 0; i < workers.length; i++) {
			if (workers[i].getName() != manager){
				return true;
			}
		}
		return false;
	}



	public String toString(){
		String res = "";
		res+= getClass().getSimpleName() + "---> " + "Name: " + this.name +", Workers --> " ;
		for (int i = 0; i < workers.length; i++) {
			System.out.print(workers[i]);
		}
		return res;
	}
}

