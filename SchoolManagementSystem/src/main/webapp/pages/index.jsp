<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title> School Admin Dashboard </title>
    <!-- Favicon icon -->
    <link rel="icon" type="image/png" sizes="16x16" href="./images/favicon.png">
    <link href="vendor/pg-calendar/css/pignose.calendar.min.css" rel="stylesheet">
    <link href="vendor/chartist/css/chartist.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
<style>
h3
{
font-family: "Times New Roman", Times, serif;
font color: white;
}
</style>
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
            <a href="" class="brand-logo">
                <img class="logo-abbr" src="./images/logo.jpg" alt="">
                <h3>Creative Minds</h3>
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
                           
                               
                            </li>
                            <li class="nav-item dropdown header-profile">
                                
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
                    <li><a class="has-arrow" href="/" >
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
                            <h4>Dashboard</h4>
                            
                        </div>
                    </div>
                    <div class="col-sm-6 p-md-0 justify-content-sm-end mt-2 mt-sm-0 d-flex">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="javascript:void(0)">Layout</a></li>
                            <li class="breadcrumb-item active"><a href="javascript:void(0)">Blank</a></li>
                        </ol>
                    </div>
                </div>

                <div class="row">
                    <div class="col-sm-4">
                        <div class="card">
                            <div class="stat-widget-one card-body">
                                <div class="stat-icon d-inline-block">
                                    <i class="ti-user text-primary border-primary"></i>
                                </div>
                                <div class="stat-content d-inline-block">
                                    <div class="stat-text">Board Master</div>
                                    <div class="stat-digit">${boardNumber}</div>
                                    <div> <a href="boardMaster" class="btn btn-info btn-lg">Goto Board list</a></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-4">
                        <div class="card">
                            <div class="stat-widget-one card-body">
                                <div class="stat-icon d-inline-block">
                                    <i class="ti-user text-primary border-primary"></i>
                                </div>
                                <div class="stat-content d-inline-block">
                                    <div class="stat-text">Batch Master</div>
                                    <div class="stat-digit">${batchNumber}</div>
                                    <div> <a href="addBatch" class="btn btn-info btn-lg">Goto Batch list</a></div>
                                </div>
                            </div>
                        </div>
                    </div>
                     <div class="col-sm-4">
                        <div class="card">
                            <div class="stat-widget-one card-body">
                                <div class="stat-icon d-inline-block">
                                    <i class="ti-user text-primary border-primary"></i>
                                </div>
                                <div class="stat-content d-inline-block">
                                    <div class="stat-text">Class Master</div>
                                    <div class="stat-digit">${classNumber}</div>
                                    <div> <a href="addClass" class="btn btn-info btn-lg">Goto Class list</a></div>
                                </div>
                            </div>
                        </div>
                    </div> <div class="col-sm-4">
                        <div class="card">
                            <div class="stat-widget-one card-body">
                                <div class="stat-icon d-inline-block">
                                    <i class="ti-user text-primary border-primary"></i>
                                </div>
                                <div class="stat-content d-inline-block">
                                    <div class="stat-text">Subject Master</div>
                                    <div class="stat-digit">${subjectNumber}</div>
                                    <div> <a href="addSubject" class="btn btn-info btn-lg">Goto Subject list</a></div>
                                </div>
                            </div>
                        </div>
                    </div> <div class="col-sm-4">
                        <div class="card">
                            <div class="stat-widget-one card-body">
                                <div class="stat-icon d-inline-block">
                                    <i class="ti-user text-primary border-primary"></i>
                                </div>
                                <div class="stat-content d-inline-block">
                                    <div class="stat-text">Teacher</div>
                                    <div class="stat-digit">${teacherNumber}</div>
                                    <div> <a href="teacherInfo" class="btn btn-info btn-lg">Goto Teacher list</a></div>
                                </div>
                            </div>
                        </div>
                    </div>
                     <div class="col-sm-4">
                        <div class="card">
                            <div class="stat-widget-one card-body">
                                <div class="stat-icon d-inline-block">
                                    <i class="ti-user text-primary border-primary"></i>
                                </div>
                                <div class="stat-content d-inline-block">
                                    <div class="stat-text">Student</div>
                                    <div class="stat-digit">${studentNumber}</div>
                                    <div> <a href="studentInfo" class="btn btn-info btn-lg">Goto Student list</a></div>
                                </div>
                            </div>
                        </div>
    			  </div>
    			   <div class="col-sm-4">
                        <div class="card">
                            <div class="stat-widget-one card-body">
                                <div class="stat-icon d-inline-block">
                                    <i class="ti-user text-primary border-primary"></i>
                                </div>
                                <div class="stat-content d-inline-block">
                                    <div class="stat-text">Video</div>
                                    <div class="stat-digit">${videoNumber}</div>
                                    <div> <a href="boardMaster" class="btn btn-info btn-lg">Goto Video list</a></div>
                                </div>
                            </div>
                        </div>
                    </div>
                     <div class="col-sm-4">
                        <div class="card">
                            <div class="stat-widget-one card-body">
                                <div class="stat-icon d-inline-block">
                                    <i class="ti-user text-primary border-primary"></i>
                                </div>
                                <div class="stat-content d-inline-block">
                                    <div class="stat-text">Homework</div>
                                    <div class="stat-digit">${homeworkNumber}</div>
                                    <div> <a href="addBatch" class="btn btn-info btn-lg">Goto Homework list</a></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    
                               
</div>
</div>
                   


        <!--**********************************
            Footer start
        ***********************************-->
        <div class="footer">
            <div class="copyright">
                <p>Copyright © Designed &amp; Developed by <a href="#" target="_blank">Sunanada K</a> 2024</p>
                <p>Distributed by <a href="https://scodetechnologies.in/" target="_blank">Scode Technology</a></p>
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

    <script src="./vendor/chartist/js/chartist.min.js"></script>

    <script src="./vendor/moment/moment.min.js"></script>
    <script src="./vendor/pg-calendar/js/pignose.calendar.min.js"></script>


    <script src="./js/dashboard/dashboard-2.js"></script>
    <!-- Circle progress -->

</body>

</html>