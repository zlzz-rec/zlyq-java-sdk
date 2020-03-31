


tip ： 每次 提交之前进行的处理
- log.info 不允许有
    -  ``` grep -r "log.info" . --exclude-dir="logs" --exclude-dir="target" --exclude="README.md" ```
- log 级别定义成INFO
    -  ``` find . -name logback.xml  | xargs -I @ cat @  | grep level -C 2  ```
- appid 不允许有具体内容
    -  ``` grep -r "appId" . --include="*.java"  ```
- appkey 不允许有具体内容
    -  ``` grep -r "appKey" . --include="*.java"  ```
- appSecret 不允许有具体内容
    -  ``` grep -r "appSecret" . --include="*.java"  ```
- 查询"" 不要有魔法变量
    -  ```  grep -r "\"" . --include="*.java"  ```
- 处理 Submit类
    - ``` cd src/test/java/cn/zplatform/appapi/service/impl/ && cp Submit.java NotSubmit.java && sed -i "" "s/Submit/NotSubmit/g" NotSubmit.java && cd ../../../../../../../..  ```    