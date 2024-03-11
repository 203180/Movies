import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 37; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);

        List<Integer> pickedNumbers = numbers.subList(0, 7);

        System.out.println("Picked numbers:");
        for (int num : pickedNumbers) {
            System.out.println(num);
        }
    }
}
