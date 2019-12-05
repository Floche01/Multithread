package q1;

class MyThread extends Thread {
	
	char letter1;
	char letter2;
	String line;
	int count1;
	int count2;

	public MyThread(char letter1, char letter2, String line) {
		super();
		this.letter1 = letter1;
		this.letter2 = letter2;
		this.line = line;
		this.count1 = 0;
		this.count2 = 0;
		run();
	}

	public void run() {
		for(int i = 0; i < line.length(); i++){
			if (line.charAt(i) == letter1) {
		        count1++;
		    }
			if (line.charAt(i) == letter2) {
		        count2++;
		    }
		}

		System.out.println("The frequency of lower and upper case letter: " + letter1 + " is: " + count1);
		System.out.println("The frequency of lower and upper case letter: " + letter2 + " is: " + count2);
	}
}
