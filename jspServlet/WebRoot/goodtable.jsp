<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/9/18
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<span style="font-size:12px;"><span style="font-size:14px;">


<html>
<head>
<style type="text/css">
table {
    border: 2px #CCCCCC solid;
    width: 360px;
}

td,th {
    height: 30px;
    border: #CCCCCC 1px solid;
}
</style>
</head>
<body>
    <%//驱动程序名
        String driverName = "com.mysql.cj.jdbc.Driver";
        //数据库用户名
        String userName = "root";
        //密码
        String userPasswd = "123456";
        //数据库名
        String dbName = "project";
        //表名
        String tableName = "good";
        //联结字符串
        String url = "jdbc:mysql://127.0.0.1:3306/project?useSSL=false&serverTimezone=UTC" + dbName + "?user="
                + userName + "&password=" + userPasswd;
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        Connection connection = null;
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project?useSSL=false&serverTimezone=UTC","root","123456");
        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM " + tableName;
        ResultSet rs = statement.executeQuery(sql);

    %>
    <br>
    <br>
    <table align="center">
        <tr>
            <th>
                <%
                    out.print("goodID");
                %>
            </th>
            <th>
                <%
                    out.print("location");
                %>
            </th>
            <th>
                <%
                    out.print("information");
                %>
            </th>
            <th>
                <%
                    out.print("warehouseID");
                %>
            </th>
        </tr>

        <%
            while (rs.next()) {
        %>
        <tr>
            <td>
                <%
                    out.print(rs.getString(1));
                %>
            </td>
            <td>
                <%
                    out.print(rs.getString(2));
                %>
            </td>
            <td>
                <%
                    out.print(rs.getString(3));
                %>
            </td>
            <td>
                <%
                    out.print(rs.getString(4));
                %>
            </td>
        </tr>
        <%
            }
        %>
    </table>
    <div align="center">
        <br> <br> <br>
        <%
            out.print("数据查询成功，恭喜你");
        %>
    </div>
    <%
        rs.close();
        statement.close();
        connection.close();
    %>
</body>
</html></span><span style="font-size:24px;color: rgb(255, 0, 0);">
</span></span>