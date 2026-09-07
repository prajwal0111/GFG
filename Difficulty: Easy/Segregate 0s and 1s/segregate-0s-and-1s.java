class Solution {
    void segregate0and1(int[] arr) {

        int numberofZeros = 0;
        int numberofOnes = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                numberofZeros++;
            } else {
                numberofOnes++;
            }
        }

        for (int i = 0; i < numberofZeros; i++) {
            arr[i] = 0;
        }

        for (int i = numberofZeros; i < arr.length; i++) {
            arr[i] = 1;
        }
    }
}