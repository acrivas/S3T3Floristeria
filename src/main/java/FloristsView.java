public class FloristsView {
    private FloristsModel model;					//En los ejemplos que he visto, la clase View no declara atributos, así que no
    												//estoy seguro de si es necesario. Dejémoslo para más adelante.

    public FloristsView(FloristsModel model) {		//Tampoco estoy seguro de si al constructor hay que pasarle un objeto de la clase
    												//Model como parámetro, o algún parámetro. En teoría, la clase View y la clase Model
    												//se relacionan con la clase Controller, pero no entre ellas.
        this.model = model;
    }
    //Salida por pantalla del inventario completo de la floristeria.
    public void printFullStock() {
        System.out.println("Stock de " + model.getName() + ":");
        ArrayList<StockItem> stock = model.getStock();
        for (StockItem item : stock) {
            System.out.println(item.getName());
        }
        //Creo que este método tiene que imprimir todo el stock, es decir, el sku, el tipo, el descriptivo y el valor de cada artículo.
        //Para ello, deberá acceder al archivo de texto donde guardemos esa información. Por ahora, aquí pondría lo siguiente:
        //System.out.println("Imprime todo el stock"), y dejaría la definición detallada de este método para más adelante.
    }
    //Salida por pantalla de las unidades totales de cada articulo.
    public void printItems(){
        ArrayList<StockItem> stock = model.getStock();
        for (StockItem item : stock) {
            System.out.println(item.getName() + ": " + item.getQuantity());
        }
        //Idem
        //System.out.println("Imprime la cantidad de cada artículo en stock");
    }
    //Salida por pantalla de los tickets guardados.
    public void printTickets(){
        ArrayList<Ticket> ticketList = model.getTicketList();
        for (Ticket ticket : ticketList) {
            System.out.println(ticket.getId() + ": " + ticket.getValue());
        }
        //Idem
        //Syste.out.println("Imprime todos los tickets");
    }
    //Salida por pantalla del valor total del stock.
    public void printStockValue(){
        System.out.println("Valor total del stock: " + model.getStockValue());
        //Idem, tendrá que acceder al archivo donde se guarde el stock y calcular el valor total en stock.
        //System.out.println("Imprime el valor en stock");
    }
    //Salida por pantalla del valor de los tickets acumulados.
    public void printTicketsValue(){
        ArrayList<Ticket> ticketList = model.getTicketList();
        double total = 0;
        for (Ticket ticket : ticketList) {
            total += ticket.getValue();
        }
        System.out.println("Valor total de las ventas: " + total);
        //Idem, tendrá que acceder al archivo donde se guarden los tickets y calcular el valor total de las ventas
        //System.out.println("Imprime el valor total de todos los tickets")
    }
}
