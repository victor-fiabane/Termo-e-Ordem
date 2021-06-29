
package termoeordem;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class TermoeOrdem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, o, t;
        String resp = null;
        Scanner teclado = new Scanner(System.in);
        t = -1; 
        System.out.println("Informe o número de sucessão");
        n = teclado.nextInt();
        for(o = 1; o <= n; o++){
            System.out.println(o);
            
            if(o % 2 == 0){
                t = t + 5;
            }else{
                t = t + 1;
            }
        }
        System.out.println(""+resp);
    }
    
}
