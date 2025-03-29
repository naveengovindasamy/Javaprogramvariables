
public class Basic {

	public static void main(String[] args) {

		getAreaOfRectangle();
		compareXandY();
		
		//to call method of another class
		TestPrograms prgms = new TestPrograms();
		prgms.testProgram();
		
		
		//static to non-static method call - create object then call 
		Basic basic = new Basic();
		basic.thisCall();
	
	}
	
	public void thisCall() {
		System.out.println("This call");
	}
	
	public static void getAreaOfRectangle() {
	
	
		int length = 5;
		int width = 2;
		int area;
		
		area = length * width;
	
		System.out.println("Length is:" + length);
		System.out.println("Width is:" + width);
		System.out.println("Area of the rectangle is: "+ area);
		
		
	}
	
	public static void compareXandY() {
	
	System.out.println("Java Learning");

	int x = 2;
	int y = 5;

	if (x > y) {
		System.out.println("x is greater than y");
	} else if (x < y) {
		System.out.println("x is less than y");
	} else {
		System.out.println("x and y are equal");
	}

}}





//public class Basic {
	//public static void main(String[] args) {
		//int length = 5;
		//int width = 2;
		//int area;
		
		//area = length * width;
	
		//System.out.println("Length is:" + length);
		//System.out.println("Width is:" + width);
		//System.out.println("Area of the rectangle is: "+ area);
	//}
//}



//public class Basic {

    //public static void main(String[] args) {
        //int x = 2;
        //int y = 5;

       // if (x > y) {
           // System.out.println("x is greater than y");
        //} else if (x < y) {
            //System.out.println("x is less than y");
        //} else {
          //  System.out.println("x and y are equal");
       // }
   // }
//}


//public class Basic {

	//public static void main(String[] args) {
//int doorCode = 454;

//if (doorCode == 563) {
  //System.out.println("Correct code. The door is now open.");
//} else {
  //System.out.println("Wrong code. The door remains closed.");
//}
	//}
	
//}


//public class Basic {
	//public static void main(String[] args) {
		//int x =2;
		//int y = 3;
		//int sum = x+y;
		//System.out.println(sum);
	//}
//}



//--------------------------------------------------------

//(1)Add two numbers asking user inputs


//import java.util.Scanner;

//class Basic{
	//public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		
		//System.out.print("Enter the first number:");
		//int x = scanner.nextInt();
		
		//System.out.print("Enter the second number:");
		//int y = scanner.nextInt();
		
		//System.out.println("Sum: " + (x+y));
		
		//scanner.close();
	//}
	//}

























