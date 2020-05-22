package by.epam.module04.simple_class.task8;

public class CardNumberRange {

    private int from;
    private int to;

    public CardNumberRange(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public boolean isInRange(int cardNumber) {
        return cardNumber >= from && cardNumber <= to;
    }
}
