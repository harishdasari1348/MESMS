<%-- 
    Document   : addNewStaff
    Created on : Feb 3, 2016, 7:19:02 PM
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
                    <h2><span>Add New Staff</span></h2>
                    <div class="module-body">


                        <s:form action="addNewStaff" method="post">                       
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
                                            <label>Biometric ID</label>

                                            <s:textfield name="biometricid" cssClass="input-long"/>

                                        </p> 
                                    </td>
                                    <td>
                                        <p>
                                            <label>Employee Name</label>
                                            <s:textfield name="empname" cssClass="input-long" />

                                        </p>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <p>
                                            <label>Date of Joining</label>
                                            <s:textfield  name="doj" cssClass="input-long" />

                                        </p>
                                    </td>
                                    <td>
                                        <p>
                                            <label>Salary type</label>
                                            <s:select 
                                                list="#{'Cash':'Cash', 'Bank':'Bank'}" 
                                                name="saltype" 
                                                cssClass="input-long" />                                                    

                                        </p>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <p>
                                            <label>Monthly Salary</label>
                                            <s:textfield name="monsalary" cssClass="input-long" />

                                        </p>

                                    </td>
                                    <td>
                                        <p>
                                            <label>Department</label>
                                            <s:select 
                                                list="#{'CSE':'CSE', 'EEE':'EEE','ECE':'ECE'}" 
                                                name="department" 
                                                cssClass="input-long" />                                                    

                                        </p>
                                    </td>
                                </tr>
                                <tr>

                                    <td>
                                        <p>
                                            <label>Bank Account Number</label>
                                            <s:textfield name="bankaccnumber" cssClass="input-long" />

                                        </p>
                                    </td>
                                    <td>
                                        <p>
                                            <label>Address</label>
                                            <s:textfield  name="address" cssClass="input-long"/>

                                        </p>

                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <p>
                                            <label>Mode of Travel</label>
                                            <s:select 
                                                list="#{'Bus':'Bus', 'Car':'Car','OwnTransport':'Own Transport'}" 
                                                name="modeoftravel" 
                                                cssClass="input-long" />                                                          

                                        </p>
                                    </td>
                                    <td>
                                        <p>
                                            <label>Mobile Number</label>
                                            <s:textfield name="mobilenumber" cssClass="input-long"/>

                                        </p>
                                    </td>
                                </tr>
                                <tr>
                                    <td  colspan="2">
                                        <s:submit cssClass="submit-green" type="submit" value="Add New Staff" />
                                    </td>
                                </tr>
                            </table>


                        </s:form>


                    </div>
                </div>
                <div style="clear:both;"></div>
            </div> <!-- End .grid_5 -->

            <script type="text/javascript">
           
                $(function() {
                    $( "#addNewStaff_doj").datepicker({
                        changeMonth: true,
                        changeYear: true
                    });
                });
            </script>


            <jsp:include page="footer.jsp" />
    </body>
</html>

