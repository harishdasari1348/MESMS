<%-- 
    Document   : head
    Created on : Feb 3, 2016, 5:21:35 PM
    Author     : miracle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <title>Miracle Enducational Soceity, Staff Salary Management System</title>

    <!-- CSS Reset -->
    <link rel="stylesheet" type="text/css" href="css/reset.css" tppabs="css/reset.css" media="screen" />

    <!-- Fluid 960 Grid System - CSS framework -->
    <link rel="stylesheet" type="text/css" href="css/grid.css" tppabs="css/grid.css" media="screen" />

    <!-- IE Hacks for the Fluid 960 Grid System -->
    <!--[if IE 6]><link rel="stylesheet" type="text/css" href="css/ie6.css" tppabs="css/ie6.css" media="screen" /><![endif]-->
    <!--[if IE 7]><link rel="stylesheet" type="text/css" href="css/ie.css" tppabs="css/ie.css" media="screen" /><![endif]-->

    <!-- Main stylesheet -->
    <link rel="stylesheet" type="text/css" href="css/styles.css" tppabs="css/styles.css" />

    <!-- WYSIWYG editor stylesheet -->
    <link rel="stylesheet" type="text/css" href="css/jquery.wysiwyg.css" tppabs="css/jquery.wysiwyg.css" media="screen" />

    <!-- Table sorter stylesheet -->
    <link rel="stylesheet" type="text/css" href="css/tablesorter.css" tppabs="css/tablesorter.css" media="screen" />

    <!-- Thickbox stylesheet -->
    <link rel="stylesheet" type="text/css" href="css/thickbox.css" tppabs="css/thickbox.css" media="screen" />

    <!-- Themes. Below are several color themes. Uncomment the line of your choice to switch to different color. All styles commented out means blue theme. -->
    <link rel="stylesheet" type="text/css" href="css/theme-blue.css" tppabs="css/theme-blue.css" media="screen" />
    <!--<link rel="stylesheet" type="text/css" href="css/theme-red.css" media="screen" />-->
    <!--<link rel="stylesheet" type="text/css" href="css/theme-yellow.css" media="screen" />-->
    <!--<link rel="stylesheet" type="text/css" href="css/theme-green.css" media="screen" />-->
    <!--<link rel="stylesheet" type="text/css" href="css/theme-graphite.css" media="screen" />-->

    <link rel="stylesheet" href="css/jquery-ui.css">    


    <!-- JQuery engine script-->
    <script type="text/javascript" src="js/jquery-1.10.2.js" tppabs="js/jquery-1.3.2.min.js"></script>

    <!-- JQuery WYSIWYG plugin script -->
    <script type="text/javascript" src="js/jquery.wysiwyg.js" tppabs="js/jquery.wysiwyg.js"></script>

    <!-- JQuery tablesorter plugin script-->
    <script type="text/javascript" src="js/jquery.tablesorter.js" tppabs="js/jquery.tablesorter.min.js"></script>

    <!-- JQuery pager plugin script for tablesorter tables -->
    <script type="text/javascript" src="js/jquery.tablesorter.pager.js" tppabs="js/jquery.tablesorter.pager.js"></script>
    <script type="text/javascript" src="js/jquery.tablesorter.widgets.js" tppabs="js/jquery.tablesorter.pager.js"></script>

    <!-- JQuery password strength plugin script -->
    <script type="text/javascript" src="js/jquery.pstrength-min.1.2.js" tppabs="js/jquery.pstrength-min.1.2.js"></script>

    <!-- JQuery thickbox plugin script -->
    <script type="text/javascript" src="js/thickbox.js" tppabs="js/thickbox.js"></script>
    
    <script src="js/jquery-ui.js"></script>
    <!-- Initiate WYIWYG text area -->
    <script type="text/javascript">
        $(function()
        {
            $('#wysiwyg').wysiwyg(
            {
                controls : {
                    separator01 : { visible : true },
                    separator03 : { visible : true },
                    separator04 : { visible : true },
                    separator00 : { visible : true },
                    separator07 : { visible : false },
                    separator02 : { visible : false },
                    separator08 : { visible : false },
                    insertOrderedList : { visible : true },
                    insertUnorderedList : { visible : true },
                    undo: { visible : true },
                    redo: { visible : true },
                    justifyLeft: { visible : true },
                    justifyCenter: { visible : true },
                    justifyRight: { visible : true },
                    justifyFull: { visible : true },
                    subscript: { visible : true },
                    superscript: { visible : true },
                    underline: { visible : true },
                    increaseFontSize : { visible : false },
                    decreaseFontSize : { visible : false }
                }
            } );
        });
    </script>

    <!-- Initiate tablesorter script -->
    <script type="text/javascript">
        $(document).ready(function() { 
            $("#myTable") 
            .tablesorter({
                // zebra coloring
                widgets: ['zebra'],
                // pass the headers argument and assing a object 
                headers: { 
                    // assign the sixth column (we start counting zero) 
                    //6: { 
                        // disable it by setting the property sorter to false 
                      //  sorter: false 
                    //} 
                }
            }) 
            .tablesorterPager({container: $("#pager")}); 
        }); 
    </script>

    <!-- Initiate password strength script -->
    <script type="text/javascript">
        $(function() {
            $('.password').pstrength();
        });
    </script>
</head>