package datos;

/**
 *
 * @author NATALY VARGAS
 */
public class SalidaMoto {
    private String placa;
    
    public String ObtenerPlaca() {
    return placa;    
    }
    
    public void modificarPlaca(String placa) {
    this.placa = placa;
    }

    public static int sumarCupo() {
        int a = 30 + 1;
        return a;
    }    
}
