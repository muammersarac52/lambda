package lambdapractice;

public class Apartman {
    private  String cephe;
    private  int katsayisi;
    private  int kirasi;

    public Apartman() {
    }

    public Apartman(String cephe, int katsayisi, int kirasi) {
        this.cephe = cephe;
        this.katsayisi = katsayisi;
        this.kirasi = kirasi;
    }

    public String getCephe() {
        return cephe;
    }

    public void setCephe(String cephe) {
        this.cephe = cephe;
    }

    public int getKatsayisi() {
        return katsayisi;
    }

    public void setKatsayisi(int katsayisi) {
        this.katsayisi = katsayisi;
    }

    public int getKirasi() {
        return kirasi;
    }

    public void setKirasi(int kirasi) {
        this.kirasi = kirasi;
    }

    @Override
    public String toString() {
        return "Apartman{" +
                "cephe='" + cephe + '\'' +
                ", katsayisi=" + katsayisi +
                ", kirasi=" + kirasi +
                '}';
    }
}
