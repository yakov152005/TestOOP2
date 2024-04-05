public class Worker {
	private int birthYear;
	private String name;
	private Worker directManager;
	private Worker[] subordinates;

	public Worker( String name,int birthYear, Worker directManager) {
		this.birthYear = birthYear;
		this.name = name;
		this.directManager = directManager;
		this.subordinates = new Worker[0];
	}

	public boolean isManager() {
		return subordinates.length > 0;
	}

	public boolean isSeniorManager() {
		return directManager != null && directManager.isManager();
	}

	public boolean isMinorWorker() {
		return subordinates.length == 0;
	}

	public int countTotalManagedWorkers() {
		int count = 0;
		for (Worker subordinate : subordinates) {
			count += 1 + subordinate.countTotalManagedWorkers();
		}
		return count;
	}

	public boolean isCEO() {
		if (directManager == null) {
			for (Worker subordinate : subordinates) {
				if (subordinate.directManager != this) {
					return false; 
				}
				if (!subordinate.isCEO()) {
					return false; 
				}
			}
			return true;
		}
		return false; 
	}
	public void addSubordinate(Worker subordinate) {
		Worker[] newSubordinates = new Worker[subordinates.length + 1];
		for (int i = 0; i < subordinates.length; i++) {
			newSubordinates[i] = subordinates[i];
		}
		newSubordinates[subordinates.length] = subordinate;
		subordinates = newSubordinates;
	}

}

