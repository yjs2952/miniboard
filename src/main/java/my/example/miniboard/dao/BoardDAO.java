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

        String sql = "select a.bid, a.board_title, a.board_content, a.board_uid, b.cname, a.register_date from board a\n" +
                "inner join champinfo b\n" +
                "where a.cid = b.cid;";

        try {
            jdbcUtil = JdbcUtil.getInstance();
            conn = jdbcUtil.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Board board = new Board();
                board.setBoardId(rs.getInt(1));
                board.setBoardTitle(rs.getString(2));
                board.setBoardContent(rs.getString(3));
                board.setBoardUid(rs.getString(4));
                board.setBoardCname(rs.getString(5));
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

    public int boardWrite(Board board) {

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
            ps.setString(1, board.getBoardTitle());
            ps.setString(2, board.getBoardContent());
            ps.setString(3, board.getBoardUid());
            ps.setString(4, board.getBoardCid());
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
