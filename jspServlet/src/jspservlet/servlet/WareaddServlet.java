package jspservlet.servlet;

import jspservlet.dao.WareaddDAO;
import jspservlet.dao.impl.WareaddDAOImpl;
import jspservlet.vo.Wareadd;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class WareaddServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException,IOException{
        Wareadd wa = new Wareadd();
        String strWarehouseID = req.getParameter("warehouseID");
        String strInformation = req.getParameter("information");
        wa.setWarehouseID(strWarehouseID);
        wa.setInformation(strInformation);

        WareaddDAOImpl wareadd =new WareaddDAOImpl();
        try {
            int flag = wareadd.Wareadd(wa);
            if (flag <= 0) {res.sendRedirect("./error.jsp");
            } else {
                res.sendRedirect("./welcome.jsp");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
    }
}
}
