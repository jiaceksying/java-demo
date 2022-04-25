<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>FreeMarker 实验</title>
    </head>
    <body>
        <table style="border: blue 5px">
            <tr>
                <td>姓名</td>
<#--                <td>年龄</td>-->
<#--                <td>Email</td>-->
            </tr>
            <tr>
        <#list users as user>
            <tr>
                <td>${user.name}</td>
            </tr>
        </#list>
<#--                <td>${user.name}</td>-->
<#--                <td>${user.age}</td>-->
<#--                <td>${user.email}</td>-->
            </tr>
        </table>
    </body>
</html>