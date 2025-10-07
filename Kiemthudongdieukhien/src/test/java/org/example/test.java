package org.example;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class test {

    @Test
    void testCase1_Player1Win() {
        // p1 = [2H,3H,4H]; p2 = [1H,2H,3H]
        // => Player1 có tổng điểm cao hơn
        List<Card> p1 = Arrays.asList(new Card(2, 'H'), new Card(3, 'H'), new Card(4, 'H'));
        List<Card> p2 = Arrays.asList(new Card(1, 'H'), new Card(2, 'H'), new Card(3, 'H'));
        assertEquals("Player1 win", ThreeCardGame.determineWinner(p1, p2));
    }

    @Test
    void testCase2_Player2Win() {
        // p1 = [2H,1C,4S]; p2 = [5H,2C,3S]
        // => Player2 có tổng điểm cao hơn
        List<Card> p1 = Arrays.asList(new Card(2, 'H'), new Card(1, 'C'), new Card(4, 'S'));
        List<Card> p2 = Arrays.asList(new Card(5, 'H'), new Card(2, 'C'), new Card(3, 'S'));
        assertEquals("Player2 win", ThreeCardGame.determineWinner(p1, p2));
    }

    @Test
    void testCase3_Player1WinBySuit() {
        // p1 = [1H,3D,4C]; p2 = [5D,2C,1S]
        // => cùng điểm, Player1 thắng do có chất mạnh hơn
        List<Card> p1 = Arrays.asList(new Card(1, 'H'), new Card(3, 'D'), new Card(4, 'C'));
        List<Card> p2 = Arrays.asList(new Card(5, 'D'), new Card(2, 'C'), new Card(1, 'S'));
        assertEquals("Player1 win", ThreeCardGame.determineWinner(p1, p2));
    }

    @Test
    void testCase4_Player2WinBySuit() {
        // p1 = [1D,3D,4C]; p2 = [5D,2H,1S]
        // => bằng điểm, Player2 có chất H mạnh hơn
        List<Card> p1 = Arrays.asList(new Card(1, 'D'), new Card(3, 'D'), new Card(4, 'C'));
        List<Card> p2 = Arrays.asList(new Card(5, 'D'), new Card(2, 'H'), new Card(1, 'S'));
        assertEquals("Player2 win", ThreeCardGame.determineWinner(p1, p2));
    }

    @Test
    void testCase5_Player1Win() {
        // p1 = [1D,3H,4C]; p2 = [5D,2H,1S]
        // => Player1 có điểm cao hơn
        List<Card> p1 = Arrays.asList(new Card(1, 'D'), new Card(3, 'H'), new Card(4, 'C'));
        List<Card> p2 = Arrays.asList(new Card(5, 'D'), new Card(2, 'H'), new Card(1, 'S'));
        assertEquals("Player1 win", ThreeCardGame.determineWinner(p1, p2));
    }

    @Test
    void testCase6_Player2Win() {
        // p1 = [1D,3H,4C]; p2 = [5H,2S,1S]
        // => Player2 có điểm cao hơn
        List<Card> p1 = Arrays.asList(new Card(1, 'D'), new Card(3, 'H'), new Card(4, 'C'));
        List<Card> p2 = Arrays.asList(new Card(5, 'H'), new Card(2, 'S'), new Card(1, 'S'));
        assertEquals("Player2 win", ThreeCardGame.determineWinner(p1, p2));
    }

    @Test
    void testCase7_Draw() {
        // p1 = [1D,3D,4H]; p2 = [4H,2S,2S]
        // => cùng điểm, cùng chất mạnh nhất => hòa
        List<Card> p1 = Arrays.asList(new Card(1, 'D'), new Card(3, 'D'), new Card(4, 'H'));
        List<Card> p2 = Arrays.asList(new Card(4, 'H'), new Card(2, 'S'), new Card(2, 'S'));
        assertEquals("Draw", ThreeCardGame.determineWinner(p1, p2));
    }
}
