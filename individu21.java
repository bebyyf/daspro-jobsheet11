import java.util.Scanner;

public class individu21 {
    public static void main(String[] args) {
        int N; // Mendeklarasikan variabel N untuk menyimpan nilai yang dimasukkan pengguna
        Scanner bebi21 = new Scanner(System.in); // Membuat objek Scanner untuk input dari pengguna

        System.out.print("Masukkan Nilai N = "); // Meminta pengguna untuk memasukkan nilai N
        N = bebi21.nextInt();

        for (int i = 0; i <= N; i++) { // Loop untuk mengatur baris (berdasarkan nilai N)
            int number = 1;
            for (int j = 0; j <= N; j++) {  // Loop untuk mengatur kolom dan menampilkan angka atau spasi
                if (j > N - i) { // Menggunakan if statement untuk menentukan kondisi tertentu (misalnya, j > N - i)
                    System.out.print(number); // Akan mencetak nilai number apabila bernilai true
                    number++;
                } else {
                    System.out.print(" "); // Jika kondisi tidak terpenuhi, cetak spasi
                }
            }

            System.out.println(); // Pindah ke baris baru setelah satu baris selesai dicetak
        }
    }
}
