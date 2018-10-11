package my.example.miniboard.servlet;

import my.example.miniboard.dao.ChampDAO;
import my.example.miniboard.util.JdbcUtil;
import my.example.miniboard.vo.Champ;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Enumeration;
import java.util.Map;

@WebServlet("/addChamp")
public class AddChampServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/board/addChamp.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");

        Map<String, String[]> parameterMap = req.getParameterMap();

        ChampDAO dao = new ChampDAO();
        dao.addChamp(req);


        resp.sendRedirect("/champList");
    }
}
