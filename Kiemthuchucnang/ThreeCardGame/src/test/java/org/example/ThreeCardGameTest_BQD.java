package org.example;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ThreeCardGameTest_BQD {
    @Test
    void testPlayer1WinByPoints() {
        List<Card> p1 = Arrays.asList(new Card(1, 'H'), new Card(3, 'D'), new Card(4, 'S')); // 8 điểm
        List<Card> p2 = Arrays.asList(new Card(1, 'H'), new Card(2, 'D'), new Card(2, 'S')); // 5 điểm
        assertEquals("Player1 win", ThreeCardGame.determineWinner(p1, p2));
    }

    @Test
    void testPlayer2WinByPoints() {
        List<Card> p1 = Arrays.asList(new Card(1, 'H'), new Card(1, 'D'), new Card(4, 'S')); // 6 điểm
        List<Card> p2 = Arrays.asList(new Card(5, 'H'), new Card(2, 'D'), new Card(2, 'S')); // 9 điểm
        assertEquals("Player2 win", ThreeCardGame.determineWinner(p1, p2));
    }

    @Test
    void testPlayer1WinBySuit() {
        List<Card> p1 = Arrays.asList(new Card(1, 'H'), new Card(3, 'D'), new Card(4, 'S')); // 8 điểm
        List<Card> p2 = Arrays.asList(new Card(1, 'C'), new Card(3, 'D'), new Card(4, 'S')); // 8 điểm
        assertEquals("Player1 win", ThreeCardGame.determineWinner(p1, p2));
    }

    @Test
    void testPlayer2WinBySuit() {
        List<Card> p1 = Arrays.asList(new Card(1, 'D'), new Card(3, 'D'), new Card(4, 'S')); // 8 điểm
        List<Card> p2 = Arrays.asList(new Card(1, 'S'), new Card(3, 'H'), new Card(4, 'S')); // 8 điểm
        assertEquals("Player2 win", ThreeCardGame.determineWinner(p1, p2));
    }

    @Test
    void testPlayer1WinByValueofSuit() {
        List<Card> p1 = Arrays.asList(new Card(1, 'S'), new Card(3, 'H'), new Card(4, 'S')); // 8 điểm
        List<Card> p2 = Arrays.asList(new Card(1, 'H'), new Card(3, 'D'), new Card(4, 'S')); // 8 điểm
        assertEquals("Player1 win", ThreeCardGame.determineWinner(p1, p2));
    }

    @Test
    void testPlayer2WinByValueofSuit() {
        List<Card> p1 = Arrays.asList(new Card(1, 'H'), new Card(3, 'D'), new Card(4, 'S')); // 8 điểm
        List<Card> p2 = Arrays.asList(new Card(1, 'S'), new Card(3, 'D'), new Card(4, 'H')); // 8 điểm
        assertEquals("Player2 win", ThreeCardGame.determineWinner(p1, p2));
    }

}
