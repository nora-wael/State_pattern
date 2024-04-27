
public class Main {
    public static void main(String[] args) {
         gumballMachine gumballMachine= new gumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insert();
        gumballMachine.trunkCrank();

        gumballMachine.print();

        gumballMachine.refill(10);
        gumballMachine.print();
    }
}