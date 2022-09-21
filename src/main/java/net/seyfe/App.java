package net.seyfe;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        print("Bonjour, mon frere" + Constant.DATA_TYPE + "!!");
        printOrder(new Order("Seyfe", 200, "IPhone"));
    }
    
    public void addedMethod(){
        System.out.println("Added a new method");
    }

    public static void print(String message){
        System.out.println(message);
        if(message.isEmpty()){
            System.out.println("No message provided!!");
        }
    }

    public static void printOrder(Order order){
        System.out.println(order);
    }
}
