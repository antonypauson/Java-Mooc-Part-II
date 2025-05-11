import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {

    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    @Override
    public int compareTo(Hand hand) {
        int value1 =
                this.cards.stream()
                        .map(card -> card.getValue())
                        .reduce(0, (sum, each) -> sum += each);
        int value2 =
                hand.cards.stream()
                        .map(card -> card.getValue())
                        .reduce(0, (sum, each) -> sum += each);
        return value1 - value2;

    }

    public void sort() {
        Collections.sort(this.cards);
    }

    public void print() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public void sortBySuit() {
        BySuitInValueOrder sortBySuitSorter = new BySuitInValueOrder();
        Collections.sort(cards, sortBySuitSorter);
    }

    public static void main(String[] args) {
//        Hand hand = new Hand();
//
//        hand.add(new Card(2, Suit.DIAMOND));
//        hand.add(new Card(14, Suit.SPADE));
//        hand.add(new Card(12, Suit.HEART));
//        hand.add(new Card(2, Suit.SPADE));
//
//        hand.sort();
//        hand.print();

//        Hand hand1 = new Hand();
//
//        hand1.add(new Card(2, Suit.DIAMOND));
//        hand1.add(new Card(14, Suit.SPADE));
//        hand1.add(new Card(12, Suit.HEART));
//        hand1.add(new Card(2, Suit.SPADE));
//
//        Hand hand2 = new Hand();
//
//        hand2.add(new Card(11, Suit.DIAMOND));
//        hand2.add(new Card(11, Suit.SPADE));
//        hand2.add(new Card(11, Suit.HEART));
//
//        int comparison = hand1.compareTo(hand2);
//
//        if (comparison < 0) {
//            System.out.println("better hand is");
//            hand2.print();
//        } else if (comparison > 0){
//            System.out.println("better hand is");
//            hand1.print();
//        } else {
//            System.out.println("hands are equal");
//        }

        Hand hand = new Hand();

        hand.add(new Card(12, Suit.HEART));
        hand.add(new Card(4, Suit.SPADE));
        hand.add(new Card(2, Suit.DIAMOND));
        hand.add(new Card(14, Suit.SPADE));
        hand.add(new Card(7, Suit.HEART));
        hand.add(new Card(2, Suit.SPADE));

        hand.sortBySuit();

        hand.print();
    }
}
