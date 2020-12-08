import java.io.*;
import java.util.*;

public class Main {
	static final Reader in = new Reader();
	static final PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
//		int t=in.nextInt();
		int t=1;
		for(int i=1; i<=t; ++i)
			new Solver();
		out.close();
	}
	
	static class Solver {
		Solver() {
			int n=in.nextInt();
			String s[] = new String[n];
			for(int i=0; i<n; ++i)
				s[i]=in.next();
			char[][] a = new char[s.length][];
			for(int i=0; i<(int)s.length; ++i)
				a[i]=s[i].toCharArray();
			for(int i=0; i<(int)s.length; ++i) {
				for(int j=0; j<(int)s[i].length(); ++j)
					out.print(a[i][j]+" ");
				out.println();
			}
		}
	}
	
	static class Reader {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String next() {
			while(st==null||!st.hasMoreTokens()) {
				try {
					st=new StringTokenizer(in.readLine());
				} catch(Exception e) {}
			}	
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}

}
