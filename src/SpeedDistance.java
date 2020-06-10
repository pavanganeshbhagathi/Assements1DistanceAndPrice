import java.util.Scanner;

public class SpeedDistance {

	public static void main(String[] args) {
		// int distance=math.sqrt(math.pow(x2-x1,2)
		// int speed=distance/time
		// 3 types of cars
		// selecting options car&distance
		// switch()----1 and 2 and 3 res three cars
		Scanner s = new Scanner(System.in);
		String cartype = "";
		int distance = 0;
		int baseprice = 50;
		// Mini Sedan SUV

		System.out.print("Please select Your car :\n1.Mini\n2.Sedan\n3.SUV");

		int i = s.nextInt();
		switch (i) {
		case 1:
			cartype = "Mini";
			System.out.print("Please provide distance 1.killmeters:");
			distance = s.nextInt();

			if (distance <= 3) {
				baseprice = 50;
				System.out.println("your price of the car: " + baseprice);
			} else if (distance > 3 && distance < 75) {
				int abovedistance = distance - 3; // km
				baseprice = 50 + abovedistance * 10;
				System.out.println("your price of the car: " + baseprice);
			} else {

				System.out.println(distance);

				//int mileStone = 50 + 72 * 10 + (distance - 75) * 8;
				int mileStone = (distance - 75) * 8;// above count 5*8==40
				int dummy = distance - 10;// && first 5 also less &&last 5 less
				int j = dummy * 10;// below applaying 10 rs per kms
				int k = j - 50;
				System.out.println("your price of the car: " + k);
				// System.out.println("your price of the car: " + mileStone);
			}

			break;
		case 2:
			cartype = "sedan";
			System.out.println("Please provide distance");
			distance = s.nextInt();

				if (distance <= 5) {
					baseprice = 80;
					System.out.println("your price of the car: " + baseprice);
				} else if (distance > 5 && distance < 100) {
					int abovedistance = distance - 5; // km
					baseprice = 80 + abovedistance * 12;
					System.out.println("your price of the car: " + baseprice);
				} else {
					int mileStone = (distance) * 10;

					System.out.println("your price of the car: " + mileStone);
				}


			break;
		case 3:
			cartype = "Suv";
			System.out.println("Please provide distance");
			distance = s.nextInt();

			if (distance <= 5) {
				baseprice = 100;
				System.out.println("your price of the car: " + baseprice);
			} else if (distance > 5) {
				int abovedistance = distance - 5; // km
				baseprice = 100 + abovedistance * 15;
				System.out.println("your price of the car: " + baseprice);
			}
			break;
		}

	}
}