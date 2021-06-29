package project.uas;
public class nomor2 {
 public static void main(String[] args) {
    nomor2queue antrian = new nomor2queue(10);
     antrian.masuk(10);
     antrian.lihat();
     antrian.masuk(8);
     antrian.lihat();
     System.out.println("yang diambil dari antrian =" + antrian.keluar());
     antrian.lihat();
     System.out.println("Nama saya adalah Reza Maulana Rizky");
     antrian.lihat();
     antrian.masuk(7);
     antrian.lihat();
     antrian.masuk(6);
     antrian.lihat();
     System.out.println("nilai yang paling depan =" + antrian.peekDepan());
 }           
}
