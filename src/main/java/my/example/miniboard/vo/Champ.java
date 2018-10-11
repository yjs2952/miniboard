package my.example.miniboard.vo;

import java.util.Date;

public class Champ {
    private int cid;    // 챔피언 번호
    private String role;    // 챔피언 역할
    private String cname;
    private String hp1;
    private String mp1;
    private String atk1;
    private String df1;
    private String hp18;
    private String mp18;
    private String atk18;
    private String df18;
    private String range1;
    private String range18;
    private String passive;
    private String passive_comment;
    private String skillq;
    private String skillq_comment;
    private String skillw;
    private String skillw_comment;
    private String skille;
    private String skille_comment;
    private String skillr;
    private String skillr_comment;
    private Date register_date;
    private Date update_date;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getHp1() {
        return hp1;
    }

    public void setHp1(String hp1) {
        this.hp1 = hp1;
    }

    public String getMp1() {
        return mp1;
    }

    public void setMp1(String mp1) {
        this.mp1 = mp1;
    }

    public String getAtk1() {
        return atk1;
    }

    public void setAtk1(String atk1) {
        this.atk1 = atk1;
    }

    public String getDf1() {
        return df1;
    }

    public void setDf1(String df1) {
        this.df1 = df1;
    }

    public String getHp18() {
        return hp18;
    }

    public void setHp18(String hp18) {
        this.hp18 = hp18;
    }

    public String getMp18() {
        return mp18;
    }

    public void setMp18(String mp18) {
        this.mp18 = mp18;
    }

    public String getAtk18() {
        return atk18;
    }

    public void setAtk18(String atk18) {
        this.atk18 = atk18;
    }

    public String getDf18() {
        return df18;
    }

    public void setDf18(String df18) {
        this.df18 = df18;
    }

    public String getRange1() {
        return range1;
    }

    public void setRange1(String range1) {
        this.range1 = range1;
    }

    public String getRange18() {
        return range18;
    }

    public void setRange18(String range18) {
        this.range18 = range18;
    }

    public String getPassive() {
        return passive;
    }

    public void setPassive(String passive) {
        this.passive = passive;
    }

    public String getPassive_comment() {
        return passive_comment;
    }

    public void setPassive_comment(String passive_comment) {
        this.passive_comment = passive_comment;
    }

    public String getSkillq() {
        return skillq;
    }

    public void setSkillq(String skillq) {
        this.skillq = skillq;
    }

    public String getSkillq_comment() {
        return skillq_comment;
    }

    public void setSkillq_comment(String skillq_comment) {
        this.skillq_comment = skillq_comment;
    }

    public String getSkillw() {
        return skillw;
    }

    public void setSkillw(String skillw) {
        this.skillw = skillw;
    }

    public String getSkillw_comment() {
        return skillw_comment;
    }

    public void setSkillw_comment(String skillw_comment) {
        this.skillw_comment = skillw_comment;
    }

    public String getSkille() {
        return skille;
    }

    public void setSkille(String skille) {
        this.skille = skille;
    }

    public String getSkille_comment() {
        return skille_comment;
    }

    public void setSkille_comment(String skille_comment) {
        this.skille_comment = skille_comment;
    }

    public String getSkillr() {
        return skillr;
    }

    public void setSkillr(String skillr) {
        this.skillr = skillr;
    }

    public String getSkillr_comment() {
        return skillr_comment;
    }

    public void setSkillr_comment(String skillr_comment) {
        this.skillr_comment = skillr_comment;
    }

    public Date getRegister_date() {
        return register_date;
    }

    public void setRegister_date(Date register_date) {
        this.register_date = register_date;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    @Override
    public String toString() {
        return "Champ{" +
                "cid=" + cid +
                ", role='" + role + '\'' +
                ", cname='" + cname + '\'' +
                ", hp1='" + hp1 + '\'' +
                ", mp1='" + mp1 + '\'' +
                ", atk1='" + atk1 + '\'' +
                ", df1='" + df1 + '\'' +
                ", hp18='" + hp18 + '\'' +
                ", mp18='" + mp18 + '\'' +
                ", atk18='" + atk18 + '\'' +
                ", df18='" + df18 + '\'' +
                ", range1='" + range1 + '\'' +
                ", range18='" + range18 + '\'' +
                ", passive='" + passive + '\'' +
                ", passive_comment='" + passive_comment + '\'' +
                ", skillq='" + skillq + '\'' +
                ", skillq_comment='" + skillq_comment + '\'' +
                ", skillw='" + skillw + '\'' +
                ", skillw_comment='" + skillw_comment + '\'' +
                ", skille='" + skille + '\'' +
                ", skille_comment='" + skille_comment + '\'' +
                ", skillr='" + skillr + '\'' +
                ", skillr_comment='" + skillr_comment + '\'' +
                ", register_date=" + register_date +
                ", update_date=" + update_date +
                '}';
    }
}
