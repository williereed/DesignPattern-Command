package MyBase;

// Receiver class.
public class StockTrade {

    private String symbolName;
    private int symbolQuantity;

    private StockTrade() {}

    public StockTrade(String name, int quantity) {
        symbolName = name;
        symbolQuantity = quantity;
    }

    public void buy() {
        System.out.println("completed BUY " + symbolQuantity + " shares of " + symbolName);
    }

    public void sell() {
        System.out.println("completed SELL " + symbolQuantity + " shares of " + symbolName);
    }

    public String getSymbolName() {
        return symbolName;
    }

    public int getSymbolQuantity() {
        return symbolQuantity;
    }
}
