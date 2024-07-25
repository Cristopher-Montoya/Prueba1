/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Email;

import Email.RentItem;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Movie extends RentItem {
Scanner lea=new Scanner(System.in);
String estado;
public Movie(String codigo, String nombre, double precio) {
    super(codigo, nombre, precio);
    estado="ESTRENO";
    }
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

public String toString(){
return super.toString()+"\nEstado"+estado+"-Movie";
}
public double pagoRenta(int dias) {
    double recargo = 0;
    if (estado.equals("ESTRENO") && dias>2) {
        recargo=(dias-2)*50;
        } else if (!estado.equals("ESTRENO") && dias>5) {
            recargo=(dias-5)*30;
        }
         return getPrecio() + recargo;
    }
public String submenu(){
    return super.submenu()+"\n2- Cambiar Estado";
}
public void ejecutarOpcion(int opcion) {
    if (opcion==1) {
        System.out.println(estado);
    } else if (opcion==2) {
            System.out.print("Ingresar nuevo estado: ");
            String nuevoEstado=lea.nextLine();
            setEstado(nuevoEstado);
        } else {
System.out.println("Opcion no valida");
    }
}


}
