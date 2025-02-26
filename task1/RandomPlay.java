import java.util.*;
public class RandomPlay{
    public static int randomNumber(int bound){
        Random r=new Random();
        int randnum=r.nextInt(bound) +1;
        return randnum;
    }
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        int level=1;
        int bound=5;
        int result=randomNumber(bound);
        int trails=0;
        int maxtrials=5;
        boolean check=true;
            while(check){
                System.out.println("enter the number:");
                n=s.nextInt();
                trails++;

                if(n==result){
                    System.out.println("congratulations  next level");
                    level++;
                    maxtrials++;
                    bound+=5;
                   continue;
                }
                else if(n>result){
                    System.out.println("to high!!!");
                }
                else{
                    System.out.println("to low!!!");
                }
                if(trails==maxtrials){
                    System.out.println("sorry number of attempts are over.try again !!!!       score="+(level-1));
                    check=false;
                }
                

            }
            s.close();
    
}
}