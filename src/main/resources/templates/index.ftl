<!doctype html>
<html xmlns="http://www.w3.org/1999/html">
<head>
<title>请登入</title>
</head>

<body>
<label>学生学籍管理系统</label>
<p>

</p>
<form action="/login" method="post">
    <div>
        <label>用户名</label>
        <input type="text" name="username" id="username">
    </div>
    <div>
        <label>密  码 </label>
        <input type="password" name="password" id="password">
    </div>
    <div>
        <button type="submit">登录</button>
        <button type="reset">取消</button>
    </div>
</form>
</body>
</html>