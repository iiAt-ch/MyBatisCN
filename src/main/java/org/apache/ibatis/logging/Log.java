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
package org.apache.ibatis.logging;

/**
 * logging包中最重要的就是 Log接口，它有 11个实现类，分布在 logging包的不同子包中
 *
 * @author Clinton Begin
 */
public interface Log {

  /**
   * 判断打印 Debug级别日志的功能是否开启
   * 低级别的日志很少开启，这意味着返回值大概率是false。因此代码中字符串拼接结果是无用的，会被直接丢弃。
   * 并且低级别日志输出频次高且内容冗长，这意味着这种无用的字符串拼接是频发的且资源消耗很大
   *
   * @return
   */
  boolean isDebugEnabled();

  boolean isTraceEnabled();

  void error(String s, Throwable e);

  void error(String s);

  void debug(String s);

  void trace(String s);

  void warn(String s);

}
