public class ContohVariabel24 {   

    public static void main (String[] args) {
       
        String salahSatuHobiSayaAdalah = "Bermain petak umpet";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte _umurSayaSekarang = 20;
        double $ipk = 3.24, tinggi = 1.78;

        System.out.println(salahSatuHobiSayaAdalah);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umur saya sekarang: " + _umurSayaSekarang);
        System.out.println(String.format("Saya berumur %s dengan tinggi badan %s",_umurSayaSekarang, tinggi));
    
    }
}