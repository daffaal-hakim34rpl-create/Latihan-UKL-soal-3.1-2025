package PakFirdausa;

import java.util.Scanner;

public class SoalRekapNilaiSiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("----------------------------------------------");
        System.out.println(" REKAPITULASI NILAI UJIAN PRODUKTIF ");
        System.out.println("----------------------------------------------");
        System.out.print("Masukkan jumlah siswa yang akan direkap nilainya : ");
        

        if (scanner.hasNextInt()) {
            System.out.println("Input tidak valid. Harap masukkan bilangan bulat untuk jumlah siswa.");
            scanner.close();
            return;
        }
        
        int jumlahSiswa = scanner.nextInt();

        if (jumlahSiswa <= 0) {
            System.out.println("Jumlah siswa harus lebih dari nol.");
            scanner.close();
            return;
        }

        double totalNilai = 0;

        
        for (int i = 1; i <= jumlahSiswa; i++) {
            double nilai;
            boolean inputValid = false;

            while (!inputValid) {
                System.out.print("Masukkan nilai siswa ke-" + i + ": ");
                
                if (scanner.hasNextDouble()) {
                    nilai = scanner.nextDouble();

                    if (nilai >= 0 && nilai <= 100) {
                        totalNilai += nilai;
                        inputValid = true;
                    } else {
                        System.out.println("Nilai harus berada dalam rentang 0 hingga 100. Silakan coba lagi.");
                    }
                } else {
                    System.out.println("Input tidak valid. Harap masukkan angka untuk nilai.");
                    scanner.next();
            }
        }

        double rataRata = totalNilai / jumlahSiswa;


        System.out.println("\n----------------------------------------------");
        System.out.println("           HASIL REKAPITULASI NILAI           ");
        System.out.println("----------------------------------------------");
        System.out.println("Jumlah Siswa yang Direkap     : " + jumlahSiswa);
        System.out.println("Total Keseluruhan Nilai Ujian : " + totalNilai);

        System.out.println("Nilai Rata-rata Ujian Produktif : " + String.format("%.2f", rataRata));
        System.out.println("----------------------------------------------");


        // Menutup objek Scanner
        scanner.close();
    }
}
}