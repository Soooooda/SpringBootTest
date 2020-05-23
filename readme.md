## Project for Learning SpringBoot

* Another project for learning backend development

### Some shortcuts to record

1. Ctrl+F5 清理浏览器缓存
2. Ctrl+F9 在idea重新编译页面
3. Alt+Enter IDEA提示
4. ctrl+o 添加Abstract继承的函数
5. ctrl+n 添加构造函数等
6. ctrl+alt+v 快速声明本地变量
7. ctrl+h 打开继承树

### Actions of this projects

![image-20200521002636936](C:\Users\gx\AppData\Roaming\Typora\typora-user-images\image-20200521002636936.png)

### Docker

##### 阿里云服务器登录 centos

```bash
ssh -l root 106.14.207.145
```

* 获取docker

  ```bash
  yum install docker
  ```

* 启动docker (停止stop)

  ```bash
  systemctl start docker
  ```

* 设置docker开机自启动

  ```bash
  systemctl enable docker
  ```

* docker仓库

  https://hub.docker.com

* 搜索mysql

  ```bash
  docker search mysql
  ```

* 下载镜像 带版本号

  ```bash
  docker pull mysql:5.5
  ```

* 列表

  ```bash
  docker images
  ```

* 删除 先用images来查询出image id

  ```bash
  docker rmi [IMAGE ID]
  ```

* 在docker中运行tomcat

  ```bash
  docker run --name mytomcat -d tomcat:latest
  ```

* 查看docker中运行的容器 -a是所有的意思

  ```bash
  docker ps [-a]
  ```

* 停止一个容器

  ```bash
  docker stop mytomcat
  ```

* 重新启动刚刚关掉的容器

  ```bash
  docker start 刚刚关掉的容器的id
  ```

* 删除容器 要先关掉

  ```bash
  docker rm 容器的id
  ```

* 启动一个做了端口映射的tomcat 如果不映射 外界没办法访问 -d后台运行 -p将主机端口映射到容器内部的端口

  ```bash
  docker run -d -p 8888:8080 tomcat
  ```

  * tomcat 服务启动！

  ![tomcat](imgs\tomcat.png)



