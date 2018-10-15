package my.example.miniboard.dao;

import my.example.miniboard.util.JdbcUtil;
import my.example.miniboard.vo.Board;
import my.example.miniboard.vo.Champ;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO {

    public List<Board> getList(){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        JdbcUtil jdbcUtil = null;
        List<Board> list = new ArrayList<>();

        String sql = "SELECT a.bid, a.board_title, a.board_content, a.board_uid, b.cname, a.register_date FROM board a\n" +
                "INNER JOIN champinfo b\n" +
                "WHERE a.cid = b.cid\n" +
                "ORDER BY a.register_date";

        try {
            jdbcUtil = JdbcUtil.getInstance();
            conn = jdbcUtil.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Board board = new Board();
                board.setId(rs.getInt(1));
                board.setTitle(rs.getString(2));
                board.setContent(rs.getString(3));
                board.setUid(rs.getString(4));
                board.setCname(rs.getString(5));
                board.setRegisterDate(rs.getDate(6));
                list.add(board);
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {

            jdbcUtil.close(ps, rs);

        }

        return list;
    }

    public int write(Board board) {

        Connection conn = null;
        PreparedStatement ps = null;
        JdbcUtil jdbcUtil = null;
        int result = 0;

        String sql = "INSERT INTO board (board_title, board_content, board_uid, cid, register_date) " +
                "values(?, ?, ?, ?, now())";

        try {
            jdbcUtil = JdbcUtil.getInstance();
            conn = jdbcUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, board.getTitle());
            ps.setString(2, board.getContent());
            ps.setString(3, board.getUid());
            ps.setString(4, board.getCid());
            result = ps.executeUpdate();

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                jdbcUtil.close(ps);
            }
        }

        return result;
    }
}
