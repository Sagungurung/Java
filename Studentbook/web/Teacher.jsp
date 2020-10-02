<%-- 
    Document   : FormFirst
    Created on : Feb 19, 2020, 10:58:46 AM
    Author     : Sagun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form class="form-horizontal" action="process.jsp" method="get">
<fieldset>

<!-- Form Name -->
<legend> Teacher Form</legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">FirstName</label>  
  <div class="col-md-4">
  <input id="textinput" name="FirstName" type="text" placeholder="placeholder" class="form-control input-md">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">LastName</label>  
  <div class="col-md-4">
  <input id="textinput" name="LastName" type="text" placeholder="placeholder" class="form-control input-md">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">Address</label>  
  <div class="col-md-4">
  <input id="textinput" name="Address" type="text" placeholder="placeholder" class="form-control input-md">
    
  </div>
</div>
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">Phone</label>  
  <div class="col-md-4">
  <input id="textinput" name="Phone" type="text" placeholder="placeholder" class="form-control input-md">
    
  </div>
</div>

<!-- Button (Double) -->
<div class="form-group">
  <label class="col-md-4 control-label" for="button1id"></label>
  <div class="col-md-8">
    <button id="button1id" name="Submit" class="btn btn-success">Submit</button>
    <button id="Cancel" name="Cancel" class="btn btn-danger">Cancel</button>
  </div>
</div>

</fieldset>
</form>

    </body>
</html>
