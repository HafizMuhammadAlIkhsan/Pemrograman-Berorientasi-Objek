import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mahasiswa> mhs = new ArrayList<>();
        mhs.add(new Mahasiswa("Hafiz", "11", 231511077));
        mhs.add(new Mahasiswa("Daffa", "12", 231511078));
        mhs.add(new Mahasiswa("Fana", "13", 231511079));
        mhs.add(new Mahasiswa("Fachry", "14", 231511080));
        mhs.add(new Mahasiswa("Yanto", "15", 231511081));
        mhs.add(new Mahasiswa("Fauzan", "16", 231511082));
        mhs.add(new Mahasiswa("Dzaki", "17", 231511083));
        mhs.add(new Mahasiswa("Rifqi", "18", 231511084));
        mhs.add(new Mahasiswa("Alvito", "19", 231511085));
        mhs.add(new Mahasiswa("Afriza", "20", 231511086));

        // Membuat instance Dosen (10 data)
        List<Dosen> dosen = new ArrayList<>();
        dosen.add(new Dosen("Yadhi Aditya P.", "KO052N", 1979122));
        dosen.add(new Dosen("Ade Chandra Nugraha", "KO001N", 19751123));
        dosen.add(new Dosen("Zulkifli Arsyad", "KO061N", 19751124));
        dosen.add(new Dosen("Ade Hodijah", "KO060N", 19751125));
        dosen.add(new Dosen("Muhammad Rizqi S.", "KO074N", 19751126));
        dosen.add(new Dosen("N.S. Junaedi", "DU153P", 19751127));
        dosen.add(new Dosen("Eddy B. Soewono", "KO016N", 19751128));
        dosen.add(new Dosen("Trisna Gelar A.", "KO078N", 19751129));
        dosen.add(new Dosen("Santi Sundari", "KO009N", 19751130));
        dosen.add(new Dosen("Irawan Thamrin", "KO006N", 19751131));

        // Membuat Jadwal perkuliahan untuk Senin-Jumat
        List<Jadwal> jadwalPerkuliahan = new ArrayList<>();
        MK PRPL = new MK("21IF2011", "PRPL");
        Ruangan ruangan1 = new Ruangan("D217", "Kelas");
        jadwalPerkuliahan.add(new Jadwal(12, PRPL, ruangan1, dosen.get(0), "Senin"));

        MK AljabarLinear = new MK("21IF2014", "Aljabar Linear");
        Ruangan ruangan2 = new Ruangan("D101", "Kelas");
        jadwalPerkuliahan.add(new Jadwal(12, AljabarLinear, ruangan2, dosen.get(4), "Selasa"));

        MK Proyek3 = new MK("21IF2016", "Proyek 3");
        Ruangan ruangan3 = new Ruangan("D102", "Lab Multimedia");
        jadwalPerkuliahan.add(new Jadwal(12, Proyek3, ruangan3, dosen.get(9), "Rabu"));

        MK PBO = new MK("21IF2011", "PBO");
        Ruangan ruangan4 = new Ruangan("D106", "Lab Basis Data");
        jadwalPerkuliahan.add(new Jadwal(12, PBO, ruangan4, dosen.get(2), "Kamis"));
        
        MK BasisData = new MK("21IF2011", "Basis Data");
        Ruangan ruangan5 = new Ruangan("D106", "Lab Basis Data");
        jadwalPerkuliahan.add(new Jadwal(12, BasisData, ruangan5, dosen.get(3), "Jumat"));

        System.out.println("Data Mahasiswa:");
        Mahasiswa.tampilkanDataMahasiswa(mhs);

        System.out.println("\nData Dosen:");
        Dosen.tampilkanDataDosen(dosen);

        System.out.println("\nJadwal Perkuliahan Senin - Jumat:");
        Jadwal.tampilkanJadwalPerkuliahan(jadwalPerkuliahan);
    }
}