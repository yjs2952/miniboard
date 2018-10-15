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

        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/board/writeChampBoard.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        //Map<String, String[]> paramMap = req.getParameterMap();
        //String valCheck = ParamUtil.validationCheck(paramMap);

        String cid  = req.getParameter("boardCid");

        /*if (valCheck != null) {
            System.out.println("null 확인 : " + valCheck);

            resp.sendRedirect("/champboard?cid=" + req.getParameter("boardCid"));
        }*/


        Board board = new Board();
        board.setCid(cid);
        //board.setBoardUid(req.getParameter("boardUid"));\
        board.setUid("admin00");
        board.setTitle(req.getParameter("title"));
        board.setContent(req.getParameter("content"));
        System.out.println(board.toString());

        BoardDAO dao = new BoardDAO();
        dao.write(board);

        resp.sendRedirect("/champboard?cid="+cid);
    }
}
