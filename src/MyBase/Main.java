package MyBase;

public class Main {

    public static void main(String[] args) {

        StockTrade msft100Trade = new StockTrade("msft", 100);
        StockTrade aapl500Trade = new StockTrade("aapl", 500);
        StockTrade aapl5000Trade = new StockTrade("aapl", 5000);
        StockTrade aapl5Trade = new StockTrade("aapl", 5);
        BuyStockOrder buy100Msft = new BuyStockOrder (msft100Trade);
        SellStockOrder sell500Aapl = new SellStockOrder (aapl500Trade);
        SellStockOrder sell5000Aapl = new SellStockOrder (aapl5000Trade);
        SellStockOrder sell5Aaapl = new SellStockOrder(aapl5Trade);

        Agent agent = new Agent();

        agent.placeOrder(buy100Msft); // Buy Shares
        agent.placeOrder(sell500Aapl); // Sell Shares
        agent.placeOrder(buy100Msft);
        agent.cancelOrder(sell500Aapl);
        agent.placeOrder(sell5000Aapl);
        agent.placeOrder(buy100Msft);
        agent.cancelOrder(sell5Aaapl);

        agent.displayOrders();

        agent.executeOrders();
    }
}
