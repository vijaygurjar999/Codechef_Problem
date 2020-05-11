import java.lang.*;
import java.util.*;
import java.io.*;

class Covid19 {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int size = Integer.parseInt(br.readLine());
			String[] temp = br.readLine().split(" ");
			int[] input = new int[size];
			for (int i = 0; i < size; i++) {
				input[i] = Integer.parseInt(temp[i]);
			}
			int start = 0, end;
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			while (start < size) {
				end = start;
				int currLen;
				if (end != size - 1) {
					while (end < size - 1 && Math.abs(input[end] - input[end + 1]) <= 2) {
						end++;
					}
					currLen = end - start + 1;

				} else {
					currLen = 1;
				}
				if (currLen < min) {
					min = currLen;
				}
				if (currLen > max) {
					max = currLen;
				}
				start = end + 1;

			}
			out.println(min + " " + max);
			out.flush();

		}
		out.close();

	}

}