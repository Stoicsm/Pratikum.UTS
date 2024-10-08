import java.util.Scanner;

public class Customer extends ReservasiHotel {
    private spekKamar pesanan;

    public Customer(String nama) {
        super();
        this.pesanan = null;
    }

    public void pesanKamar() {
        if (pesanan != null) {
            System.out.println("Anda sudah memesan kamar, silakan lihat detail pesanan Anda.");
            return;
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Silakan pilih tipe kamar yang tersedia:");
        System.out.println("1. Standar - Rp500.000\n2. Superior - Rp750.000\n3. Super Deluxe - Rp1.000.000\n4. Executive - Rp2.000.000\n5. Family Room - Rp3.000.000");
        int pilihan = input.nextInt();

        String tipeKamar = "";
        int harga = 0;

        switch (pilihan) {
            case 1:
                tipeKamar = "Standar";
                harga = 500000;
                break;
            case 2:
                tipeKamar = "Superior";
                harga = 750000;
                break;
            case 3:
                tipeKamar = "Super Deluxe";
                harga = 1000000;
                break;
            case 4:
                tipeKamar = "Executive";
                harga = 2000000;
                break;
            case 5:
                tipeKamar = "Family Room";
                harga = 3000000;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        input.nextLine();
        System.out.print("Masukkan nama lengkap: ");
        String namaLengkap = input.nextLine();
        System.out.print("Masukkan nomor HP: ");
        String nomorHP = input.nextLine();
        System.out.print("Masukkan email: ");
        String email = input.nextLine();
        System.out.print("Masukkan alamat: ");
        String alamat = input.nextLine();
        System.out.print("Tanggal check-in (YYYY-MM-DD): ");
        String checkIn = input.nextLine();
        System.out.print("Tanggal check-out (YYYY-MM-DD): ");
        String checkOut = input.nextLine();
        System.out.print("Jumlah anggota: ");
        int jumlahAnggota = input.nextInt();

        
        pesanan = new spekKamar(tipeKamar, harga, checkIn, checkOut, namaLengkap, nomorHP, email, alamat, jumlahAnggota);
        System.out.println("Mantap, kamar berhasil dipesan!");
    }

    public void cekKetersediaanKamar() {
        System.out.println("Daftar Kamar yang Tersedia:");
        System.out.println("1. Standar - Rp500.000");
        System.out.println("2. Superior - Rp750.000");
        System.out.println("3. Super Deluxe - Rp1.000.000");
        System.out.println("4. Executive - Rp2.000.000");
        System.out.println("5. Family Room - Rp3.000.000");
    }

    public void lihatDetailPesanan() {
        if (pesanan == null) {
            System.out.println("Anda belum memiliki pesanan, yuk pesan dulu");
        } else {
            System.out.println("Detail Pesanan Anda:");
            pesanan.tampilkanDetail();
        }
    }
}
