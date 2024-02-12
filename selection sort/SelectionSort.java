//Selection sort
/*selects minmum, swaps using temp the value
 where the minimum should be
and pushes set to the left*/

/*searches through an array and keeps 
track of the minimum value during each iteration.
At the end of each iteration, we swap variable
*/


public class SelectionSort {

    public static void main(String[] args) {

        int array[] = {8, 7, 9, 2, 3, 1, 5, 4, 6};

        selectionSort(array);
        
        for (int i : array) {
            System.out.println(i); //print elements
        }
    }

    //pass array as argument    
    private static void selectionSort(int[] array) {
        

        for (int i = 0; i< array.length -1; i++ ) {
            
            int min = i; //keep track of current minimum

            /*to check if minimum of array
             is greater than array at index of j
            */

            for (int j = i +1; j< array.length; j++) {
                if(array[min] > array[j]){
                    min = j;
                }
            }

            //swap minimum with array element [i]
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }


}