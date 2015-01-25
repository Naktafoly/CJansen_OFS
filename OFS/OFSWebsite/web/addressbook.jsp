<%-- 
    Document   : addressbook
    Created on : 25-Jan-2015, 10:57:09
    Author     : CJansen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>OFSAddressbook</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css"/>
        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css"/>
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
        
        <link rel="stylesheet" type="text/css" href="CSS/main.css"/>                       
    </head>
    <body>
        <h1 class="title">Adresboek</h1>
                        
        <div class="addresbook">
            <form action="AddressbookController" role="form">
                <div class="form-group">
                    <label for="Naam" class="col-sm-2 control-label">Naam: </label>
                    <div class="col-sm-5">
                        <input type="text" name="naam" class="form-control" id="Naam" placeholder="naam">
                    </div>
                    <br>
                </div>                
                <div class="form-group">
                    <label for="Adres" class="col-sm-2 control-label">Adres: </label>
                    <div class="col-sm-5">
                        <input type="text" name="adres" class="form-control" id="Adres" placeholder="adres">
                    </div>
                    <br>
                </div>
                <div class="form-group">
                    <label for="Telefoon" class="col-sm-2 control-label">Telefoon: </label>
                    <div class="col-sm-5">
                        <input type="text" name="telefoon" class="form-control" id="Telefoon" placeholder="telefoon">
                    </div>
                    <br>
                </div>    
                <div class="form-group">
                    <label for="E-Mail" class="col-sm-2 control-label">E-Mail: </label>
                    <div class="col-sm-5">
                        <input type="text" name="e-mail" class="form-control" id="E-Mail" placeholder="e-mail">
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
                </div>
                </form>
            </div>
            <div>
                <form class="form-group">                
                    <a onclick="href='/OFSWebsite/index.html'" class="btn btn-default">Hoofdmenu</a>                
                </form>
            </div>              
        </div>
    </body>
</html>
