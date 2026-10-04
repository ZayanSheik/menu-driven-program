import java.util.Scanner;

class firstmenudrivenprogram {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		System.out.println("What would you like to do?");
		System.out.println("1. Compare the price of two quantities of the same item");
		System.out.println("2. Compare interest earned from two banks");
		System.out.println("3. Choose an account for monthly expenses (not available yet)");
		System.out.print("Enter your choice (1 to 3): ");

		int choice = sn.nextInt();
		switch (choice) {
			case 1: {
				System.out.print("Enter the quantity of the first product: ");
				double quantity1 = sn.nextDouble();
				System.out.print("Enter the quantity of the second product (same unit): ");
				double quantity2 = sn.nextDouble();
				System.out.print("Enter the cost of the first product in rupees: ");
				double cost1 = sn.nextDouble();
				System.out.print("Enter the cost of the second product in rupees: ");
				double cost2 = sn.nextDouble();

				if (quantity1 <= 0 || quantity2 <= 0) {
					System.out.println("Quantities must be greater than zero.");
				} else {
					double unitPrice1 = cost1 / quantity1;
					double unitPrice2 = cost2 / quantity2;
					if (unitPrice1 < unitPrice2) {
						System.out.println("Buy the first product; it is cheaper per unit.");
					} else if (unitPrice2 < unitPrice1) {
						System.out.println("Buy the second product; it is cheaper per unit.");
					} else {
						System.out.println("Both products cost the same per unit.");
					}
				}
				break;
			}
			case 2: {
				System.out.println("Interest is compounded quarterly.");
				System.out.print("Enter the principal for the first bank: ");
				double principal1 = sn.nextDouble();
				System.out.print("Enter the principal for the second bank: ");
				double principal2 = sn.nextDouble();
				System.out.print("Enter the annual interest rate (%) for the first bank: ");
				double rate1 = sn.nextDouble();
				System.out.print("Enter the annual interest rate (%) for the second bank: ");
				double rate2 = sn.nextDouble();
				System.out.print("Enter the time in years for the first bank: ");
				double time1 = sn.nextDouble();
				System.out.print("Enter the time in years for the second bank: ");
				double time2 = sn.nextDouble();

				double amount1 = principal1 * Math.pow(1 + rate1 / 400, 4 * time1);
				double amount2 = principal2 * Math.pow(1 + rate2 / 400, 4 * time2);
				double interest1 = amount1 - principal1;
				double interest2 = amount2 - principal2;
				if (interest1 > interest2) {
					System.out.println("The first bank earns more interest: ₹" + interest1);
				} else if (interest2 > interest1) {
					System.out.println("The second bank earns more interest: ₹" + interest2);
				} else {
					System.out.println("Both banks earn the same amount of interest.");
				}
				break;
			}
			case 3:
				System.out.println("Sorry, this option is not available yet.");
				break;
			default:
				System.out.println("Invalid choice. Enter a number from 1 to 3.");
		}

		sn.close();
	}
}
