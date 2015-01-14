package MyBase;

//ConcreteCommand Class.
class BuyStockOrder implements Order {

    private StockTrade stock;
    private String symbolName;
    private int symbolQuantity;
    private String action;

    public BuyStockOrder (StockTrade st) {
        stock = st;
        symbolName = st.getSymbolName();
        symbolQuantity = st.getSymbolQuantity();
        action = "BUY";
    }

    public void execute( ) {
        System.out.println("executing " + action + " " + symbolQuantity + " shares of " + symbolName);
        stock.buy();
    }

    public String getSymbolName () {
        return symbolName;
    }

    public int getSymbolQuantity () {
        return symbolQuantity;
    }

    public String getAction () {
        return action;
    }
}
