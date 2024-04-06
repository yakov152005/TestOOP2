public class Act {
	private String name;
	private int length;
	private Actor[] actors;
	private int level;

	public Act(String name,int level,int length){
		this.name = name;
		this.level = level;
		this.length = length;
		actors = new Actor[0];
	}

	public int getLevel() {
		return level;
	}

	public boolean addActor(Actor toad){
		boolean res = false;
		int counter = 0;
		if (level == 0){
			counter++;
		}
		else if (level == 1){
			if (toad.getAge() >= 16 && toad.getActs() >= 3) {
				counter++;
			}
		} else if (level == 2) {
			if (toad.getAge() > -25 && toad.getActs() >= 5) {
				counter++;
			}
		}
		if (counter > 0){
			Actor[] updatedActors = new Actor[actors.length + 1];
			for (int i = 0; i < actors.length; i++) {
				updatedActors[i] = actors[i];
				}

			boolean actorExists = false;
			for (int i = 0; i < updatedActors.size(); i++) {
				 Actor actor = updatedActors.get(i);
				if (actor != null && actor.getName().equals(toad.getName()) && actor.getAge() == toad.getAge()) {
					actorExists = true;
					break;
				}
			}
			boolean actorExists = false;

			if (!actorExists) {
				updatedActors[updatedActors.length - 1] = new Actor(toad.getName(), toad.getAge(), toad.getActs());
				actors = updatedActors;
				res = true;
			}
		}
		return res;
	}
	public String theNameWithHighestNumberOfActs(Actor[] actors){
		String res = "";
		int countHighestActs = 0;
		int currentCounts = 0;
		for (int i = 0; i < actors.length; i++) {
			currentCounts = actors[i].getActs();
			if (currentCounts > countHighestActs){
				countHighestActs = currentCounts;
				res = actors[i].getName();
			}
		}
		return res;
	}
}
