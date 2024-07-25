package Email;

import Email.RentItem;
import Email.PS3Game;
import Prueba1.Movie;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class main {
       public static void main(String[] args) {
        ArrayList<RentItem> items = new ArrayList<>();
        Scanner lea = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("Menu: \n1-Agregar Item \n2-Codigo del item \n3-Ejecutar Sub Menu \n4-Imprimir \n5-Salir \nIngresar una opcion:"); 
            opcion =lea.nextInt();
switch (opcion) {
                case 1:
                    System.out.print("Ingresar tipo MOVIE o PS3: ");
                    String tipo=lea.nextLine();
                    System.out.print("Ingresar codigo: ");
                    String codigo=lea.nextLine();
                    System.out.print("Ingresar nombre: ");
                    String nombre = lea.nextLine();
                    switch (tipo.toUpperCase()) {
                        case "MOVIE":
                            System.out.print("Ingresar precio de renta: ");
                            double precio = lea.nextDouble();
                            items.add(new Movie(codigo, nombre, precio));
                            break;
                        case "PS3":
                            items.add(new PS3Game(codigo, nombre));
                            break;
                        default:
                            System.out.println("Error");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Ingresar codigo del Item: ");
                    codigo=lea.nextLine();
                    RentItem item=findItemByCodigo(items, codigo);
                    if (item != null) {
                        System.out.println(item+"\nIngrese dias de renta: ");
                        int dias = lea.nextInt();
                        System.out.println("Monto a pagar: "+item.pagoRenta(dias));
                    } else {
                        System.out.println("Item no existente");
                    }
                    break;
                case 3:
                    System.out.print("Ingresar codigo del Item: ");
                    codigo = lea.nextLine();
                    item = findItemByCodigo(items, codigo);
                    if (item != null) {
                        System.out.println(item.submenu());
                        System.out.print("Ingresar una opcion");
                        int subOpcion =lea.nextInt();
                        item.ejecutarOpcion(subOpcion);
                    } else {
                        System.out.println("Item No Existente");
                    }
                    break;
                case 4:
                    for (RentItem itemListado : items) {
                        System.out.println(itemListado);
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(opcion!=5);
    }
    private static RentItem findItemByCodigo(ArrayList<RentItem> items, String codigo) {
        for (RentItem item : items) {
            if (item.getCodigo().equals(codigo)) {
                return item;
            }
        }
        return null;
    }
}