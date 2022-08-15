package day33_Encapsulation;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogr1=new Ogretmen();
        ogr1.setIsim("Tulay");//yazdirdi
        System.out.println(ogr1.getIsim());//getirdi
        /*
        bu yontemde data hiding degil daha anlasilir bir kod amaclanmis olur
         */
    }
}
