
# Java SPI 运行示例

## module description
- Service-Provider-Interface 调用方提供接口逻辑，以及加载Provider逻辑
- Service-Provider 提供者实现具体接口逻辑，并提供配置文件
- spi-simple-example 运行 SPI示例
## 项目说明
这里只提供了单个service-provider加载使用示例。
```
.
├── lib
│   ├── Service-Provider-Interface.jar
│   └── Service-Provider.jar
├── readme.md
├── Service-Provider
│   ├── lib
│   │   └── Service-Provider-Interface.jar
│   ├── Service-Provider.iml
│   └── src
│       ├── com
│       │   └── example
│       │       └── service
│       │           ├── Logback.java
│       │           └── TestSPI.java
│       └── META-INF
│           ├── MANIFEST.MF
│           └── services
│               └── com.example.spi.Logger
├── Service-Provider-Interface
│   ├── Service-Provider-Interface.iml
│   └── src
│       ├── com
│       │   └── example
│       │       └── spi
│       │           ├── Logger.java
│       │           └── LoggerService.java
│       └── Main.java
├── spi-simple-example.iml
└── src
    └── com
        └── service
            └── TestSPI.java 入口
```