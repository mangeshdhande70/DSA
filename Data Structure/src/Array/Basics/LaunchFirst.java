package Array.Basics;


/**
 * Array is DS which stores the homogeneous Data where the data or elements are stored in contiguous
   memory location.

 * Array is fixed in size i.e, after size of Array exceed we can't add elements in array.

 * we can't store heterogeneous type of data.

 * The data store on memory has its particular index no.

 * Complexity
       1. For Adding Element       -----> O(n) -- Linear
       2. For Deleting Elements    -----> O(n) -- Linear
       3. For Accessing Elements   -----> O(1) -- Constant
       4. For Traversing           -----> O(n) -- Linear

 */

public class LaunchFirst {

    public static void main(String[] args) {


        Integer[] arr = new Integer[4];

        arr[0] = 43;
//      arr[1] = "Mangesh" not stored
        arr[1] = 2;
        arr[2] = 45;
        arr[3] = 90;
//      arr[4] = 00;  ArrayIndexOutOfBoundsException


        System.out.print("Elements in Array ::  ");
        for (int ar:arr)
            System.out.print(ar+" ");


    }
}
