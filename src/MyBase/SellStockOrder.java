package MyBase;

//ConcreteCommand Class.
class SellStockOrder implements Order {

    private StockTrade stock;
    private String symbolName;
    private int symbolQuantity;
    private String action;

    public SellStockOrder (StockTrade st)     {
        stock = st;
        symbolName = st.getSymbolName();
        symbolQuantity = st.getSymbolQuantity();
        action = "SELL";
    }

    public void execute( ) {
        System.out.println("executing " + action + " " + symbolQuantity + " shares of " + symbolName);
        stock.sell();
    }

    public String getSymbolName () {
        return symbolName;
    }

    public int getSymbolQuantity () {
        return symbolQuantity;
    }

    public String getAction() {
        return action;
    }
}
