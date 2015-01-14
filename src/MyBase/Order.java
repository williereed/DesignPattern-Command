package MyBase;

public interface Order {
    public int numShares = 0;
    public abstract void execute ( );
    public abstract String getSymbolName ( );
    public abstract int getSymbolQuantity ( );
    public abstract String getAction ( );
}
