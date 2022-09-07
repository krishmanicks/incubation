abstract class Athlete {
	String type = "";
	abstract public void run();
	abstract public void doTraining();
}

class action extends Athlete {
	
	public void run() {
	type = "acting";
		System.out.println("run type: " + type);
	}
	public void doTraining() {
		type = "acting";
		System.out.println("training type training: " + type);
		}
}

class Runner extends Athlete {
	public void run() {
		type = "Runner";
		System.out.println("run type: " + type);
	}
	public void doTraining() {
		type = "Runner";
		System.out.println("training type training: ");
		}
}

class AthleteType {
	
	public static void main(String args[]) {
		action act = new action();
		act.run();
		act.doTraining();
		Runner ru = new Runner();
		ru.run();
		ru.doTraining();
	}
}