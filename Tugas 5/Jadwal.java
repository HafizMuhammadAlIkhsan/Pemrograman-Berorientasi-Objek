import java.util.List;

public class Jadwal {
    private int jam;
    private MK mk;
    private Ruangan ruangan;
    private Dosen dosen;
    private String hari;

    public Jadwal(int jam, MK mk, Ruangan ruangan, Dosen dosen, String hari) {
        this.jam = jam;
        this.mk = mk;
        this.ruangan = ruangan;
        this.dosen = dosen;
        this.hari = hari;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public MK getMk() {
        return mk;
    }

    public Ruangan getRuangan() {
        return ruangan;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public String getHari() {
        return hari;
    }

    public static void tampilkanJadwalPerkuliahan(List<Jadwal> jadwalPerkuliahan) {
        for (Jadwal jadwal : jadwalPerkuliahan) {
            System.out.println("Hari: " + jadwal.getHari() + ", Jam: " + jadwal.getJam() + ":00");
            System.out.println("Mata Kuliah: " + jadwal.getMk().getNamaMK());
            System.out.println("Ruangan: " + jadwal.getRuangan().getNamaRuangan());
            System.out.println("Dosen Pengampu: " + jadwal.getDosen().getNamePerson());
            System.out.println();
        }
    }
}