public class Hello {

	public static void main(String[] args) {
		
		System.out.println(Hello.greetingMessage("GitHub"));
		
		int[] array = {5,4,3,2,1};
		
		System.out.println(Hello.arrayToString("Array", array));
		array = Hello.bubbleSort(array);
		System.out.println(Hello.arrayToString("Sorted Array", array));
	}

	public static String greetingMessage(String name){
		String res = "Hello, " + name;
		return res;
	}

	public static int[] bubbleSort(int[] array){
		// TODO Sort the given array in an ascending order and return the sorted array.
		int temp;
		boolean notsorted;
		do {
			notsorted = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					notsorted = true;
		
				}
			}
		} while (notsorted);
		return array;
	}
	
	public static String arrayToString(String title,int[] array){
		
		String str = title + " : ";
		for (int i = 0;i < array.length;i++)
		{
			str += array[i] + " ";
		}
		return str;
	}
}
