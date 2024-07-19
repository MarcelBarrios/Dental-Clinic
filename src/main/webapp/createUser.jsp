
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="components/header.jsp"%>
<%@ include file="components/bodyfirstpart.jsp"%>

<h1>Add User</h1>
<p>This is the page to add user to the system.</p>

<form class="user" action="SvUsers" method="Post">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="userName" name="userName"
                placeholder="User Name">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" id="password" name="password"
                placeholder="Password">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="role" name="role"
                placeholder="Role">
        </div>
    </div>

    <button class="btn btn-primary btn-user btn-block" type="submit">
        Add User
    </button>
</form>


<%@ include file="components/bodyfinalpart.jsp"%>