package tenajeros;
import java.util.*;
public class tenajeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int row = 7;
		int column = 5;
		
		int arr[][] = new int[row][column];
		
		while(true) {
		
			System.out.println("\n ===== Hotel Reservation =====");
			System.out.println("1. View all rooms ");
			System.out.println("2. check out reserve room");
			System.out.println("3. Check our(Free room)");
			System.out.println("4. Exit program ");
			System.out.println("Enter Choice: ");
			int choice = sc.nextInt();
			 
			switch(choice ) {
			case 1: 
				for(int i = 6;i>=0;i-- ) {
					System.out.println("Number of floor" + (i + 1) + ": ");
					for(int j = 5; j >=0; j-- ) {
						System.out.println("[" + arr[i][j] + " ] ");
					}
				}
				 System.out.println();
				break;
				
			case 2: 
				
			
//		for(int i = 0; i<row; i++ ) {
//			for(int j = 0; j < column ; j++ ) {
//				
				
				
			}
			
		}
		
		
		
		
		
		
	}

}
