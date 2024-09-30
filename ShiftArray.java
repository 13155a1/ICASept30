public class ShiftArray {

    // A method to shift all the items of "arr" to the right 
	// by "shift" number of places (with wraparound).
	// Example: {3, 4, 5, 6} with a shift of 1 becomes {6, 3, 4, 5} 
	public static int[] shiftBy(int[] arr, int shift) {

		// If shift is larger than the array, this expression
		// finds an equivalent shift amount. If shift is less
		// than the size of the array, this expression leaves
		// shift unchanged:
		shift = shift % arr.length;

		int[] newArray = new int[arr.length];

		for(int i = 0; i < arr.length; i++){
			int index = (i+shift) % arr.length;
			newArray[index] = arr[i];

			// System.out.println("i: " + i);
			// System.out.println("index: " + index);
			// System.out.println("arr[i]: " + arr[i]);
			// System.out.println();
		}

		// for(int i : newArray){
		// 	System.out.print(i + " ");
		// }
		// System.out.println();

		return newArray;
	}


	public static void main(String[] args) {
		try{
			int[] a = {3, 4, 5, 6};
			int shiftAmount = Integer.valueOf(args[0]);
			if(shiftAmount < 0){
				System.out.println("Sorry, shift about must be positive.");
				return;
			}
			int[] newArray = shiftBy(a, shiftAmount);
			for(int i : newArray){
				System.out.print(i + " ");
			}
		}catch(Exception e){
			System.out.println("Please rerun the program with proper command line arguments: " + e.getMessage());
		}
	}

}