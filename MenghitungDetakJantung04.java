import java.util.Scanner;
public class MenghitungDetakJantung04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan usia (10-100): ");
        int usia = input.nextInt();
        System.out.print("Masukkan HR (detak jantung saat latihan): ");
        int HR = input.nextInt();
        
        if (usia < 10 || usia > 100 || HR <= 0) {
            System.out.println("Input tidak valid! Usia harus antara 10-100 dan HR harus positif.");
        } else {
            
            int MHR = 220 - usia;
            double persenMHR = ((double) HR / MHR) * 100;
           
            String kategori, saran;
            if (persenMHR < 50) {
                kategori = "Sangat ringan";
                saran = "Pemanasan, manfaat minimal.";
            } else if (persenMHR < 60) {
                kategori = "Ringan";
                saran = "Peningkatan dasar kebugaran.";
            } else if (persenMHR < 70) {
                kategori = "Sedang";
                saran = "Zona aerobik nyaman.";
            } else if (persenMHR < 85) {
                kategori = "Berat";
                saran = "Meningkatkan kapasitas kardiorespirasi.";
            } else {
                kategori = "Sangat berat";
                saran = "Berisiko bagi pemula, batasi durasi.";
            }
           
            System.out.println("\n=== HASIL PERHITUNGAN ===");
            System.out.println("MHR (Maksimum Heart Rate) : " + MHR);
            System.out.println("%MHR (dibulatkan)        : " + Math.round(persenMHR) + "%");
            System.out.println("Kategori                  : " + kategori);
            System.out.println("Saran                     : " + saran);
        }
        input.close();
    }
}
