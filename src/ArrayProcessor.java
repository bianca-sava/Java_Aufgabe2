public class ArrayProcessor {
    public double maxNumber(double[] array) {
        double max = array[0];
        for (double num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public double minNumber(double[] array) {
        double min = array[0];
        for (double num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public double maxSum(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum-minNumber(array);
    }

    public double minSum(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum-maxNumber(array);
    }
}
