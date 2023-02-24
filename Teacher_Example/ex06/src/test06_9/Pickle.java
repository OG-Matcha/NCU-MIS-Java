package test06_9;

public class Pickle {
	boolean isPreserved = false;
	private boolean isCreated = false;

	void preserve() {
	    isPreserved = true;
    }

	public static void main(String[] args) {
		Pickle pickle = new Pickle();
	    pickle.isCreated = true;
	    pickle.preserve();
	}
}

