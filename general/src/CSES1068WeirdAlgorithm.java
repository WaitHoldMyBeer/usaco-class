import java.util.*;
public class CSES1068WeirdAlgorithm {
	static Scanner in;
	static int n;
	static StringBuilder output;
	public static void main(String[] args) {
		init();
		solve();
		output();
	}
	public static void init() {
		in = new Scanner(System.in);
		n = in.nextInt();
		output = new StringBuilder();
	}
	public static void solve() {
		output.append(n).append(" ");
		int num = n;
		while (num!=1) {
			if (num%2 == 0) {
				num/=2;
			}
			else {
				num = num*3+1;
			}
			output.append(num).append(" ");
		}
	}
	public static void output() {
		System.out.println(output.toString());
	}
}
