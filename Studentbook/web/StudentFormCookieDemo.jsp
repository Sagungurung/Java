<%-- 
    Document   : StudentFormCookieDemo
    Created on : Mar 12, 2020, 10:57:11 AM
    Author     : Sagun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Setting Cookie</title>
    </head>
    <body>
         <form class="form-horizontal" action="SetCookieDemo" method="GET">
            <fieldset>

                <!-- Form Name -->
                <legend>Form Name</legend>

                <!-- Text input-->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="name">Student Name</label>  
                    <div class="col-md-4">
                        <input id="name" name="name" type="text" placeholder="name" class="form-control input-md">
                    </div>
                </div><br/>

                <!-- Text input-->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="phone">Phone</label>  
                    <div class="col-md-4">
                        <input id="phone" name="phone" type="text" placeholder="placeholder" class="form-control input-md">
                    </div>
                </div><br/>

                <!-- Password input-->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="password">Password</label>
                    <div class="col-md-4">
                        <input id="password" name="password" type="password" placeholder="placeholder" class="form-control input-md" required="">
                    </div>
                </div><br/><br/>

                <!-- Button (Double) -->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="submitbtn"></label>
                    <div class="col-md-8">
                        <input type="submit" id="submitbtn" name="submitbtn" value="Submit" class="btn btn-success"/>
                        <button id="cancelbtn" name="cancelbtn" class="btn btn-danger">Cancel</button>
                    </div>
                </div>

            </fieldset>
    </body>
</html>
