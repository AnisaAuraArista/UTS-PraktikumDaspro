import java.util.Scanner;
public class MenentukanBilangan04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = 0, b = 0, c = 0;
        boolean valid = false;
        
        while (!valid) {
            try {
                System.out.print("Masukkan angka pertama: ");
                a = Double.parseDouble(input.nextLine());
                System.out.print("Masukkan angka kedua: ");
                b = Double.parseDouble(input.nextLine());
                System.out.print("Masukkan angka ketiga: ");
                c = Double.parseDouble(input.nextLine());

                valid = true; 
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid! Harap masukkan angka saja.\n");
            }
        }
      
        double terkecil = Math.min(a, Math.min(b, c));
      
        int count = 0;
        if (a == terkecil) count++;
        if (b == terkecil) count++;
        if (c == terkecil) count++;
        
        if (count > 1) {
            System.out.print("Terdapat beberapa angka terkecil yaitu: ");
            if (a == terkecil) System.out.print(a + " ");
            if (b == terkecil) System.out.print(b + " ");
            if (c == terkecil) System.out.print(c + " ");
            System.out.println();
        } else {
            System.out.println("Angka terkecil adalah: " + terkecil);
        }

        input.close();
    }
}