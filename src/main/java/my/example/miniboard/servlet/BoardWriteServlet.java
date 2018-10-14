package my.example.miniboard.servlet;

import my.example.miniboard.dao.BoardDAO;
import my.example.miniboard.vo.Board;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/boardWrite")
public class BoardWriteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/board/boardWrite.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        Board board = new Board();
        board.setBoardCid(req.getParameter("boardCid"));
        //board.setBoardUid(req.getParameter("boardUid"));\
        board.setBoardUid("admin00");
        board.setBoardTitle(req.getParameter("title"));
        board.setBoardContent(req.getParameter("content"));
        System.out.println(board.toString());

        BoardDAO dao = new BoardDAO();
        dao.boardWrite(board);


        resp.sendRedirect("/champboard");
    }
}
