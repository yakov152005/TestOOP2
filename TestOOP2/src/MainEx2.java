public class MainEx2 {
	public static void main(String[] args) {
		Actor[] actors = {
				new Actor("yakov",28,10),//with highest acts
				new Actor("daniel",28,4),
				new Actor("ido",32,7),
				new Actor("sharon",15,8),
				new Actor("amit",22,2),
				new Actor("yakov",28,2) // Same name and age
		};
		Act act = new Act("Romeo & Juliet", 0, 4);
		System.out.println(act.addActor(actors[0]));
		System.out.println(act.addActor(actors[1]));
		System.out.println(act.addActor(actors[2]));
		System.out.println(act.addActor(actors[3]));
		System.out.println(act.addActor(actors[4]));
		System.out.println(act.addActor(actors[5]));
		String name = act.theNameWithHighestNumberOfActs(actors);
		System.out.println(name);
	}
}
