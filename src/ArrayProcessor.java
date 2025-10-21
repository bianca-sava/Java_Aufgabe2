public class ArrayProcessor {
    public int maxNumber(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public int minNumber(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public int maxSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum-minNumber(array);
    }

    public int minSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum-maxNumber(array);
    }
}