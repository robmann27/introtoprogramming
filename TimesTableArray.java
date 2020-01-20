


public class TimesTableArray {
	public static void main(String[] args)
	{
		int size = 100;
		int number = 6;

		int [] timesTable = getTimesTable(size, number);

		printArray(timesTable);
	}
 
	private static int [] getTimesTable(int requiredSize, int requiredNumber){
		int[] array = new int[requiredSize];
		
		for(int i = 1; i <= requiredSize; i++) {
			array[i - 1] = i * requiredNumber;
		}
		return array;
	}
	private static void printArray(int [] integerArray){
		int length = integerArray.length;
		for(int i = 0; i < length; i++) {
			System.out.println(integerArray[i]);
		}
	}
	
	
}