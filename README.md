# HM-Cloud-Platform
HM 云平台

一个企业级综合平台，主要涵盖：流程管理平台、配置管理平台、发布平台、开发管理平台、测试管理平台、资源管理平台等

## 项目结构介绍

- hm-security-code: 安全框架核心代码
- hm-common: 公共方法或实体
- hm-admin: 后台管理平台
- hm-quartz: 分布式定时任务管理
- hm-generator: 代码生成系统
- hm-apollo: 分布式配置中心
- hm-gateway-kong: 微服务网关kong
- hm-doc-management-platform: 文档管理平台
  - hm-yapi: YApi接口文档管理
  - hm-confluence-wiki: 工作日常进程内容管理

### 依赖介绍

hm-admin <—— hm-system <—— hm-common


## 第一阶段
a. 对`hm-cloud-platform` 项目进行整体架构规划
b. 项目采用分模块管理
c. `hm-admin`后台管理实现基本web端登录流程
d. `hm-security-code`项目 自定义短信发送验证逻辑

### 鸣谢

- 参考慕课网`JoJo`老师视频《Spring Security技术栈开发企业级认证与授权》 视频地址： https://coding.imooc.com/class/134.html
- 参考`RuoYi` 开源框架地址：https://doc.ruoyi.vip/