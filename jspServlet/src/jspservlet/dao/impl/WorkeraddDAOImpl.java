package jspservlet.dao.impl;

import jspservlet.dao.WorkeraddDAO;
import jspservlet.db.DBConnect;
import jspservlet.vo.Workeradd;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class WorkeraddDAOImpl implements WorkeraddDAO {
    public int Workeradd(Workeradd workeradd) {
        String sql = "insert into worker (workerID,workerName,username) value(?,?,?)";
        PreparedStatement pstmt = null ;
        DBConnect dbc = null;
        try{
            // 连接数据库
            dbc = new DBConnect() ;
            pstmt = dbc.getConnection().prepareStatement(sql) ;
            pstmt.setString(1, workeradd.getWorkerID());
            pstmt.setString(2, workeradd.getWorkerName());
            pstmt.setString(3, workeradd.getUsername());

            pstmt.executeUpdate();
            pstmt.close() ;

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return 1;
    }
}
