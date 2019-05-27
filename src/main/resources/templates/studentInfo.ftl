<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>修改学生信息主页</title>
</head>
<body>
<div>
    <form action="/update" method="post">
        <input value="${username}" hidden type="text" id="username" name="username">
        <p></p>
        <input type="text" value="${student.sno}" id="sno" name="sno" hidden>
        <p></p>
        <label>姓名</label>
        <input type="text" value="${student.sname}" id="sname" name="sname">
        <p></p>
        <label>性别</label>
        <input type="text" value="${student.ssex}" id="ssex" name="ssex">
        <p></p>
        <label>生日</label>
        <input type="text" value="${student.sbirth}" id="sbirth" name="sbirth">
        <p></p>
        <label>地址</label>
        <input type="text" value="${student.saddress?if_exists}" id="saddress" name="saddress">
        <p></p>
        <label>年级</label>
        <input type="text" value="${student.syear}" id="syear" name="syear">
        <p></p>
        <label>学院</label>
        <input type="text" value="${student.sacademy}" id="sacademy" name="sacademy">
        <p></p>
        <label>系别</label>
        <input type="text" value="${student.sdepartment}" id="sdepartment" name="sdepartment">
        <p></p>
        <label>专业</label>
        <input type="text" value="${student.smajor}" id="smajor" name="smajor">
        <p></p>
        <label>班级</label>
        <input type="text" value="${student.classno}" id="classno" name="classno">
        <p></p>
        <button type="submit">修改</button>
    </form>
</div>
<p></p>
<div>
    <form action="/getback" method="post">
        <input type="text" name="username" id="username" value="${username}" hidden>
        <button type="submit">返回管理界面</button>
    </form>
</div>
</body>
</html>