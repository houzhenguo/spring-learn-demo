<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/29
  Time: 0:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h3>入门程序</h3>

    <a href="hello/hello?username=houzhenguo">入门程序hou</a>

        <form action="user/saveAccount" method="post">
            姓名：<input type="text" name="username" /><br/>
            id：<input type="text" name="id" /><br/>
            金额：<input type="text" name="money" /><br/>
            <input type="submit" value="提交" />
        </form>

                <form action="user/saveAccount1" method="post">
                    姓名1：<input type="text" name="name" /><br/>
                    id1：<input type="text" name="id" /><br/>
                    金额1：<input type="text" name="money" /><br/>
                    usersex：<input type="text" name="user.sex" /><br/>


                    用户姓名list：<input type="text" name="list[0].name" /><br/>
                    用户性别list：<input type="text" name="list[0].sex" /><br/>
                    用户姓名map：<input type="text" name="map['one'].name" /><br/>
                            用户性别：<input type="text" name="map['one'].sex" /><br/>
                用户性别：<input type="text" name="birth" /><br/>
                    <input type="submit" value="提交" />
                </form>

                  <a href="hello/test?username=houzhenguo">servlet 原生</a>

                  <a href="role/findAll">测试查询</a>

                      <h3>测试保存</h3>

                      <form action="role/saveRole" method="post">
                          姓名：<input type="text" name="name" /><br/>
                          金额：<input type="text" name="money" /><br/>
                          <input type="submit" value="保存"/><br/>
                      </form>

</body>
</html>
