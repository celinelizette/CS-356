import java.util.Scanner;

public class IVoteService {

	private Student[] studentNum;
	private int a;
	private int b;
	private int c;
	private int d;
	private int one;
	private int two;

	public IVoteService(Single q, Student[] num) {
		studentNum = num;
		printSingle(q);
		getSAnswers();
		printSingleStats();
	}

	public IVoteService(Multiple q, Student[] num) {
		studentNum = num;
		printMult(q);
		getMAnswers();
		printMultipleStats();

	}

	private void printSingle(Single q) {
		System.out.println(q.getQ());
		System.out.println(q.getAns1());
		System.out.println(q.getAns2());

	}

	private void printMult(Multiple q) {
		System.out.println(q.getQ());
		System.out.println(q.getAns1());
		System.out.println(q.getAns2());
		System.out.println(q.getAns3());
		System.out.println(q.getAns4());

	}

	private void getSAnswers() {
		Scanner kb = new Scanner(System.in);
		for (int i = 1; i < studentNum.length; i++) {
			System.out.println("Student " + studentNum[i].getID() + ":");
			int ans = kb.nextInt();
			while (ans != 1 && ans != 2) {
				System.out.println("Sorry try again" + studentNum[i]);
				ans = kb.nextInt();
			}
			if (ans == 1)
				one++;
			else
				two++;

		}

	}

	private void getMAnswers() {
		Scanner bk = new Scanner(System.in);
		for (int i = 1; i < studentNum.length; i++) {
			System.out.println("Student " + studentNum[i].getID() + ":");
			String ans = bk.next();
			while (!ans.equals("a") && !ans.equals("b") && !ans.equals("c")
					&& !ans.equals("d")) {
				System.out.println("Sorry try again" + studentNum[i]);
				ans = bk.next();
			}
			if (ans.equalsIgnoreCase("a"))
				a++;
			else if (ans.equalsIgnoreCase("b"))
				b++;
			else if (ans.equalsIgnoreCase("c"))
				c++;
			else if (ans.equalsIgnoreCase("d"))
				d++;

		}

	}

	private void printSingleStats() {
		System.out.println("The results: \n" + one + " students believe in God\n"
				+ two + " do not.");

	}

	private void printMultipleStats() {
		System.out.println("The results: \n" + a + " students love pizza\n" + b
				+ " students love steak\n" + c + " students love salad\n" + d
				+ " students don't love any of these.\n");

	}

}
