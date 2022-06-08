import java.util.*;
import java.io.*;
public class U2014Decpaint {
	static Scanner in;
	static PrintWriter out;
	static int output;
	static int a,b,c,d;
	public static void main(String[] args) throws IOException{
		
	}
	public static void init() throws IOException{
		in = new Scanner(new File("paint.in"));
		out = new PrintWriter("paint.out");
		
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		
		output = -1;
	}
	public static void solve() {
		int[] fences = new int[101];
		for (int i = a; i < b; i++) {
			fences[i] = 1;
		}
		for (int i = c; i < d; i++) {
			fences[i] = 1;
		}
		int sum = 0;
		for (int i = 0; i < 101; i++) {
			sum+= fences[i];
		}
		output = sum;
	}
	public static void output() {
		out.println(output);
		out.close();
		in.close();
	}
}
