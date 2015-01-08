<%@ page language="java" contentType="text/html; charset=US-ASCII"
  pageEncoding="US-ASCII"%>
  <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  <html>
    <head>
      <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
        <title>Home Page</title>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      </head>
      <body>
        <div align="center">
          <h1>Rooms List</h1>
          <table border="1">
            <th>Room Name</th>
            <th>Value</th>

            <c:forEach var="room" items="${roomList}">
              <tr>
                <td>${room.room_name}</td>
                <c:choose>
                  <c:when test="${room.room_value == 1}">
                    <td><button style="background-color:RED">${room.room_value}</button></td>

                  </c:when>
                  <c:when test="${room.room_value == 2}">
                    <td><button style="background-color:green">${room.room_value}</button></td>
                  </c:when>
                  <c:when test="${room.room_value == 3 }">
                    <td><button style="background-color:blue">${room.room_value}</button></td>
                  </c:when>

                </c:choose>

              </tr>
            </c:forEach>
          </table>
        </div>
      </body>
    </html>
