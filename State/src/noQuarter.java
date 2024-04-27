public class noQuarter implements State{
    gumballMachine gumballmachine;
    public noQuarter(gumballMachine gumballmachine){
        this.gumballmachine=gumballmachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("you inserted a quarter !");
        gumballmachine.setState(gumballmachine.getHasQuarter());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you haven't inserted a quarter ");
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned ,but there is no quarter");
    }

    @Override
    public void despense() {
        System.out.println("you need to pay first");
    }
}
