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
 * Contains the statement executors.
 * 如果从 MyBatis的所有包中选择一个最为重要的包，那就是 executor包。
 *
 * executor 包，顾名思义为执行器包，它作为 MyBatis 的核心将其他各个包凝聚在了一起。
 * 在该包的工作中，会调用配置解析包解析出的配置信息，会依赖基础包中提供的基础功能。
 * 最终，executor包将所有的操作串接在了一起，通过 session包向外暴露出一套完整的服务
 */
package org.apache.ibatis.executor;
