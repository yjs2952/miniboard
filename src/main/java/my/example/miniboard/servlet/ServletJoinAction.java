package my.example.miniboard.servlet;

import my.example.miniboard.vo.User;
import sun.misc.Request;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/joinAction")
public class ServletJoinAction extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        System.out.println(id);
        System.out.println(password);
        System.out.println(name);

        req.setAttribute("id", req.getParameter("id"));
        req.setAttribute("name", req.getParameter("name"));
        req.setAttribute("password", req.getParameter("password"));

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/join/joinAction.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        resp.sendRedirect("/joinAction");
    }
}
