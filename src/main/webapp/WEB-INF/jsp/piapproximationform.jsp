<%-- 
    Document   : piapproximationform
    Created on : Dec 2, 2014, 5:50:49 PM
    Author     : sarm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculate Pi</title> 
        <link href="<c:url value='/resources/theme/css/all.css'/>"  media="screen" rel="stylesheet" type="text/css">

        <script>
            function validateForm() {
                var x = document.forms["piform"]["terms"].value;
            
                if (x == null || x == "") {
                    alert("First terms must be filled out");
                    return false;
                }
                if (/\D/.test(x)){
                     alert("Terms must only be numbers");
                    return false;
                }
            }
        </script>

    </head>
    <body>

        <div id="container">
            <div id="header">
                <div id="logo"></div>
                <h1>Calculate Pi </h1>
            </div>

            <div id="main">

                <div class="block">
                    <h2>  Here we will use the Leibniz formula for calculating Pi </h2>
                    <img src="<c:url value='/resources/theme/images/Leibniz1.png'/>" />

                    <div class="content">
                        <div class="inner">
                            <h2>Please enter the number of terms (n) to which you want to calculate Pi</h2>
                            <form:form name="piform" id="piform" method="POST" action="generatePi.html" commandName="piBean" onsubmit="return validateForm()">
                                <table>
                                    <tr>
                                        <td><form:label   path="approximation">Terms</form:label></td>
                                        <td><form:input id="terms" path="approximation" /></td>
                                    </tr>

                                    <tr>
                                        <td><form:hidden path="piValue" /></td>
                                    </tr>


                                    <tr>
                                        <td colspan="2">
                                            <input id="button-upload" type="submit" value="Submit"/>
                                        </td>
                                    </tr>
                                </table>  
                            </form:form>

                        </div>
                    </div>   


                </div>
            </div>
    </body>
</html>
