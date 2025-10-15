import java.util.List;
public class ArrayProcessor {
    public Integer maxNumber(List<Integer> array) {
        Integer max = array.getFirst();
        for (Integer num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public Integer minNumber(List<Integer> array) {
        Integer min = array.getFirst();
        for (Integer num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public Integer maxSum(List<Integer> array) {
        Integer sum = 0;
        for (Integer num : array) {
            sum += num;
        }
        return sum-minNumber(array);
    }

    public Integer minSum(List<Integer> array) {
        Integer sum = 0;
        for (Integer num : array) {
            sum += num;
        }
        return sum-maxNumber(array);
    }
}
