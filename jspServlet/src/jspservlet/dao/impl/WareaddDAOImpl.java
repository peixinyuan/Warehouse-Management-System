package jspservlet.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jspservlet.dao.WareaddDAO;
import jspservlet.db.DBConnect;
import jspservlet.vo.Wareadd;

public class WareaddDAOImpl implements WareaddDAO{
    public int Wareadd(Wareadd wareadd) {
        String sql = "insert into warehouse (warehouseID,information) value(?,?)";
        PreparedStatement pstmt = null ;
        DBConnect dbc = null;
        try{
            // 连接数据库
            dbc = new DBConnect() ;
            pstmt = dbc.getConnection().prepareStatement(sql) ;
            pstmt.setString(1, wareadd.getWarehouseID());
            pstmt.setString(2, wareadd.getInformation());

            pstmt.executeUpdate();
            pstmt.close() ;

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return 1;
        }
}
