public class FloristsView {
    private FloristsModel model;

    public FloristsView(FloristsModel model) {
        this.model = model;
    }
    //Salida por pantalla del inventario completo de la floristeria.
    public void printFullStock() {
        System.out.println("Stock de " + model.getName() + ":");
        ArrayList<StockItem> stock = model.getStock();
        for (StockItem item : stock) {
            System.out.println(item.getName());
        }
    }
    //Salida por pantalla de las unidades totales de cada articulo.
    public void printItems(){
        ArrayList<StockItem> stock = model.getStock();
        for (StockItem item : stock) {
            System.out.println(item.getName() + ": " + item.getQuantity());
        }
    }
    //Salida por pantalla de los tickets guardados.
    public void printTickets(){
        ArrayList<Ticket> ticketList = model.getTicketList();
        for (Ticket ticket : ticketList) {
            System.out.println(ticket.getId() + ": " + ticket.getValue());
        }
    }
    //Salida por pantalla del valor total del stock.
    public void printStockValue(){
        System.out.println("Valor total del stock: " + model.getStockValue());
    }
    //Salida por pantalla del valor de los tickets acumulados.
    public void printTicketsValue(){
        ArrayList<Ticket> ticketList = model.getTicketList();
        double total = 0;
        for (Ticket ticket : ticketList) {
            total += ticket.getValue();
        }
        System.out.println("Valor total de las ventas: " + total);
    }
}
