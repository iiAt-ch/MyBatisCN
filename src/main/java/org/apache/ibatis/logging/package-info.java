/**
 *    Copyright 2009-2018 the original author or authors.
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
 * Base package for logging.
 * 基础功能包-日志
 * logging包负责完成 MyBatis操作中的日志记录工作。对于大多数系统而言，日志记录是必不可少的，
 * 它能够帮助我们追踪系统的状态或者定位问题所在。MyBatis作为一个 ORM框架，运行过程中可能会在配置解析、参数处理、数据查询、结果转化等各个环节中遇到错误，
 * 这时，MyBatis 输出的日志便成了定位错误的最好资料
 *
 */
package org.apache.ibatis.logging;
