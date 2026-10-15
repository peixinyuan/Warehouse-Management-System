<%@ page language="java" contentType="text/html;charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>    
    <title>My JSP 'welcome.jsp' starting page</title>
  </head>
  
  <body>
    <%String username = (String)session.getAttribute("username"); %>
    welcome   <%= username %>
    <a href="wareadd.jsp">
      <input type="SUBMIT" value="Add Warehouse">
    </a>

    <a href="waredelete.jsp">
      <input type="SUBMIT" value="Delete Warehouse">
    </a>

    <a href="workeradd.jsp">
      <input type="SUBMIT" value="Add Worker">
    </a>

    <a href="workerdelete.jsp">
      <input type="SUBMIT" value="Delete Worker">
    </a>

    <a href="warehousetable.jsp">
      <input type="SUBMIT" value="watch warehouse table">
    </a>

  <a href="workertable.jsp">
    <input type="SUBMIT" value="watch worker table">
  </a>

    <a href="goodtable.jsp">
      <input type="SUBMIT" value="watch good table">
    </a>

    <a href="login.jsp">
      <input type="SUBMIT" value="logout">
    </a>

  </body>
</html>