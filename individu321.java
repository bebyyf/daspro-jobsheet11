import java.util.Scanner;
public class individu321 {
    public static void main(String[] args) { 
        Scanner bebi321 = new Scanner(System.in); // Membuat objek Scanner untuk input dari pengguna

        System.out.print("Masukkan nilai N = ");  // Meminta pengguna untuk memasukkan nilai N
        int N = bebi321.nextInt();

        for (int i = 1; i <= N; i++) { // Menggunakan nested loop untuk membuat pola persegi
            for (int j = 1; j <= N; j++) { // Memeriksa apakah posisi saat ini berada di dalam batas bagian kosong
                if (i > 1 && i < N && j > 1 && j < N) { // Jika i dan j berada di dalam batas, cetak spasi
                    System.out.print("  ");
                } else {
                    System.out.print(N + " "); // Jika i atau j berada di batas atau di luar batas, cetak nilai N
                }
            }
            System.out.println(); // Pindah ke baris baru setelah satu baris selesai dicetak
        }
    }
}
