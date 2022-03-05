/*
You get an array of numbers, return the sum of all the positives ones.
Example [1,-4,7,12] => 1 + 7 + 12 = 20
Note: if there is nothing to sum, the sum is default to 0.
 */
package learningToProgram.fundamentals;

public class SumOfPositive {
    public static void main(String[] args) {
        int [] newInt = {2,-100,3,4,5,-9,-7};
        System.out.println(Positive.sum(newInt));
    }
    public static class Positive{
        public static int sum(int[] arr){
            int sum =0;
            for (int j : arr) {
                if (j > 0) {
                    sum = sum + j;
                }
            }
            return sum;
        }
    }
}