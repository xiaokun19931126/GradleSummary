# Gradle for Android 

## Groovy语法

gradle构建脚本基于Groovy语言书写，所以需要简单了解Groovy语法。因为Groovy是一款基于Java虚拟机语言，所以区别不是很大，而且看groovy源码发现是Java代码。以下主要记录常用的一些区别。

* 字符串
* 方法
* 列表list和map
* 闭包

### 字符串

Groovy中既可以用单引号也可以用双引号表示字符串，区别单引号是单纯的字符串，双引号里面可以有变量运算如${a+b}。

```groovy
def a = 1
def b = 'hello world'
def c = 1;

def d = "a=${a},b=$b"

println d

//输出
a=1,b=hello world
```



### 方法

方法定义：Groovy中变量和方法都使用def修饰，不需要指定返回值，也可以不使用return关键字，但是建议使用。

```groovy
def hello1(){
    println('hello world')
    //retrun 关键字可以省略
    return 1
}

//2.retrun是可以不用写的，但是建议加上
def method2(int a,int b){
    if(a>b){
        a
    }else{
        b
    }
}
```



方法调用：Groovy中调用方法时，可以省略括号，比如method(1,2)和method 1,2 作用一样。然后如果最后一个参数是闭包，则可以将闭包参数移到方法外。

```groovy
def method1(int a,int b){
    println "求和：${a+b}"
}

//下面两者效果一样
method1(1,2)
method1 1,2 

//a.首先将{代码块}作为参数传入each方法中
test4.each({println it})
//b.groovy规定，如果方法的最后一个参数是闭包，可以放到方法外面
test4.each(){
    println it
}
//c.然后方法可以省略
test4.each{
    println it
}
```



### 集合



### 闭包

卸载task任务闭包里的代码是再gradle配置阶段就会执行，如果只是想执行这个task才会执行代码时，就需要调用doFirst或者doLast





## Android gradle 插件

Android 插件中专门为 Android 做了相关的扩展，其中 android{} 就是独属于 Android 的一个 dsl 扩展。包名是org.gradle.的都是gradle平台的，包名是com.android.build.gradle.的是Android的gradle插件.

其中Android插件的所有扩展有:

```groovy
ext, 
defaultArtifacts, 
reporting, 
sourceSets, 
java, 
buildOutputs, 
android, 
kotlin, 
kotlinTestRegistry, 
androidExtensions
```

通过打印我们可以知道其包含的属性有：

```groovy
dexOptions, 
convention,
conventionMapping, 
extensions, 
unitTestVariants, 
buildToolsRevision, 
transforms, 
//构建工具版本
buildToolsVersion, 
mockableAndroidJar,
//资源名称前置
resourcePrefix,
//默认配置
defaultConfig,
asDynamicObject, 
//项目编译sdk版本
compileSdkVersion, 
libraryRequests, 
testServers, 
compileOptions,
//应用的所有变体
applicationVariants, 
bundle, 
externalNativeBuild, 
ndkVersion, 
deviceProviders, 
dataBinding, 
buildOutp
uts, 
ndkDirectory, 
variantFilter, 
testVariants, 
defaultPublishConfig, 
splits, 
generatePureSplits, 
sourceSets, 
class, 
testBuildType, 
sdkDirectory, 
baseFeature, 
flavorDimensionList,
//签名配置
signingConfigs, 
transformsDependencies, 
dynamicFeatures, 
bootClasspath, 
productFlavors, 
adbExe, 
jacoco, 
adbOptions,
//构建类型
buildTypes, 
adbExecutable, 
lintOptions, 
testOptions, 
aaptOptions, 
packagingOptions
```

新建工程默认添加的属性有：

```groovy
//项目编译sdk版本
compileSdkVersion
//构建工具版本
buildToolsVersion
//默认配置
defaultConfig
//签名配置
signingConfigs
//构建类型
buildTypes
```

