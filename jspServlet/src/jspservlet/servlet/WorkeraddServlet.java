package jspservlet.servlet;

import jspservlet.dao.impl.WorkeraddDAOImpl;
import jspservlet.vo.Workeradd;
import jspservlet.dao.WorkeraddDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class WorkeraddServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        Workeradd wa = new Workeradd();
        String strWorkerID = req.getParameter("workerID");
        String strWorkerName = req.getParameter("workerName");
        String strUsername = req.getParameter("username");
        wa.setWorkerID(strWorkerID);
        wa.setWorkerName(strWorkerName);
        wa.setUsername(strUsername);

        WorkeraddDAOImpl workeradd =new WorkeraddDAOImpl();
        try {
            int flag = workeradd.Workeradd(wa);
            if (flag <= 0) {res.sendRedirect("./error.jsp");
            } else {
                res.sendRedirect("./welcome.jsp");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
