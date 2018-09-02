<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form >
  <div class="container">
    <h1>Edit</h1>
    <p>Edit this form to continue.</p>
    <hr>

	<label><b>1.Id</b></label>
    <input type="text" placeholder="Id" name="Id" id="Id" required>

    <label><b>2.First Name</b></label>
    <input type="text" placeholder="First Name" name="fname" id="fname" <%-- value="<%request.getAttribute("fname").toString();%>" --%>>

    <label><b>3.Other name/s</b></label>
    <input type="text" placeholder="Other Names" name="mname"  <%-- value="<%request.getAttribute("mname").toString();%>" --%>>
	<br/><br/>
	<%-- <%=request.getAttribute("mname").toString()%> --%>
	 
    <label><b>4.Surname</b></label>
    <input type="text" placeholder="Surname" name="sname" <%-- value="<%request.getAttribute("sname").toString();%>" --%>>
    
    <label><b>5.Gender </b></label>
    <input type="text" placeholder="Gender" name="gender" <%-- value="<%request.getAttribute("gender").toString();%>" --%>>
    <br/><br/>
    
    <label><b>6.DOB</b></label>
    <input type="date" placeholder="Date of Birth" name="dob"<%--  value="<%request.getAttribute("dob").toString();%>" --%>>
    
    <label><b>7.Religion</b></label>
    <input type="text" placeholder="Religion" name="religion" <%-- value="<%request.getAttribute("religion").toString();%>" --%>>
    
     <label><b>8.Nationality </b></label>
    <input type="text" placeholder="Nationality" name="nationality" <%-- value="<%request.getAttribute("nationality").toString();%>" --%>>
    <br/><br/>
    
    <label><b>9.Guardian Name</b></label>
    <input type="text" placeholder="Guardian Name" name="gname" <%-- value="<%request.getAttribute("gname").toString(); %>" --%>>
    <br/><br/>
    
     <label><b>11.Guardian's Occupation</b></label>
    <input type="text" placeholder="Guardian's Occupation" name="goccu" <%-- value="<%request.getAttribute("goccu").toString();%>" --%>>
    
    <label><b>12.Address </b></label>
			<textarea placeholder="Address" name="address"
				<%-- value="<%request.getAttribute("address").toString();%>" --%>></textarea>
			<br/><br/>
    <label><b>13.NIC </b></label>
    <input type="text" placeholder="NIC" name="nic" <%-- value="<%request.getAttribute("nic").toString();%>" --%>>
    
    <label><b>14.Mobile </b></label>
    <input type="number" placeholder="Mobile" name="mobile" <%-- value="<%request.getAttribute("mobile").toString();%>" --%>>
    <br/><br/>
     <label><b>15.Email</b></label>
    <input type="email" placeholder="Email" name="email" <%-- value="<%request.getAttribute("email").toString();%>" --%>>
    
    <label><b>16.Admin</b></label>
    <input type="text" placeholder="admin" name="admin" <%-- value="<%request.getAttribute("admin").toString();%>" --%>>
    
    <br/><br/>
    

  </div>
 </form>
</body>
</html>