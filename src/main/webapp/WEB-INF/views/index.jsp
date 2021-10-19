<%@page import="spring.mvc.entities.Book" %>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
body{
  text-align: center;
  font-family: Arial, Helvetica, sans-serif;
}
table {
  border-collapse: collapse;
  width: 100%;
 
}

th, td {
   text-align: center;
  padding: 8px;
}

tr:nth-child(even) 
{background-color: #f2f2f2;}
th {
  background-color: #008CBA;
  color: white;
}

a:link, a:visited {
  background-color: white;
  color: black;
  border: 2px solid #008CBA;
  border-radius:6px;
  padding: 10px 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}

a:hover, a:active {
  background-color: #008CBA;
  color: white;
   text-align: center;
}
</style>
<title>Home Page</title>
</head>
<body>
    <%
        List<Book> bookList = (List<Book>)request.getAttribute("listOfBooks");    
    
    %>
    <h1>Home Page</h1>

    <table>
        <tr>
            <th>Id</th>
            <th>Name of Book</th>
            <th>Author</th>
            <th>Description</th>
            <th>Cost</th>
            <th>Number of Copies</th>
            <th>Availability</th>
            <th>Actions</th>
        </tr>
        
        <% for(Book book : bookList) { %>

        <tr>
            <td><%= book.getId() %></td>
            <td><%= book.getBookName() %></td>
            <td><%= book.getAuthorName() %></td>
            <td><%= book.getDescription()%></td>
            <td><%= book.getCost()%></td>
            <td><%= book.getNumberOfCopies()%></td>
            <%if(book.getAvailability().equals("A")){ %>
            <td>Available</td>
            <%} else { %>
            <td>Not Available</td>
            <%} %>
            
            <td> 
            
            <a href="showUpdateBookForm/<%=book.getId() %>">Update Book</a>
            <a href="deleteBook/<%=book.getId() %>">Delete Book</a>
            
            </td>
        </tr>
        <% } %>            

    </table>
  <p><a href="showAddBookForm">ADD BOOK</a></p>
  
</body>
</html>