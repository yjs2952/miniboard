package my.example.miniboard.servlet;

import my.example.miniboard.dao.BoardDAO;
import my.example.miniboard.util.ParamUtil;
import my.example.miniboard.vo.Board;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/boardWrite")
public class ChampBoardWriteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/board/boardWrite.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Map<String, String[]> paramMap = req.getParameterMap();
        String valCheck = ParamUtil.validationCheck(paramMap);

        if (valCheck != null) {
            System.out.println("null 확인 : " + valCheck);

            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/board/champBoard.jsp");
            rd.forward(req, resp);
        }

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
