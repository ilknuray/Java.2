package practiceler;

public class C20_MethodCreation {
    public static void main(String[] args) {
        String input="yayla bakliyat";
        essizYaz(input);
    }

    public static void essizYaz(String input) {
        String essizInput="";
        for (int i = 0; i <input.length() ; i++) {
            if(!essizInput.contains(input.substring(i,i+1))){
                essizInput+=input.substring(i,i+1);




            }

        }
        System.out.println(essizInput);

    }
}
