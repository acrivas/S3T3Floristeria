import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input;
        do {
           Menu();
           input = AskInt();
        }while (input<0 || input>13);{
            switch (input){
                case 1:
                    FileExist();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 0:
                    break;
            }
        }
    }
    public static void Menu(){
        System.out.println("****MENÚ PRINCIPAL****");
        System.out.println("1· Crear Floristería");
        System.out.println("2· Añadir Árbol");
        System.out.println("3· Añadir Flor");
        System.out.println("4· Añadir Decoración");
        System.out.println("5· Visualizar Stock");
        System.out.println("6· Retirar Árbol");
        System.out.println("7· Retirar Flor");
        System.out.println("8· Retirar Decoración");
        System.out.println("9· Visualizar Cantidades de Stock");
        System.out.println("10· Visualizar Valor Total de Stock");
        System.out.println("11· Crear Ticket de Compra");
        System.out.println("12· Visualizar Listado de Compras");
        System.out.println("13· Visualizar Historial de Ventas");
        System.out.println("0· Finalizar programa.");
    }
    public static int AskInt(){
        int input =-1;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            input = sc.nextInt();
        }else{
            System.out.println("Debe escoger una opción del menú.\n");
        }
        return input;
    }
    public static void FileExist(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre: ");
        String name = sc.nextLine();
        File file = new File(name + ".txt");
        if (file.exists()){
            System.out.println("Ya se encuentra en el sistema.");
        }else{
            CreateFile(name);
        }
    }
    public static void CreateFile(String name){
        try{
            FileWriter fw = new FileWriter(name + ".txt");
            fw.write("***Floristería "+name+"***");
            fw.close();
            System.out.println("Se ha añadido al sistema.");
        }catch (IOException e){
            System.out.println("Se ha producido un error.");
        }
    }
    public static void Writer(String name){
        try{
            FileWriter fw = new FileWriter(name + ".txt");
            BufferedWriter bw = new BufferedWriter(fw);
            Scanner sc = new Scanner(System.in);
            System.out.println("Indique que quiere añadir al archivo: ");
            String input = sc.nextLine();
            bw.write(input);
            bw.close();
        }catch (IOException e){
            System.out.println("Se ha producido un error.");
        }
    }
}