public class FloristsController {
    private FloristsModel model;
    private FloristsView view;

    public FloristsController(FloristsModel model, FloristsView view) {
        this.model = model;
        this.view = view;
    }
    public FloristsModel getModel() {
        return model;
    }
    //Crea un objeto de la clase StockItem y lo añade al stock.
    public void createStockItem() {

        StockItem stockItem = new StockItem (type, descr, price);			//Corrección de la mala sintaxis.
        model.addToStock(stockItem);
    }
    //Elimina un artículo del stock.
    public void eliminateStockItem(String sku) {							//Cambio de tipo de la variable sku
        model.removeFromStock(sku);
    }
    //Crea un ticket de compra y lo añade al array de tickets.
    public void createTicket() {
        Ticket ticket = new Ticket();
    }
    //Crea un ticket de compra y lo añade al array de tickets.
    public void createTicket() {
    	Ticket ticket = new Ticket();
      model.addTicketToList(ticket);
    }
    //Elimina un ticket de compra.
    public void eliminateTicket(int ticketNumber) {
    model.removeTicketFromList(ticketNumber);
    }
}