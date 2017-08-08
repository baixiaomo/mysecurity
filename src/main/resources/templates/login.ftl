<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<span>login</span>
<form action="${springMacroRequestContext.contextPath}/hello">
    NAME:<input type="text" name="username"><br>
    PASS:<input type="password" name="password">
    <input type="submit" value="submint">
</form>
</body>
</html>