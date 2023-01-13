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
    	//Aquí llamaría al constructor de StockItem desde dentro del método createStockItem (en vez de tener llamar al constructor
    	//desde el main para posteriormente pasarle el objeto de la clase StockItem al método createStockItem).
    	StockItem stockItem = new StockItem (String type, String descr, double price);
        model.addToStock(stockItem);
    }
    //Elimina un artículo del stock.
    public void eliminateStockItem(int sku) {
        //Aquí le pasaría por parámetro el sku (stock keeping unit), que es el número identificativo del artículo.
    	if (skuExists(sku)) {						//Método que devuelve TRUE si el sku existe (por definir)
    		stockItem = searchStockItem(sku);		//Método que devuelve un objeto de la clase StockItem al recibir un sku (por definir)
    		model.removeFromStock(stockItem)
    	} else {
    		System.out.print("sku no asignado a ningún artículo de inventario")
    	}
    }
    //Crea un ticket de compra y lo añade al array de tickets.
    public void createTicket() {
    	//Igual que antes, llamaría al constructor desde dentro del método.
    	Ticket ticket = new Ticket();
        model.addTicketToList(ticket);
    }
    //Elimina un ticket de compra.
    public void eliminateTicket(int ticketNumber) {
    	//Igual que antes, le pasaría por parámetro el número de ticket.
    	if (ticketNumberExists(ticketNumber)) {		//Método que devuelve TRUE si el número de ticket existe (por definir)
    		ticket = searchTicket(ticketNumber);	//Método que devuele un objeto de la clase Ticket al recibir un número de ticket (por definir)
    		model.removeTicketFromList(ticket);
    	}
       		
    }
}
