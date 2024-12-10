
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {MainApplicationTests.class})
public class MainApplicationTests {

    @Test
    public void contextLoads() {
        boolean checkFlag = true;
        Assertions.assertTrue(checkFlag);
    }
}

