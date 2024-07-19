
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="components/header.jsp"%>
<%@ include file="components/bodyfirstpart.jsp"%>

<h1>Add Dentist</h1>
<p>This is a Test!!</p>

<form class="user">
                                <div class="form-group col">
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="identification"
                                            placeholder="Identification">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="firstName"
                                            placeholder="First Name">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="lastName"
                                            placeholder="Last Name">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="phone"
                                            placeholder="Phone">
                                    </div>
                                     <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="address"
                                            placeholder="Address">
                                    </div>
                                     <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="dob"
                                            placeholder="Date of Birth">
                                    </div>
                                     <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="speciality"
                                            placeholder="Speciality">
                                    </div>
<!--                                    here is going to be everyting respecting users and schedules.-->
                                </div>
                               
                                <a href="#" class="btn btn-primary btn-user btn-block">
                                    Add Dentist
                                </a>
                            </form>


<%@ include file="components/bodyfinalpart.jsp"%>

