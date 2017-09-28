# androidComponentProject
安卓组件化开发框架，使用阿里ARouter路由进行组件解耦，使用EventBus进行组件间通信，使用Glide加载图片。
整个工程分为app壳、main组件、news组件、image组件、common组件，帮助开发者快速学习搭建一个组件化安卓app

app壳：提供整个组件的框架，只有一个application。

main、news、image：业务组件，全部依赖common组件，完成业务操作。

common：功能组件，引入公用的jar，创建一些公共类，以及请求权限。

![image](https://raw.githubusercontent.com/haoxinlei1994/androidComponentProject/master/ACom/%E6%88%AA%E5%B1%8F/a.gif)
