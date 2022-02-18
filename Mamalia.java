package karnivora;

public class Mamalia extends Karnivora {
    String namaHewan="";
    String habitat;
    public void setnama(String nama){
        this.namaHewan=nama;
    }
    public void setHabitat(String habitat){
        this.habitat=habitat;        
    }
    public String getHabitat(){
        return habitat;
    }
    public void contohMamalia(){
        System.out.println("Nama hewan ini adalah"+namaHewan);
        System.out.println(namaHewan+"termasuk mamalia yang karnivora");
        System.out.println(namaHewan+"memiliki sifat"+sifat);
        System.out.println("Makanan utamanya adalah"+super.makananUtama);
    }
}
