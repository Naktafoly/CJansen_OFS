<%-- 
    Document   : invoice
    Created on : 25-Jan-2015, 10:57:27
    Author     : CJansen
--%>

<%@page import="Viewmodels.ViewModelNamen"%>
<%@page import="Dal.Addressbook"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>OFSFacturen</title>
                <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css"/>
        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css"/>
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
        
        <link rel="stylesheet" type="text/css" href="CSS/main.css"/>   
        
        
    </head>
    <body>
        <h1 class="title">Facturen</h1>
                        
        <div class="facturen">
            <form role="form">
                <div class="form-group">
                    <label for="Naam" class="col-sm-2 control-label">Naam: </label>
                    <div class="col-sm-5">                        
                        <select type="text" name="naam" class="form-control" id="Naam" placeholder="naam">
                            <option value="">test</option>                            
                        </select>
                    </div>
                    <br>
                </div>                
                <div class="form-group">
                    <label for="Datum" class="col-sm-2 control-label">Datum: </label>
                    <div class="col-sm-5">
                        <input type="text" name="datum" class="form-control" id="Datum" placeholder="datum">
                    </div>
                    <br>
                </div>                
                <div class="form-group">
                    <label for="Note" class="col-sm-2 control-label">Note: </label>
                    <div class="col-sm-5">
                        <input type="text" name="note" class="form-control" id="Note" placeholder="datum">
                    </div>
                    <br>
                </div> 
            </form>            
            <div>
                <form class="form-group">                
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default">Opslaan</button>
                    <button type="submit" class="btn btn-default">Update</button>
                    <button type="submit" class="btn btn-default">Verwijderen</button>
                    <br>
                    <button type="submit" class="btn btn-default"><<</button>
                    <button type="submit" class="btn btn-default">Zoeken</button>
                    <button type="submit" class="btn btn-default">>></button>
                    <br>
                    <button type="submit" class="btn btn-default">Velden Leegmaken</button>                    
                    <br>
                    <br>
                </div>
                </form>
            </div>
            <br>
            <h2 class="title">Facturen</h2>     
            <div >
                <form class="form-group">                
                 <select multiple class="col-sm-10">
                    <option value="">test</option>
                 </select> 
                </form>
            </div>
            <br>
            <div>
                <form class="form-group">   
                    <br>
                    <br>
                    <br>
                    <a onclick="href='/OFSWebsite/index.html'" class="btn btn-default">Hoofdmenu</a>                
                </form>
            </div>              
        </div>        
    </body>
</html>
