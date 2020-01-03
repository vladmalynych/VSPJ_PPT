import java.time.LocalDateTime;

public class Faktura_bez_kompozici {
    private String cislo_dokladu;
    private LocalDateTime datum_vystaveni;
    private LocalDateTime datum_splatnosti;

    private String prijemce_jmeno;
    private String prijemce_prijmeni;
    private String prijemce_ulice;
    private String prijemce_mesto;
    private String prijemce_psc;
    private String prijemce_telefon;
    private String prijemce_email;

    private float doklad_cena_bez_dph;
    private float doklad_cena_s_dph;
    private String doklad_sazba_zkratka;
    private float docker_sazba_hodnota;

    public Faktura_bez_kompozici(String cislo_dokladu, LocalDateTime datum_vystaveni, LocalDateTime datum_splatnosti,
                                 String prijemce_jmeno, String prijemce_prijmeni, String prijemce_ulice, String prijemce_mesto,
                                 String prijemce_psc, String prijemce_telefon, String prijemce_email, float doklad_cena_bez_dph,
                                 float doklad_cena_s_dph, String doklad_sazba_zkratka, float docker_sazba_hodnota) {
        this.cislo_dokladu = cislo_dokladu;
        this.datum_vystaveni = datum_vystaveni;
        this.datum_splatnosti = datum_splatnosti;
        this.prijemce_jmeno = prijemce_jmeno;
        this.prijemce_prijmeni = prijemce_prijmeni;
        this.prijemce_ulice = prijemce_ulice;
        this.prijemce_mesto = prijemce_mesto;
        this.prijemce_psc = prijemce_psc;
        this.prijemce_telefon = prijemce_telefon;
        this.prijemce_email = prijemce_email;
        this.doklad_cena_bez_dph = doklad_cena_bez_dph;
        this.doklad_cena_s_dph = doklad_cena_s_dph;
        this.doklad_sazba_zkratka = doklad_sazba_zkratka;
        this.docker_sazba_hodnota = docker_sazba_hodnota;
    }

    @Override
    public String toString() {
        return "Faktura_bez_kompozici{" +
                "cislo_dokladu='" + cislo_dokladu + '\'' +
                ", datum_vystaveni=" + datum_vystaveni +
                ", datum_splatnosti=" + datum_splatnosti +
                ", prijemce_jmeno='" + prijemce_jmeno + '\'' +
                ", prijemce_prijmeni='" + prijemce_prijmeni + '\'' +
                ", prijemce_ulice='" + prijemce_ulice + '\'' +
                ", prijemce_mesto='" + prijemce_mesto + '\'' +
                ", prijemce_psc='" + prijemce_psc + '\'' +
                ", prijemce_telefon='" + prijemce_telefon + '\'' +
                ", prijemce_email='" + prijemce_email + '\'' +
                ", doklad_cena_bez_dph=" + doklad_cena_bez_dph +
                ", doklad_cena_s_dph=" + doklad_cena_s_dph +
                ", doklad_sazba_zkratka='" + doklad_sazba_zkratka + '\'' +
                ", docker_sazba_hodnota=" + docker_sazba_hodnota +
                '}';
    }
}
