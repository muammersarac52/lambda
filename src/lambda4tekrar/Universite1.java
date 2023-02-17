package lambda4tekrar;

public class Universite1 {
    private String univercity ;
    private String bolum;
    private int ogrsayisi;
    private int notOrt;

    public Universite1() {
    }

    public Universite1(String univercity, String bolum, int ogrsayisi, int notOrt) {
        this.univercity = univercity;
        this.bolum = bolum;
        this.ogrsayisi = ogrsayisi;
        this.notOrt = notOrt;
    }

    public String getUnivercity() {
        return univercity;
    }

    public void setUnivercity(String univercity) {
        this.univercity = univercity;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getOgrsayisi() {
        return ogrsayisi;
    }

    public void setOgrsayisi(int ogrsayisi) {
        this.ogrsayisi = ogrsayisi;
    }

    public int getNotOrt() {
        return notOrt;
    }

    public void setNotOrt(int notOrt) {
        this.notOrt = notOrt;
    }

    @Override
    public String toString() {
        return "uni{" +
                "univercity='" + univercity + '\'' +
                ", bolum='" + bolum + '\'' +
                ", ogrsayisi=" + ogrsayisi +
                ", notOrt=" + notOrt +
                '}';
    }
}
