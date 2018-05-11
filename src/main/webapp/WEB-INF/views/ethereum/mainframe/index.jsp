<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Mainframe</title>

    <!-- Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <%--<nav class="container">
        <ul class="nav nav-pills">
            <li><span>0.144总数:</span><span class="lotteryNum">${lotteryNum}</span></li>
            <li></li>
            <li></li>
        </ul>
    </nav>
--%>
    <div class="container">
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>排名</th>
                    <th>总额</th>
                    <th>次数</th>
                    <th>地址</th>
                </tr>
            </thead>
            <tbody id="data">
            </tbody>
        </table>
    </div>
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <script type="text/javascript">

        $(function () {
            getList();
        });
        var list = "";
        function getList(){
            $.getJSON("/ethereum/mainframe/top600",{},function ( data ) {
                $("#data")
                for( var i=0 ; i < data.length ; i++){
                    var transactions = data[i].transactions;
                    $("#data").append(
                        '<tr>'+
                        '<td>'+(i+1)+'</td>'+
                        '<td>'+data[i].totalValues+'</td>'+
                        '<td>'+transactions.length+'</td>'+
                        '<td>'+data[i].address+'</td>'+
                        '</tr>'
                    );
                }
            });
        }

    </script>
</body>

</html>





















