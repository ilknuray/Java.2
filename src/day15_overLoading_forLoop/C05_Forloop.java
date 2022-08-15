package day15_overLoading_forLoop;

public class C05_Forloop {
    public static void main(String[] args) {
        //1 den 5 é (dahil)kadar olan sayilarin toplamini bulunuz
        int toplam=0;

        for (int i = 1; i <= 5; i++) {

            toplam+=i;
        }
        System.out.println(toplam);

        toplam=0;
        for (int i=10; i<=50; i++){
            toplam+=i;
        }
        System.out.println(toplam);
        //30 ve 50 dahil aralarindaki cift sayilarin toplami
        // 1:yontem
        toplam=0;
        for (int i=30; i<=50; i+=2){
            toplam=+i;
        }
        System.out.println(toplam);

        //2:yontem
        for(int i=30; i<=50; i++){
            if(i%2==0){
                toplam=+i;
                System.out.println(toplam);
            }
        }











    }
}