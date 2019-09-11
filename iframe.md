### 1.什么是 iframe?
    iframe是html的一个标签，它会创建包含另外一个文档的内联框架。
    属性有：
    frameborder：可用值0或者1，决定是否显示框架周围边框
    width：frame宽
    height：frame高
    src：引入的资源（图片，页面等）URL
---
### 2.如何在当前页面中嵌入其他页面？
    设置iframe的src属性为其他页面地址即可。
---
### 3.iframe 有哪些常见应用？
    插入广告，实现简单的局部刷新。
---
### 4.如何使用 &lt;a> 标签控制 iframe 中显示的内容？
    iframe可通过配合<a>标签的target属性来控制iframe之中显示的内容。
---
### 5.为什么越来越少的人使用 iframe？
    首先我们需要知道及时触发窗口的onland时间是十分重要的。onland事件触发是浏览器“忙”指示器停止，告诉用户当前网页已经加载完毕。当onland事件加载延迟后，给用户的直接体验就是该网页很慢。
    窗口的onland时间需要在所有iframe加载完毕后（包含里面的元素）才能够触发，也就是说iframe阻塞页面加载。
---
### 6.frame 和 iframe 有什么区别？
    frame不能脱离frameSet单独使用，iframe可以。
    frame不能放入body
    frame高度只能通过frameSet控制，iframe通过自己控制，不能通过frameSet控制