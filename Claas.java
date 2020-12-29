class Xyz{

Xyz(){
System.out.println("default");
}
Xyz(int x, int y){
{
System.out.println("para");
}
void disp(){
System.out.println("disp1 ");
}
}
 class Abc extends Xyz{

Abc(){
super(10,20);
System.out.println("def");
}
 void disp(){
System.out.println("disp2");
}
}
class Claas{
public static void main(String args[]){
Abc a1 =new Abc();
a1.disp();
}
}
