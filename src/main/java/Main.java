import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> allElements = List.of("a1", "123", "b1", "tmp", "asd1", "3d4");

        allElements.forEach(System.out::println);

        Stream.iterate(1, n -> n + 1)
            .limit(10)
            .forEach(System.out::println);
    }

    public static int get2(){
        return 2;
    }

    public static int multiplyBy2(int a){
        return a * 2;
    }
}
