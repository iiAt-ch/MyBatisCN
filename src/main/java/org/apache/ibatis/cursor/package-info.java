/**
 *    Copyright 2009-2016 the original author or authors.
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
 * Base package for cursor feature
 * 有些时候，我们希望逐一读入和处理查询结果，而不是一次读入整个结果集。因为前者能够减少对内存的占用，这在处理大量的数据时会显得十分必要。
 * 游标就能够帮助我们实现这一目的，它支持我们每次从结果集中取出一条结果
 */
package org.apache.ibatis.cursor;
