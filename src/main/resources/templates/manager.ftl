<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>管理员界面</title>
</head>
<body>
<p>欢迎管理员, ${user.userName}</p>
<div>
    <p>查看所有学生信息
    </p>
    <table>
        <tr>
            <th>学号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>地址</th>
            <th>年级</th>
            <th>学院</th>
            <th>系别</th>
            <th>专业</th>
            <th>班级</th>
            <th>删除</th>
        </tr>
        <#list students as stu>
            <tr>
                <td>${stu.sno?if_exists}</td>
                <td>${stu.sname?if_exists}</td>
                <td>${stu.ssex?if_exists}</td>
                <td>${stu.saddress?if_exists}</td>
                <td>${stu.syear?if_exists}</td>
                <td>${stu.sacademy?if_exists}</td>
                <td>${stu.sdepartment?if_exists}</td>
                <td>${stu.smajor?if_exists}</td>
                <td>${stu.classno?if_exists}</td>
                <td><form action="/deleteStudent" method="post">
                        <input id="username" name="username" hidden value="${user.userName}">
                        <input id="sno" name="sno" value="${stu.sno}"hidden>
                        <button type="submit">删除</button>
                    </form>
                </td>
            </tr>
        </#list>
    </table>
</div>
<p></p>
<div>
    <label>新增学生信息</label>
    <form action="/saveStudent" method="post">
        <input type="hidden" value="${user.userName}" id="username" name="username">
        <input type="text" name="sno" id="sno" placeholder="学号(必填信息">
        <input type="text" name="sname" id="sname" placeholder="姓名(必填信息)">
        <input type="text" name="ssex" id="ssex" placeholder="性别">
        <input type="text" name="sbirth" id="sbirth" placeholder="生日">
        <input type="text" name="saddress" id="saddress" placeholder="地址">
        <input type="text" name="syear" id="syear" placeholder="年级">
        <input type="text" id="sacademy" name="sacademy" placeholder="学院">
        <input type="text" name="sdepartment" id="sdepartment" placeholder="系别">
        <input type="text" id="smajor" name="smajor" placeholder="专业">
        <input type="text" id="classno" name="classno" placeholder="班级">
        <button type="submit">新增校友</button>
    </form>
</div>
<p></p>
<div>
    <label>根据学号搜索学生信息</label>
    <form action="/Info" method="post">
        <input type="text" id="sno" name="sno" placeholder="学号">
        <input type="text" id="username" name="username" hidden value="${user.userName}">
        <button type="submit">查找</button>
    </form>
</div>
<div>
    <form action="/" method="get">
        <button type="submit">退出</button>
    </form>
</div>
</body>
</html>