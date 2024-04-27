public class hasQuarter implements State{
    gumballMachine gumballmachine;
    public hasQuarter(gumballMachine gumballmachine){
        this.gumballmachine=gumballmachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("you can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("quarter returned");
        gumballmachine.setState(gumballmachine.getHasQuarter());
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned..");
        gumballmachine.setState(gumballmachine.getSoldState());
    }

    @Override
    public void despense() {
        System.out.println("no gumbell desbensed");
    }
}
