<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
body{
  padding:10px 15px 15px 20px;
  text-align: center;
  font-family: Arial, Helvetica, sans-serif;
}
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  font-size:16px;
}

input[type=submit] {
  width: 100%;
  background-color: #0099cc;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  font-size:20px;
}

input[type=submit]:hover {
  background-color: #008CBA;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
<title>Add New Book!</title>
</head>
<body>

<form action="register" method ="get">
   
          <input type ="text" placeholder="Enter Book Name" name="bookName"/> <br/>
          
          <input type ="text" placeholder="Enter Author Name" name="authorName"/> <br/>
          
          <input type ="text" placeholder="Enter Description" name="description"/> <br/>
          
          <input type ="text" placeholder="Enter Cost" name="cost"/> <br/>
          
          <input type ="text" placeholder="Enter Number of Copies" name="numberOfCopies"/> <br/>
       
          <input type ="submit" value="Submit"/> 
      

   </form>

</body>
</html>