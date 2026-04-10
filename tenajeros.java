package tenajeros;
import java.util.*;
public class tenajeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);

				int hotel[][] = new int[7][5];

				boolean accept = true;

				System.out.println("#################################"
						+ "\n     HOTEL_RESERVATION_SYSTEM"
						+ "\n#################################");

				while (accept) {
					
					System.out.println("MENU:"
							+ "\n1. {View Rooms}"  + "\n2. {Check-In} " 
							+ "\n3. {Check-Out} " + "\n4. {Exit}");
					
					
					System.out.print("Enter choice: ");
					int choice = sc.nextInt();
					System.out.println("#################################");

					switch (choice) {
					case 1:
						System.out.println("\n############## ROOMS #############"
								+ "\n 0 = unoccupied     1 = occupied\n");
						
						for (int x = hotel.length-1; x >= 0; x--) {
							System.out.print("Floor_" + (x + 1) + ": ");
							for (int i = 0; i < hotel[x].length; i++) {
								System.out.print("[" + hotel[x][i] + "]");
							}
							System.out.println();
						}
						
						System.out.print("          ");
						for (int i = 0; i < hotel[0].length; i++) {
							System.out.print(i+1 + "  ");
						}
						System.out.print(" {Room}\n");
						System.out.println("####################################");

						break;
						
					case 2:
						boolean rev = false;
						System.out.println("CHECK-IN");
						
						do {
							System.out.print("Enter floor (1-7): ");
							int floors = sc.nextInt();

							System.out.print("Enter room (1-5): ");
							int rooms = sc.nextInt();

							if (floors>=1 && floors<=7 && rooms>=1 && rooms<=5) {
								if (hotel[floors-1][rooms-1] == 0) {
									hotel[floors-1][rooms-1] = 1;
									System.out.println("\nCheck-in successful!"
											+ "\n#################################");
									rev = true;
								} else {
									System.err.println("Room already occupied.\nPlease select another room!");
								}
							} else {
								System.err.println("Invalid floor/room number.");
							}

						} while (!rev);

						break;
						
					case 3:
						boolean rev2 = false;
						System.out.println("CHECK-OUT");

						do {
							System.out.print("Choose floor [1-7]: ");
							int floors = sc.nextInt();

							System.out.print("Choose room [1-5]: ");
							int rooms = sc.nextInt();

							if (floors>=1 && floors<=7 && rooms>=1 && rooms<=5) {
								if (hotel[floors-1][rooms-1] == 1) {
									hotel[floors-1][rooms-1] = 0;
									System.out.println("\nCheck-out successful!"
											+ "\n#############################");
									rev2 = true;
								} else {
									System.err.println(" Room already empty. \nPlease select another one!");
								}
							} else {
								System.err.println("Invalid floor/room number.");
							}

						} while (!rev2);

						break;
						
					case 4:
						System.out.println("Thank you for booking! \n HAVE FUN STAYING!");
						System.out.println("==================================");
						accept = false;
						break;
						
					default:
						System.err.println("SYSTEM INVALID: Invalid choice! Please try again.");
					}
				}
				
			}
			
		}
		
		
	
