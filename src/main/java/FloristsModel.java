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
        //Aquí, además de hacer esto, hay que escribir los datos del artículo de stock en un archivo txt.
        //Pensándolo bien, si hay que escribir los datos en un fichero, quizás no hagan falta los ArrayList.
        //De momento, aquí escribiría solo:
        //System.out.println("Artículo añadido al stock");
        //y cuando veamos que la relación entre las clases y las llamadas a los métodos funcionan, desarrollaría este método en detalle.
    }
    //Recibe un objeto de la clase StockItem por parámetro y lo elimina.
    public void removeFromStock(StockItem item) {
        stock.remove(item);
        stockValue -= item.getValue();
        //Idem, hay que eliminar los datos del archivo de texto.
        //System.out.println("Artículo eliminado del stock");
    }
    //Recibe un objeto de la clase Ticket por parámetro y lo añade a la lista de tickets.
    public void addTicketToList(Ticket ticket) {
        ticketList.add(ticket);
        //Idem, hay que guardar los datos de cada ticket en un archivo de texto.
        //System.out.println("Ticket archivado");
    }
    //Recibe un objeto de la clase Ticket por parámetro y lo elimina.
    public void removeTicketFromList(Ticket ticket) {
        ticketList.remove(ticket);
        //System.out.println("Ticket eliminado");
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
