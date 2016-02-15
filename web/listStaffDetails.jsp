<%-- 
    Document   : listStaffDetails
    Created on : Feb 10, 2016, 8:30:09 PM
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

            <!-- Account overview -->
            <div  class="grid_16">

                <div class="module">
                    <h2><span>Satff Details</span></h2>
                    <div class="module-table-body">
                        <form action="">
                            <table id="myTable" class="tablesorter">
                                <thead>
                                    <tr>                                       
                                        <th class="header">Bio Metric ID</th>
                                        <th class="header">Employee Name</th>
                                        <th class="header">Date Of Joining</th>
                                        <th class="header">Salary Type</th>
                                        <th class="header">Monthly Salary</th>
                                        <th class="header">Department</th>
                                        <th class="header">Bank Acc No</th>
                                        <th class="header">Address</th>
                                        <th class="header">Mode Of Travel</th>
                                        <th class="header">Mobile No</th>
                                        <th></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <s:iterator var="staff" value="staffList">

                                        <tr class="even">

                                            <td><a href="#"> <s:property value="biometricid"/></a></td>

                                            <td> <s:property value="empname"/></td>
                                            <td> <s:property value="doj"/></td>
                                            <td> <s:property value="saltype"/></td>
                                            <td> <s:property value="monsalary"/></td>
                                            <td> <s:property value="department"/></td>
                                            <td> <s:property value="bankaccnumber"/></td>
                                            <td> <s:property value="address"/></td>
                                            <td> <s:property value="modeoftravel"/></td>
                                            <td> <s:property value="mobilenumber"/></td>
                                            <td>
                                                <s:url action="viewStaff.action" var="viewStaff" >
                                                    <s:param name="biometricid"><s:property value="biometricid"/></s:param>
                                                </s:url>  
                                                <s:url action="editStaff.action" var="editStaff" >
                                                    <s:param name="biometricid"><s:property value="biometricid"/></s:param>
                                                </s:url> 
                                                <s:url action="deleteStaff.action" var="deleteStaff" >
                                                    <s:param name="biometricid"><s:property value="biometricid"/></s:param>
                                                </s:url> 
                                                <a href="<s:property value='#editStaff'/>"><img src="images/pencil.gif" tppabs="images/pencil.gif" width="16" height="16" alt="edit"></a>
                                                <!--<a href="<s:property value='#viewStaff'/>"><img src="images/balloon.gif" tppabs="images/balloon.gif" width="16" height="16" alt="view"></a>-->
                                                <a href="<s:property value='#deleteStaff'/>"><img src="images/bin.gif" tppabs="images/bin.gif" width="16" height="16" alt="delete"></a>
                                            </td>
                                        </tr>
                                    </s:iterator>

                                </tbody>
                            </table>
                        </form>
                        <div class="pager" id="pager">
                            <form action="">
                                <div>
                                    <img class="first" src="images/arrow-stop-180.gif" tppabs="images/arrow-stop-180.gif" alt="first">
                                        <img class="prev" src="images/arrow-180.gif" tppabs="images/arrow-180.gif" alt="prev"> 
                                            <input type="text" class="pagedisplay input-short align-center">
                                                <img class="next" src="images/arrow.gif" tppabs="images/arrow.gif" alt="next">
                                                    <img class="last" src="images/arrow-stop.gif" tppabs="images/arrow-stop.gif" alt="last"> 
                                                        <select class="pagesize input-short align-center">
                                                            <option value="10" selected="selected">10</option>
                                                            <option value="20">20</option>
                                                            <option value="30">30</option>
                                                            <option value="40">40</option>
                                                        </select>
                                                        </div>
                                                        </form>
                                                        </div>
                                                        <div class="table-apply">

                                                        </div>
                                                        <div style="clear: both"></div>
                                                        </div> <!-- End .module-table-body -->
                                                        </div>



                                                        <div style="clear:both;"></div>
                                                        </div> <!-- End .grid_5 -->



                                                        <jsp:include page="footer.jsp" />
                                                        </body>
                                                        </html>
