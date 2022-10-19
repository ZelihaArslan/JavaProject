package methodOverloading;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        System.out.println("Sonuc:"+ dortIslem.topla(5,3));
        System.out.println(dortIslem.topla(2,4,5));
    }

}
