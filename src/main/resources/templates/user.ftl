<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录成功</title>
</head>
<body>
<label>欢迎登录学生信息管理中心</label>
<p></p>
<div>
    <label>${student.sname?if_exists}同学的个人信息</label>
        <p>生日 : ${student.sbirth?if_exists}</p>
        <p></p>
        <p>性别 : ${student.ssex?if_exists}</p>
        <p></p>
        <p>地址 : ${student.saddress?if_exists}</p>
        <p></p>
    <p>年级 : ${student.syear?if_exists}</p>
        <p></p>
    <p>学院 : ${student.sacademy?if_exists}</p>
        <p></p>
    <p>系   : ${student.sdepartment?if_exists}</p>
        <p></p>
    <p>专业 : ${student.smajor?if_exists}</p>
        <p></p>
    <p>班级 : ${student.classno?if_exists}</p>
</div>
<div>
    <form action="/Info" method="post">
        <input hidden id="sno" value="${student.sno}" name="sno">
        <input hidden id="username" value="${user.userName}" name="username">
        <button type="submit">修改学生信息</button>
    </form>
</div>
<div>
    <p>学生成绩</p>
    <table>
        <tr>
            <th>课程号</th>
            <th>课程名</th>
            <th>学生成绩</th>
        </tr>
        <#list scores as score>
            <tr>
                <td>${score.cno?if_exists}</td>
                <td>${score.cname?if_exists}</td>
                <td>${score.score?if_exists}</td>
            </tr>
        </#list>
    </table>
</div>
<div>
    <form action="/" method="get">
    <button type="submit">退出</button>
    </form>
</div>
</body>
</html>