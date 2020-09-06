import java.util.Arrays;

public class MaxConsecutive {
    public static void main(String[] args) {
//        System.out.println(maxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
//        System.out.println(findNumbers(new int[]{12, 345, 2, 6, 7896}));
//        duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0});
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        merge(nums1, 3, nums2, 3);

    }

    public static int maxConsecutiveOnes(int[] nums) {
        int maxLength = 0;
        int counter = 0;
        for (int el : nums) {
            if (el == 1) {
                counter++;
                if (counter > maxLength) {
                    maxLength = counter;
                }
            } else {
                counter = 0;
            }
        }
        return maxLength;
    }

    public static int findNumbers(int[] nums) {
        int counter = 0;
        for (int el : nums) {
            int digits = 0;
            while (true) {
                int mod = el % 10;
                el = el / 10;
                if (mod == 0 && el == 0) {
                    break;
                }
                digits++;
            }
            if (digits % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int[] sortedSquares(int[] A) {
        int[] squaredNumbers = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            squaredNumbers[i] = A[i] * A[i];
        }
        Arrays.sort(squaredNumbers);
        return squaredNumbers;
    }

    public static void duplicateZeros(int[] arr) {
        int[] copyOfArray = arr;
        int countZeros = 0;
        for (int i = 0; i < copyOfArray.length; i++) {
            if (copyOfArray[i] == 0) {
                countZeros++;
            }
        }
        int[] arrayWithZeros = new int[copyOfArray.length + countZeros];
        int length = 0;

        for (int j = 0; j < copyOfArray.length; j++) {
            arrayWithZeros[j + length] = copyOfArray[j];
            if (arr[j] == 0) {
                length++;
                arrayWithZeros[j + length] = copyOfArray[j];
            }
        }
        for (int i = 0; i < arr.length; i++) arr[i] = arrayWithZeros[i];
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int counter = 0;
        for (int i = m; i < nums1.length; i++, counter++) nums1[i] = nums2[counter];
        for (int j = 0; j < nums1.length - 1; j++)
            for (int k = 0; k < nums1.length - 1; k++)
                if (nums1[k] > nums1[k + 1]) {
                    int tmp = nums1[k];
                    nums1[k] = nums1[k + 1];
                    nums1[k + 1] = tmp;
                }
    }
}