//wite program + symble in row * amd colonm &
class Parteen2{
    public static void main(String[] args){
        int r=7;
        int c=8;
        for (int i=1 ;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==4 ){
                System.out.print("*");
                }
                else if(j==4){
                    System.out.print( "&");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}