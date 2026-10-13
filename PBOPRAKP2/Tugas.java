
package PBOPRAKP2;


public class Tugas {
    public static void main(String[] args) {
        System.out.println("\n-----No 1-----");
        int i = 5;
        System.out.println("Increment = " + i);
        System.out.println("increment = " + (i++));
        System.out.println("increment = " + i);
        System.out.println("increment = " + (++i)); 
        System.out.println("--------------");
        
        System.out.println("\n-----No 2-----");
        PersegiPanjang hp = new PersegiPanjang();
        hp.hitungPersegiP();
        System.out.println("--------------");
        
        System.out.println("\n-----No 3-----");
        PersamaanKuadrat pk = new PersamaanKuadrat();
        pk.a = 2;
        pk.b = 10;
        pk.c = 5;
        pk.persamaanK();
        System.out.println("--------------");
        
        System.out.println("\n-----No 4-----");
        OperasiMatematika om = new OperasiMatematika();
        om.x = 22;
        om.y = 33;
        om.operasiMath();
        System.out.println("--------------");
        
        System.out.println("\n-----No 5-----");
        Segitiga s = new Segitiga();
        s.a = 6;
        s.b = 8;
        s.hitungS();
        System.out.println("--------------");
        
        System.out.println("\n-----No 6-----");
        Segitiga fc = new Segitiga();
        fc.a = 6;
        fc.b = 8;
        fc.findC();
        System.out.println("--------------");
        
        System.out.println("\n-----No 7-----");
        String a = "Saya Belajar Java";
        String b = "Saya Belajar Java";
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());
        System.out.println("--------------");
        
        System.out.println("\n-----No 8-----");
        double bulan = 384400;
        double matahari = 152100000;
        double kecepatan = 300000;    
        
        double wbulan = bulan / kecepatan;
        double wmatahari = matahari/kecepatan;
        
        System.out.println("Waktu tempuh dari bumi ke bulan : " + wbulan + " Detik");
        System.out.println("Waktu tempuh dari bumi ke Matahari : " + wmatahari + " Detik");
        System.out.println("--------------");
        
        System.out.println("\n-----No 9-----");
        KonversiSuhu ks = new KonversiSuhu();     
        ks.c = 10;
        ks.f = 15;
        ks.r = 5;
        ks.hitung();
        System.out.println("--------------");        
        

        
    }
}
 