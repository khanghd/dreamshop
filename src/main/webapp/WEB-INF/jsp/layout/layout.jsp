<%-- 
    Document   : layout
    Created on : Dec 19, 2017, 7:46:33 PM
    Author     : DuyKhang
--%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--
        Website được thiết kế và phát triển bởi Huỳnh Duy Khang.
        Website: DreamShop
        Tel: 01648621759
        Addr: kiệt 82/93 Nguyễn Lương Bằng, Hòa Khánh Bắc, Liên Chiểu, TP.ĐÀ NẴNG
        Bản quyền thuộc về Huỳnh Duy Khang
        ©2017 All rights reserved.
        -->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title><tiles:insertAttribute name="title" /></title>  
        <link rel="SHORTCUT ICON" href="resources/image/fabvicon.ico"/>
        <!--Style-->
        <link href="../../../resources/styles/bootstrap4/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="../../../resources/styles/main_styles.css" rel="stylesheet" type="text/css"/>
        <link href="../../../resources/plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <link href="../../../resources/styles/responsive.css" rel="stylesheet" type="text/css"/>
        <link href="../../../resources/plugins/OwlCarousel2-2.2.1/owl.carousel.css" rel="stylesheet" type="text/css"/>
        <link href="../../../resources/plugins/OwlCarousel2-2.2.1/owl.theme.default.css" rel="stylesheet" type="text/css"/>
        <link href="../../../resources/plugins/OwlCarousel2-2.2.1/animate.css" rel="stylesheet" type="text/css"/>
        <link href="../../../resources/styles/responsive.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div> 
            <tiles:insertAttribute name="header" />
        </div>
        <div> 
            <tiles:insertAttribute name="body" />
        </div>
        <div style="clear:both">
            <tiles:insertAttribute name="footer" />
        </div>  
    </body>
</html>


