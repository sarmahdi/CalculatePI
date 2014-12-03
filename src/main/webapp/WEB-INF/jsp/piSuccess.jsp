<%-- 
    Document   : pisuccess
    Created on : Dec 2, 2014, 6:07:36 PM
    Author     : sarm
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pi Calculated</title>
         <link href="${pageContext.request.contextPath}/resources/theme/css/all.css" media="screen" rel="stylesheet" type="text/css">
       
    </head>
    <body>
          <div id="container">
            <div id="header">
                <div id="logo"></div>
                <h1>Calculate Pi </h1>
            </div>
        <div align="center">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Pi Value</h2></td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <h3>Here's the approximation of Pi over ${piBean.approximation} terms ...</h3>
                    </td>
                </tr>
                <tr>
                    <td>Terms :</td>
                    <td>${piBean.approximation}</td>
                </tr>
                <tr>
                    <td>Value of Pi :</td>
                    <td>${piBean.piValue}</td>
                </tr>

               

               </table>

            <a href="loadpiform.html">Start Again</a>

        </div>
    </body>
</html>
