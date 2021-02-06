
public class week2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 14;
		boolean hasLicense = true;

 
		System.out.println(age >= 16);
		age = 16;
		System.out.println(age >= 16);
		System.out.println(hasLicense);
		
		if (age >= 16 && hasLicense) {
			System.out.println("You can drive");
		} else {
			System.out.println("You cannot drive");
		}
		double costOfMilk = 2.50;
		int thirstLevel = 7 ;
		if (costOfMilk < 2.50 || thirstLevel > 6) {
			System.out.println("Milk Please");
		} else {
			System.out.println("No Thanks");
		}
		int numberOfCookies = 14;
		int numberOfChildren = 5;
			if (numberOfCookies % numberOfChildren == 0) {
			System.out.println("Sad Face");
		} else if (numberOfCookies % numberOfChildren < 2) {
			System.out.println("Yes!");
		} else if (numberOfCookies % numberOfChildren < 5) {
			System.out.println("whooohoo!");
		} else {
			System.out.println("Jackpot!");
			
		}
		String loyaltyMemberStatus = "SILVER";
		double loyaltyMemberDiscount = 0.0;

			switch(loyaltyMemberStatus) {
				case "SILVER":
					loyaltyMemberDiscount = 0.10;
					break;
				case "GOLD":
					loyaltyMemberDiscount = 0.15;
					break;
				case "PLATINUM":
					loyaltyMemberDiscount = 0.25;
			} 
			
			System.out.println(loyaltyMemberDiscount);
		double billTotal = 500.00;
		double adjustedTotal = billTotal - (loyaltyMemberDiscount * billTotal);
			System.out.println(adjustedTotal);
			
			if (adjustedTotal > 500) {
				if (loyaltyMemberStatus == "SILVER") {
					loyaltyMemberStatus = "GOLD" ;
				} else if (loyaltyMemberStatus == "GOLD") {
					loyaltyMemberStatus = "PLATINUM" ; 
				}
			}
			System.out.println(loyaltyMemberStatus);
			
		String username = "Tommy123";
		String password = "12345"; 
			if (username.equals("Tommy123") && password.equals("12345")) {
				System.out.println("login sucessful");
			} else {
				System.out.println("access denied");
			}
			
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		} 
		
		for (int i = 0; i <= 100; i += 2) {
			System.out.println(i);
		}
		
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println("EVEN");
			} else {
				System.out.println("ODD");
			}
		}
		
		int x = 100;
		while  (x >= 0) {
			System.out.println(x + " " + (x % 3));
			x --;
		}
	}

}
