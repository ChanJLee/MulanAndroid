# annotaion的使用
## annotaion的使用
### annotaion的使用
#### annotaion的使用
##### annotaion的使用

Annotation的种类：
1. SOURCE:在源文件中有效（即源文件保留）
2. CLASS:在class文件中有效（即class保留）
3. RUNTIME:在运行时有效（即运行时保留）

- unorder 1
- unorder 2

**text**
*text*

![图片](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

[link](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)
> vysor选择的是三种方案，通过分析源码得知，vysor通过发射调用SurfaceControl.screenshot()或者Surface.screenshot(), 但是，如果是用户进程，即使发射了也是拿不到数据的，这时候就需要提权，如果能够拿到system权限，那么就可以很轻松的获取到数据，并且也不需要做什么特殊的处理，直接将拿到的图片发送给web端显示就可以了。我们的实现是通过app_proces，它是拥有system权限的。追溯其父进程它是init。