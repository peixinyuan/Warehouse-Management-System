package jspservlet.servlet;

import jspservlet.dao.impl.WorkerdeleteDAOImpl;
import jspservlet.vo.Workeradd;
import jspservlet.dao.WorkerdeleteDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class WorkerdeleteServlet extends HttpServlet{

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String strWorkerID=request.getParameter("workerID");
        Workeradd w =new Workeradd();
        w.setWorkerID(strWorkerID);
        WorkerdeleteDAOImpl Workerdelete=new WorkerdeleteDAOImpl();
        try {int flag = Workerdelete.Workerdelete(w);
            if (flag <= 0) {response.sendRedirect("./error.jsp");
            } else {
                response.sendRedirect("./welcome.jsp");}
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
