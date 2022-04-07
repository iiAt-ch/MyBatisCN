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
 * Logging proxies that logs any JDBC statement.
 * MyBatis是 ORM框架，它负责数据库信息和 Java对象的互相映射操作，而不负责具体的数据库读写操作。
 * 具体的数据库读写操作是由 JDBC进行的，这一点在后面的章节也会详细介绍。既然 MyBatis不进行数据库的查询，
 * 那 MyBatis的日志中便不会包含 JDBC的操作日志。然而，很多时候 MyBatis的映射错误是由于 JDBC的错误引发的，
 * 例如JDBC无法正确执行查询操作或者查询得到的结果类型与预期的不一致等。因此，JDBC 的运行日志是分析 MyBatis框架报错的重要依据。
 * 然而，JDBC日志有自身的一套输出体系，JDBC日志和 MyBatis日志是分开的，这会给我们的调试工作带来很多的困难。
 * jdbc子包就是用来解决这个问题的。jdbc子包基于代理模式，让 MyBatis能够将 JDBC的操作日志打印出来，极大地方便了我们的调试工作
 */
package org.apache.ibatis.logging.jdbc;
