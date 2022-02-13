##Learn how to implement custom plugin



```text
zsh: permission denied: gradlew
```

解决方法。

```text
chmod +x gradlew
```


想要看自定义插件的Task执行，直接运行这个task。

```text
 gradle :app:apkdist

```

输出结果 

```text
> Task :app:apkdist
hello world!
helloapp
apk-distribution-directory

```


参考链接：

* [Gradle核心思想（六）自定义Gradle插件的三种方式](http://liuwangshu.cn/application/gradle/6-custonplugin.html)

