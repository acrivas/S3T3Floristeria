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
    public void createStockItem(StockItem item) {
        model.addToStock(item);
    }
    //Elimina un artículo del stock.
    public void eliminateStockItem(StockItem item) {
        model.removeFromStock(item);
    }
    //Crea un ticket de compra y lo añade al array de tickets.
    public void createTicket(Ticket ticket) {
        model.addTicketToList(ticket);
    }
    //Elimina un ticket de compra.
    public void eliminateTicket(Ticket ticket) {
        model.removeTicketFromList(ticket);
    }
}
