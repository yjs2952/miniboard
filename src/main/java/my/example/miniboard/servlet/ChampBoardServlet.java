package my.example.miniboard.servlet;

import my.example.miniboard.dao.BoardDAO;
import my.example.miniboard.dao.ChampDAO;
import my.example.miniboard.vo.Board;
import my.example.miniboard.vo.Champ;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/champboard")
public class ChampBoardServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        BoardDAO boardDAO = new BoardDAO();
        ChampDAO champDAO = new ChampDAO();
        List<Board> boardList = boardDAO.boardList();

        int cid = Integer.parseInt(req.getParameter("cid"));
        Champ champAbility = champDAO.champAbility(cid);
        req.setAttribute("boardList", boardList);
        req.setAttribute("champAbility", champAbility);

        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/board/champBoard.jsp");
        rd.forward(req, resp);
    }
}
