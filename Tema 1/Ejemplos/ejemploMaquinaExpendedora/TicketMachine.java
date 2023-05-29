
/**
 * --EJEMPLO MAQUINA EXPENDEDORA
 * clase donde vamos a moldear, mediante un ejemplo, una maquina expendedora
 * de billetes muy sencilla.. (página 52)
 *  - este proyecto solo consta de una clase, aunque le hemos añadido otra para jugar con ella y sus objetos con sus metodos
 * 
 * - Se nos pide que suminu¡istremos un número, que se corresponde con el precio 
 * de los billetes emitidos por esa maquinaen concreto.
 *      --> consideremos que el precio esta en centimos y trabajamos ocn numeros  enteros positivos
 * 
 * @author Sergio Sanchez
 * @version 1.0
 */

public class TicketMachine {
    // Atributos

    // precio de un billete
    private int price;

    // la cantidad de dinero que el usuario ha introducido en la maquina
    private int balance;

    // Cantidad total de dinero recaudado
    private int total;

    /*
     * atributo con valor priv porque solo quiero que esten aqui y ya
     */

    // Constructor
    /**
     * constructores que son los objetos de la clase , aunque no lo creemos
     * habrá uno por defecto
     * 
     * esto crea una instancia y da unos valores a los atributos de la clase
     * 
     * - los constructores son otro tipo de "metodos"
     */
    public TicketMachine(int cost) {
        price = cost;
        balance = 0;
        total = 0;
    }

    // métodos

    // metodo para recuperar el valor de un atributo

    // metodo que devuelve el precio de un billete
    public int getPrice() {
        return price;
    }

    // metodo que devuelve la cantidad de dinero
    public int getBalance() {
        return balance;
    }

    // metodo para almacenar la cantidad de dinero
    public void insertMoney(int amount) {
        balance = balance + amount;
    }

    // mostrar por pantalla
    public void printTicket() {
        System.out.println("*************");
        System.out.println("* Billete");
        System.out.println("* " + price + " €");
        System.out.println("*************");
        System.out.println(""); // espacio en blanco pa que quede bonico

        total = total + balance;
        balance = 0;
    }

}
