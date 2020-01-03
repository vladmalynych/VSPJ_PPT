import java.time.LocalDateTime;

class Prijemce {
    private String jmeno;
    private String prijmeni;
    private String ulice;
    private String Mesto;
    private String psc;
    private String telefon;
    private String email;

    public Prijemce(String jmeno, String prijmeni, String ulice,
                    String mesto, String psc, String telefon, String email) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.ulice = ulice;
        Mesto = mesto;
        this.psc = psc;
        this.telefon = telefon;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Prijemce{" +
                "jmeno='" + jmeno + '\'' +
                ", prijmeni='" + prijmeni + '\'' +
                ", ulice='" + ulice + '\'' +
                ", Mesto='" + Mesto + '\'' +
                ", psc='" + psc + '\'' +
                ", telefon='" + telefon + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

class Sazba {
    private String zkratka;
    private float hodnota;

    public Sazba(String zkratka, float hodnota) {
        this.zkratka = zkratka;
        this.hodnota = hodnota;
    }

    @Override
    public String toString() {
        return "Sazba{" +
                "zkratka='" + zkratka + '\'' +
                ", hodnota=" + hodnota +
                '}';
    }
}

class CastkaDokladu {
    private float castka_bez_dphl;
    private float castka_s_dph;
    private Sazba sazba;

    public CastkaDokladu(float castka_bez_dphl, float castka_s_dph, Sazba sazba) {
        this.castka_bez_dphl = castka_bez_dphl;
        this.castka_s_dph = castka_s_dph;
        this.sazba = sazba;
    }

    @Override
    public String toString() {
        return "CastkaDokladu{" +
                "castka_bez_dphl=" + castka_bez_dphl +
                ", castka_s_dph=" + castka_s_dph +
                ", sazba=" + sazba +
                '}';
    }
}

public class Faktura_s_kompozici {
    private String cislo_dokladu;
    private LocalDateTime datum_vystaveni;
    private LocalDateTime datum_splatnosti;
    private Prijemce prijemce;
    private CastkaDokladu castka_dokladu;

    public Faktura_s_kompozici(String cislo_dokladu, LocalDateTime datum_vystaveni,
                               LocalDateTime datum_splatnosti, Prijemce prijemce,
                               CastkaDokladu castka_dokladu) {
        this.cislo_dokladu = cislo_dokladu;
        this.datum_vystaveni = datum_vystaveni;
        this.datum_splatnosti = datum_splatnosti;
        this.prijemce = prijemce;
        this.castka_dokladu = castka_dokladu;
    }

    @Override
    public String toString() {
        return "Faktura_s_kompozici{" +
                "cislo_dokladu='" + cislo_dokladu + '\'' +
                ", datum_vystaveni=" + datum_vystaveni +
                ", datum_splatnosti=" + datum_splatnosti +
                ", prijemce=" + prijemce +
                ", castka_dokladu=" + castka_dokladu +
                '}';
    }
}
