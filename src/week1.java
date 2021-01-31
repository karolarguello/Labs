
public class week1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int availablePlaneSeats = 20;
		double costOfGroceries = 85.35;
		char middleInitial = 'A';
		boolean isItHotOutside = false;
		String customerFirstName = "Frank";
		String streetAddress = "5634 S Long St";
		System.out.println("Seats Available on a Plane: " + availablePlaneSeats);
		System.out.println(costOfGroceries + " is the cost of groceries.");
		System.out.println("The person's middle initial is: " + middleInitial);
		System.out.println("It is hot in Nebraska right now: " + isItHotOutside);
		System.out.println("The customer's first name is: " + customerFirstName);
		System.out.println("The office's address is:" + streetAddress);
		
		availablePlaneSeats -= 2;
		System.out.println(availablePlaneSeats);
		costOfGroceries += 2.15;
		System.out.println(costOfGroceries);
		middleInitial = 'B';
		System.out.println(middleInitial);
		isItHotOutside = !isItHotOutside;
		System.out.println(isItHotOutside);
		String customerFullName = customerFirstName + " " + middleInitial +  " Walker";
		System.out.println(customerFullName);
		System.out.println("This is our customer " + customerFirstName + " he works at" + streetAddress + ".");
		
		
		
	}

}
