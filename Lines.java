package assignment;
import java.util.*; 
import java.lang.Math;

public class Lines {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("choose from the below option ");
		System.out.println("Enter 1 to calculate the length of line");
		System.out.println("Enter 2 to check the euality of two lines ");
		System.out.println("Enter 3 to compare two lines  ");
		int option = sc.nextInt();
	
		
		Scanner dp= new Scanner(System.in);
		System.out.println("enter the x1 of first coordinates ");
		int x1= dp.nextInt(); 
		System.out.println("enter the y1 of first coordinates ");
		int y1 = dp.nextInt();
		System.out.println("enter the x2 of second coordinates ");
		int x2 = dp.nextInt();
		System.out.println("enter the y2 of second coordinates ");
		int y2 = dp.nextInt();
		
		double ans1 = firstline(x1,y1,x2,y2); 
		
		Scanner cp= new Scanner(System.in);
	    System.out.println("Enter the first coordinate of second line ");
	    int p_1 = cp.nextInt();
	    int q_1 = cp.nextInt();
	    System.out.println("Enter the second coordinate of second line ");
	    int p_2 = cp.nextInt();
	    int q_2 = cp.nextInt();
	    
	    double ans2 = secondline(p_1,q_1,p_2,q_2);
		
		switch(option)
		{
			case 1:
				System.out.println("lenght of the first line is = " + ans1);
				break;
				
				
			case 2:
			    if (ans1 == ans2) {
			    	System.out.println("lines are equal");
			    }
			    else {
			    	System.out.println("lines rae not equal");
			    }
			    break;
			    
			case 3: 
			    
			    if (ans1 == ans2) {
			    	System.out.println("lines are equal");
			    }
			    else if (ans1> ans2) {
			    	System.out.println("first line is greater");
			    }
			    
			    else {
			    	System.out.println("second line is greater");
			    }
			    
			    break;
			    default:
			    	System.out.println("invalid input");
		
		}
	}
	
	public static double firstline(int x1,int y1,int x2,int y2) {
		
		double line_len = (double) Math.sqrt(((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2)));
		return line_len;
		
	}
	
	public static double secondline(int p_1,int q_1,int p_2,int q_2) {
		
	    double sec_line = (double) Math.sqrt(((p_1-p_2)*(p_1-p_2)) + ((q_1-q_2)*(q_1-q_2))); 
		return sec_line;	
		
	}	
}
	     
