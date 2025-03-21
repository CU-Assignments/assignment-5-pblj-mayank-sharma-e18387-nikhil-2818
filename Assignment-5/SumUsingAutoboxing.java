import java.util.*;

public class SumUsingAutoboxing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter numbers separated by spaces: ");
        String input = scanner.nextLine();
        scanner.close();
        
        List<Integer> numbers = new ArrayList<>();
        
        String[] tokens = input.split(" ");
        for (String token : tokens) {
            numbers.add(Integer.parseInt(token));
        }
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        System.out.println("Sum of numbers: " + sum);
    }
}