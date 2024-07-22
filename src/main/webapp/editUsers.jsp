
<%@page import="logic.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="components/header.jsp"%>
<%@ include file="components/bodyfirstpart.jsp"%>

<h1>Users Edition</h1>
<p>This is the page to modify an user in the system.</p>

<% User use = (User) request.getSession().getAttribute("useEdit"); %>

<form class="user" action="SvEditUsers" method="Post">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="userName" name="userName"
                placeholder="User Name" value="<%= use.getUser_name() %>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" id="password" name="password"
                placeholder="Password" value="<%= use.getPassword() %>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="role" name="role"
                placeholder="Role" value="<%= use.getRole() %>">
        </div>
    </div>

    <button class="btn btn-primary btn-user btn-block" type="submit">
        Update
    </button>
</form>


<%@ include file="components/bodyfinalpart.jsp"%>