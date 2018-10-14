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

    public List<Board> boardList(){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<Board> list = new ArrayList<>();

        String sql = "SELECT bid, board_title, board_content, board_uid, cid, register_date FROM board";

        try {
            conn = JdbcUtil.connection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Board board = new Board();
                board.setBoardId(rs.getInt(1));
                board.setBoardTitle(rs.getString(2));
                board.setBoardContent(rs.getString(3));
                board.setBoardUid(rs.getString(4));
                board.setBoardCid(rs.getString(5));
                board.setRegisterDate(rs.getDate(6));
                list.add(board);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JdbcUtil.close(conn, ps, rs);
        }

        return list;
    }

    public int boardWrite(Board board) {

        Connection conn = null;
        PreparedStatement ps = null;
        int result = 0;

        String sql = "INSERT INTO board (board_title, board_content, board_uid, cid, register_date) " +
                "values(?, ?, ?, ?, now())";

        try {
            conn = JdbcUtil.connection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, board.getBoardTitle());
            ps.setString(2, board.getBoardContent());
            ps.setString(3, board.getBoardUid());
            ps.setString(4, board.getBoardCid());
            result = ps.executeUpdate();

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JdbcUtil.close(conn, ps);
        }

        return result;
    }
}
