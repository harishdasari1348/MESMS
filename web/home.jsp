<%-- 
    Document   : home.jsp
    Created on : Jan 27, 2016, 4:31:57 PM
    Author     : miracle
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
    <jsp:include page="head.jsp" />    
    <body>
        <jsp:include page="header.jsp" />

        <div id="body" class="container_12">

            <!-- Account overview -->
            <div  class="grid_10">
                <div class="module">
                    <h2><span>Account overview</span></h2>
                    <div class="module-body">
                        <p>
                            <strong>User: </strong>       <s:property  value="name"  /> <br />
                            <strong>Your last visit was on: </strong> <s:property  value="lastLogin"  />,<br />
                            <strong>From IP: </strong><s:property  value="ip"  /> 
                        </p>
                    </div>
                </div>
                <div style="clear:both;"></div>
            </div> <!-- End .grid_5 -->




            <div style="clear:both;"></div>
        </div> <!-- End .container_12 -->


        <jsp:include page="footer.jsp" />
    </body>
</html>
