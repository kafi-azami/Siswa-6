//Driver Class
public class TesSiswa {
    public static void main(String[] args) {
        //membuat obyek
        Siswa azami = new Siswa();
        Siswa kafi = new Siswa();
        azami.id = 16;
        azami.nama = "Azami";
        azami.ipk = 4;
        System.out.println("Ini Data Azami");
        System.out.println(azami.id);
        System.out.println(azami.nama);
        System.out.println(azami.ipk);
        System.out.println("Ini Data Kafi");
        System.out.println(kafi.id);
        System.out.println(kafi.nama);
        System.out.println(kafi.ipk);
    }   
}
