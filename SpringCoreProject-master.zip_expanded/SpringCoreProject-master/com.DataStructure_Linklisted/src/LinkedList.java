
class Eleman{
    int sayi ;
    Eleman ileri;    
    public Eleman(int sayi){
        this.sayi = sayi;
        this.ileri = null;
    }
}

// Elemanlar?m?z? Tek Yönlü Ba?l? Listede tutuyoruz.
public class LinkedList {
    Eleman bas; // Ba?taki eleman? tutuyoruz.
    Eleman son; // Sondaki eleman? tutuyoruz.
    
    public LinkedList(){
        bas=null; // ilk ba?ta bo? tan?ml?yoruz.
        son=null;         
    }
    
    public void basaEkle(Eleman yeni){
        // E?er hiç eleman yoksa yeni gelen Eleman hem ba?? hem sonu gösteriyor.
        if(bas==null){ 
            bas = yeni ;
            son = yeni ;           
        }
        // E?er daha önceden eleman varsa yeni gelen eleman ba?? gösteriyor ve art?k ba? o oluyor.
        else {
            yeni.ileri = bas ;
            bas = yeni ;
        }
    }
    
    public void sonaEkle(Eleman yeni){
        // E?er hiç eleman yoksa yeni gelen Eleman hem ba?? hem sonu gösteriyor.
        if(bas==null){
            bas = yeni ;
            son = yeni ;            
        }
        else {
        // E?er daha önceden eleman varsa yeni gelen eleman sonu gösteriyor ve art?k son o oluyor.
            son.ileri = yeni ;
            son = yeni ;
        }
    }
        
    /* Bu metod ile birlikte liste içinde arad???m?z elemana kadar gidip o elaman? bulduktan sonra 
    hemen arkas?na eklemek istedi?imiz eleman? ekliyoruz.
    */
    public void arayaEkle(Eleman yeni,int aranan){
        Eleman gecici = bas ;
        while(gecici.ileri!=null){
            if(gecici.sayi==aranan){
                yeni.ileri = gecici.ileri ;
                gecici.ileri = yeni ;
                break;
            }
            else {
                gecici = gecici.ileri ;
            }
            
        }
    // E?er sondaysa arad??m?z eleman sona ekleme yap?yoruz.
        if(gecici == son && gecici.sayi == aranan){
            son.ileri = yeni ;
            son = yeni;
        }
    }
    
    // ba? bir sonraki eleman? gösterdi?inde o eleman? art?k kaybetmi?(silmi?) oluyoruz.
    public void bastanSil(){
        bas = bas.ileri ;
        if(bas == null){
            son = null ;
        }        
    }
    
     /*
    Son'dan önceki eleman? son yaparak sondaki eleman? silmi? oluyoruz.
    Sondan önceki elemanada gezinme yaparak gidiyoruz.
    */
    public void sondanSil(){
        Eleman gecici = bas ;
        Eleman once = null;
        while(gecici != son){
           once = gecici ;
           gecici = gecici.ileri;
        }        
        if(once == null){
            bas = null;
        }
        else {
            once.ileri = null ;
            son = once ;
        }
    }
        
    /*
    Arad???m?z eleman? buldu?umuzda öncesinde bulunan elemanla arad???m?z eleman?n bir sonraki eleman?
     aras?ndaki ba?lant?y? yaparak arad???m?z eleman? silmi? oluyoruz.
    */
    public void arananSil(int aranan){
        Eleman yedek = bas ;
        Eleman once = null ;
        
        while(yedek!=null){
            if(yedek.sayi == aranan){
                break;
            }
            else {
                once = yedek ;
                yedek = yedek.ileri;
            }
        }
        if(once == null){
            bas = bas.ileri;
        }
        else if(once !=null){
            once.ileri = yedek.ileri;
        }
    }
    
    /*
    E?er her yeni gelen eleman s?ral? bir ?ekilde eklensin istiyorsak(Küçükten büyü?e)
    Bu ?ekilde bir yol izlememiz gerekmekte.
    */
    void siraliEkleyelim(Eleman yeni){
        if(bas == null){
            bas = yeni;
        }
        else {
            Eleman yedek = bas;
            Eleman once = null ;
            
            // Gezinme i?leminde kulland???m?z 'yedek' de?i?keni bo? olmad??? ve yeni gelen say?m?z bir önceki elemandan büyük oldu?u sürece
            // bu döngü içerisine girecek.
            while(yedek!=null && yedek.sayi < yeni.sayi){
                if(yedek.sayi < yeni.sayi){
                    once = yedek ;
                    yedek = yedek.ileri;
                }
                else break ;
            }
            if (once == null){
                yeni.ileri = yedek ;
                bas = yeni ;
            }
            
            // E?er daha önceden bir eleman varsa yeni gelen eleman?n ilerisi art?k bir önceki eleman?n ilerisini gösterecek
            // bir önceki eleman?n ileriside art?k yeni eleman olaca??ndan dolay? bir nevi 'araya ekleme' olacak.
            else {
                yeni.ileri = once.ileri ;
                once.ileri = yeni;
            }
        }
    }
    
    // Burada ilk elemandan ba?lay?p son eleman bo? olana kadar gezinip tek tek hepsini bir String'e at?yoruz.
    String listele(){
        Eleman yedek = bas;
        String liste = "";
        while(yedek!=null){
            liste = liste + yedek.sayi + "-->";
            yedek = yedek.ileri ;            
        }
        return liste;
    }

    public static void main(String[] args) {
       LinkedList liste = new LinkedList(); // Liste s?n?f?ndan liste ad?nda nesne olu?turuyoruz.
       Eleman a = new Eleman(5); // Yeni bir eleman olu?turup 
       liste.basaEkle(a); // 'ba?a ekleme' yap?yoruz.
       a = new Eleman(9); // yeni bir eleman daha olu?turup 'sona ekleme' yap?yoruz.
       liste.sonaEkle(a);
       a = new Eleman(35); // yeni bir eleman olu?turup hangi elemandan sonra eklenece?ini belirtip 'araya ekleme' yap?yoruz.
       liste.arayaEkle(a, 5);
       liste.sondanSil(); // sondaki eleman? siler.
        System.out.println(liste.listele()); // listelemizdeki tüm elemanlar? konsol'a basar.
        
    }
    
}