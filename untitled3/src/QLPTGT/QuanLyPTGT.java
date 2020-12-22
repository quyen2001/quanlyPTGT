package QLPTGT;

import java.util.Queue;

public class QuanLyPTGT {
    String HãngSX, Màu, KiểuĐộngCơ, CôngSuất, TrọngTải;
    int  NămSX, SốChỗNgồi,ID;
    float GiáBán;
public QuanLyPTGT(int ID,String HãngSX,int NămSX,float GiáBán,String Màu, int SốChỗNgồi,String KiểuĐộngCơ,String CôngSuất,String TrọngTải){
    this.ID= ID;
    this.NămSX = NămSX;
    this.HãngSX = HãngSX;
    this.Màu = Màu;
    this.KiểuĐộngCơ= KiểuĐộngCơ;
    this.CôngSuất = CôngSuất;
    this.TrọngTải = TrọngTải;
    this.GiáBán = GiáBán;
    this.SốChỗNgồi = SốChỗNgồi;
}

    public int getID() { return ID; }

    public void setID(int ID) { this.ID = ID;
    }

    public String getHãngSX() {
        return HãngSX;
    }

    public void setHãngSX(String hãngSX) {
        HãngSX = hãngSX;
    }

    public String getMàu() {
        return Màu;
    }

    public void setMàu(String màu) {
        Màu = màu;
    }

    public String getKiểuĐộngCơ() {
        return KiểuĐộngCơ;
    }

    public void setKiểuĐộngCơ(String kiểuĐộngCơ) {
        KiểuĐộngCơ = kiểuĐộngCơ;
    }

    public String getCôngSuất() {
        return CôngSuất;
    }

    public void setCôngSuất(String côngSuất) {
        CôngSuất = côngSuất;
    }

    public String getTrọngTải() {
        return TrọngTải;
    }

    public void setTrọngTải(String trọngTải) {
        TrọngTải = trọngTải;
    }

    public int getNămSX() {
        return NămSX;
    }

    public void setNămSX(int nămSX) {
        NămSX = nămSX;
    }

    public int getSốChỗNgồi() {
        return SốChỗNgồi;
    }

    public void setSốChỗNgồi(int sốChỗNgồi) {
        SốChỗNgồi = sốChỗNgồi;
    }

    public float getGiáBán() {
        return GiáBán;
    }

    public void setGiáBán(float giáBán) {
        GiáBán = giáBán;
    }

    }

