/**
 *    Copyright 2009-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
/**
 * Type handlers.
 * 基础功能包
 *
 * 经过梳理后，我们把 type包内的类分为以下六组。
 * · 类型处理器：1个接口、1个基础实现类、1个辅助类、43个实现类。
 * -TypeHandler：类型处理器接口；
 * -BaseTypeHandler：类型处理器的基础实现；
 * -TypeReference：类型参考器；
 * -*TypeHandler：43个类型处理器。
 *
 * · 类型注册表：3个。
 * -SimpleTypeRegistry：基本类型注册表，内部使用 Set 维护了所有 Java 基本数据类型的集合；
 * -TypeAliasRegistry：类型别名注册表，内部使用 HashMap维护了所有类型的别名和类型的映射关系；
 * -TypeHandlerRegistry：类型处理器注册表，内部维护了所有类型与对应类型处理器的映射关系。
 *
 * · 注解类：3个。
 * -Alias：使用该注解可以给类设置别名，设置后，别名和类型的映射关系便存入TypeAliasRegistry中；
 * -MappedJdbcTypes：有时我们想使用自己的处理器来处理某些 JDBC 类型，只需创建 BaseTypeHandler 的子类，然后在上面加上该注解，声明它要处理的JDBC类型即可；
 * -MappedTypes：有时我们想使用自己的处理器来处理某些Java类型，只需创建BaseTypeHandler的子类，然后在上面加上该注解，声明它要处理的 Java类型即可。
 *
 * · 异常类：1个。
 * -TypeException：表示与类型处理相关的异常。
 *
 * · 工具类：1个。
 * -ByteArrayUtils：提供数组转化的工具方法。
 *
 * · 枚举类：1个。
 * -JdbcType：在 Enum中定义了所有的 JDBC类型，类型来源于 java.sql.Types。
 */
package org.apache.ibatis.type;
