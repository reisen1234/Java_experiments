package code_data.Third;
// *************************************************************
// Card.java
//
// To use the enum
// *************************************************************
public class Card {
    public static void main(String[] args)
    {
        enum Rank {zero, ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king};
        Rank highCard, faceCard, card1 = Rank.eight, card2 = Rank.seven;
        highCard = Rank.ace;
        faceCard = Rank.king;
        System.out.println("A blackjack hand: " + highCard + " and " + faceCard);
        int card1Val = card1.ordinal(), card2Val = card2.ordinal();
        System.out.println("A two card hand: " + card1 + " and " + card2);
        System.out.println("Hand value: " + (card1Val + card2Val));
    }
}