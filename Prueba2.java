import com.bramepar.practiva_depurando_1.CuentaBancaria;

public class Prueba2 {
    public static void main(String[] args) {
    CuentaBancaria cuenta2 =new CuentaBancaria(1,"prueba",2);
    
/*CAJA BLANACA  DE Tipo condiciones */

    /*Si ponemos 3 a retirar con el mismo balance nos dara error */
    
    cuenta1.retirar(4);


    System.out.println(cuenta2.balance);


    }
}
