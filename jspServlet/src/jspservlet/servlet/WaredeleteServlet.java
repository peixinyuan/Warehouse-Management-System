package jspservlet.servlet;

import jspservlet.dao.impl.WaredeleteDAOImpl;
import jspservlet.vo.Wareadd;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class WaredeleteServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String strWarehouseID=request.getParameter("warehouseID");
        Wareadd w =new Wareadd();
        w.setWarehouseID(strWarehouseID);
        WaredeleteDAOImpl Waredelete=new WaredeleteDAOImpl();
        try {int flag = Waredelete.Waredelete(w);
            if (flag <= 0) {response.sendRedirect("./error.jsp");
            } else {
                response.sendRedirect("./welcome.jsp");}
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
