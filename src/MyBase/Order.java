package MyBase;

public interface Order {
    public abstract void execute ( );
    public abstract String getSymbolName ( );
    public abstract int getSymbolQuantity ( );
    public abstract String getAction ( );
}
