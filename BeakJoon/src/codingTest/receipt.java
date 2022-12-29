package codingTest;

import java.util.*;

public class receipt{
	
	public static void main(String[] args) {
		ArrayList<String> arReceipt = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String X = sc.nextLine();
        String N = sc.nextLine();
        int sum = 0;
        
        for(int i=1; i<=Integer.parseInt(N); i++){
            String receipt = sc.nextLine();
            
            String[] arAB = receipt.split(" ");
            int a = Integer.parseInt(arAB[0]);
            int b = Integer.parseInt(arAB[1]);
            
            String price = Integer.toString(a*b);
            arReceipt.add(price);
        }
        
        int totalElements = arReceipt.size();
        for (int index=0; index<totalElements; index++) {
        	sum += Integer.parseInt(arReceipt.get(index));
        }
        
        if(sum == Integer.parseInt(X)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
	}
	
}