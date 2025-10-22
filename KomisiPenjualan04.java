import java.util.Scanner;
public class KomisiPenjualan04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Masukkan omzet (Rp ≥ 0): ");
        double omzet = input.nextDouble();
        System.out.print("Masukkan rating (1-100): ");
        int rating = input.nextInt();
        System.out.print("Apakah memiliki sertifikasi profesional? (ya/tidak): ");
        String sertifikasi = input.next().toLowerCase();
       
        if (omzet < 0 || rating < 1 || rating > 100 || 
            (sertifikasi.equals("ya") && sertifikasi.equals("tidak"))) {
            System.out.println("\nInput tidak valid! Pastikan data sesuai ketentuan.");
        } 
        else {
            double persenKomisi = 0;
            double bonusSertifikasi = 0;            
            if (rating < 70) {
                System.out.println("\nRating di bawah 70, tidak memenuhi syarat komisi.");
                persenKomisi = 0;
            } 
            else {               
                if (omzet < 50000000) {
                    persenKomisi = 1;
                } else if (omzet < 100000000) {
                    persenKomisi = 2;
                } else {
                    persenKomisi = 3;
                }
                
                if (rating >= 90) {
                    persenKomisi += 1;
                }
               
                if (sertifikasi.equals("ya")) {
                    bonusSertifikasi = 500000;
                }
            }
           
            double jumlahKomisi = (persenKomisi / 100) * omzet;
            double total = jumlahKomisi + bonusSertifikasi;
          
            System.out.println("\n=== HASIL PERHITUNGAN KOMISI ===");
            System.out.println("Omzet                : Rp " + String.format("%,.0f", omzet));
            System.out.println("Rating               : " + rating);
            System.out.println("Sertifikasi          : " + sertifikasi);
            System.out.println("Persentase Komisi    : " + persenKomisi + "%");
            System.out.println("Jumlah Komisi        : Rp " + String.format("%,.0f", jumlahKomisi));
            System.out.println("Bonus Sertifikasi    : Rp " + String.format("%,.0f", bonusSertifikasi));
            System.out.println("--------------------------------------");
            System.out.println("Total Komisi Diterima: Rp " + String.format("%,.0f", total));
        }

        input.close();
    }
}