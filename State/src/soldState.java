public class soldState implements State{
    gumballMachine gumballmachine;;
    public soldState(gumballMachine gumballmachine){
         this.gumballmachine=gumballmachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("please wait, we're already giving you a gumbel");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("turning twice doesn't give you another gumbel !");
    }

    @Override
    public void despense() {
         gumballmachine.releaseball();
         if (gumballmachine.getCount()>0){
             gumballmachine.setState(gumballmachine.getNoQuarter());
         }else {
             System.out.println("Oops, out of gumbel");
             gumballmachine.setState(gumballmachine.getSoldOut());
         }
    }
}
