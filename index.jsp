<%-- 
    Document   : index
    Created on : 6 Νοε 2011, 3:43:43 μμ
    Author     : Voula
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <strong> CURRENCY CONVERTER  </strong>> <br/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%-- <div style="margin-left:auto; margin-right:auto;height: 40%;width:40%;"> --%>
            <form name="forma1" action="Curr" method="get" style= "width: 80%; height:60%; top:10%; left: 50%; background-color:antiquewhite;""> 
                  
                  Amount of money: <input type="text" name="poso" value="" />
                  
                  From&nbsp;:   <select name="from">
                     <option value="JPY">Japan</option>
                     <option value="EUR">Euro</option>
                    <option value="USD">U.S.Dollar</option>
                    <option value="BGN">Bulgaria lev</option>
                    <option value="CZK">Czech koruna</option>
                    <option value="DKK">Danish krone</option>
                    <option value="GBP">British pound </option>
                    <option value="HUF">Hungarian forint</option>
                    <option value="LTL">Lithuanian litas</option>
                    <option value="PLN">Polish zloty</option>
                    <option value="CHF">Swiss franc</option>
                    <option value="NOK">Norwegian Krone </option>
                    <option value="HRK">Croatian kuna</option>
                    <option value="RUB">Russian Ruble</option>
                    <option value="TRY">Turkish lira</option>
                    <option value="AUD">Australian Dollar</option>
                    <option value="BRL">Brazil real</option>
                    <option value="CAD">Canadian Dollar</option>
                    <option value="CNY">Chinese Yuan</option>
                    <option value="HKD">Hong Kong dollar</option>
                    <option value="IDR">Indonesian rupiah</option>
                    <option value="ILS">Israeli shekel</option>
                    <option value="INR">Indian rupee</option>
                </select> 
                  
                  =&nbsp;

                
                 <input type="Text" value ="<%= request.getParameter("param1")%>">
                 
                 To&nbsp;:
                <select name="to"> 
                    <option value="JPY">Japan</option>
                      <option value="EUR">Euro</option>
                    <option value="USD">U.S.Dollar</option>
                    <option value="BGN">Bulgaria lev</option>
                    <option value="CZK">Czech koruna</option>
                    <option value="DKK">Danish krone</option>
                    <option value="GBP">British pound </option>
                    <option value="HUF">Hungarian forint</option>
                    <option value="LTL">Lithuanian litas</option>
                    <option value="PLN">Polish zloty</option>
                    <option value="CHF">Swiss franc</option>
                    <option value="NOK">Norwegian Krone </option>
                    <option value="HRK">Croatian kuna</option>
                    <option value="RUB">Russian Ruble</option>
                    <option value="TRY">Turkish lira</option>
                    <option value="AUD">Australian Dollar</option>
                    <option value="BRL">Brazil real</option>
                    <option value="CAD">Canadian Dollar</option>
                    <option value="CNY">Chinese Yuan</option>
                    <option value="HKD">Hong Kong dollar</option>
                    <option value="IDR">Indonesian rupiah</option>
                    <option value="ILS">Israeli shekel</option>
                    <option value="INR">Indian rupee</option>





                    
                </select>

             

                <input type="submit" value="GO" onclick="Curr" />

               

                </form>  
                 
                 
                 <form name="FormaInfo" action="ListenerServ" method="get">
                      <input type="submit" value="Info" onclick="ListenerServ" />
                     </form>
                 
                <form name="Code" action="CodeZip" method="get">
                      <input type="submit" value="Code" onclick="CodeZip" />
                     </form>
                 
                 
                 
                <%-- </div> --%>
    </body>
</html>
