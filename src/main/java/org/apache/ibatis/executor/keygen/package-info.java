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
 * Contains the key generators
 * 在进行数据插入操作时，经常需要一个自增生成的主键编号，这既能保证主键的唯一性，又能保证主键的连续性。
 * 许多数据库都支持主键自增功能，如 MySQL数据库、SQL Server数据库等。当然也有一些数据库不支持主键自增功能，
 * 如 Oracle数据库。MyBatis的 executor包中的 keygen子包兼容以上这两种情况
 */
package org.apache.ibatis.executor.keygen;
