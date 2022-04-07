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
 * Base package for caching stuff
 *
 * MyBatis 每秒可能要处理数万条数据库查询请求，而这些请求可能是重复的。
 * 缓存能够显著降低数据库查询次数，提升整个 MyBatis的性能。MyBatis 缓存使得每次数据库查询请求都会先经过缓存系统的过滤，
 * 只有在没有命中缓存的情况下才会去查询物理数据库。cache包就是 MyBatis缓存能力的提供者
 */
package org.apache.ibatis.cache;
