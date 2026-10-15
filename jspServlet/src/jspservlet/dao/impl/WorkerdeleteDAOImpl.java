package jspservlet.dao.impl;

import jspservlet.dao.WorkerdeleteDAO;
import jspservlet.dao.WorkerdeleteDAO;
import jspservlet.db.DBConnect;
import jspservlet.vo.Workeradd;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
public class WorkerdeleteDAOImpl implements WorkerdeleteDAO {

    public int Workerdelete(Workeradd w) {
        try {
            String sql = "delete from worker where workerID=?";
            DBConnect dbc = new DBConnect();
            PreparedStatement pstmt = dbc.getConnection().prepareStatement(sql);
            pstmt.setString(1, w.getWorkerID());
            pstmt.executeUpdate();
            dbc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }return 1;
    }
}
