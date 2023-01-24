import java.util.ArrayList;

public class FloristsModel {
    
    private String name;
    private double stockValue;
    private double ticketsValue;

    public FloristsModel(String name) {
        this.name = name;
        this.stockValue = 0;
    }
    //Recibe un objeto de la clase StockItem por parámetro y lo añade al stock.
    public void addToStock(StockItem item) {
        System.out.println("Artículo " + item + " añadido al stock");
    }
    //Recibe un objeto de la clase StockItem por parámetro y lo elimina.
    public void removeFromStock(String sku) {										//Cambio de tipo de la variable sku
        System.out.println("Artículo sku = " + sku + " eliminado del stock");
    }
   public void addTicketToList(Ticket ticket) {
        System.out.println("Ticket " + ticket.getTicketNumber() + " creado y archivado");
    }
    //Recibe un objeto de la clase Ticket por parámetro y lo elimina.
    public void removeTicketFromList(int ticketNumber) {
        //ticketList.remove(ticket);
        System.out.println("Ticket " + ticketNumber + " eliminado");
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
