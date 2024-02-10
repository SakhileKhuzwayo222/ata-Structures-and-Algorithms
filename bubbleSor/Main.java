/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        int array[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        bubbleSort(array); //call method

        for( int i : array) {
            System.out.println(i);
        }
    }

    public static void bubbleSort(int array[]){

        for(int i = 0; i < array.length - 1; i++){

            /* outer forloop controls how many times the whole array is traversed,
            * inner forloop controls how many elements  are compared and swapped per iteration.
            */

            for(int j = 0; j < array.length -i -1 ; j++){
                if (array[j] > array[j+1]) { //compares adjacent elements

                    int temp = array[j];
                    array[j] = array[j+1];   //swaps using temporary variable
                    array[j+1] = temp;
                }
            }
        }
    }
}