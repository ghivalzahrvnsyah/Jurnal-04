package ghivalhrvnsyah;

public class Pegawai {
    private String NIP;
    private String nama;
    private String divisi;

    public Pegawai(String NIP, String nama, String divisi) {
        this.NIP = NIP;
        this.nama = nama;
        this.divisi = divisi;
    }

    public String getNIP() {

        return NIP;
    }

    @Override
    public String toString() {
        return "Pegawai{" +
                "NIP='" + NIP + '\'' +
                ", nama='" + nama + '\'' +
                ", divisi='" + divisi + '\'' +
                '}';
    }
}
