// in variable

// class Parent{
//     int x=10;
// }
// class Child extends Parent{
//     int x=20;
//     void show(){
//         System.out.println(super.x);
//          System.out.println(x);
//     }
// }

// public class SuperKeyword {
//     public static void main(String[] args) {
//         Child c = new Child();
//         c.show();
//     }
// }

// in method 
// class Parent{
//    void show(){
//     System.out.println("parent method ");
//    }
// }
// class Child extends Parent{
//     void display(){
//         super.show();

        
//          System.out.println("child method");
//     }
// }

// public class SuperKeyword {
//     public static void main(String[] args) {
//         Child c = new Child();
//         c.display();
//     }
// }

//  in constructure 
class Parent{
   Parent(){
    System.out.println("parent constucture");
   }
}
class Child extends Parent{
    Child(){
        super();

        
         System.out.println("child constucture");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Child c = new Child();
      
    }
}
// supper key word is used in java  to refer to thje immediate parent class object .
// super ଦ୍ୱାରା child class ରୁ parent class ର variable, method କିମ୍ବା constructor କୁ access କରିପାରିବା।
