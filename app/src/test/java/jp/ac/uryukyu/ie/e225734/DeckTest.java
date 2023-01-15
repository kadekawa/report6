package jp.ac.uryukyu.ie.e225734;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DeckTest {
    @Test void DeckmakeDeck() {
        Deck test = new Deck();
        assertEquals(test.getSize(), 52);
        for (int i=0;i<test.getSize();i++){
            test.getCard(i);
        }
    }
}