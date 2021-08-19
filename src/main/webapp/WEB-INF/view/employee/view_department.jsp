<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%> 
	<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
	<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		    
<!DOCTYPE html>
<html>
<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Pôle</title>

  <!-- Custom fonts for this template -->
  <link href="../static/admin/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="../static/admin/css/sb-admin-2.min.css" rel="stylesheet">

  <!-- Custom styles for this page -->
  <link href="../static/admin/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">

</head>

<body id="page-top">

  <!-- Page Wrapper -->
  <div id="wrapper">

    <!-- Sidebar -->
    <ul class="navbar-nav  sidebar sidebar-dark accordion" id="accordionSidebar" style="background-color:#628B18;">

      <!-- Sidebar - Brand -->
      <a class="sidebar-brand d-flex align-items-center justify-content-center">
        <div class="sidebar-brand-icon ">
           <i class="fas fa-user-shield"></i>
        </div>
        <div class="sidebar-brand-text mx-1"> Administrateur </div>
      </a>

      <!-- Divider -->
      <hr class="sidebar-divider my-0">

      <!-- Nav Item - Dashboard -->

            
            
                  <!-- Divider -->
                  <hr class="sidebar-divider d-none d-md-block">            




      <!-- Sidebar Toggler (Sidebar) -->
      <div class="text-center d-none d-md-inline">
        <button class="rounded-circle border-0" id="sidebarToggle"></button>
      </div>

    </ul>
    <!-- End of Sidebar -->

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

      <!-- Main Content -->
      <div id="content" style="background-image:url(../static/admin/img/cdg3.jpg); background-size : cover ;">

        <!-- Topbar -->
          <nav class="navbar navbar-expand navbar-light bg-transparent topbar mb-4 static-top shadow">

          <!-- Sidebar Toggle (Topbar) -->
          <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
            <i class="fa fa-bars"></i>
          </button>

        
          <!-- Topbar Navbar -->
          <ul class="navbar-nav ml-auto">

            <!-- Nav Item - Search Dropdown (Visible Only XS) -->
            <li class="nav-item dropdown no-arrow d-sm-none">
              <a class="nav-link dropdown-toggle" href="#" id="searchDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <i class="fas fa-search fa-fw"></i>
              </a>
              <!-- Dropdown - Messages -->
              <div class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in" aria-labelledby="searchDropdown">
                <form class="form-inline mr-auto w-100 navbar-search">
                  <div class="input-group">
                    <input type="text" class="form-control bg-light border-0 small" placeholder="Search for..." aria-label="Search" aria-describedby="basic-addon2">
                    <div class="input-group-append">
                      <button class="btn btn-primary" type="button">
                        <i class="fas fa-search fa-sm"></i>
                      </button>
                    </div>
                  </div>
                </form>
              </div>
            </li>

            <!-- Nav Item - Alerts -->
            <li class="nav-item dropdown no-arrow mx-1">
 
           
            <div class="topbar-divider d-none d-sm-block"></div>

            <!-- Nav Item - User Information -->
            <li class="nav-item dropdown no-arrow">
              <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <span class="mr-2 d-none d-lg-inline text-white-600 small">
                	<security:authorize access="isAuthenticated()">
					    <security:authentication property="name" />
					</security:authorize>
                </span>
                <img class="img-profile rounded-circle" src="../static/admin/img/cdg3.jpg">
              </a>
              <!-- Dropdown - User Information -->
              <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="userDropdown">
                <a class="dropdown-item" href="#">
                  <i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>
                  Profile
                </a>
                <form action="logout" method="post">
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="/logout">
                  <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                  Se déconnecter
                </a>
                </form>
              </div>
            </li>

          </ul>

        </nav>
        <!-- End of Topbar -->

        <!-- Begin Page Content -->
        <div class="container-fluid">

          <!-- Page Heading -->
          <h1 class="h3 mb-2 text-gray-800" id="department_update_text">Détails du département</h1>
          <br>

          <form class="was-validated" action="department" method="POST">
               
            
            <div class="form-row">
              <div class="col-md-6 mb-3">
                <label for="validationTooltip01">Nom du département</label>
                <input type="text" class="form-control" id="departmentName" name="departmentName" value="${department.departmentName}" readonly="readonly" required>
          
                <div class="invalid-tooltip">
                  Veuillez entrer le nom du département.
                </div>
                <div class="valid-tooltip">
                  Bien!
                </div>
              </div>

              
              <div class="col-md-6 mb-3">
                <label for="validationTooltip02">Téléphone</label>
                <input type="text" class="form-control" id="department_phoneNo" name="dphoneNo" value="${department.dphoneNo}" readonly="readonly" required>
                <div class="invalid-tooltip">
                  Veuillez entrer le numéro de téléphone du département.
                </div>
                <div class="valid-tooltip">
                  Bien!
                </div>
              </div>
     
            </div>
            <div class="form-row">

              <div class="col-md-12 mb-3 mt-4">
                <label for="validationTooltipUsername">Email</label>
                <div class="input-group">
                  <div class="input-group-prepend">
                    <span class="input-group-text" id="validationTooltipUsernamePrepend">@</span>
                  </div>
                  <input type="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" class="form-control" id="department_email" name="departmentEmail" value="${department.departmentEmail}" aria-describedby="validationTooltipUsernamePrepend" readonly="readonly" required>
                  <div class="invalid-tooltip">
                    Veuillez entrer l'email du département.
                  </div>
                  <div class="valid-tooltip">
                    Bien!
                  </div>
                </div>
              </div>

             

            </div>

            <div class="form-row">
              <div class="col-md-12 mb-3 mt-4">
                <label for="validationTooltip03">Adresse</label>
                <input type="text" class="form-control" id="department_address" name="department_address" value="${department.department_address}" readonly="readonly" required>
                <div class="invalid-tooltip">
                  Veuillez entrer l'adresse du département.
                </div>
                <div class="valid-tooltip">
                  Bien!
                </div>
              </div>
              

              
            </div>

            
			<button class="btn btn-secondary mt-4 mb-6" type="submit" id="department_cancel_edit" hidden="hidden">Enregistrer</button>
            <button class="btn btn-primary mt-4 mb-6" type="button" id="department_view_btn_text" onclick="editDepartment()">Modifier</button>
            
          </form>
                

        </div>
        <!-- /.container-fluid -->

      </div>
      <!-- End of Main Content -->


    </div>
    <!-- End of Content Wrapper -->

  </div>
  <!-- End of Page Wrapper -->

  <!-- Scroll to Top Button-->
  <a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
  </a>

  <!-- Logout Modal-->
 <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">Etes-vous sur de vouloir vous déconnecter?</h5>
          <button class="close" type="button" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">×</span>
          </button>
        </div>
        <div class="modal-body">cliquez sur "se déconnecter" pour fermer la session</div>
        <div class="modal-footer">
          <button class="btn btn-secondary" type="button" data-dismiss="modal">Annuler</button>
          <a class="btn btn-primary" href="login.html">Se déconnecter</a>
        </div>
      </div>
    </div>
  </div>

  <!-- Bootstrap core JavaScript-->
  <script src="../static/admin/vendor/jquery/jquery.min.js"></script>
  <script src="../static/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="../static/admin/vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="../static/admin/js/sb-admin-2.min.js"></script>

  <!-- Page level plugins -->
  <script src="../static/admin/vendor/datatables/jquery.dataTables.min.js"></script>
  <script src="../static/admin/vendor/datatables/dataTables.bootstrap4.min.js"></script>

  <!-- Page level custom scripts -->
  <script src="../static/admin/js/demo/datatables-demo.js"></script>

  <script src="../static/admin/js/employees_view.js"></script>

</body>
</html>