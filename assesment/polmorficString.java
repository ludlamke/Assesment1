package assesment;

import java.util.Scanner;

class Poly
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String morf;

        System.out.println("enter ether 1, 2 , or3");
        int choos = sc.nextInt();

        if(choos == 1)
        {
            morf = "hello";
        }
        else if(choos == 2)
        {
            morf = "north";
        }
        else if(choos == 3)
        {
            morf = "penutbutter";
        }
        else 
        {
            morf = "not appropriate number you fail goodbye";
        }

        System.out.println(morf);
        


        sc.close();
    }
}