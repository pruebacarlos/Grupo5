import com.bramepar.practiva_depurando_1.CuentaBancaria;

public class Prueba1 {
    public static void main(String[] args) {
        /* Method to make a withdrawal from an account */
    CuentaBancaria cuenta1 =new CuentaBancaria(1,"prueba",2);
    
    /*PRUEBA FCAJA BLANCA */
    
    
    /*Para que funcione tiene que ser una cantidad menos del balance que tenemos,
    en este caso, tenems de balance 2, si ponemos 1 a retirar nos quedaria 1*/
    cuenta1.retirar(1);


    System.out.println(cuenta1.balance);






}
}
