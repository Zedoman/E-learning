<%@page import="com.servlet.db.DB"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <link href="//db.onlinewebfonts.com/c/a4e256ed67403c6ad5d43937ed48a77b?family=Core+Sans+N+W01+35+Light" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="form.css" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Download Assignment</title>
        <style>
            tr,td,th{
                padding: 20px;
                text-align: center;
            }
        </style>
    </head>
    <body>
    <a href ="DB"></a>
        <br><br><br>
        <%@ page import="java.util.*" %>
        <%!
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
        %>
        <a href ="DB"></a>
        <table border="2">
            <tr>
                <th>First Name</th><th>Last Name</th><th>File Name</th><th>Added Date</th><th>Download</th>
            </tr>
            <%
            con = DB.getConnection();
            String sql = "select firstname, lastname, filename, added_date from employee";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
            %>
            <tr>
                <td><%=rs.getString(1)%></td>
                <td><%=rs.getString(2)%></td>
                <td><%=rs.getString(3)%></td>
                <td><%=rs.getTimestamp(4)%></td>
                <td><a href="DownloadServlet?fileName=<%=rs.getString(3)%>">Download</a></td>
            </tr>
            
            <%
                }
            %>
            
        </table><br>
        <a href="index4.jsp">Home</a>

    </body>
</html>
