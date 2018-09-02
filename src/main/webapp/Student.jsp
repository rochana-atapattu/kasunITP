<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
</script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<script src="Student.js" type="text/javascript"></script>
<title>Insert title here</title>
</head>
<body>
<form action="addStudent" method="post" name="form1" id="form1">
  <div class="container">
    <h1>Student Registration</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

	<label><b>1.Id</b></label>
    <input type="text" placeholder="Id" name="Id" id="Id" required>

    <label><b>2.First Name</b></label>
    <input type="text" placeholder="First Name" name="fname" id="fname" value="" required>

    <label><b>3.Other name/s</b></label>
    <input type="text" placeholder="Other Names" name="mname"  required>
	<br/><br/>
	<%-- <%=request.getAttribute("mname").toString()%> --%>
	 
    <label><b>4.Surname</b></label>
    <input type="text" placeholder="Surname" name="sname" required>
    
    <label><b>5.Gender </b></label>
    <input type="text" placeholder="Gender" name="gender" required>
    <br/><br/>
    
    <label><b>6.DOB</b></label>
    <input type="date" placeholder="Date of Birth" name="dob" required>
    
    <label><b>7.Religion</b></label>
    <input type="text" placeholder="Religion" name="religion" required>
    
     <label><b>8.Nationality </b></label>
    <input type="text" placeholder="Nationality" name="nationality" required>
    <br/><br/>
    
    <label><b>9.Password</b></label>
    <input type="password" placeholder="Password" name="studpass" required>
    
    <label><b>10.Guardian Name</b></label>
    <input type="text" placeholder="Guardian Name" name="gname" required>
    <br/><br/>
    
     <label><b>11.Guardian's Occupation</b></label>
    <input type="text" placeholder="Guardian's Occupation" name="goccu" required>
    
    <label><b>12.Address </b></label>
    <textarea placeholder="Address" name="address" required></textarea>
    <br/><br/>
    <label><b>13.NIC </b></label>
    <input type="text" placeholder="NIC" name="nic" required>
    
    <label><b>14.Mobile </b></label>
    <input type="number" placeholder="Mobile" name="mobile" required>
    <br/><br/>
     <label><b>15.Email</b></label>
    <input type="email" placeholder="Email" name="email" required>
    
     <label><b>16.Guardian Pass</b></label>
    <input type="password" placeholder="Guardian Password" name="guardpass" required>
    
     <label><b>17.Admin</b></label>
    <input type="text" placeholder="admin" name="admin" required>
    
    <br/><br/>
    
 

   
    <hr>
    
    <input type="button" name="action" id="add" value="add">
    <input type="button" name="action" id="search" value="search">
    <input type="button" name="action" value="delete">
  </div>
 </form>
	<script >
	$(document).ready(function(){

		init();

		}); 
	
	</script>
</body>
</html>