final class Parent{
        final void show(){
            System.out.println("parent method");
        }
    }
    // class Child extends Parent{
    //     // do not write void show 
    // }
public class FinalKeyword {
    public static void main(String[] args) {
        // in variable
        // final  int x=10;
        // x =20;// error because this not in final kkey word

        // System.out.println(x);

        // in method 
        // Child c =new Child();
        // c.show();
        Parent p= new Parent();
        p.show();


    }

}

