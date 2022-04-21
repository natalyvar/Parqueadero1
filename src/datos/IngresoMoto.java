package datos;

import java.util.Date;
import java.util.Timer;

/**
 *
 * @author NATALY VARGAS
 */
public class IngresoMoto {
     private String placa;
    private Date fecha;
    private Timer hora;
    private String identificacion;
    
    public IngresoMoto() throws UnsopportedOperationException{
        throw new UnsopportedOperationException("Not supported yet");
    }
    
    public String ObtenerPlaca(){
        return placa;
    }
    
    public void ModificarPlaca(String placa){
        this.placa = placa;
    }
    
    public Date ObtenerFecha(){
        return fecha;
    }
    
    public void ModificarFecha(Date fecha){
        this.fecha = fecha;
    }
    
    public Timer ObtenerHora(){
        return hora;
    }
    
    public void modificarHora(Timer hora) {
    this.hora = hora;
    }
    
    public String obtenerIdentificacion() {
    return identificacion;
    }
    
    public void modificarIdentificacion(String identificacion) {
    this.identificacion = identificacion;
    } 
    
   public static int restarCupo(){
      int c= 30-1;
       return c;
   }    
}


  