import java.util.Scanner;

public class ReservasiHotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat datang di Aplikasi Reservasi Hotel!");

        System.out.println("Silakan pilih peran Anda:");
        System.out.println("1. Admin");
        System.out.println("2. Customer");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = input.nextInt();
        input.nextLine();

        if (pilihan == 1) {
            System.out.print("Masukkan nama Admin: ");
            String namaAdmin = input.nextLine();
            AdminBosqu admin = new AdminBosqu(namaAdmin);

           
            admin.aksesAdmin();

        } else if (pilihan == 2) {
            System.out.print("Masukkan nama Anda: ");
            String namaCustomer = input.nextLine();
            Customer customer = new Customer(namaCustomer);
            System.out.println("Selamat datang di hotel kami Bapak/Ibu " + namaCustomer);
            
            int menuPilihan = 0;
            do {
                System.out.println("==========================");
                System.out.println("Menu:");
                System.out.println("1. Pesan Kamar");
                System.out.println("2. Cek Ketersediaan Kamar");
                System.out.println("3. Lihat Detail Pesanan");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu: ");
                menuPilihan = input.nextInt();

                switch (menuPilihan) {
                    case 1:
                        customer.pesanKamar();
                        break;
                    case 2:
                        customer.cekKetersediaanKamar();
                        break;
                    case 3:
                        customer.lihatDetailPesanan();
                        break;
                    case 4:
                        System.out.println("Terima kasih telah berkunjung, mampir lagi yaa.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid :(.");
                        break;
                }
            } while (menuPilihan != 4);
        } else {
            System.out.println("Pilihan tidak valid :(.");
        }

        input.close();
    }
}
