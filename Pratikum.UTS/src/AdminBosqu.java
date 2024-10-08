public class AdminBosqu extends Interface {
    public AdminBosqu(String nama) {
        super(nama);
    }

    public void aksesAdmin() {
        System.out.println("Selamat datang, Admin " + nama);
        System.out.println("Anda memiliki akses penuh ke sistem.");
    }
}

