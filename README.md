#  Translate

#### 介绍
通过JavaSwing开发的中英翻译训练系统

#### 软件架构
软件架构说明


#### 安装教程
安装文档：https://www.aliyundrive.com/s/YUajDqNqp9S



#### 数据库定义
数据库名称为：vocabulary




```
数据表			表名				字段
三级词汇表		three			English	    Chinese
重要词汇表		imporant		English	    Chinese
专业词汇表		professional	        English	    Chinese
Java词汇表		java			English     Chinese
MySQL词汇表		mysql			English	    Chinese
Git词汇表		git			English	    Chinese
Html词汇表		html			English     Chinese
用户数据表		information		user	    account    password	
用户词汇表		user 			user	    English    Chinese

```


其中的information的user字段与
user表中的user字段一致都为用户名

数据库关系文档：https://www.aliyundrive.com/s/xDxGFZWcBUm

#### 代码规范

1、Java 代码的存放规定：
运行界面代码与功能的代码放入至 Interface

数据库交互的代码放入至 JDBC文件夹中

全局变量与方法放入至Global包中
其对应内容分别存入至：Global_date与Global_library类中

2、Java 类的存放规范：
每一个类对应一个界面，如有多个界面或是功能则建立对应文件夹
在文件夹中 存放其中的功能类。

3、Java 代码的命名规定：
项目名称、类名、函数、变量名皆为英文，其中 常量为大写
其中类名需要在前面写出对应包名 且首字母需大写
相关的变量注释都在对应代码块中。
图片展示文档：https://www.aliyundrive.com/s/xDxGFZWcBUm

