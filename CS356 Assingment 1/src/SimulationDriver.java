import java.util.Random;

public class SimulationDriver {
	

	public static void main(String[] args) {
		Student[] num = generateStudents();
		IVoteService q1 = new IVoteService(createMultipleQ(),num);
		IVoteService q2 = new IVoteService(createSingleQ(),num);
	
	}

	private static Student[] generateStudents() {
		Random randomGenerator = new Random();
		int n = randomGenerator.nextInt(10) + 1;
		Student[] students = new Student[n];
		for (int i = 1; i < n; i++) {
			students[i] = new Student(i);
		}

		return students;

	}

	private static Multiple createMultipleQ() {
		String s = "What is your favorite food?";
		Multiple q = new Multiple(s, "a.pizza", "b.steak", "c.salad",
				"d.none of these");
		return q;
	}

	private static Single createSingleQ() {
		String s = "Do you believe in God:";
		Single q = new Single(s, "1.yes", "2.no");
		return q;
	}

}
