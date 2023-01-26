

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    int temp;
    //FIX: Change to arr.length/2
    for(int i = 0; i < arr.length/2; i += 1) {
      //FIX: Created a temp variable to swap
      temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      //FIX: Switch array names
      newArray[i] = arr[arr.length - i - 1];
    }

    //FIX: return newArray instead of arr
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }

    double count = 0;
    for (double num: arr)
    {
      if(num == lowest) { count++;}
    }

    double sum = 0;
    for(double num: arr) {
      if(num != lowest) { sum += num; }
    }
    //Does not account for multiple lowest;
    return sum / (arr.length - count);
  }


}

