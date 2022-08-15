package day41_abstractClass_Interface;

public abstract class DAraba {
    public static void main(String[] args) {
        /*abstract classlarda main method obsiyoneldir
        eger abstract class sadece child classlariin tasimak zorunda
        oldugu ozellikleri belirlemek icin olusturulduysa main methoda ihtiyac
        olmaz sadece abstract methodlar olur


        ama bir abstract methodta da standart belirlemek disinda
        da methodlar calisabilir
        bu durumda ihtiyac olursa main method olusturulabilir

        * */}

        protected abstract void yakit();
       protected abstract void motor();
       /*
       sadece child ozellikler belirlenecekse body olmaz
        */
       protected abstract void kaporta();

       public void klima(){
           System.out.println("bazi arabalarda klima olabilir");
       }

    }

