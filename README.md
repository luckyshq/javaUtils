javaUtils
=========

常用的java工具类集合.

---

### 版本

#### Version 0.1.3

#####  Http相关:
* HttpRequestCode 所有的既定http状态码.
* HttpCommonCode 常用的http状态码,同时封装`getCodeString`方法.

#####  Value相关:
* ProgressHelper 获取数值进度工具类.
* MyMath 数学计算相关类.

##### Date相关:
* SimpleDateFormatFun 通过函数式方法生成DateFormat. (e.g. new SimpleDateFormatFun().year().s().monthNum().s().day().fin(), 仅供娱乐>,<)
* SimpleDateFactory 常用SimpleDateFormat工厂类. (编写中,这个肯定比上面那个实用=.=)

---

### 更新

#### Version 0.1.3
* 添加MyMath数学计算相关类.

#### Version 0.1.2
* 完成SimpleDateFormatFactory基本年月日时分秒的构造,获取.

#### Version 0.1.1
* 完成SimpleDateFormatFun类.

#### Version 0.1.0
* 添加SimpleDateFormatFun,并完成一部分函数的实现.



---

Copyright 2014 Shengqi Zhang

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
