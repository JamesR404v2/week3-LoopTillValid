package com.coderscampus.myapp.main;

//import com.coderscampus.myapp.service.MyService;

public class LoopTillValid {

	
//	private MyService myService = new MyService();
	
	public static void main(String[] args){
		new LoopTillValid().execute();
	}

	private void execute() {
		// Your code goes here, not in the main() method
		
//		int numberOut;
		
		int numberOut = numberBetween50And300();
//		I don't understand why, but if I do not declare the numberOut variable outside of the function, I get an error.
//		And if I do declare it, the value returned by the function numberBetween50And300 is overwriten by the 999 value above....
//		to further investigate.
		
		
		
		
		System.out.println("The number you typed in was:" + numberOut);
		
	}
	
	public static int numberBetween50And300() {
		
		
		
		java.util.Scanner typedInput = new java.util.Scanner(System.in);

		System.out.println("Type a number between 50 and 300");

		String userInput = typedInput.nextLine();
		
		Integer numberizedInput = Integer.parseInt(userInput);

		
		
		while (numberizedInput < 50 || numberizedInput > 300) 
			{
				System.out.println("Oops, that number wasn't between 50 and 300, try again:");
				System.out.println("Type a number between 50 and 300");
	
				userInput = typedInput.nextLine();
				
				numberizedInput = Integer.parseInt(userInput);
				
				
			}
//		if (numberizedInput > 50 && numberizedInput < 300) 
//		{  
		 	int numberOut = numberizedInput;
		 	return numberOut;
//		}
//		else
//		{
//			numberOut = numberizedInput;
//			// adding this to have the variable declared
//		}
			 
	}

}
	

