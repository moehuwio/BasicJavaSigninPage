
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>Read!</title>
  </head>

  <body>
  <br>
  <br>
  <form action="Login" method="post">

    <div>
      Enter uname <input type="text" name="uname">
    </div>

    <div>
      Enter Password <input type="password" name="pass">
    </div>

    <input type="submit" value="login"/>
    <div>
      <a href="./Signup.jsp"> Dont have an account? register. </a>
    </div>
  </form>
  </body>
</html>
