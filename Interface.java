interface Simple{
void show();
}
class A implements Simple{
public void show(){
System.out.println("Showing");
}
}
class Interface{
public static void main(String args[]){
Simple a=new A();
a.show();
}
}
