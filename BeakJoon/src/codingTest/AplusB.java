package codingTest;

import java.util.*;

public class AplusB {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String T = sc.nextLine();
        
        for(int i=1; i<=Integer.parseInt(T); i++){
            String AB = sc.nextLine();
            
            String[] arAB = AB.split(" ");
            int A = Integer.parseInt(arAB[0]);
            int B = Integer.parseInt(arAB[1]);
            
            String AplusB = Integer.toString(A+B);
            ar.add(AplusB);
        }
        int totalElements = ar.size();
        for (int index=0; index<totalElements; index++) {
            System.out.println(ar.get(index));
        }
	}

}
