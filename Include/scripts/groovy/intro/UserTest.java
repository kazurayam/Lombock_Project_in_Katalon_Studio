package intro;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class UserTest {

    User user;

    @BeforeClass
    void setup() {
        user = new User("John", "Doe", 65);
    }

    @Test
    void test_getters() {
        assertThat(user.getFirstName(), is("John");
        assertThat(user.getLastName()).isEqualTo("Doe");
        assertThat(user.getAge()).isEqualTo(65);
    }

    @Test
    void test_setters_getters() {
        user = new User();
        user.setFirstName("Lie");
        user.setLastName("Shanrang");
        user.setAge(17);
        assertThat(user.getFirstName()).isEqualTo("Lie");
        assertThat(user.getLastName()).isEqualTo("Shanrang");
        assertThat(user.getAge()).isEqualTo(17);
    }
}
