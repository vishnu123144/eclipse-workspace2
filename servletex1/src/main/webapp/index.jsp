<html>
<head><!-- CSS only -->
<link
 href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css"
 rel="stylesheet">
</head>
<body>
<h2 class="bg-primary">Enter the customer details</h2>
<form action="addCustomer" method="post">
<div class="form-group">
<label for="username">username</label>
<input type="text" name="username" class="form-control" required="required">
</div>
<div class="form-group">
<label for="mobile">Mobile</label>
<input type="number" name="mobile" class="form-control" required="required">
</div>
<div class="form-group">
<label for="email">email</label>
<input type="email" name="email" class="form-control">
</div>
<input type="submit" value="submit" class="btn btn-success" required="required">


</form>

</body>
</html>
