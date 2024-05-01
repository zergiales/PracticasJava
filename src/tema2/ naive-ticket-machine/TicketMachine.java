
/**
 * Maquina de tickets expendedora ejemplo del tema 2 
 * 
 * @author Sergio Sanchez 
 * @version 15/04/2024
 */
public class TicketMachine{
    
    private int balance;
    private int price;
    private int money;
    private String ticket="ticket imprimido";
    
    //constructor con parametros
    public TicketMachine(int balance, int price, int money, String ticket){
        balance = this.balance;
        price = this.price;
        money = this. money;
        ticket = this.ticket;
    }
    
    //metodos get para mostrar los valores de las variables
    
    public int getBalance(){
        return balance;
    }
    
    public int getPrice(){
        return price;
    }
    
    //metodos set
    public void insertMoney(int moneyInserted){
        money=moneyInserted;
    }
    
}
