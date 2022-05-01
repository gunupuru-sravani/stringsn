class Person

{

int aadhar,age;

String surname,name,dob;

void ReadData()

{


BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

try

{
System.out.println("Enter aadhar:");

aadhar=Integer.parseInt(br.readLine());

System.out.println("Enter surname:");

surname=br.readLine();

System.out.println("Enter name:");

name=br.readLine();

System.out.println("Enter age:");

age=Integer.parseInt(br.readLine());

System.out.println("Enter dob:");

dob=br.readLine();
}

catch(Exception e){}
}
void DisplayData()

{


System.out.println("person aadhar no:"+aadhar);

System.out.println("person name:"+surname);

System.out.println("person name:"+name);

System.out.println("person dob:"+dob);

System.out.println("person age:"+age);

}

}
class Student

{

int admno,year;

String college,course;

void ReadData()

{


BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

try

{

System.out.println("Enter admission no:");

 admno=Integer.parseInt(br.readLine());

System.out.println("Enter college:");

college=br.readLine();

System.out.println("Enter course:");

course=br.readLine();

System.out.println("Enter year:");

year=Integer.parseInt(br.readLine());

}
catch(Exception e){}

}


void DisplayData()

{


System.out.println("student admission no:"+admno);

System.out.println("student college:"+college);

System.out.println("student course:"+course);

System.out.println("year of joining:"+year);


}

}
class Main

{

public static void main(String arg[])throws IOException

{

BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

Person p=new Person();

p.ReadData();

p.DisplayData();


System.out.println();

System.out.println();


Student s= new Student();

s.ReadData();

s.DisplayData();
}
}
