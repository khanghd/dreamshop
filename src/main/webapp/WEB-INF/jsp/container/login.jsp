<%-- 
    Document   : login
    Created on : Dec 21, 2017, 8:05:15 PM
    Author     : DuyKhang
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div id="content">
    <div class="bg-color">
        <div class="wrapper">
            <div class="container banner-info login-page">
                <div class="panel background-transparent-white">
                    <div class="panel-body">
                        <div class="row text-center logo-dec">
                            <div class="col-xs-12 col-sm-12 col-md-12">
                                <h1>Login</h1>
                            </div>
                        </div>
                        <div class="row">
                            <form class="login-form logo-dec" action="<c:url value='j_spring_security_check' />" method='POST'>
                                <div class="form-group">
                                    <label for="inputusername">Email</label>
                                    <input type="text" name="username" class="form-control" id="inputusername" 
                                           placeholder="username">
                                </div>
                                <div class="form-group">
                                    <label for="inputPassword">Password</label>
                                    <input type="password" name="password" class="form-control" id="inputPassword" placeholder="Password">
                                </div>
                                <div class="form-group text-center">
                                    <button type="submit" class="btn btn-default">Sign in</button>
                                </div> 
                                <input type="hidden" name="${_csrf.parameterName}"
                                       value="${_csrf.token}" />
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>