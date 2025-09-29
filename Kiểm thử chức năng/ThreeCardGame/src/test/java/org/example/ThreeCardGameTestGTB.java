package org.example;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ThreeCardGameTestGTB {
    @Test
    void testDraw() {
        List<Card> p1 = Arrays.asList(new Card(1, 'S'), new Card(3, 'C'), new Card(1, 'S'));
        List<Card> p2 = Arrays.asList(new Card(1, 'S'), new Card(3, 'C'), new Card(1, 'S'));
        assertEquals("Draw", ThreeCardGame.determineWinner(p1, p2));
    }

    @Test
    void testPlayer1_01() {
        List<Card> p1 = Arrays.asList(new Card(1, 'S'), new Card(3, 'C'), new Card(1, 'S'));
        List<Card> p2 = Arrays.asList(new Card(1, 'S'), new Card(9, 'S'), new Card(1, 'S'));
        assertEquals("Player1 win", ThreeCardGame.determineWinner(p1, p2));
    }

    @Test
    void testPlayer1_02() {
        List<Card> p1 = Arrays.asList(new Card(1, 'S'), new Card(3, 'C'), new Card(1, 'S'));
        List<Card> p2 = Arrays.asList(new Card(1, 'C'), new Card(9, 'S'), new Card(1, 'S'));
        assertEquals("Player1 win", ThreeCardGame.determineWinner(p1, p2));
    }

    @Test
    void testPlayer2_01() {
        List<Card> p1 = Arrays.asList(new Card(1, 'S'), new Card(3, 'C'), new Card(1, 'S'));
        List<Card> p2 = Arrays.asList(new Card(2, 'C'), new Card(3, 'D'), new Card(5, 'S'));
        assertEquals("Player2 win", ThreeCardGame.determineWinner(p1, p2));
    }

    @Test
    void testPlayer2_02() {
        List<Card> p1 = Arrays.asList(new Card(1, 'S'), new Card(3, 'C'), new Card(1, 'S'));
        List<Card> p2 = Arrays.asList(new Card(2, 'C'), new Card(3, 'H'), new Card(5, 'S'));
        assertEquals("Player2 win", ThreeCardGame.determineWinner(p1, p2));
    }

    @Test
    void testPlayer2_03() {
        List<Card> p1 = Arrays.asList(new Card(1, 'S'), new Card(9, 'S'), new Card(1, 'S'));
        List<Card> p2 = Arrays.asList(new Card(1, 'C'), new Card(3, 'C'), new Card(1, 'S'));
        assertEquals("Player2 win", ThreeCardGame.determineWinner(p1, p2));
    }

    @Test
    void testPlayer2_04() {
        List<Card> p1 = Arrays.asList(new Card(1, 'S'), new Card(9, 'C'), new Card(1, 'S'));
        List<Card> p2 = Arrays.asList(new Card(1, 'C'), new Card(3, 'C'), new Card(1, 'S'));
        assertEquals("Player2 win", ThreeCardGame.determineWinner(p1, p2));
    }

    @Test
    void testPlayer1_03() {
        List<Card> p1 = Arrays.asList(new Card(2, 'S'), new Card(3, 'D'), new Card(5, 'S'));
        List<Card> p2 = Arrays.asList(new Card(1, 'C'), new Card(3, 'C'), new Card(1, 'S'));
        assertEquals("Player1 win", ThreeCardGame.determineWinner(p1, p2));
    }

    @Test
    void testPlayer1_04() {
        List<Card> p1 = Arrays.asList(new Card(2, 'S'), new Card(3, 'H'), new Card(5, 'S'));
        List<Card> p2 = Arrays.asList(new Card(1, 'C'), new Card(3, 'C'), new Card(1, 'S'));
        assertEquals("Player1 win", ThreeCardGame.determineWinner(p1, p2));
    }
}
