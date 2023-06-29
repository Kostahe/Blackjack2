public enum Card {
    ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10);

    private final int VALUE;

    Card(int VALUE) {
        this.VALUE = VALUE;
    }

    public int getVALUE() {
        return VALUE;
    }

    public static Card getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
