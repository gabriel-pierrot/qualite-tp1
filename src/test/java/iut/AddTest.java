@package iut;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AddTest {
    @Test
    void addTest() {
        int a = 5;
        int b = 3;
        int resultat = recupererResultat(a, b);

        assertEquals(8, resultat, "5 + 3 est égal à 8");
    }

    private int recupererResultat(int a, int b) {
        return Add.add(a, b);
    }
}
