public class gumballMachine {
State soldOut;
State NoQuarter;
State HasQuarter;
State SoldState;

State state =soldOut;
int count=0;
public gumballMachine(int numberGumbel){
   soldOut=new soldOut(this);
   NoQuarter=new noQuarter(this);
   HasQuarter=new hasQuarter(this);
   SoldState =new soldState(this);
   this.count=numberGumbel;
   if (numberGumbel>0){
      state=NoQuarter;
   }
}
public void insert(){
   state.insertQuarter();
}
public void eject(){
   state.ejectQuarter();
}
public void trunkCrank(){
   state.turnCrank();
   state.despense();
}
public void despense() {
   state.despense();
}
void setState(State state){
   this.state=state;
}
void releaseball(){
   System.out.println("a gumble comes out slot ..");
   if (count!=0){
      count=count-1;
   }
}
public State getSoldOut(){
   return soldOut;
}
public State getNoQuarter(){
   return NoQuarter;
}
public State getHasQuarter(){
   return HasQuarter;
}
public State getSoldState(){
   return SoldState;
}
public int getCount(){
   return count;
}
public void refill(int numgumbell){
   count+=numgumbell;
   if (count>0){
      state=NoQuarter;
   }
}
public void print(){
   System.out.println("gumbel machine statues\n");
   System.out.println("current state:"+state.getClass().getSimpleName());
   System.out.println("\ngumbelle in machine"+count);
}

}
