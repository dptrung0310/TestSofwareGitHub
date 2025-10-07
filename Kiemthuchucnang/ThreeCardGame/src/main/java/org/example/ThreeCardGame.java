package org.example;

import java.util.List;

public class ThreeCardGame {
    // Thứ tự ưu tiên chất: H > D > C > S
    private static int suitRank(char suit) {
        switch (suit) {
            case 'H': return 4;
            case 'D': return 3;
            case 'C': return 2;
            case 'S': return 1;
            default: return 0;
        }
    }
    // Tính tổng điểm (chỉ lấy hàng đơn vị)
    private static int calculatePoints(List<Card> hand) {
        int sum = hand.stream().mapToInt(Card::getValue).sum();
        return sum % 10 == 0 ? 10 : sum % 10;
    }

    // Tìm chất mạnh nhất trong 1 bộ
    private static char getStrongestSuit(List<Card> hand) {
        return hand.stream()
                .map(Card::getSuit)
                .max((s1, s2) -> Integer.compare(suitRank(s1), suitRank(s2)))
                .orElse('S'); // default
    }

    // Tìm lá mạnh nhất của chất mạnh nhất
    private static Card getStrongestCard(List<Card> hand) {
        char strongestSuit = getStrongestSuit(hand);
        return hand.stream()
                .filter(c -> c.getSuit() == strongestSuit)
                .max((c1, c2) -> Integer.compare(c1.getValue(), c2.getValue()))
                .orElse(hand.get(0));
    }

    // So sánh 2 bộ bài
    public static String determineWinner(List<Card> player1, List<Card> player2) {
        int p1Points = calculatePoints(player1);
        int p2Points = calculatePoints(player2);

        if (p1Points > p2Points) return "Player1 win";
        if (p2Points > p1Points) return "Player2 win";

        // Hòa điểm thì so chất mạnh nhất
        Card strongest1 = getStrongestCard(player1);
        Card strongest2 = getStrongestCard(player2);

        int suitCmp = Integer.compare(suitRank(strongest1.getSuit()), suitRank(strongest2.getSuit()));
        if (suitCmp > 0) return "Player1 win";
        if (suitCmp < 0) return "Player2 win";

        // Nếu cùng chất mạnh nhất thì so giá trị lá trong chất đó
        if (strongest1.getValue() > strongest2.getValue()) return "Player1 win";
        if (strongest2.getValue() > strongest1.getValue()) return "Player2 win";

        return "Draw";
    }
}
