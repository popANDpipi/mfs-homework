### 1.HTML元素需要正确嵌套，给出实例代码说明什么是正确嵌套，什么是不正确嵌套
    元素嵌套 <em><p>Text</p></em> 正确
    元素交叉 <em><p>Text</em></p> 错误
---
### 2.HTML元素属性是什么？在哪里如何指定属性？常见属性有哪些？
    HTML元素可添加属性，属性可在元素中添加附加信息
        一般在开始标签中，以名称/值对的形式出现
        常见属性：
            class 为html定义一个或者多个类名
            id    定义元素唯一id
            style 规定元素行为的样式
            title 描述了元素的额外信息
---
### 3.空标签如何自闭合？
    只有自闭合标签（标签内部为空，即空标签）能自闭合，使用自闭合形式，如
    <br/>
---
### 4.HTML中多个空白字符如何显示？
    多个&nbsp
    使用<pre>标签
---
### 5.HTML中字符转义是什么？有哪些字符需要转义？
    转义字符是指本身在字母表中的部分字符，因为在HTML语言，格式中作为形式文法的一部分，而被规定了与原本含义不同的作用。当需要作为原本的字符使用的时候，便需要转义。
---
### 6.有哪些常见标签？请给出代码示例
    标题
        <h1>h1</h1>
        <h2>h2</h2>
        <h3>h3</h3>
        <h4>h4</h4>
        <h5>h5</h5>
        <h6>h6</h6>
    段落和块
        <p>Text</p>
        <div>Text</div>
    
    行内书写
        <span>Text</span>
    使用 <span> 来组合行内元素，通常通过样式来修改行内文字的表现形态

    超链接
    HTML 超链接是通过 <a> 标签进行定义的。
        <a href="网址" target="_blank">This is a link</a>
    target: 打开页面方式
        _self： 默认，在当前选项卡打开，替换当前页面
        _blank：新的选项卡打开
        _parent：在父框架中打开
        _top: 在最顶层打开
    图片
        <img src="图片" width="100" height="10" alt="alt"/>
    src：图片地址
    alt： 图片因为网络等原因未成功加载时候的显示文案内容
    width/height：可以是像素值或者相对于父容器的百分比，两个属性可以只设置一个，另外一个值会按相应等比缩放

内容相关
    有序列表
    <ol>
        <li>a</li>
        <li>b</li>
        <li>c</li>
    </ol>
    无序列表
    <ul>
        <li>Coffee</li>
        <li>Tea</li>
        <li>Milk</li>
    </ul>
    换行
        <br/>
    分割线
        <hr/>
    按钮
        <button>按钮</button>
    table
        <table>
        <tr>
            <th>Firstname</th>
            <th>Lastname</th> 
            <th>Age</th>
        </tr>
        <tr>
            <td>Jill</td>
            <td>Smith</td> 
            <td>50</td>
        </tr>
        <tr>
            <td>Eve</td>
            <td>Jackson</td> 
            <td>94</td>
        </tr>
        </table>
文本相关
    mark
    几乎和内容无关，就是为了标示（匹配搜索项，拼写错误等）

    强调
    标签所包含的文本会有加粗的效果，用于强调。

    着重
    标签所包含的文本会产生斜体效果，表示感情上的强调，增强了语气。

        <mark>Text</mark>
        <strong>Text</strong>
        <em>Text</em>
---
### 7.行内元素和块状元素的区别
    有行内元素，块状元素以及行内块状元素
    使用display实现三者互相转化（display:inline/block/inline-block）
    
    行内元素：常用<span>
        设置宽高无效
        margin仅左右有效，padding上下左右有效
        不自动换行
    块状元素：常用<div>
        识别宽高
        margin，padding上下左右有效
        默认从上而下排列
    行内块状元素：
        不自动换行
        识别宽高
        默认从左而右排列
---