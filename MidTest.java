package CodingTest_Semester1;
import java.util.Scanner; 

public class MidTest {
    public static void main(String[] args) {
        // ------ DEKLARASI ------
        Scanner sc = new Scanner(System.in);
        String nama, sekolah, cekLagi;
        double skolastik, penalaranMat, literasiBing; //antisipasi nilai dg koma
        int mean; // spy nilai rata-rata tdk koma
        long nim; // antisipasi nim digit angka yg banyak

        // ------ PERULANGAN SISTEM SESUAI INPUT (Y/N) USER ------
        do {
            // ------ INPUT DATA MAHASISWA ------
            System.out.println("");
            System.out.println("----- Input Data Mahasiswa -----");
            System.out.print("Nama : ");
                nama = sc.next();
            System.out.print("NIM  : ");
                nim = sc.nextLong();
            System.out.print("Kategori SLTA (SMA/SMK/MA) : ");
                sekolah = sc.next();

            // ------ TERMINATE SISTEM APABILA KATEGORI SLTA TIDAK SESUAI ------
            if (sekolah.equalsIgnoreCase("sma") || sekolah.equalsIgnoreCase("smk") || sekolah.equalsIgnoreCase("ma")) {
                // ------ INPUT NILAI MAHASISWA ------
                System.out.println("");
                System.out.println("----- Keterangan Nilai Mahasiswa -----");
                System.out.print("Skolastik            : ");
                    skolastik = sc.nextDouble();
                System.out.print("Penaralan Matematika : ");
                    penalaranMat = sc.nextDouble();
                System.out.print("Literasi B. Inggris  : ");
                    literasiBing = sc.nextDouble();

                // ------ PROSES HITUNG NILAI ------
                mean = (int) ((skolastik + penalaranMat + literasiBing) / 3);
                System.out.println("Nilai rata-rata      : " + mean);

                // ----- SPESIFIKASI MATRIKULASI -----
                // -> SMA
                //      >> Wajib Prak. Rangkaian Listrik
                //      >> penalaran Mat < 75 (Kalkulus 1)
                //      >> literasi bing < 65 (Bahasa Inggris Dasar)
                // -> SMK
                //      >> rata-rata < 70 (Prak. Rangkaian Listrik)
                //      >> Wajib Kalkulus 1
                //      >> literasi bing < 65 (Bahasa Inggris Dasar)
                // -> MA
                //      >> Wajib Prak. Rangkaian Listrik
                //      >> Wajib Kalkulus 1
                //      >> literasi bing < 65 (Bahasa Inggris Dasar)
                
                // ------ PROSES PEMILIHAN KELAS MATRIKULASI ------
                System.out.println("----- Kelas Matrikulasi Yang Diikuti -----");

                if (sekolah.equalsIgnoreCase("sma")) {
                    System.out.println("Praktikum Rangkaian Listrik");
                    if (penalaranMat < 75) {
                        System.out.println("Kalkulus 1");
                        if (literasiBing < 65) {
                            System.out.println("Bahasa Inggris Dasar");
                        }
                    } else if (literasiBing < 65) {
                        System.out.println("Bahasa Inggris Dasar");
                    }
                } else if (sekolah.equalsIgnoreCase("smk")){
                    System.out.println("Kalkulus 1");
                    if (mean < 70) {
                        System.out.println("Praktikum Rangkaian Listrik");
                        if (literasiBing < 65) {
                        System.out.println("Bahasa Inggris Dasar");
                        }
                    } else if (literasiBing < 65) {
                        System.out.println("Bahasa Inggris Dasar");
                    }
                } else if (sekolah.equalsIgnoreCase("ma")){
                    System.out.println("Praktikum Rangkaian Listrik");
                    System.out.println("Kalkulus 1");
                    if (literasiBing < 65) {
                        System.out.println("Bahasa Inggris Dasar");
                    }
                }
            } else {
                System.out.println("\nTidak dapat menjalankan program.");
                System.out.println("Mohon input kategori SLTA yang sesuai.");
            }

            System.out.println("");
            System.out.print("Cek mahasiswa lainnya? (y/n): ");
            cekLagi = sc.next();

        } while (cekLagi.equalsIgnoreCase("y"));
        
        sc.close();
    }
}
