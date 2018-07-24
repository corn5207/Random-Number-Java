import java.util.*;

public class YuMin_Chen_Midterm_RandomNumber {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] randomArray = new int[100];
		
		for (int i = 0; i < 100; i++) {
			randomArray[i] = rand.nextInt(1000);
		}
		printArray(randomArray);
		System.out.println();
		printArray(PickDivisibleBy3Ones(randomArray));
		
	}
	private static void printArray(int[] randomArray) {
		for (int i = 0; i < randomArray.length; i++)
			System.out.printf("%d,", randomArray[i]);
		
		
	}
	private static int[] PickDivisibleBy3Ones (int[] array) {
		int[] newArray = new int[100];
		for (int i = 0, j = 0; i < array.length; i++)
			if (array[i]%3==0) {
				newArray[j]=array[i];
				j++;
			}
		return removeZero(newArray);
		
	}
	private static int[] removeZero(int[] array) {
		 int j = 0;
		    for( int i=0;  i<array.length;  i++ )
		    {
		        if (array[i] != 0)
		            array[j++] = array[i];
		    }
		    int [] newArray = new int[j];
		    System.arraycopy( array, 0, newArray, 0, j );
		    return newArray;
	}
}
