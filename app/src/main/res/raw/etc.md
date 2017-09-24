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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。


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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。

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
> this is reference


# WHAT is asm
ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。

[下载地址]("http://asm.ow2.org/")

# Java class的结构
![Class的结构](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

- 一个section描述modifiers（比如public, private),name, super class, interfaces, annotations

- 描述field的section，每个section描述modifiers，name
, type, annotations

- 描述方法和构造函数的section。每个section描述modifiers, name, parameter types以及annotations。其中它还包含方法的字节码。

源码文件和字节码文件有如下区别：

- 每个字节码文件都只有一个类，而源码可以包含多个类，其中主类文件包含多个指向内部类的引用。同样内部类也有主类的引用。

- 字节码文件不包含注释

- 字节码文件没有package和import部分，所以都是全类路径。

- 字节码文件含有一个常量池。

## 内部名称
一个类的内部名称是一个类的全路径，只不过点变成了斜杠，比如String就是java/lang/String。

## 类型描述

内部名仅用于描述类或接口类型，但是域，java类型是被描述为类型描述符的。

![类型描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

## 方法描述

方法描述用来描述方法的类型参数，返回类型。

![方法描述](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

# ClassVisitor

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

ASM使用ClassVisitor来生成以及转换一个编译过的类。

![x](http://images.csdn.net/20170905/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20170905083402.jpg)

它的方法调用必须遵循以下的规则。
visit必须第一个掉，剩下的最多可以调用一次 visitSource，跟随着可以最多调用一次visitOuterClass。紧接着可以调用任意次数的visitAnnotation和visitAttribute。之后才是任意次数的visitInnerClass，visitField，visitMethod，并且以visitEnd结尾。

ASM提供了以下几个ClassVisitor的实现类:
- ClassReader

接受一个比特数组，用以用来分析一个class文件，并且有一个accept方法，接收ClassVisitor，它可以被视为一个时间产生者。

- ClassWriter

用来处理class的输出内容，可以被视为事件消费者。通过调用toByteArray输出class。