import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class MainTest {
    @Test
    void testGet2(){
        assert Main.get2() == 2;
    }

    @ParameterizedTest(name = "test multiplying {arguments} by 2")
    @ValueSource(ints = {5,4,3,2,1})
    void testMultiplyBy2(int number){
        assert Main.multiplyBy2(number) == number * 2;
    }
}
