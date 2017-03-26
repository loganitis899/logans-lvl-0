public class yearsAlive2 {
	public static void main(String[] args) {

		int age = 13;
		int yearUp = 2004;
		int yearDown = 2017;
		for (int i = 0; i <= age; i++) {

			System.out.print(" i lived in the year " + (yearUp));
			yearUp = yearUp + 1;
		}
		System.out.println("\n");
		for (int o = 0; o <= age; o++) {

			System.out.print(" i lived in the year " + (yearDown));
			yearDown = yearDown - 1;
		}
	}
}
