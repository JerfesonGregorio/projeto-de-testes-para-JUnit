import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MainTest {

    @Test
    @Order(1)
    public void firstTest() {
        System.out.println("Primeiro teste");
    }

    @Test
    @Order(3)
    public void thirdTest() {
        System.out.println("Terceiro teste");
    }

    @Test
    @Order(2)
    public void secondTest() {
        System.out.println("Segundo teste");
    }
}
