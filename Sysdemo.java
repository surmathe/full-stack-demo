class A{
 final int a=10;
public void display(){
int a =20;
System.out.println("Changed value:"+a);
}
}

class Sysdemo extends A{
public static void main(String args[]){
A a1= new A();
System.out.println(a1.a);
a1.display();
}
}
