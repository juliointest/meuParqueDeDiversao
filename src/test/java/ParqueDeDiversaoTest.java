import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ParqueDeDiversaoTest {
    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void testParqueDeDiversao() {
        // Vamos codificar aqui
    }
}
