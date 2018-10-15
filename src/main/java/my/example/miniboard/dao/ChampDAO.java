package my.example.miniboard.dao;

import my.example.miniboard.util.JdbcUtil;
import my.example.miniboard.vo.Board;
import my.example.miniboard.vo.Champ;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ChampDAO {

    public Champ champAbility(int cid) {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        JdbcUtil jdbcUtil = null;

        String sql = "SELECT cid, cname, role, hp1, hp18, mp1, mp18, atk1, atk18, df1, df18, range1, range18, passive, passive_comment, skillq, skillq_comment, skillw, skillw_comment, skille, skille_comment, skillr, skillr_comment, register_date, update_date FROM champinfo WHERE cid=?";
        Champ champ = null;
        try {
            jdbcUtil = JdbcUtil.getInstance();
            conn = jdbcUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, cid);
            rs = ps.executeQuery();

            while (rs.next()) {
                champ = new Champ();
                champ.setCid(rs.getInt(1));
                champ.setCname(rs.getString(2));
                champ.setRole(rs.getString(3));
                champ.setHp1(rs.getString(4));
                champ.setHp18(rs.getString(5));
                champ.setMp1(rs.getString(6));
                champ.setMp18(rs.getString(7));
                champ.setAtk1(rs.getString(8));
                champ.setAtk18(rs.getString(9));
                champ.setDf1(rs.getString(10));
                champ.setDf18(rs.getString(11));
                champ.setRange1(rs.getString(12));
                champ.setRange18(rs.getString(13));
                champ.setPassive(rs.getString(14));
                champ.setPassive_comment(rs.getString(15));
                champ.setSkillq(rs.getString(16));
                champ.setSkillq_comment(rs.getString(17));
                champ.setSkillw(rs.getString(18));
                champ.setSkillw_comment(rs.getString(19));
                champ.setSkille(rs.getString(20));
                champ.setSkille_comment(rs.getString(21));
                champ.setSkillr(rs.getString(22));
                champ.setSkillr_comment(rs.getString(23));
                champ.setRegister_date(rs.getDate(24));
                champ.setUpdate_date(rs.getDate(25));
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (jdbcUtil != null) {
                jdbcUtil.close(ps);
            }
        }

        return champ;
    }

    public List<Champ> getList() {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        JdbcUtil jdbcUtil = null;

        List<Champ> list = new ArrayList<>();

        String sql = "SELECT cid, cname, role, register_date, update_date FROM champinfo ORDER BY register_date";

        try {
            jdbcUtil = JdbcUtil.getInstance();
            conn = jdbcUtil.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Champ champ = new Champ();
                champ.setCid(rs.getInt(1));
                champ.setCname(rs.getString(2));
                champ.setRole(rs.getString(3));
                champ.setRegister_date(rs.getDate(4));
                champ.setUpdate_date(rs.getDate(5));
                list.add(champ);
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            jdbcUtil.close(ps);
        }

        return list;
    }

    public int addChamp(HttpServletRequest req) {

        Connection conn = null;
        PreparedStatement ps = null;
        JdbcUtil jdbcUtil = null;
        int result = 0;

        String sql = "INSERT INTO champinfo (cname, role, hp1, hp18, mp1, mp18, atk1, atk18, df1, df18, range1, range18, passive, passive_comment, skillq, skillq_comment, skillw, skillw_comment, skille, skille_comment, skillr, skillr_comment, register_date) " +
                "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,now())";

        try {
            jdbcUtil = JdbcUtil.getInstance();
            conn = jdbcUtil.getConnection();
            ps = conn.prepareStatement(sql);
            Champ champ = new Champ();
            ps.setString(1, champ.getCname());
            ps.setString(2, champ.getRole());
            ps.setString(3, champ.getHp1());
            ps.setString(4, champ.getHp18());
            ps.setString(5, champ.getMp1());
            ps.setString(6, champ.getMp18());
            ps.setString(7, champ.getAtk1());
            ps.setString(8, champ.getAtk18());
            ps.setString(9, champ.getDf1());
            ps.setString(10, champ.getDf18());
            ps.setString(11, champ.getRange1());
            ps.setString(12, champ.getRange18());
            ps.setString(13, champ.getPassive());
            ps.setString(14, champ.getPassive_comment());
            ps.setString(15, champ.getSkillq());
            ps.setString(16, champ.getSkillq_comment());
            ps.setString(17, champ.getSkillw());
            ps.setString(18, champ.getSkillw_comment());
            ps.setString(19, champ.getSkille());
            ps.setString(20, champ.getSkille_comment());
            ps.setString(21, champ.getSkillr());
            ps.setString(22, champ.getSkillr_comment());
            result = ps.executeUpdate();

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            jdbcUtil.close(ps);
        }

        return result;
    }
}
