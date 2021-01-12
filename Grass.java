import java.util.*;
class Grass{
    public static void main(String [] args){
        Scanner kbd=new Scanner(System.in);
        double C,sum=0;
        C=kbd.nextDouble();
        if(C>0 && C <=100){
            int L;
            L=kbd.nextInt();
            for(int i=0;i<L;i++){
                double len,wid;
                len=kbd.nextDouble();
                wid=kbd.nextDouble();
                sum+=len*wid;
            }
            System.out.format("%.7f%n",sum*C);
        }
    }
}