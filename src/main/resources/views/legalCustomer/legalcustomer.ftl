<!DOCTYPE html>
<html>
<head>
	<title>客户管理</title>
	<#include "../common.ftl">
</head>
<body class="childrenBody">

<form class="layui-form" >
	<blockquote class="layui-elem-quote quoteBox">
		<form class="layui-form">
			<div class="layui-inline">
				<div class="layui-input-inline">
					<input type="text" name="name"
						   class="layui-input
					searchVal" placeholder="客户名" />
				</div>
				<div class="layui-input-inline">
					<input type="text" name="customer_id" class="layui-input
					searchVal" placeholder="客户编号" />
				</div>
				<div class="layui-input-inline">
                    <select name="level"  id="level">
						<option value="">请选择...</option>
						<option value="供应商">供应商</option>
						<option value="担保客户">担保客户</option>
						<option value="承租人">承租人</option>
						<option value="合作伙伴">合作伙伴</option>
						<option value="保险公司">保险公司</option>
                    </select>
				</div>
				<a class="layui-btn search_btn" data-type="reload"><i
							class="layui-icon">&#xe615;</i> 搜索</a>
			</div>
		</form>
	</blockquote>
	<table id="customerList" class="layui-table"  lay-filter="customers"></table>


	<script type="text/html" id="toolbarDemo">
		<div class="layui-btn-container">
			<a class="layui-btn layui-btn-normal addNews_btn" lay-event="add">
				<i class="layui-icon">&#xe608;</i>
				添加
			</a>
			<a class="layui-btn layui-btn-normal  " lay-event="link">
				<i class="layui-icon">&#xe608;</i>
				联系人管理
			</a>
		</div>
	</script>
	<!--操作-->
	<script id="customerListBar" type="text/html">
		<a class="layui-btn layui-btn-xs" id="edit" lay-event="edit">编辑</a>
		<a class="layui-btn layui-btn-xs layui-btn-danger" lay-event="del">删除</a>
	</script>


</form>
<script type="text/javascript" src="${ctx}/js/legalcustomer/legalcustomer.js"></script>

</body>
</html>