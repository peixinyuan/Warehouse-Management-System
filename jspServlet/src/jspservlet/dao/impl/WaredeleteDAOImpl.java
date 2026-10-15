package jspservlet.dao.impl;

import jspservlet.dao.WaredeleteDAO;
import jspservlet.db.DBConnect;
import jspservlet.vo.Wareadd;

import java.sql.PreparedStatement;

public class WaredeleteDAOImpl implements WaredeleteDAO {

    public int Waredelete(Wareadd w) {
        try {
            String sql = "delete from warehouse where warehouseID=?";
            DBConnect dbc = new DBConnect();
            PreparedStatement pstmt = dbc.getConnection().prepareStatement(sql);
            pstmt.setString(1, w.getWarehouseID());
            pstmt.executeUpdate();
            dbc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }return 1;
    }
}
