package ExceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        //try tarafından atılan hata catch ile yakalanır.
        try {
            byte x[] = new byte[3];
//            x[5] = 3;   //dizinin boyutu yanlış
//            x[1] = (byte) (50/0);   //0 a bölünme hatası
            String str = null;   //string ifade null, boyutunu hesaplayamaz exception atar
            System.out.println("String'in boyu="+str.length());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dizinin boyutunu aştınız");
        }catch (ArithmeticException e){
            System.out.println("Tanımsız ifade");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Programda bir hata oluştu");
            e.printStackTrace();
        }finally {
            System.out.println("Kod bloğu her durumda çalışır");
        }
    }
}
