
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>添加书籍</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="js/jquery.validate.min.js"></script>
    <script type="text/javascript" src="js/messages_cn.js"></script>

</head>
<body>
<div class="container" style="max-width: 400px">
    <h2>添加书籍</h2>
    <form action="AddBookServlet" method="post" id="bookForm">
        <div class="form-group">
            <label for="name">图书名称</label>
            <input type="text" name="name" id="name" class="form-control" placeholder="请输入书籍名称"/>
        </div>
        <div class="form-group">
            <label for="name">图书作者</label>
            <input type="text" name="author" id="author" class="form-control" placeholder="请输入作者"/>
        </div>
        <div class="form-group">
            <label for="name">购买日期</label>
            <input type="date" name="time" id="time"  class="form-control" placeholder="请输入购买日期"/>
        </div>
        <div class="form-group">
            <label for="name">图书类别</label>
            <select name="type" id="type" class="form-control">
                <option value="0">--请选择--</option>
                <option value="1">计算机</option>
                <option value="2">小说</option>
                <option value="3">杂项</option>
            </select>
        </div>
        <div style="text-align: center;">
            <input type="submit" value="增加图书" class="btn btn-success"/>
        </div>
    </form>
</div>
</body>
<script type="text/javascript">

    /* $(function(){
        $("#bookForm").validate({
            rules:{
                name:"required",
                author:"required",
                time:{
                    date:true,
                },
                type:"required"
            },
            messages:{
                name:alert("书籍名称不能为空"),
                author:alert("作者名不能为空"),
                time:alert("日期格式不正确"),
                type:alert("请选择书籍类型")
            }
        });
    });*/
</script>
</html>
