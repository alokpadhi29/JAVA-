// // Default constucture
// class Constructure {
//     public static void main(String[] args) {
//         Student s1=new Student();
//         System.out.println(s1.name);//null
//         System.out.println(s1.age);//0
//         System.out.println(s1.rollno);//0
//         System.out.println(s1.college);//null
        
//     }
// }
// class Student {
//     String name;
//     int age ;
//     int rollno;
//     String college;
    
//     Student(){//student is constucture

//     }

// }
// // integer-->0
// // float-->0.0
// // bollean-->false
// // String-->null(nothing)


// Rule of constructure
// - name same as class
// - no return value
// - initilize the object
// type 0f constucture:-
// 1. Default
// 2. parameter
// 3. copy

// Parameter constructure--->

class Constructure {
    public static void main(String[] args) {
        Student s1=new Student("Alok padhi",22,101,"Nit");
        System.out.println(s1.name);//Alok padhi
        System.out.println(s1.age);//22
        System.out.println(s1.rollno);//101
        System.out.println(s1.college);//Nit
        
    }
}
class Student {
    String name;
    int age ;
    int rollno;
    String college;
    
    Student(String n,int a,int r,String c){//student is constucture
        name =n;
        age =a;
        rollno=r;
        college =c;


    }

}