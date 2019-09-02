<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Sign Up Form by Colorlib</title>

    <!-- Font Icon -->
    <link rel="stylesheet" href="material-design-iconic-font.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="style.css">
</head>
<body>

    <div class="main">
        <div class="container">
            <div class="signup-content">
                <div class="signup-img">
                    <img src="signup-img.jpg" alt="">
                </div>
                <div class="signup-form">
                    <form  action="xyz8" method="POST" class="register-form" id="register-form">
                        <h2>student idea form</h2>
                        <div class="form-row">
                           
                        </div>
                        <div class="form-group">
                            <label for="address">Student Name :</label>
                            <input type="text" name="txtName" id="txtName" required/>
                        </div>
                        <div class="form-radio">
                            <label for="gender" class="radio-label">Gender :</label>
                            <div class="form-radio-item">
                                <input type="radio" name="txtGender" value="male" checked>
                                <label for="male">Male</label>
                                <span class="check"></span>
                            </div>
                            <div class="form-radio-item">
                                <input type="radio" name="txtGender" value="female">
                                <label for="female">Female</label>
                                <span class="check"></span>
                            </div>
                        </div>
                        <div class="form-row">
                            
                            
                            <div class="form-group">
                                <label for="city">University :</label>
                                <div class="form-select">
                                    <select name="txtUniversity" id="txtUniversity">
                                        <option value=""></option>
                                        <option value="NSBM">NSBM Green University</option>
                                        <option value="IIT">IIT Madras</option>
                                    </select>
                                    <span class="select-icon"><i class="zmdi zmdi-chevron-down"></i></span>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="birth_date">Date :</label>
                            <input type="text" name="txtDate" id="txtDate">
                        </div>
                    
                        <div class="form-group">
                            <label for="course">Course :</label>
                            <div class="form-select">
                                <select name="txtCourse" id="txtCourse">
                                    <option value=""></option>
                                    <option value="computer">Computer Science</option>
                                    <option value="desiger">MIS</option>
                                    <option value="marketing">Software Engineering</option>
                                </select>
                                <span class="select-icon"><i class="zmdi zmdi-chevron-down"></i></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="email">Email ID :</label>
                            <input type="email" name="txtMail" id="txtMail" />
                        </div>
                        <div class="form-group">
                            <label for="email">idea :</label>
                            <textarea name="txtIdea" id="txtIdea" rows="8" cols="71"></textarea>
                        </div>
                        <div class="form-submit">
                            <input type="submit" value="Reset All" class="submit" name="btnReset" id="reset" />
                            <input type="submit" value="Submit Form" class="submit" name="btnSubmit" id="submit" />
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </div>

    <!-- JS -->
    <script src="jquery.min.js"></script>
    <script src="main.js"></script>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>