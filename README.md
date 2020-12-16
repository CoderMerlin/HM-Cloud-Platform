# HM-Cloud-Platform
HM 云平台

一个企业级综合平台，主要涵盖：流程管理平台、配置管理平台、发布平台、开发管理平台、测试管理平台、资源管理平台等

## 目录规划

- hm-security-code : 安全框架核心代码
- hm-common : 公共方法或实体
- hm-admin : 后台管理平台
- hm-quartz : 分布式定时任务管理


## 第一阶段
a. `hm-security-code`项目 自定义短信发送验证逻辑
实现 security 基本登录认证
实现 security rbac权限管理
### 鸣谢

- `Spring Security` 参考慕课网`JoJo`老师视频《Spring Security技术栈开发企业级认证与授权》