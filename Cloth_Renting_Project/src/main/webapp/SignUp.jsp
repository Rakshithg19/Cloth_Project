<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="images/v.png" rel="icon">

<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">


<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>


<!--Fontawesome CDN-->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"
	integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU"
	crossorigin="anonymous">

<!--Custom styles-->
<link rel="stylesheet" type="text/css" href="styles.css">

</head>
<body style="background-image: url(https://ik.imagekit.io/flyrobe/bitmap_2x.png); background-repeat: no-repeat; background-size: cover">


<nav class="navbar navbar-expand-sm bg-dark navbar-dark justify-content-center">
  <ul class="navbar-nav">  
    <li class="nav-item">
      <a class="nav-link" href="#">SignIn</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="home.jsp">Home</a>
    </li>
   </ul>
</nav>

<div class="container">
  
  <form action="SignUp.do" class="was-validated" method="post" >

<div class="col-sm-6">


<p style="color: green">User Info</p>
    <div class="form-group">
      <label for="firstName" class="bg-dark text-white">First Name:<span class="required">*</span></label>
      <input type="text" class="form-control" id="uname" placeholder="Enter first name" name="firstName" required>
      <div class="valid-feedback">Valid.</div>
      <div class="invalid-feedback">Please fill out this field.</div>
    </div>
    </div>
	<div class="col-sm-6">
    <div class="form-group">
      <label for="middleName" class="bg-dark text-white">Middle Name:</label>
      <input type="text" class="form-control" id="uname" placeholder="Enter middle name" name="middleName">
     
   </div>
    </div>
  <div class="col-sm-6">
    <div class="form-group">
      <label for="lastName"class="bg-dark text-white">Last Name:<span class="required">*</span></label>
      <input type="text" class="form-control" id="lname" placeholder="Enter first name" name="lastName" required>
      <div class="valid-feedback">Valid.</div>
      <div class="invalid-feedback">Please fill out this field.</div>
    </div>
    </div>
  <div class="col-sm-6">
    <div class="form-group">
      <label for="email" class="bg-dark text-white">Email:<span class="required">*</span></label>
      <input type="text" class="form-control" id="email" placeholder="Enter Email" name="email" required>
      <div class="valid-feedback">Valid.</div>
      <div class="invalid-feedback">Please fill out this field.</div>
    </div>
    </div>
	<div class="col-sm-3">
      <label for="type" class="bg-dark text-white">Select list (select one):</label>
      <select class="form-control" id="sel" name="type">
           <option>Retailer</option>
        <option>Customer</option>
      </select>
      </div>
      <br><br>
      <div class="col-sm-6">
    <div class="form-group">
      <label for="phoneNumber" class="bg-dark text-white">Phone Number:<span class="required">*</span></label>
      <input type="tel" class="form-control" id="number" placeholder="Enter Phone Number" name="phoneNumber" required>
      <div class="valid-feedback">Valid.</div>
      <div class="invalid-feedback">Please fill out this field.</div>
    </div>
    </div>
     <div class="col-sm-6">
    <div class="form-group">
      <label for="alternativeNumber" class="bg-dark text-white">Alternative Phone Number:</label>
      <input type="tel" class="form-control" id="altnumber" placeholder="Enter Alternative Phone Number" name="alternativeNumber">
      </div>
      </div>
      <br>
      <p> Address </p>
      <div class="col-sm-6">
    <div class="form-group">
      <label for="address" class="bg-dark text-white">Address:<span class="required">*</span></label>
      <input type="text" class="form-control" id="adddress" placeholder="Enter Address " name="address" required>
      <div class="valid-feedback">Valid.</div>
      <div class="invalid-feedback">Please fill out this field.</div>
    </div>
    </div>
    <div class="col-sm-6">
    <div class="form-group">
      <label for="city" class="bg-dark text-white">City:<span class="required">*</span></label>
      <input type="text" class="form-control" id="city" placeholder="Enter City" name="city" required>
      <div class="valid-feedback">Valid.</div>
      <div class="invalid-feedback">Please fill out this field.</div>
    </div>
    </div>
    <div class="col-sm-6">
    <div class="form-group">
      <label for="state" class="bg-dark text-white">State:<span class="required">*</span></label>
      <input type="text" class="form-control" id="lname" placeholder="Enter State" name="state" required>
      <div class="valid-feedback">Valid.</div>
      <div class="invalid-feedback">Please fill out this field.</div>
    </div>
    </div>
     <div class="col-sm-6">
    <div class="form-group">
      <label for="landMark" class="bg-dark text-white">Landmark:</label>
      <input type="text" class="form-control" id="lmark" placeholder="Land Mark" name="landMark">
      </div>
      </div>
      <button type="submit" class="btn btn-primary">Submit</button>
      
      </form>
      </div>
</body>
</html>