# Dubbo-SpringBoot-Demo
  
  Dubbo-SpringBoot-Demo
  
  使用SpringBoot maven构建dubbo demo

### 项目安装：

1. 首先安装zookeeper；[Zookeeper 安装教程](https://www.w3cschool.cn/zookeeper/zookeeper_installation.html)；

2. 将项目导入eclipse；

3. `dubbo-provider`服务提供者项目的资源文件 src/main/resiyrces/provides.xml下配置zookeeper地址；

4. `dubbo-consumer`服务提供者项目的资源文件 src/main/resiyrces/consumer.xml下配置zookeeper地址；

5. 启动`dubbo-provider`项目下的`ProviderApplication`注册服务提供者；

6. 启动`dubbo-consumer`项目下的`ConsumerApplication`注册服务消费者；

7. 整个项目即可完整运行，浏览器访问 http://localhost:8088/user/sayHello/loveincode 验证效果。

### 多提供者模拟

1. 上面操作的 1 - 6 

2. 修改`dubbo-provider`服务提供者项目下`UserServiceImpl`，修改打印语句 node；

3. 修改`dubbo-provider`服务提供者项目的资源文件 src/main/resiyrces/application.properties下配置server.port端口地址，与之前的不重复；

4. 重复启动dubbo-provider项目下的`ProviderApplication`注册服务提供者，可多启动几个提供者；

5. 浏览器访问 http://localhost:8088/user/sayHello/loveincode 验证效果，多次访问会调用了不同的提供者,查看多个提供者的后台打印测试验证。
