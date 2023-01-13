import java.util.ArrayList;

public class FloristsModel {
    private ArrayList<StockItem> stock;
    private ArrayList<Ticket> ticketList;
    private String name;
    private double stockValue;

    public FloristsModel(String name) {
        this.name = name;
        this.stock = new ArrayList<StockItem>();
        this.ticketList = new ArrayList<Ticket>();
        this.stockValue = 0;
    }
    //Recibe un objeto de la clase StockItem por parámetro y lo añade al stock.
    public void addToStock(StockItem item) {
        stock.add(item);
        stockValue += item.getValue();
    }
    //Recibe un objeto de la clase StockItem por parámetro y lo elimina.
    public void removeFromStock(StockItem item) {
        stock.remove(item);
        stockValue -= item.getValue();
    }
    //Recibe un objeto de la clase Ticket por parámetro y lo añade a la lista de tickets.
    public void addTicketToList(Ticket ticket) {
        ticketList.add(ticket);
    }
    //Recibe un objeto de la clase Ticket por parámetro y lo elimina.
    public void removeTicketFromList(Ticket ticket) {
        ticketList.remove(ticket);
    }
    public ArrayList<StockItem> getStock() {
        return stock;
    }
    public ArrayList<Ticket> getTicketList() {
        return ticketList;
    }
    public String getName() {
        return name;
    }
    public double getStockValue() {
        return stockValue;
    }
}
