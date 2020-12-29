import java.util.Scanner;
class Menu{
public static void main(String args[]){
int empid =0;
String name = " ";
String designation=" ";
Scanner sc= new Scanner(System.in);
System.out.println("press a no");
int num= sc.nextInt();



String choice ;
switch(num)
{
case 1 :

System.out.println("employee id");
 empid =sc.nextInt();
System.out.println("enter ur name");
 name=sc.next();
System.out.println("designation");
designation = sc.next();

case 2 :
System.out.println("enter");
num =sc.nextInt();

System.out.println("employee id :" +empid);
System.out.println("name:" +name);
System.out.println("designation:" +designation);

default :
System.out.println("enter");
num =sc.nextInt();
System.out.println("invalid");
break;

}
}
}
