<html>
<head><link
 href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css"
 rel="stylesheet"></head>
<body>
<h2>This is a Index page</h2>
<h2 class ="bg-primary"> Enter the Customer Details</h2>
 <form action="addCustomer" method="post">
  <div class="form-group">
   <label for="username">Username</label> 
   <input type="text" name="username" class="form-control" required="required">

  </div>
  <div class="form-group">
   <label for="mobile">Mobile</label> 
   <input type="number" name="mobile" class="form-control" required="required">
  </div>
  <div class="form-group">
   <label for="email">Email</label> 
   <input type="email" name="email" class="form-control" required="required">
  </div>
  <hr>
  <input type="submit" value="submit" class="btn btn-primary">
 </form>

</body>
</html>
