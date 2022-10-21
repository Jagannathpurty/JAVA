class A{
public static void main(String args[]){
int a,b,c,i,j;
Scanner r=new Scanner(System.in);
System.out.println("Enter the raw of matrix: ");
raw=r.nextint();
System.out.println("Enter the column of matrix: ");
col=r.nextint();

int a[][]=new int [2][2];
int b[][]=new int [2][2];
int c[][]=new int [2][2];
System.out.println("Enter element of matrix a: ");
for(i=0;i<2;i++){
for(j=0;j<2;j++){
a[i][j]=r.nextint();
}
System.out.println("\n");
}
System.out.println("Enter element of matrix b: ");
for(i=0;i<2;i++){
for(j=0;j<2;j++){
a[i][j]=r.nextint();
}

System.out.println("\n");
}
System.out.println("After addition of 2 matrix: ");
for(i=0;i<2;i++){
for(j=0;j<2;j++){
c[i][j]=a[i][j]+b[i][j];
System.out.println("c[i][j]+" ");
}

System.out.println("\n");
}

System.out.println();

}
}
