import javax.swing.JOptionPane;

public class letters {
	public static void main(String[] args) {
		String graade = JOptionPane.showInputDialog("what did u get on your test?");
		int grade = Integer.parseInt(graade);
		if (grade >= 97) {
			System.out.println("u got an A+");
		} else if (grade <= 96 && grade >= 93) {
			System.out.println("u got a A");
		} else if (grade <= 92 && grade >= 90) {
			System.out.println("u got an A-");
		} else if (grade <= 89 && grade >= 87) {
			System.out.println("u got a B");
		} else if (grade <= 86 && grade >= 83) {
			System.out.println("u got a B-");
		} else if (grade <= 82 && grade >= 80) {
			System.out.println("u got a B-");
		} else if (grade <= 79 && grade >= 77) {
			System.out.println("u got a C+");
		} else if (grade <= 76 && grade >= 73) {
			System.out.println("u got a C");
		} else if (grade <= 72 && grade >= 70) {
			System.out.println("u got a C-");
		} else if (grade <= 69 && grade >= 67) {
			System.out.println("u got a D+");
		} else if (grade <= 66 && grade >= 63) {
			System.out.println("u got a D");
		} else if (grade <= 62 && grade >= 60) {
			System.out.println("u got a D-");
		} else {
			System.out.println("u got a F");
		}

	}

}
