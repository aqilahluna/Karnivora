package karnivora;

public class Ikan extends Karnivora{
    String namaHewan="";
    String tempatTinggal="";
    public void setnama(String nama){
        this.namaHewan=nama;        
    }
    public void setnama(String nama, String tempatTinggal){
        this.namaHewan=nama;
        this.tempatTinggal=tempatTinggal;
    }
    public void contohMamalia(){
     System.out.println("Nama Hewan Ini adalah "+contohMamalia);
     System.out.println("makanan utama kucing adalah Ikan");
 }
    public void cetak(){
        System.out.println("Nama hewan ini adalah"+namaHewan);
        System.out.println(namaHewan+"termasuk ikan"+tempatTinggal+"yang karnivora");
        System.out.println(namaHewan+"memiliki sifat"+super.sifat);
        System.out.println("Makanan utamanya adalah"+super.makananUtama);
    }
}
