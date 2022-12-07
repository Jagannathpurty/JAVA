import java.util.Scanner;
class AddMatrix{
public static void main(String args[]){
int a[][]=new int [3][3];
int b[][]=new int [3][3];
int c[][]=new int [3][3];
Scanner in=new Scanner(System.in);
System.out.print("Enter the first matrix data\n");
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
a[i][j]=in.nextInt();
}
}
System.out.print("Enter the second matrix data\n");
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
b[i][j]=in.nextInt();
}
}
System.out.print("First matrix\n");
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
System.out.print(a[i][j]+" ");
}
System.out.print("\n");
}

System.out.print("Second matrix\n");
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
System.out.print(b[i][j]+" ");
}
System.out.println("\n");
}
System.out.println("Sum of two matrix\n");
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
c[i][j]=a[i][j]+b[i][j];
System.out.print(c[i][j]+" ");
}
System.out.print("\n");
}
}
}

