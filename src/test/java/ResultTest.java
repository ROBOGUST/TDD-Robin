import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @BeforeEach
    public void startingTests(){
        System.out.println("Running a new test.");
    }
    @AfterEach
    public void endingTests(){
        System.out.println("The test has passed.");
    }

    @DisplayName("Fifty nine should return F")
    @Test
    void fiftyNineShouldReturnF(){
        assertTrue('F' == Result.determineGrade(59));
    }

    @DisplayName("Sixty nine should return D")
    @Test
    void sixtyNineShouldReturnD(){
        assertTrue('D' == Result.determineGrade(69));
    }

    @DisplayName("Seventy nine should return C")
    @Test
    void seventyNineShouldReturnC(){
        assertTrue('C' == Result.determineGrade(79));
    }

    @DisplayName("Eighty nine should return B")
    @Test
    void eightyNineShouldReturnB(){
        assertTrue('B' == Result.determineGrade(89));
    }

    @DisplayName("Ninety nine should return A")
    @Test
    void ninetyNineShouldReturnA(){
        assertTrue('A' == Result.determineGrade(99));
    }

    @DisplayName("Zero should return F")
    @Test
    void zeroShouldReturnF(){
        assertEquals('F', Result.determineGrade(0));
    }

    @DisplayName("Sixty should return D")
    @Test
    void sixtyShouldReturnD(){
        assertEquals('D', Result.determineGrade(60));
    }

    @DisplayName("Seventy should return C")
    @Test
    void seventyShouldReturnC(){
        assertEquals('C', Result.determineGrade(70));
    }

    @DisplayName("Eighty should return B")
    @Test
    void eightyShouldReturnB(){
        assertEquals('B', Result.determineGrade(80));
    }

    @DisplayName("Ninety should return A")
    @Test
    void ninetyShouldReturnA(){
        assertEquals('A', Result.determineGrade(90));
    }

    @DisplayName("This should throw an exception")
    @Test
    void negativeOneShouldReturnIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Result.determineGrade(-1);

                });
    }

    @DisplayName("Ninety should not return F")
    @Test
    void ninetyShouldNotReturnF(){
        assertNotEquals('F', Result.determineGrade(90));}

    @DisplayName("Zero should not return A")
    @Test
    void zeroShouldNotReturnA(){
        assertFalse('A' == Result.determineGrade(0));
    }

}