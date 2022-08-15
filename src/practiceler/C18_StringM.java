package practiceler;

public class C18_StringM {
    public static void main(String[] args) {
      /*  StringBuilder sb=new StringBuilder("ilknur");
        sb=sb.reverse();
        System.out.println(sb);*/

        String str="meva";
        if(str.length()<=4){
            char bir=str.charAt(0);
            char iki=str.charAt(1);
            char uc=str.charAt(2);
            char dort=str.charAt(3);
            System.out.println(dort+uc+iki+bir);
        }else
            System.out.println("girdiginiz kelimenin uzunlugu dortten fazladir");
    }
}
