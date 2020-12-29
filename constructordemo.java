class A{
int a;
int b;
A(int x, int y){
a=x;
b=y;
}
 public void display(){
System.out.println("X value is " +a + " Y value is" +b);
}
}





class Constructordemo{
public static void main(String args[]){
A a1= new A(20,30);
a1.display();
}
}
