import java.util.List;

public class Person {
    private String id;
    private String nama;

    public Person(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getIdPerson() {
        return id;
    }

    public String getNamePerson() {
        return nama;
    }
}

class Dosen extends Person {
    private int nip;

    public Dosen(String nama, String id, int nip) {
        super(id, nama);
        this.nip = nip;
    }

    public int getNip() {
        return nip;
    }

    public static void tampilkanDataDosen(List<Dosen> daftarDosen) {
        for (Dosen dosen : daftarDosen) {
            System.out.println("Nama: " + dosen.getNamePerson() + ", NIP: " + dosen.getNip());
        }
    }
}


class Mahasiswa extends Person {
    private int nim;

    public Mahasiswa(String nama, String id, int nim) {
        super(id, nama);
        this.nim = nim;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public static void tampilkanDataMahasiswa(List<Mahasiswa> daftarMahasiswa) {
        for (Mahasiswa mhs : daftarMahasiswa) {
            System.out.println("Nama: " + mhs.getNamePerson() + ", NIM: " + mhs.getNim());
        }
    }
}