import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
int [] myArray = getIntegers(5);
printArray(myArray);
printArray(sortIntegers(myArray));

    }

    public  static int[]  getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
    return values;
    }
public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " typed value was " + array[i]);
        }
}

public static int[] sortIntegers(int[] array) {
int[] sortedArray = new int[array.length];
for (int i = 0; i < array.length; i++) {
    sortedArray[i] = array[i];
//}
//int temp;
//for (int i = 0; i < sortedArray.length -1; i++){
//    if(sortedArray[i] < sortedArray[i+1]){
//        temp = sortedArray[i];
//        sortedArray[i] = sortedArray[i+1];
//        sortedArray[i+1] = temp;
//    }
//}
    for (int j = 0; j < sortedArray.length; j++){
        if (sortedArray[j] <= array[i]){

            for(int f = sortedArray.length - 1; f > j; f--){
                sortedArray[f] = sortedArray[f-1];
            }

            sortedArray[j] = array[i];
            break;
        }

    }
    }
    return sortedArray;
}

}




