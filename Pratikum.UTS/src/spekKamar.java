public class spekKamar {
    private String tipeKamar;
    private int harga;
    private String checkIn, checkOut;
    private String namaLengkap, nomorHP, email, alamat;
    private int jumlahAnggota;

    public spekKamar(String tipeKamar, int harga, String checkIn, String checkOut, String namaLengkap, String nomorHP, String email, String alamat, int jumlahAnggota) {
        this.tipeKamar = tipeKamar;
        this.harga = harga;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.namaLengkap = namaLengkap;
        this.nomorHP = nomorHP; 
        this.email = email;
        this.alamat = alamat;
        this.jumlahAnggota = jumlahAnggota;
    }

    public void tampilkanDetail() {
        System.out.println("==========================");
        System.out.println("Tipe Kamar: " + tipeKamar);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Check-in: " + checkIn);
        System.out.println("Check-out: " + checkOut);
        System.out.println("Nama: " + namaLengkap);
        System.out.println("No HP: " + nomorHP);
        System.out.println("Email: " + email);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jumlah Anggota: " + jumlahAnggota);
        System.out.println("==========================");
    }
}
