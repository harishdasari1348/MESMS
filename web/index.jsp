<%-- 
    Document   : index
    Created on : Feb 3, 2016, 2:24:06 PM
    Author     : miracle
--%>

<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/loginstyle.css" rel='stylesheet' type='text/css' />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>

        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    </script>
    <!--webfonts-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,400,300,600,700' rel='stylesheet' type='text/css'>
    <!--//webfonts-->

</head>
<body>

    <!--/start-login-one-->
    <h1>Login Form</h1>
    <div class="login">	
        <div class="ribbon-wrapper h2 ribbon-red">
            <div class="ribbon-front">
                <h2>User Login</h2>
            </div>
            <div class="ribbon-edge-topleft2"></div>
            <div class="ribbon-edge-bottomleft"></div>
        </div>
        <s:form action="login" method="post">
            <s:property  value="error"  /> 
            <ul>
                <li>
                    <s:textfield name="name" cssClass="text" value="Email Address" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email Address';}"><a href="#" class=" icon user"></a> </s:textfield>
                </li>
                <li>
                    <s:textfield name="pwd" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}"><a href="#" class=" icon lock"></a></s:textfield>
                </li>
            </ul>
            <div class="submit">        
                <s:submit name="submit" label="Log in" align="center" />
            </div>            
        </s:form>
    </div>

    <div class="copy-right">
        <p>&copy; 2016. <a href="#" title="Miracle">Copy rights @ 2016</a></p>
    </div>
</body>
</html>
