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
 * Utilities for JDBC.
 * 整个 jdbc包中的所有类都没有被外部引用过，那该包有什么存在的意义？
 * 那是因为 jdbc包是 MyBatis提供的一个功能独立的工具包，留给用户自行使用而不是由 MyBatis调用
 *
 * SqlRunner类和 ScriptRunner类则为用户提供了执行 SQL语句和脚本的能力。有些情况下，
 * 我们要对数据库进行一些设置操作（如运行一些 D D L操作），这时并不需要通过MyBatis提供 ORM功能，
 * 那么 SqlRunner类和 ScriptRunner类将是非常好的选择
 */
package org.apache.ibatis.jdbc;
