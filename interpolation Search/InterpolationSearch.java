//INTERPOLATION SEARCHES
//best for uniformly distributed data.
//O(log(log n))
// an improved binary search, where a probe is used to estimate where the value is.
//guess based on probe, within a searchable set, shrinking its size per iteration.

public class InterpolationSearch {

    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8,9};

        int index = interpolationSearch(array, 8);


        //check if the value returned does equal number one/was not found.
        if (index!= -1) {
            
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("Element not found");
        }

    }

    private static int interpolationSearch( int[] array, int value)  {

        int high = array.length -1;
        int low = 0;
        
        /*while the value is greater than or eqaul oto the lower and 
        our vlaue is less than ror equal to the higher boumnd*/

        while(value>= array[low] && value <array[high] && low<=high)    {

            int probe = low + (high - low) * (value - array[low]) /
                    (array[high] - array[low]); //calculates where the value will likely be.

            System.out.println("probe: " + probe); //display probe


            //if probe is equal to value, if not lower search area.

            if(array[probe] == value)   { //check if value is equal to probe
                return probe;
            }
            else if (array[probe] < value){ 
                low = probe + 1; //set new lower bound
            }
            else{
                high = probe - 1; //all values ignored if great than probe
            }
        }

        return -1; //sentinal value (if value isnt found)

       
    }
}