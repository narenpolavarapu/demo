import java.util.*;

class Student{
int roll;
String name;
void studentdetails(String x,int y){
name=x;
roll=y;
}
void printstudent(){
System.out.println("Name is "+name);
System.out.println("Roll number is "+roll);
}
}

class Marks extends Student{
int maths;
int english;
void marksdetails(int x,int y){
maths=x;
english=y;
}
void printmarks(){
System.out.println("Maths marks are "+maths);
System.out.println("English marks are "+english);
}
}

class percentage extends Marks{
void printpercentage(){
System.out.println("total percentage is "+(maths+english));
}
}

class Multi{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
percentage p1=new percentage();
System.out.println("enter student name ");
String n=s.next();
System.out.println("enter student roll number ");
int r=s.nextInt();
System.out.println("enter maths marks ");
int m=s.nextInt();
System.out.println("enter english marks ");
int e=s.nextInt();
System.out.println("---------------------");
System.out.println("student details are ");
p1.studentdetails(n,r);
p1.printstudent();
p1.marksdetails(m,e);
p1.printmarks();
p1.printpercentage();
}
}