<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>Focus - Bootstrap Admin Dashboard </title>
    <!-- Favicon icon -->
    <link rel="icon" type="image/png" sizes="16x16" href="./images/favicon.png">
    <link href="./vendor/pg-calendar/css/pignose.calendar.min.css" rel="stylesheet">
    <link href="./vendor/pg-calendar/css/pignose.calendar.min.css" rel="stylesheet">
    <link href="./vendor/chartist/css/chartist.min.css" rel="stylesheet">
    <link href="./css/style.css" rel="stylesheet">

</head>

<body>

    <!--*******************
        Preloader start
    ********************-->
    <div id="preloader">
        <div class="sk-three-bounce">
            <div class="sk-child sk-bounce1"></div>
            <div class="sk-child sk-bounce2"></div>
            <div class="sk-child sk-bounce3"></div>
        </div>
    </div>
    <!--*******************
        Preloader end
    ********************-->


    <!--**********************************
        Main wrapper start
    ***********************************-->
    <div id="main-wrapper">

        <!--**********************************
            Nav header start
        ***********************************-->
        <div class="nav-header">
            <a href="index.html" class="brand-logo">
                <img class="logo-abbr" src="./images/logo.jpg" alt="">
                <img class="logo-compact" src="./images/logo-text.png" alt="">
                <img class="brand-title" src="./images/logo-text.png" alt="">
            </a>

            <div class="nav-control">
                <div class="hamburger">
                    <span class="line"></span><span class="line"></span><span class="line"></span>
                </div>
            </div>
        </div>
        <!--**********************************
            Nav header end
        ***********************************-->

        <!--**********************************
            Header start
        ***********************************-->
        <div class="header">
            <div class="header-content">
                <nav class="navbar navbar-expand">
                    <div class="collapse navbar-collapse justify-content-between">
                        <div class="header-left">
                            <div class="search_bar dropdown">
                                <span class="search_icon p-3 c-pointer" data-toggle="dropdown">
                                    <i class="mdi mdi-magnify"></i>
                                </span>
                                <div class="dropdown-menu p-0 m-0">
                                    <form>
                                        <input class="form-control" type="search" placeholder="Search" aria-label="Search">
                                    </form>
                                </div>
                            </div>
                        </div>

                        <ul class="navbar-nav header-right">
                            <li class="nav-item dropdown notification_dropdown">
                                <a class="nav-link" href="#" role="button" data-toggle="dropdown">
                                    <i class="mdi mdi-bell"></i>
                                    <div class="pulse-css"></div>
                                </a>
                               
                            </li>
                            <li class="nav-item dropdown header-profile">
                                <a class="nav-link" href="#" role="button" data-toggle="dropdown">
                                    <i class="mdi mdi-account"></i>
                                </a>
                                <div class="dropdown-menu dropdown-menu-right">
                                    <a href="profile" class="dropdown-item">
                                        <i class="icon-user"></i>
                                        <span class="ml-2">Profile </span>
                                    </a>
                                   
                                    <a href="home" class="dropdown-item">
                                        <i class="icon-key"></i>
                                        <span class="ml-2">Logout </span>
                                    </a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </nav>
            </div>
        </div>
        <!--**********************************
            Header end ti-comment-alt
        ***********************************-->

        <!--**********************************
            Sidebar start
        ***********************************-->
        <div class="quixnav">
            <div class="quixnav-scroll">
                <ul class="metismenu" id="menu">
                    
                    <!-- <li><a href="index.html"><i class="icon icon-single-04"></i><span class="nav-text">Dashboard</span></a>
                    </li> -->
                    <li><a class="has-arrow" href="/" aria-expanded="false">
                        <i class="fa fa-tachometer" aria-hidden="true"></i>
                        <span class="nav-text">Dashboard</span></a>
                    
                    </li>
                   
                    <li><a class="has-arrow" href="javascript:void()" aria-expanded="false">
                        <i class="fa fa-list" aria-hidden="true"></i>
                        <span class="nav-text">Master</span></a>
                        <ul aria-expanded="false">
                            <li>
                                <a href="boardMaster">Board Master</a></li>
                            <li>
                                <a href="addBatch">Batch Master </a></li>
                            <li>
                                <a href="addClass">Class Master</a></li>
                            <li>
                                <a href="addSubject">Subject Master</a></li>
                           
                        </ul>
                    </li>
                  
                    <li><a class="has-arrow" href="javascript:void()" aria-expanded="false">
                        <i class="fa fa-pencil-square-o" aria-hidden="true"></i>
                        <span class="nav-text">Information</span></a>
                        <ul aria-expanded="false">
                            <li><a href="teacherInfo">Teacher</a></li>
                            <li><a href="studentInfo">Student</a></li>
                        </ul>
                    </li>

                    
                    <li><a class="has-arrow" href="javascript:void()" aria-expanded="false">
                        <i class="fa fa-upload" aria-hidden="true"></i>
                        <span class="nav-text">Uploads</span></a>
                        <ul aria-expanded="false">
                            <li><a href="videoInfo">Videos</a></li>
                            <li><a href="homeworkInfo">Homework</a></li>
                                </ul>
                            </li>
                            
                            
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
        <!--**********************************
            Sidebar end
        ***********************************-->

        <!--**********************************
            Content body start
        ***********************************-->
        <div class="content-body">
            <div class="container-fluid">
                <div class="row page-titles mx-0">
                    <div class="col-sm-6 p-md-0">
                        <div class="welcome-text">
                            <h2>Video </h2>
                            
                        </div>
                    </div>
                    <div class="col-sm-6 p-md-0 justify-content-sm-end mt-2 mt-sm-0 d-flex">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="javascript:void(0)">Uploads</a></li>
                            <li class="breadcrumb-item active"><a href="javascript:void(0)">Video</a></li>
                        </ol>
                    </div>
                </div>
                <!-- row -->
                <form action="video_form" method="post">
                <div class="row">
                    <div class="col-xl-12 col-xxl-12">
                        <div class="card">
                          <h4>New Video Info</h4>
                        
                                      
                                    
                                        <section>
                                        <div>
                                            <div class="row">
                                            <div class="col-lg-12 mb-4">
                                                    <div class="form-group">
                                                        <label class="text-label">Date</label>
                                                        <input type="date" name="video_date" class="form-control" placeholder="Date" required>
                                                    </div>
                                                </div>
                                                </div>
                                                                    
                                                   <div class="col-lg-12 mb-4">
                                                    <div class="form-group">
                                                          <label for="exampleFormControlSelect1">Board</label>
   														 <select class="form-control" name="board_name" id="exampleFormControlSelect1">
    															 <option>Select Board</option>
     															 <c:forEach var="e" items="${b1}"> 
     															<option>${e.board_name}</option>
															     </c:forEach>
															    </select>
                                                        </div>
                                                    </div>
                                              
                                              <div class="col-lg-12 mb-4">
                                                    <div class="form-group">
                                                          <label for="exampleFormControlSelect1">Class</label>
   														 <select class="form-control" name="class_name" id="exampleFormControlSelect1">
    															 <option>Select Class</option>
     															 <c:forEach var="e" items="${a1}"> 
     															<option>${e.class_name}</option>
															     </c:forEach>
															    </select>
                                                        </div>
                                                    </div>
                                              
                                              <div class="col-lg-12 mb-4">
                                                    <div class="form-group">
                                                          <label for="exampleFormControlSelect1">Batch</label>
   														 <select class="form-control" name="batch_name" id="exampleFormControlSelect1">
    															 <option>Select Batch</option>
     															<c:forEach var="e" items="${c1}"> 
     															<option>${e.batch_name}</option>
															     </c:forEach>
															    </select>
                                                        </div>
                                                    </div>
                                                    <div class="col-lg-12 mb-4">
                                                    <div class="form-group">
                                                          <label for="exampleFormControlSelect1">Subject</label>
   														 <select class="form-control" name="subject_name" id="exampleFormControlSelect1">
    															 <option>Select Subject</option>
     															 <c:forEach var="e" items="${d1}"> 
     															<option>${e.subject_name}</option>
															     </c:forEach>
															    </select>
                                                        </div>
                                                    </div>
                                              
                                              <div class="col-lg-12 mb-4">
                                                    <div class="form-group">
                                                          <label for="exampleFormControlSelect1">Teacher</label>
   														 <select class="form-control" name="teacher_fname" id="exampleFormControlSelect1">
    															 <option>Select Teacher</option>
     															<c:forEach var="e" items="${t1}"> 
     															<option>${e.teacher_fname}</option>
															     </c:forEach>
															    </select>
                                                        </div>
                                                    </div>
                                                      <div class="col-lg-12 mb-4">
                                                    <div class="form-group">
                                                        <label class="text-label">Chapter Name</label>
                                                        <input type="text" name="chapter_name" class="form-control" placeholder="Chapter Name" required>
                                                    </div>
                                                </div>
                                                </div>
                                                <div class="col-lg-12 mb-4">
                                                    <div class="form-group">
                                                        <label class="text-label">YouTube Link</label>
                                                        <div class="input-group">
                                                            <input type="url"  class="form-control" name="youtube_link"  placeholder="YouTube Link" required>

                                                        </div>
                                                    </div>
                                                    </div>
                                          <div>
                                                <input type="submit" value="Add" class="btn btn-primary pl-5 pr-5 mr-3 mb-4">
                                                    <a href="Videoform" class="btn btn-primary pl-5 pr-5 mr-3 mb-4">Reset</a>
                                                        <a href="videoInfo" class="btn btn-primary pl-5 pr-5 mr-3 mb-4">View VideoInfo</a>
                                                           
                                                            </div>
                                                            </div>
                                                            </div>

                                </form>
                              
                            </div>
                            
                        </div>
                       
                    </div>
                  
               
          
        <!--**********************************
            Content body end
        ***********************************-->


        <!--**********************************
            Footer start
        ***********************************-->
        <div class="footer">
            <div class="copyright">
                <p>Copyright � Designed &amp; Developed by <a href="#" target="_blank">Sunanda K</a> 2024</p>
            </div>
        </div>
        <!--**********************************
            Footer end
        ***********************************-->

        <!--**********************************
           Support ticket button start
        ***********************************-->

        <!--**********************************
           Support ticket button end
        ***********************************-->

        
    </div>
    <!--**********************************
        Main wrapper end
    ***********************************-->

    <!--**********************************
        Scripts
    ***********************************-->
    <!-- Required vendors -->
    <script src="./vendor/global/global.min.js"></script>
    <script src="./js/quixnav-init.js"></script>
    <script src="./js/custom.min.js"></script>
    


    <script src="./vendor/jquery-steps/build/jquery.steps.min.js"></script>
    <script src="./vendor/jquery-validation/jquery.validate.min.js"></script>
    <!-- Form validate init -->
    <script src="./js/plugins-init/jquery.validate-init.js"></script>



    <!-- Form step init -->
    <script src="./js/plugins-init/jquery-steps-init.js"></script>

</body>

</html>