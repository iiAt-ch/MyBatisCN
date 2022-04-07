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
 * Contains cache decorators
 * 缓存实现类 PerpetualCache的实现非常简单，但可以通过装饰器来为其增加更多的功能。
 * decorators子包中存在许多装饰器，根据装饰器的功能可以将它们分为以下几个大类。
 * · 同步装饰器：为缓存增加同步功能，如 SynchronizedCache类。
 * · 日志装饰器：为缓存增加日志功能，如 LoggingCache类。
 * · 清理装饰器：为缓存中的数据增加清理功能，如 FifoCache 类、LruCache 类、WeakCache类、SoftCache类。
 * · 阻塞装饰器：为缓存增加阻塞功能，如 BlockingCache类。
 * · 定时清理装饰器：为缓存增加定时刷新功能，如 ScheduledCache类。
 * · 序列化装饰器：为缓存增加序列化功能，如 SerializedCache类。
 * · 事务装饰器：用于支持事务操作的装饰器，如 TransactionalCache类。
 */
package org.apache.ibatis.cache.decorators;
