<%-- 
    Document   : addNewDepartment
    Created on : Feb 11, 2016, 10:40:18 PM
    Author     : miracle
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
 

<html xmlns="http://www.w3.org/1999/xhtml">
    <jsp:include page="head.jsp" />    
    <body>
        <jsp:include page="header.jsp" />

        <div id="body" class="container_12">


            <div  class="grid_10">
                <div class="module">
                    <h2><span>Add New Department</span></h2>
                    <div class="module-body">


                        <s:form action="addNewDepartment" method="post">                       
                            <s:set var="errorVal" value="error" />
                            <s:set var="successVal" value="success" />
                            <s:if test="%{#errorVal !='' && #errorVal != NULL}">                           
                                <span class="notification n-error"><s:property value="#errorVal"/></span>
                            </s:if>
                            <s:if test="%{#successVal !='' && #successVal != NULL}">                           
                                <span class="notification n-success"><s:property value="#successVal"/></span>
                            </s:if>


                            <table style="border:0;">
                                <tr>
                                    <td>
                                        <p>
                                            <label>Department Name</label>
                                            <s:textfield name="departName" cssClass="input-long"/>
                                        </p> 
                                    </td>   
                                     <td>
                                        <p>
                                            <label>Department Description</label>
                                            <s:textfield name="departDesc" cssClass="input-long"/>
                                        </p> 
                                    </td>
                                </tr>
                           
                                <tr>
                                    <td  colspan="2">
                                        <s:submit cssClass="submit-green" type="submit" value="Add New Department" />
                                    </td>
                                </tr>
                            </table>


                        </s:form>


                    </div>
                </div>
                <div style="clear:both;"></div>
            </div> <!-- End .grid_5 -->

            <jsp:include page="footer.jsp" />
    </body>
</html>
