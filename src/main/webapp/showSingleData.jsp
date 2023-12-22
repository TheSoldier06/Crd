<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Show single Data</title>
    </head>

    <body>
    <%
    out.print("the laptop data is :");
    out.print(session.getAttribute("laptop"));
    %>
    
    <br>
    
    ${laptop}
  
    </body>

    </html>