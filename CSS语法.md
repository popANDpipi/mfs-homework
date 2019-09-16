### 1.什么是 CSS？它有什么优势？
    CSS（Cascading Style Sheet，可译为“层叠样式表”或“级联样式表”）是一组格式设置规则，用于控制Web页面的外观。通过使用CSS样式设置页面的格式，可将页面的内容与表现形式分离。页面内容存放在HTML文档中，而用于定义表现形式的CSS规则则存放在另一个文件中或HTML文档的某一部分，通常为文件头部分。将内容与表现形式分离，不仅可使维护站点的外观更加容易，而且还可以使HTML文档代码更加简练，缩短浏览器的加载时间。
### 2.内部样式表和外部样式表各是如何声明和使用？
+ 外部样式表：
当样式需要应用于很多页面时，外部样式表将是理想的选择。在使用外部样式表的情况
你可以通过改变一个文件来改变整个站点的外观。每个页面使用 &lt;link> 标签链接到样式表，其书写格式为
`<link rel="stylesheet"type="text/css"href="xxx.css">`

+ 内部样式表：
当单个文档需要特殊的样式时，就应该使用内部样式表。你可以使用 &lt;style> 标签在文
档头部定义内部样式表，就像这样:
```
<head> 
<style type="text/css"> 
h1 {color: sienna;} 
body{background-color:black} 
</style> 
</head>
```
### 3.多层样式层叠是什么意思？
CSS层叠是指CSS样式在针对同一元素配置同一属性时，依据层叠规则（权重）来处理冲突，选择应用权重高的CSS选择器所指定的属性，一般也被描述为权重高的覆盖权重低的，因此也称作层叠。
如果外部样式，内部样式，内联样式同时应用于同一个元素，就是使用多重样式的情况。
### 4.什么是优先级？样式表的优先级排序是什么？
指的是样式的优先级，当产生冲突时以优先级高的为准。
1. 开发者样式>读者样式>浏览器样式（除非使用!important标记 ）
2. id选择符>（伪）类选择符>元素选择符
3. 权重相同时取后面定义的样式
### 5.请解释 CSS 如下概念
+ 选择器
+ 属性
+ 值
+ 声明
+ 声明块
##### 解释如下：
+ 选择器（Selector）: 选择需要应用样式的元素对象，具体用法参考选择器。
+ 属性（property）:CSS1、CSS2、CSS3规定了许多的属性，通过设置属性的值达到控制选择器的样式的目的。
+ 值（value）:指属性接受的设置值/关键字，一个属性的值要么是关键字、要么是一个关键字列表。如果一个属性可以取多个关键字，则多个关键字时大都以空格隔开，例如p{font:medium Helvetica}。
+ 声明（declaration）:属性和值之间用半角冒号：隔开，形成一条声明。
+ 声明块(declaration block)：多个特性间用；隔开，前后用{}括起来，形成一个生命快。
### 6.CSS 中回车符(\n)会影响 CSS 的解析吗？请测试在不同位置下的回车符对解析的影响，然后谈谈你的理解
比如声明块格式中：
一般有两种格式：单行和多行。
```
h1 {color:red; font-size:16px; width:150px; height:50px; border-bottom: 1px solid #333;}
h1{
  color:red;
  font-size:16px;
  width:150px;
  height:50px;
  border-bottom: 1px solid #333;
}
```
可见换行符对解析应该没有影响吧。
### 7.CSS 代码中如何使用注释？
在CSS中也有注释语句：用/*注释语句*/来标明。示例代码：
```
/*多行注释：
把h1标签的字体颜色设置为红色
字体大小为25px*/
h1 {
  color:red;
  font-size:25px;  /*单行注释，字体为25像素*/
}
```
### 8.浏览器前缀是什么？我们为什么需要浏览器前缀？
##### 所谓浏览器前缀，有些新式的CSS样式并不是所有的浏览器都支持，一些浏览器率先支持了，或者不是所有的浏览器支持情况都一样，我们需要前缀写法

#### 关于为什么需要浏览器前缀，
就目前而言：一最新版本浏览绝大多数属性不需要添加前缀写法，但是为了兼容旧版本浏览器，我们还是需要使用前缀写法

### 9.对浏览器前缀的处理有哪些方案？其中较好处理方案是哪个？
###### 比如：
+ Firefox: -moz-
+ Safari/Chrome: -webkit-
+ Opera: -o-
+ IE: -ms-
##### 书写顺序要注意，先写私有的CSS3属性，再写标准的CSS3属性，这样以后不需要前缀了，能保证我们使用标准的

+ -webkit-transform:rotate(-3deg);
+ -moz-transform:rotate(-3deg);
+ -ms-transform:rotate(-3deg);
+ -o-transform:rotate(-3deg);
+ transform:rotate(-3deg);

#### 何时不可以书写前缀？
当一个属性成为标准属性时。
根据软件项目浏览器兼容性要求（如需要兼容95%的浏览器，那么我们就可以根据浏览器占比，抛弃旧5%浏览器的兼容性写法）
#### 前缀这么繁琐，有没有办法自动添加前缀？ 
使用 css 预处理器
### 10.CSS 缩写是什么？哪些属性支持缩写？
#### 使用CSS缩写可以减少CSS文件的大小，并使其更为易读，例如：

+ 颜色缩写：
   + 16进制的色彩值，如果每两位的值相同，可以进行缩写，例如： 
      + ＃000000可以缩写为#000，#336699可以缩写为#369;

+ 盒尺寸缩写：
   + Property: Value1 Value2 Value3 Value4；
      + 四个值依次表示Top，Right，Bottom，Left

+ 边框缩写 
   + 边框的属性如下：

      + border-width: 1px;
      + border-style: solid;
      + border-color: #000;
   + 可以缩写为一句：

      + border: 1px solid #000;
+ 背景缩写

      + background-color: #F00;
      + background-image: url(background.gif);
      + background-repeat: no-repeat;
      + background-attachment: fixed;
      + background-position: 0 0;
   + 可以缩写为一句：

      + background: #F00 url(background.gif) no-repeat fixed 0 0;
+ 文字缩写

      + font-weight: bold;
      + font-size: 12px;
      + line-height: 1.8em;
      + font-family: Arial;
   + 可以缩写为一句（但文字缩写一定要具有字号、字体样式这两个属性。行高用/分隔）：

      + font:bold 12px/1.8em Arial;
### 11.什么是 CSS 中的继承？哪些属性可以继承？如果不希望子元素继承父元素的某个属性该怎么办？
某些样式不仅能应用到指定的元素，还会应用到它的后代元素。可以通过文档的树图，来分析属性的继承。  

关于哪些属性可以继承，哪些属性不可以继承：  

不能继承的：  
有些属性不能继承，往往归因于简单的常识，例如大多数框模型属性（包括外边距、内边距、背景和边框）都不能继承，因为如果边框能继承，则文档会变得更加混乱，创作人员往往需要另外花功夫去掉继承的边框。  
属性继承值没有特殊性，通配符的0特殊性属性也可以覆盖继承值。  

可以继承的：  
文本相关属性：  

font-family, font-size, font-style,
font-variant, font-weight, font, letter-spacing,
line-height, text-align, text-indent, 
texttransform, word-spacing  

列表相关属性：  

list-style-image, list-style-position,
list-style-type, list-style  

还有一个属性比较重要，color属性。  

其他属性不常用，了解下即可  

关于如果不希望子元素继承父元素的某个属性该怎么办：  

以讲义中的例子来说：  
如果你不希望 "Verdana, sans-serif" 字体被所有的子元素继承，又该怎么做呢？比方说，你希望段落的字体是 Times。没问题。创建一个针对 p 的特殊规则，这样它就会摆脱父元素的规则：  
```
body {
  font-family: Verdana, sans-serif;
}

td, ul, ol, ul, li, dl, dt, dd {
  font-family: Verdana, sans-serif;
}

p {
  font-family: Times, "Times New Roman", serif;
}
```
总而言之，需要一个对某个元素继承父元素的某个属性时，只需要创建一个针对这个元素的特殊规则，这样它就会摆脱父元素的规则了。
### 12.以下代码&lt;h2>最终显示成什么颜色？为什么？
```
<!DOCTYPE html>
<html>

<head>
<style type="text/css">
  body{
    color: yellow;
  }
</style>
</head>

<body>
<h2>标题</h2>
</body>

</html>
```
黄色，因为在style中设置了文本color属性为黄色。在&lt;h2>标签使用时，没有声明标签颜色的情况下使用默认颜色，因为之前已经把color默认改为了黄色，所以显示为黄色。
## 代码题
### 13.以下代码中&lt;h2>最终显示成什么颜色？如果我想让color: red，在不修改内部和外部样式表的前提下，该如何实现？
```
index.html

<!DOCTYPE html>
<html>

<head>
 <link rel="stylesheet" type="text/css" href="style.css">
 <style type="text/css">
   body{
     color: yellow;
   }
   h2 {
     color: blue;
   }
 </style>
</head>

<body>
 <h2>标题</h2>
</body>

</html>
style.css

h2 {
 color: green
}
```
显示为蓝色，在不修改外部，内部样式表的前提下，我们可以修改css文件，修改其中的颜色属性，并提高它的优先级，比如加入最高优先级的语句! important，即：
```
h2 {
    color: red! important
}
```