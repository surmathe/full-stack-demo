interface Rbi{
int a =8;

 void loan();
public default void display(){

}
static void print(){
System.out.println("ln");
}
}

class Axis extends Rbi{
public void loan(){
System.out.println("5");
}
public void loanrecover(){
System.out.println("sbiclass");

}
class Sbi extends Rbi{
void loan(){
System.out.println("6");
}
 }
class Loans{
public static void main(String args[]){
System.out.println("loans");
//Sbi s = new Sbi();
//s.loan();
//Axis a=new Axis();
//a.loan();
Rbi r = new Sbi();
r.loan();
}
}