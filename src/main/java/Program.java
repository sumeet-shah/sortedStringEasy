import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        String input = "hello world how are u?";
        String output = sortedString(input);
        System.out.println(output);
    }
    private static String sortedString(String input) {
        if (input == null || input.isEmpty()) return "";
        return input.chars()
                .mapToObj(x -> (char) x)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}
