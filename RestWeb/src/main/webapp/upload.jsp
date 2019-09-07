<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>File Upload</title>
</head>
<body>
   <div>
      <form action="rest/image/upload" method="post" enctype="multipart/form-data">
        <table align="centr">
          <caption>Image Upload</caption>
          <tr>
          <td><label for="upload">Upload a image</label></td>
          </tr>
          <tr>
          <td><input type="file" name="file"/></td>
          </tr>
          <tr>
          <td><input type="submit" name="btnsubmit" value="Browse"/></td>
          </tr>
        
        </table>
      
      
      </form>
   
   </div>
</body>
</html>