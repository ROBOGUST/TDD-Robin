import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @BeforeEach
    void setUp() {
        var result = new Result();
    }
    @AfterEach
    void tearDown() {
        var result = new Result();
    }

    @DisplayName("Fifty nine should return F")
    @Test
    void fiftyNineShouldReturnF(){
        var result = new Result();
        assertEquals('F', result.determineGrade(59));
    }

    @DisplayName("Sixty nine should return D")
    @Test
    void sixtyNineShouldReturnD(){
        var result = new Result();
        assertEquals('D', result.determineGrade(69));
    }

    @DisplayName("Seventy nine should return C")
    @Test
    void seventyNineShouldReturnC(){
        var result = new Result();
        assertEquals('C', result.determineGrade(79));
    }

    @DisplayName("Eighty nine should return B")
    @Test
    void eightyNineShouldReturnB(){
        var result = new Result();
        assertEquals('B', result.determineGrade(89));
    }

    @DisplayName("Ninety nine should return A")
    @Test
    void ninetyNineShouldReturnA(){
        var result = new Result();
        assertEquals('A', result.determineGrade(99));
    }

    @DisplayName("Zero should return F")
    @Test
    void zeroShouldReturnF(){
        var result = new Result();
        assertEquals('F', result.determineGrade(0));
    }

    @DisplayName("Sixty should return D")
    @Test
    void sixtyShouldReturnD(){
        var result = new Result();
        assertEquals('D', result.determineGrade(60));
    }

    @DisplayName("Seventy should return C")
    @Test
    void seventyShouldReturnC(){
        var result = new Result();
        assertEquals('C', result.determineGrade(70));
    }

    @DisplayName("Eighty should return B")
    @Test
    void eightyShouldReturnB(){
        var result = new Result();
        assertEquals('B', result.determineGrade(80));
    }

    @DisplayName("Ninety should return A")
    @Test
    void ninetyShouldReturnA(){
        var result = new Result();
        assertEquals('A', result.determineGrade(90));
    }

    @DisplayName("This should throw an exception")
    @Test
    void negativeOneShouldReturnIllegalArgumentException(){
        var result = new Result();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    result.determineGrade(-1);

                });
    }
}