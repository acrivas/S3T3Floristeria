public class FloristsView {

    private String name;

    public FloristView() {
        this.name = FloristsModel.name;
    }
    //Salida por pantalla del inventario completo de la floristeria.
    public void printFullStock() {
        System.out.println("Imprime todo el stock");
    }
    //Salida por pantalla de las unidades totales de cada articulo.
    public void printItems(){
        System.out.println("Imprime la cantidad de cada artículo en stock");
    }
    //Salida por pantalla de los tickets guardados.
    public void printTickets(){
        System.out.println("Imprime todos los tickets");
    }
    //Salida por pantalla del valor total del stock.
    public void printStockValue(){
        System.out.println("Imprime el valor en stock");
    }
    //Salida por pantalla del valor de los tickets acumulados.
    public void printTicketsValue(){
        System.out.println("Imprime el valor total de todos los tickets");
    }
}