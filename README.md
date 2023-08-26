# Moon Under Java

## 项目介绍

参考：

[RouYi-Vue](https://github.com/yangzongzhuan/RuoYi-Vue)

[AgileBoot-Back-End](https://github.com/valarchie/AgileBoot-Back-End)

### 分层

moon-under-admin

moon-under-common

moon-under-domain

moon-under-infrastructure

```mermaid
stateDiagram-v2
    Start --> Admin
    Admin --> Infrastructure
    Admin --> Domain
    Domain --> Infrastructure
    Domain --> Common
```

### 代码风格

[intellij-java-google-style](https://github.com/google/styleguide/blob/gh-pages/intellij-java-google-style.xml)
