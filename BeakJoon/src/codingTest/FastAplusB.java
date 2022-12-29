package codingTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FastAplusB {

	public static void main(String[] args) throws IOException {
	    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        int T = Integer.parseInt(br.readLine());
     
        for(int i=1;i<=T;i++) {
    	    String[] strs = br.readLine().split(" ");
    	    int A = Integer.parseInt(strs[0]);
    	    int B = Integer.parseInt(strs[1]);
    	
            bw.write(Integer.toString(A + B) + '\n');
        }
        bw.flush();
    }

}
