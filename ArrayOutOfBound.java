package LAB10;

public class ArrayOutOfBound {
	public static void main(String[]args) {
		int [] array= {23,45,67,89,2};
		
		try {
			System.out.println("The value at the index 10 is :"+array[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception occur here: "+e);
		}
	}
	

}
