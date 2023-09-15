package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testujObdlznik {

    @BeforeEach()
        void setUp(){
            System.out.println("Metoda setup sa vykona ako prva, este pred jUnit testami");
        }




    @DisplayName("Testy na vypocet obvodu obdlznika")
    @Test
    public void testVypocitajObvod(){
        assertEquals(10,Obdlznik.vypocitajObvod(2,3),"vypocet obvodu by mal byt 10");
        assertEquals(10,Obdlznik.vypocitajObvod(1.5,3.5));
        assertEquals(2,Obdlznik.vypocitajObvod(0.9,0.1));
    }

    @DisplayName("Testy na vypocet obsahu obdlznika")
    @Test
    public void testVypocitajObsah(){
        assertEquals(20,Obdlznik.vypocitajObsah(2,10));
        assertEquals(8,Obdlznik.vypocitajObsah(2,4));
    }
}
