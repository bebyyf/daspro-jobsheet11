import java.util.Scanner;
public class individu221 {
    public static void main(String[] args) {
        Scanner bebi221 = new Scanner(System.in); // Membuat objek Scanner untuk input dari pengguna
        int N; // Mendeklarasikan variabel N untuk menyimpan nilai yang dimasukkan pengguna

        System.out.print("Masukkan nilai N = "); // Meminta pengguna untuk memasukkan nilai N
        N = bebi221.nextInt();

        for (int i = 0; i <= N; i++) { // Loop untuk mengatur baris (berdasarkan nilai N)
            for (int j = N; j > i; j--) { // Loop untuk mengatur kolom dan menampilkan karakter '*'

                System.out.print("*"); //untuk mencetak (*)
            }
            
            System.out.println(); // Pindah ke baris baru setelah satu baris selesai dicetaK
        }
    }
}
