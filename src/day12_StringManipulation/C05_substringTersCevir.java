package day12_StringManipulation;

public class C05_substringTersCevir {
    public static void main(String[] args) {
        //kullanicidan bir kelime isteyin ve tersten yazdirin

        String input = "Veli";
        String tersInput = input.substring(3) +
                input.substring(2, 3) +
                input.substring(1, 2) +
                input.substring(0, 1);
        System.out.println(tersInput);
    }
}
