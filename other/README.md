# 说明

---

## Sentinel

控制台:
> java -Dserver.port=8080 -Dcsp.sentinel.dashboard.server=localhost:8080 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard-1.8.1.jar

## Nacos

1. 对Sentinel支持

规则配置
```json
[
    {
        "resource": "sayHello",
        "limitApp": "default",
        "grade": 1,
        "count": 1,
        "strategy": 0,
        "controlBehavior": 0,
        "clusterMode": false
    }
]
```

2. 配置支持

```ymal
name: suze

spring:
  application:
    cloud:
      discovery:
        server-addr: localhost:8848
```