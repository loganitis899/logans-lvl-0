
public class fib {
	public static void main(String[] args) {
		int a = 5;
		int b = 8;
		System.out.print("0 ");
		System.out.print("1 ");
		System.out.print("1 ");
		System.out.print("2 ");
		System.out.print("3 ");
		for (int i = 0; i < 7; i++) {

			System.out.print(a + " ");

			System.out.print(b + " ");
			int c = a + b;
			System.out.print(c + " ");
			int d = c + b;
			System.out.print(d + " ");
			int e = c + d;
			System.out.print(e + " ");
			int f = d + e;
			System.out.print(f + " ");
			int g = f + e;
			System.out.print(g + " ");
		}
	}

}
