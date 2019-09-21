### 1.font 属性可以缩写哪些子属性？它们的参数各是什么，有何含义？
    1.font-size：字体大小
    2.font-family：字体，宋体、微软雅黑、Arial等
    3.font-weight：文字粗度，常用的就是默认值regular和粗体bold
    4.line-height：行高，可以用百分比、倍数或者固定尺寸

    font:bold 12px/1.8em Arial;
    可以缩写为一句：但文字缩写一定要具有字号、字体样式这两个属性。行高用/分隔
### 2如何实现单行文本的垂直居中？
    如果一个容器中只有一行文字，对它实现居中相对比较简单，我们只需要设置它的实际高度height和所在行的高度line-height相等即可。

    如： 

    div {   
        height:25px;   
        line-height:25px;   
        overflow:hidden;   //防止内容超出容器或者产生自动换行
    }   
### 3.如何实现文本的水平居中？
    我们需要知道一个属性的作用：text-align：文本对齐方式 left、center、right、justify
    div{text-align:center} 即可
### 4.什么是 iconfont？使用它有什么优势？如何使用 iconfont？
    iconfont 就是阿里巴巴的矢量图标库
    项目中我们经常使用图标(icon)。传统项目中一般使用图片(img)实现图标；但是这种解决方案并不完美，比如

    不方便条件大小
    耗费流量
    不同分辨率下需要不同图片
    视网膜下不清晰
    以上问题，我们都可以使用矢量图(svg)解决。

    为了让我们的图标更加灵活，我们可以使用字体(font)来实现图标。
    结合矢量图和字体的特点，就是iconfont的优势

    在阿里巴巴矢量图标库将想要的图标加入购物车，在购物车里下载代码，保存本地。
    解压后放在项目的css文件夹中
    使用时引用这个css文件即可
### 5.文本相关的属性哪些是可以继承的？
    1、字体系列属性
    　　font-family：字体系列
    　　font-weight：字体的粗细
    　　font-size：字体的大小
    　　font-style：字体的风格
    
    　　2、文本系列属性
    　　text-indent：文本缩进
    　　text-align：文本水平对齐
    　　line-height：行高
    　　word-spacing：单词之间的间距
    　　letter-spacing：中文或者字母之间的间距
    　　text-transform：控制文本大小写（就是uppercase、lowercase、capitalize这三个）
    　　color：文本颜色
### 6.什么是 CSS 边框？如何使用边框？
    元素的边框 (border) 是围绕元素内容和内边距的一条或多条线。

    CSS border 属性允许你规定元素边框的样式、宽度和颜色。

    border-width：边框宽度
    border-color：边框颜色
    border-style：边框样式（solid、dashed）
    支持合写

    border: solid 1px #333;