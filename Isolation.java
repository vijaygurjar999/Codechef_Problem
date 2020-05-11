import java.lang.*;
import java.util.*;
import java.io.*;

import java.io.*;

class Isolation {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] temp = br.readLine().split(" ");
            int size = temp.length;
            int[] input = new int[size];
            for (int i = 0; i < size; i++) {
                input[i] = Integer.parseInt(temp[i]);
            }
            int query = input[1];
            char[] inputChar = br.readLine().toCharArray();
            HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
            for (char c : inputChar) {
                if (charCountMap.containsKey(c)) {
                    int val = charCountMap.get(c); // 1
                    charCountMap.replace(c, val + 1);
                } else {
                    charCountMap.put(c, 1);
                }
            }
            while (query-- > 0) {

                // stayinghomesaveslife
                int waiting = 0;
                int centers = Integer.parseInt(br.readLine());
                for (Character cc : charCountMap.keySet()) {
                    // search for value
                    int val = charCountMap.get(cc);
                    if (val > centers) {
                        waiting += (val - centers);
                    }

                }
                out.println(waiting);
                out.flush();
            }
            out.close();

        }

    }
}