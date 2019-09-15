### 1.什么是 URL？
    URL也被称为网址。英文全称 Uniform Resource Locator，中文译为“统一资源定位符”。
    URL可以由单词组成，比如 “mafengshe.com”，或者是IP地址：192.168.1.1
    遵守以下的语法规则：
    scheme://host:port/path/filename
    其中:
+ scheme - 定义因特网服务的类型。最常见的类型是 http
+ host - 定义域主机名
+ port - 定义主机上的端口号（http 的默认端口号是 80）
+ path - 定义服务器上的路径（如果省略，则文档必须位于网站的根目录中）。
+ filename - 定义文档/资源的名称
---
### 2.URL 有哪些常见的 Schemes？他们各是什么含义？
Scheme|协议名|含义
--|:--:|--:
http|超文本传输协议|http://开头的普通网页，不加密
https|安全超文本传输协议|安全网页，加密所有信息交换
ftp|文件传输协议|用于将文件下载或者上传到网站
file||本地计算机上的文件
---
### 3.URL 有哪些约束？
#### URL 编码会将字符转换为可通过因特网传输的格式。
+ URL 只能使用 ASCII 字符集来通过因特网进行发送。
+ 由于 URL 常常会包含 ASCII 集合之外的字符，URL 必须转换为有效的 ASCII 格式。
+ URL 编码使用 "%" 其后跟随两位的十六进制数来替换非 ASCII 字符。
+ URL 不能包含空格。URL 编码通常使用 + 来替换空格。
---
### 4.请将以下 URL 转换成合法的 URL

baidu.com/s?wd=码蜂社 前端

更正后：
baidu.com/s?wd=码蜂社+前端
这里的+在URL中替换为空格
---
### 5.请提取以下 URL 的 scheme，host，port，path，filename

https://www.mafengshe.com/course/fe-senior/ad
http://127.0.0.1:3000/course/fe-senior/ad

Scheme|host|port|path|filename
--|:--|:--|:--|:--:
https|www.mafengshe.com|80|/course/fe-senior|ad
http|127.0.0.1|3000|/course/fe-senior|ad
---