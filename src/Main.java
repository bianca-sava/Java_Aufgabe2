import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayProcessor arrayProcessor = new ArrayProcessor();
        int[] numbers = {4, 8, 3, 10, 17};
        System.out.println("Max Number: " + arrayProcessor.maxNumber(numbers));
        System.out.println("Min Number: " + arrayProcessor.minNumber(numbers));
        System.out.println("Max Sum: " + arrayProcessor.maxSum(numbers));
        System.out.println("Min Sum: " + arrayProcessor.minSum(numbers));

    }
}