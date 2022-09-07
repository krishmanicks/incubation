interface Muscial {
	 interface MuscialInterface {
		abstract public void play();
	}
	interface Ringtone  {
	abstract public void play();
}
}


class M1 implements Muscial.MuscialInterface {
	public void play() {
		System.out.println("Playing Musical Instrument");
	}
}
class M2 implements Muscial.Ringtone {
	public void play() {
		System.out.println("Playing Ringtone");
	}
}

class Instrument {
	
	public static void main(String args[]) {
		M1 mi = new M1();
		mi.play();
		M2 mii = new M2();
		mii.play();
	}
}