package Email;

import Prueba1.RentItem;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class PS3Game extends RentItem {
    private Calendar fechaPublicacion;
    public PS3Game(String codigoItem, String nombreItem) {
        super(codigoItem, nombreItem, 30);
        this.fechaPublicacion = Calendar.getInstance();
    }
    public Calendar getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(int year, int mes, int dia) {
        this.fechaPublicacion.set(year, mes - 1, dia);
    }
    public String toString(){
    return super.toString()+fechaPublicacion+" -PS3 Games";
    }
    public String submenu(){
    return super.submenu()+"\n2-Actualizar fecha de publicacion";
    }
    public double pagoRenta(int dia){
    return getPrecio()*dia;    
    }
    public void ejecutarOpcion(int opcion){
        if (opcion==1) {
            System.out.println(fechaPublicacion);
        } else if (opcion==2) {
            Scanner lea = new Scanner(System.in);
            System.out.print("Ingresar año: ");
            int year=lea.nextInt();
            System.out.print("Ingresar mes: ");
            int mes=lea.nextInt();
            System.out.print("Ingresar día: ");
            int dia=lea.nextInt();
            setFechaPublicacion(year, mes, dia);
        } else {
            System.out.println("Opcion no valida");
        }
    }
    
    
}
