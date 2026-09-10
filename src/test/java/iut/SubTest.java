package iut;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SubTest {
    @Test
    void testSoustractCorrect1(){
        int [] paire1;
        int [] paire2;
        int attendu1;
        int attendu2;

        paire1 = new int[2];
        paire2 = new int[2];

        paire1[0] = 4;
        paire1[1] = 1;
        attendu1 = 3;

        paire2[0] = 11;
        paire2[1] = 3;
        attendu2 = 8;

        assertEquals(attendu1, recupereResultat(paire1[0], paire1[1]), "Erreur: " + recupereResultat(paire1[0], paire1[0]) + " != " + attendu1);
        assertEquals(attendu2, recupereResultat(paire2[0], paire2[1]), "Erreur: " + recupereResultat(paire1[0], paire1[0]) + " != " + attendu1);
    }

    private int recupereResultat(int a, int b){
        return Sub.sub(a, b);
    }
}
