import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayProcessor arrayProcessor = new ArrayProcessor();
        List<Integer> numbers = List.of(4, 8, 3, 10, 17);
        System.out.println("Max Number: " + arrayProcessor.maxNumber(numbers));
        System.out.println("Min Number: " + arrayProcessor.minNumber(numbers));
        System.out.println("Max Sum (excluding min): " + arrayProcessor.maxSum(numbers));
        System.out.println("Min Sum (excluding max): " + arrayProcessor.minSum(numbers));

    }
}