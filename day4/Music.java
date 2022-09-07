import java.util.*;

interface Musical {
	abstract void play();
}

class M implements Musical {
	public void play() {
		System.out.println("Playing music");
	}
}

class Music {
	
	public static void main(String args[]) {
		
		M obj = new M();
		obj.play();
	}
}