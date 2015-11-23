<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="styles/style.css">
    <title>JSP page</title>
</head>
<body>
    <img src ="image?imgID=<%=request.getAttribute("model")%>" width="115" border="0" ><br>
    <img src ="image?imgID=<%=request.getAttribute("model")%>" width="115" border="0" ></br>
    <img src ="image?imgID=<%=request.getAttribute("model")%>" width="115" border="0" >
</body>
</html>
