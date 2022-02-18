package karnivora;

public class Hasil {
    public static void main(String[] args) {
        
        Mamalia Kucing=new Mamalia();
        Kucing.setnama("Kucing");
        Kucing.setHabitat("Hutan");
        Kucing.contohMamalia();
        System.out.println("Habitat Kucing adalah di"+Kucing.getHabitat());
        System.out.println("");
        Ikan ikan=new Ikan();
        ikan.setnama("Hiu","laut");
        ikan.cetak();
    }
}
