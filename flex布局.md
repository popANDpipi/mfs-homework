### 1.当父元素设置为 display: flex 时，子元素的摆放方式更像 display: block 还是 display: inline？请解释为什么。
    更像display:block，因为flex:item有main size和cross size，和块元素的宽高属性类似，表现效果也很相像。
### 2.flexbox 有哪两个轴？他们的方向可以改变吗？如果可以改变，通过设置什么属性可以改变？
    有main axis（水平主轴）和cross axis（交叉轴）
    方向是可以改变的，通过flex-direction属性来决定主轴的方向。
### 3.有哪些属性可以设置在 container 上的？他们分别有哪些属性？分别代表什么意思
    flex-direction：决定主轴的方向（即项目的排列方向）
        row（默认值）：主轴为水平方向，起点在左端。
        row-reverse：主轴为水平方向，起点在右端。
        column：主轴为垂直方向，起点在上沿。
        column-reverse：主轴为垂直方向，起点在下沿。
        
    flex-wrap：定义如果一条轴线排不下，如何换行。
        nowrap（默认）：不换行。
        wrap：换行，第一行在上方。
        wrap-reverse：换行，第一行在下方。

    flex-flow：
        flex-flow属性是flex-direction属性和flex-wrap属性的简写形式，默认值为row nowrap。

    justify-content：定义了项目在主轴上的对齐方式。
        flex-start（默认值）：左对齐
        flex-end：右对齐
        center： 居中
        space-between：两端对齐，项目之间的间隔都相等。
        space-around：每个项目两侧的间隔相等。所以，项目之间的间隔比项目与边框的间隔大一倍。

    align-items：定义项目在交叉轴上如何对齐。
        flex-start：交叉轴的起点对齐。
        flex-end：交叉轴的终点对齐。
        center：交叉轴的中点对齐。
        baseline: 项目的第一行文字的基线对齐。
        stretch（默认值）：如果项目未设置高度或设为auto，将占满整个容器的高度。

    align-content：定义了多根轴线的对齐方式。如果项目只有一根轴线，该属性不起作用。
        flex-start：与交叉轴的起点对齐。
        flex-end：与交叉轴的终点对齐。
        center：与交叉轴的中点对齐。
        space-between：与交叉轴两端对齐，轴线之间的间隔平均分布。
        space-around：每根轴线两侧的间隔都相等。所以，轴线之间的间隔比轴线与边框的间隔大一倍。
        stretch（默认值）：轴线占满整个交叉轴。
### 4.有哪些属性可以设置在 item 上的？他们分别有哪些属性？分别代表什么意思
    order：属性定义项目的排列顺序。数值越小，排列越靠前，默认为0。

    flex-grow：定义项目的放大比例，默认为0，即如果存在剩余空间，也不放大。
    如果所有项目的flex-grow属性都为1，则它们将等分剩余空间（如果有的话）。如果一个项目的flex-grow属性为2，其他项目都为1，则前者占据的剩余空间将比其他项多一倍。

    flex-shrink：定义了项目的缩小比例，默认为1，即如果空间不足，该项目将缩小。
    如果所有项目的flex-shrink属性都为1，当空间不足时，都将等比例缩小。如果一个项目的flex-shrink属性为0，其他项目都为1，则空间不足时，前者不缩小。

    flex-basis：定义了在分配多余空间之前，项目占据的主轴空间（main size）。浏览器根据这个属性，计算主轴是否有多余空间。它的默认值为auto，即项目的本来大小。
    它可以设为跟width或height属性一样的值（比如350px），则项目将占据固定空间。

    flex：是flex-grow, flex-shrink 和 flex-basis的简写，默认值为0 1 auto。后两个属性可选。
    该属性有两个快捷值：auto (1 1 auto) 和 none (0 0 auto)。
    建议优先使用这个属性，而不是单独写三个分离的属性，因为浏览器会推算相关值。

    align-self：允许单个项目有与其他项目不一样的对齐方式，可覆盖align-items属性。默认值为auto，表示继承父元素的align-items属性，如果没有父元素，则等同于stretch
    可能取6个值，除了auto，其他都与align-items属性完全一致。

### 5.如何使用 flex 实现完全居中
```
    #container {
        display: flex;
        justify-content: center;
        align-items: center;
    }
```
    容器没有设置宽高，根据实需要设置，项目设置宽高即可。
### 6.如何使用 flex 实现 列表（从左往右排布，可以多行，最后一行左对齐）
    从左到右，可以多行的话
```
.container {
    display: flex;
    justify-content: space-between;
    flex-wrap: wrap;
}
```
    这样测试的实际结果是最后一行会是两端对齐的方式，为了实现最后一行左对齐的话，我们添加一些空项目即可。
    不过这样的方式需要根据已有项目的数量确定空项目的数量，在添加新的项目时还需要添加空项目，只是我暂时想不到其他更好的方法了。。。