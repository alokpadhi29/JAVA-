class Parameter{
    String name;
    int age;
    Parameter(String n,int a){
        name=n;
        age=a;
    }
    public static void main(String[] args) {
        Parameter d =new Parameter("Alok padhi",22);
        System.out.println(d.name);
        System.out.println(d.age);
    }
}
