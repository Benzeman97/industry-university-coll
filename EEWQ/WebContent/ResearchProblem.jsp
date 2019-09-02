<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>Research Problem</title>

    <!-- Icons font CSS-->
    <link href="mdi-fontmaterial-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="select2.min.css" rel="stylesheet" media="all">
    <link href="daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="main.css" rel="stylesheet" media="all">
</head>

<body>
    <div class="page-wrapper bg-gra-03 p-t-45 p-b-50">
        <div class="wrapper wrapper--w790">
            <div class="card card-5">
                <div class="card-heading">
                    <h2 class="title">Research Problem Form</h2>
                </div>
                <div class="card-body">
                    <form method="POST" action="xyz2">
                        
                        <div class="form-row">
                            <div class="name">Company</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="text" name="txtCname">
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Email</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="email" name="txtMail">
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Title</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="text" name="txtTitle">
                                </div>
                            </div>
                        </div>
                         <div class="form-row">
                            <div class="name">Date</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="text" name="txtDate">
                                </div>
                            </div>
                        </div>
                       
                        <div class="form-row">
                            <div class="name">University</div>
                            <div class="value">
                                <div class="input-group">
                                    <div class="rs-select2 js-select-simple select--no-search">
                                        <select name="txtSubject">
                                            <option disabled="disabled" selected="selected">Choose option</option>
                                            <option>NSBM Grenn University</option>
                                            <option>Plymouth University</option>
                                            <option>IIT Madras</option>
                                             <option>All</option>
                                        </select>
                                        <div class="select-dropdown"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Problem</div>
                            <div class="value">
                                <div class="input-group">
                                    <textarea class="input--style-5"  name="txtProblem" rows="4" cols="49"></textarea>
                                </div>
                            </div>
                        </div>
                        <div class="form-row p-t-20">
                            <label class="label label--block">Are you an existing company?</label>
                            <div class="p-t-15">
                                <label class="radio-container m-r-55">Yes
                                    <input type="radio" checked="checked" name="exist">
                                    <span class="checkmark"></span>
                                </label>
                                <label class="radio-container">No
                                    <input type="radio" name="exist">
                                    <span class="checkmark"></span>
                                </label>
                            </div>
                        </div>
                        <div>
                            <button class="btn btn--radius-2 btn--red" type="submit" name="btnSubmit">Submit</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <!-- Jquery JS-->
    <script src="jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="select2.min.js"></script>
    <script src="moment.min.js"></script>
    <script src="daterangepicker.js"></script>

    <!-- Main JS-->
    <script src="global.js"></script>

</body><!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>