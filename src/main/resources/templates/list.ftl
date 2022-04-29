<html>
<head>
    <meta charset="utf-8">
    <title>Freemarker入门小DEMO </title>
</head>
<body>
<input type="text" value="你好呀"/>
<input type="text" value="你好呀"/>
<input type="text" value="你好呀"/>
<input type="text" value="你好呀"/>
<input type="text" value="你好呀"/>
<#--我只是一个注释，我不会有任何输出  -->
<#list users?sort as item>
    <tr>
        <td>${item.name}</td>
        <td>${item.email}</td>
        <td>${item.doSomethine()}</td>
        <td>${users?size}</td>

    </tr>
</#list>
</body>
</html>