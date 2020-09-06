package solution1;


enum Symbol {
    X("X"), O("O"), EMPTY(" ");

    private final String symbol;

    Symbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
