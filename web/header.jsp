<%-- 
    Document   : header
    Created on : Feb 3, 2016, 5:22:37 PM
    Author     : miracle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<!-- Header -->

<div id="header">
    <!-- Header. Status part -->
    <div id="header-status">
        <div class="container_12">
            <div class="grid_8">
                &nbsp;
            </div>
            <div class="grid_4">
                <a href="" id="logout">
                    Logout
                </a>
            </div>
        </div>
        <div style="clear:both;"></div>
    </div> <!-- End #header-status -->

    <!-- Header. Main part -->
    <div id="header-main">
        <div class="container_12">
            <div class="grid_12">
                <div id="logo">
                    <ul id="nav">
                        <li id="current" onclick="mainMenu(this,'dashboard')"><a id="dashboard" href="#">Dashboard</a></li>
                        <li onclick="mainMenu(this,'staff')"><a id="staff" href="#">Staff</a></li>
                        <li onclick="mainMenu(this,'department')"><a id="department" href="#">Department</a></li>                        
                        <li><a href="#">Profile</a></li>
                        <li><a href="#">Settings</a></li>
                    </ul>
                </div><!-- End. #Logo -->
            </div><!-- End. .grid_12-->
            <div style="clear: both;"></div>
        </div><!-- End. .container_12 -->
    </div> <!-- End #header-main -->
    <div style="clear: both;"></div>
    <!-- Sub navigation -->
    <div id="subnav">
        <div id="dashboard-subnav">
            <div class="container_12">
                <div class="grid_12">


                </div><!-- End. .grid_12-->
            </div><!-- End. .container_12 -->
        </div>
        <div id="staff-subnav" style="display: none">
            <div class="container_12">
                <div class="grid_12">
                    <ul>
                        <li>
                            <s:url action="addNewStaff.action" var="addNewStaff" ></s:url>                            
                            <a href="<s:property value="#addNewStaff" />" >New Staff</a>
                        </li>
                        <li>
                            <s:url action="listStaff.action" var="listStaff" ></s:url>                            
                            <a href="<s:property value="#listStaff" />">List Staff Details</a>
                        </li>      

                    </ul>

                </div><!-- End. .grid_12-->
            </div><!-- End. .container_12 -->
        </div>
        <div id="department-subnav" style="display: none">
            <div class="container_12">
                <div class="grid_12">
                    <ul>
                        <li>
                            <s:url action="addNewDepartment.action" var="addNewDepartment" ></s:url>                            
                            <a href="<s:property value="#addNewDepartment" />" >New Department</a>
                        </li>
                        <li>
                            <s:url action="listDepartment.action" var="listDepartment" ></s:url>                            
                            <a href="<s:property value="#listDepartment" />">List Department Details</a>
                        </li>      

                    </ul>

                </div><!-- End. .grid_12-->
            </div><!-- End. .container_12 -->
        </div>
        <div style="clear: both;"></div>
    </div> <!-- End #subnav -->
</div> <!-- End #header -->



<script type="text/javascript" lang="javascript">
    currentMenu="<s:property  value="menu" />";
    submenu=$("#current").children().attr("id");      
    $("#current").removeAttr("id");        
    $("#"+currentMenu).parent().attr("id","current");        
    $("#"+submenu+"-subnav").hide();
    $("#"+currentMenu+"-subnav").show();
        
    function mainMenu(menu,menuName){        
        $("#current").removeAttr("id");
        $(menu).attr("id","current");
        $("#"+currentMenu+"-subnav").hide();
        $("#"+menuName+"-subnav").show();
        currentMenu=menuName;
    }
</script>
