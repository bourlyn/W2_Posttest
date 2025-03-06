import java.util.Scanner;

public class posttest 
{
    public static void main(String[] args) 
    {
        // NO 1 dan 2
        System.out.print("Masukkan nama: ");
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        System.out.print("Masukkan usia: ");
        int usia = input.nextInt();
        double konversiUsia = (double) usia;
        System.out.print("Masukkan jumlah uang: ");
        double uang = input.nextDouble();
        int konversiUang = (int) uang;
        System.out.print("rata-rata pengeluaran: ");
        double rataPengeluaran = input.nextDouble();
        
        // NO 3
        double sisaUang = uang - (rataPengeluaran * 30);
        double uangBulanan = uang / (rataPengeluaran * 30);
    
        String keuangan;
        if (uangBulanan < 1) 
        {
            keuangan = "PERINGATAN: keuangan Anda kurang stabil!";
        } 
        else if (uangBulanan > 6) 
        {
            keuangan = "keuangan Anda dalam kondisi aman.";
        }
        else
        {
            keuangan = "keuangan Anda dalam kondisi cukup.";
        }
    
        // NO 4
        System.out.println("Apakah usia lebih dari 30? " + (usia > 30));
        System.out.println("Apakah usia > 30 dan uang > 10 juta? " + (usia > 30 && uang > 10000000));
        System.out.println("Apakah usia < 30 atau uang > 5 juta? " + (usia < 30 || uang > 5000000));
    
        // NO 5
        System.out.print("\nMasukkan jumlah hutang : ");
        double hutang = input.nextDouble();
        double nilaiAbsolut = Math.abs(hutang); 
        double pembulatanAtas = Math.ceil(rataPengeluaran);
        double bonus = Math.random() * (1000000 - 100000) + 100000;
        double totalUang = sisaUang + bonus;

        // NO 6
        System.out.println("\n=== LAPORAN KEUANGAN PRIBADI ===");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Uang yang dimiliki: Rp " + konversiUang);
        System.out.println("Pengeluaran harian rata-rata: Rp " + (int) rataPengeluaran);
        System.out.println("Sisa uang dalam 30 hari: Rp " + (int) sisaUang);
        System.out.println("Estimasi bulan bertahan: " + uangBulanan + " bulan");
        System.out.println("Status Keuangan: " + keuangan);
        System.out.println("Nilai absolut dari hutang: Rp " + (int) nilaiAbsolut);
        System.out.println("Pengeluaran harian setelah pembulatan: Rp " + (int) pembulatanAtas);
        System.out.println("Bonus tak terduga: Rp " + bonus);
        System.out.println("Total uang yang dimiliki setelah pengeluaran dan bonus: Rp " + (int) totalUang);
        
        input.close();
    }   
}
