package ejemplofor;

/**
 *
 * @author JUAN
 */
public class EjemploFor {

    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Hola");
            
        }
        
        
        // Aqui usamos un while para crewar el mismo efecto del for de arriba 
        // por si alguna vez tenemos la limitacion de no poder usar un for
        int j=0;
        
        while( j<10 ) {
            System.out.println("Adios");
            j++;
        }
    }
    
}
