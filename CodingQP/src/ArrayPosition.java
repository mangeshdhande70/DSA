public class ArrayPosition {
    public static void main(String[] args) {
        int []num = {1,3,5,6};
        int target = 7;
        System.out.println(fun(num , target));
    }
    static int fun(int [] arr , int target) { int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (arr[i] >= target) {
                return i;
            }
        }
        return length;

    }
}
