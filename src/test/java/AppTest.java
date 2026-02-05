import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {


    @Test
    @DisplayName(value = "1 + 2 = 3")
    void t1() {
        App app = new App();
        int rst = app.plus(1, 2);

        assertThat(rst).isEqualTo(3);
    }

    @Test
    @DisplayName("10 + 20 = 30")
    void t2() {
        App app = new App();
        int rst = app.plus(10, 20);

        assertThat(rst).isEqualTo(30);
    }

    @Test
    @DisplayName("0 + 5 = 5")
    void t3() {
        App app = new App();
        int rst = app.plus(0, 5);

        assertThat(rst).isEqualTo(5);
    }
}
