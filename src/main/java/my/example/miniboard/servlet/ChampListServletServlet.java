package my.example.miniboard.servlet;

import my.example.miniboard.dao.ChampDAO;
import my.example.miniboard.util.ParamUtil;
import my.example.miniboard.vo.Champ;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/champList")
public class ChampListServletServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        ChampDAO dao = new ChampDAO();
        List<Champ> list =  dao.champList();

        req.setAttribute("champList", list);

        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/board/champList.jsp");
        rd.forward(req, resp);
    }
}
