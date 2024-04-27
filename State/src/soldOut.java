public class soldOut implements State{
    gumballMachine gamballmachine;
    public soldOut(gumballMachine gamballMachine){
        this.gamballmachine=gamballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("Sorry, the machine is sold out. You can't insert a quarter.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");

    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs left.");

    }

    @Override
    public void despense() {
        System.out.println("No gumball dispensed. Machine is sold out.");

    }
}
