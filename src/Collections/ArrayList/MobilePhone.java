package Collections.ArrayList;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName())>=0){ //eklenen kişi listede varsa false döndürür
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact); //kişi listede yoksa ekleyip true döner.
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);  //eklenen kişiyi buluruz
        if(foundPosition<0){    //önceki kayıdın konumu yoksa
            System.out.println(oldContact.getName() + ", was not found");
            return false;
        }else if(findContact(newContact.getName())!= -1){  //aynı isim varsa tekrar güncellemez
            System.out.println("Contact with name "+newContact.getName() +
                    " already exists. Update was not successful");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName()+ ", was replaces with "+ newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + ", was not found");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName()+ " , was deleted");
        return true;
    }
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);   //konumu bul
    }
    private int findContact(String contactName){
        for(int i=0; i<this.myContacts.size();i++){   //kayıtlar arasında bu isim varsa tüm kayıtları gezerek ismi bulacak
            Contact contact = this.myContacts.get(i); //yeni bir nesne yaratıp, listede kaydın konumunu bularak
            if(contact.getName().equals(contactName)){  //kaydın ismini tanımlanan contactName e eşitse
                return i; //konumun numarasını verecek
            }
        }
        return -1;  //bulunamadı
    }
    public Contact queryContact(String name){   //kişiyi güncellemek ve silmek için önce konumunu bulmalıyız ve bu kayda erişmek için public
        int position = findContact(name); //isme göre güncelleme ve silme yapıyorum
        if(position >= 0){
            return this.myContacts.get(position); // bulunan kişinin konumunu döndürüyorum.
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List");
        for(int i=0;i<this.myContacts.size(); i++){
            System.out.println((i+1)+ "."+
                    this.myContacts.get(i).getName() + " ->" +
                    this.myContacts.get(i).getPhoneNumber());

        }
    }
}
