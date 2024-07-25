package Email;
/**
 *
 * @author crist
 */
public class RentItem {
String codigo;
String nombre;
double precio;
int cantidad;

    public RentItem(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad=0;
    }

public String toString(){
    return "Codigo: "+codigo+"\nNombre: "+nombre+"\nPrecio: "+precio+"\nCopias"+cantidad;
}    
public double pagoRenta(int dias){
return 0;    
}

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
   public String submenu(){
   return "Submenu"+"\n1-Imprimir";    
   }  
public void ejecutarOpcion(int opcion){
 if(opcion==1)
 super.toString();
    System.out.println("Opcion no valida");
}

}

