    <%@page contentType="text/html" pageEncoding="UTF-8" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html>
        <html lang="es" ng-app="saleModule">
        <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="cache-control" content="no-cache" />

        <!-- Angular JS-->
        <script type="text/javascript" src="resources/js/angular.js"></script>
        <script type="text/javascript" src="resources/js/angular-route.js"></script>
        <script type="text/javascript" src="resources/js/angular-resource.js"></script>


        <script src="https://code.jquery.com/jquery.js"></script>


        <script type="text/javascript" src="app/app.js"></script>
        <script type="text/javascript" src="app/controller/SedeController.js"></script>
        <script type="text/javascript" src="app/factory/sedeFactory.js"></script>




        <!-- Bootstrap-->
        <script type="text/javascript" src="resources/js/bootstrap.min.js"></script>

        <!--css-->
        <link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css" media="screen"/>


        <title>JSP Page</title>
        </head>
        <body>

        <h3>Test ng-view</h3>

        <div>
            <div data-ng-view="">

            </div>
        </div>

        </body>
        </html>
