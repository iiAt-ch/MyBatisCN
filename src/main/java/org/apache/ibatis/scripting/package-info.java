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
 * Base package for languages.
 * MyBatis支持非常灵活的 SQL语句组建方式。
 * 我们可以在组建SQL语句时使用 foreach、where、if等标签完成复杂的语句组装工作
 * 语句最终还是会被解析成为最基本的 SQL语句才能被数据库接收，这个解析过程主要由 scripting包完成
 */
package org.apache.ibatis.scripting;
