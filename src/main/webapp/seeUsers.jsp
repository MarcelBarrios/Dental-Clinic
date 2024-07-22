
<%@page import="logic.User"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="components/header.jsp"%>
<%@ include file="components/bodyfirstpart.jsp"%>

    <!-- Begin Page Content -->
    <div class="container-fluid">

<!-- Page Heading -->
        <h1 class="h3 mb-2 text-gray-800">See Users</h1>
        <p class="mb-4">In this page you may visualize the complete users list</p>

        <!-- DataTales Example -->
        <div class="card shadow mb-4">
            <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">Users</h6>
            </div>
            <div class="card-body">
                <div class="table-responsive">
                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>User Name</th>
                                <th>Role</th>
                                <th style="width: 210px">Action</th>
                            </tr>
                        </thead>
                        <tfoot>
                            <tr>
                                <th>Id</th>
                                <th>User Name</th>
                                <th>Role</th>
                                <th style="width: 210px">Action</th>
                            </tr>
                        </tfoot>

                        <% 
                        List<User> usersList = (List) request.getSession().getAttribute("usersList");
                        %>

                        <tbody>
                            <% for (User usu : usersList) {%>
                            <tr>
                                <td id="id_user<%= usu.getId_user() %>"><%= usu.getId_user() %></td>
                                <td><%= usu.getUser_name()%></td>
                                <td><%= usu.getRole()%></td>
                                
                                <td style="display: flex; width: 230px">
                                    <form name="eliminate" action="SvElimUsers" method="POST">
                                        <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color:red; margin-right: 5px;">
                                            <i class="fas fa-trash-alt"></i> Eliminate
                                        </button>
                                        <input type="hidden" name="id" value="<%= usu.getId_user()%>">
                                    </form>
                                    <form name="edit" action="SvEditUsers" method="GET">
                                        <button type="submit" class="btn btn-primary btn-user btn-block" style="margin-left: 5px;">
                                            <i class="fas fa-pencil-alt"></i> Edit
                                        </button>
                                        <input type="hidden" name="id" value="<%= usu.getId_user() %>">
                                    </form>
                                </td>
                            </tr>
                            <% } %>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

    </div>
    <!-- /.container-fluid -->

<%@ include file="components/bodyfinalpart.jsp"%>