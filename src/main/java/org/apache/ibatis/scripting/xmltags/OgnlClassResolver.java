/**
 *    Copyright 2009-2019 the original author or authors.
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
package org.apache.ibatis.scripting.xmltags;

import ognl.DefaultClassResolver;
import org.apache.ibatis.io.Resources;

/**
 * Custom ognl {@code ClassResolver} which behaves same like ognl's
 * {@code DefaultClassResolver}. But uses the {@code Resources}
 * utility class to find the target class instead of {@code Class#forName(String)}.
 *
 * @author Daniel Guggi
 *
 * @see <a href='https://github.com/mybatis/mybatis-3/issues/161'>Issue 161</a>
 * DefaultClassResolver 类是 OGNL 中定义的一个类，OGNL 可以通过该类进行类的读取，即将类名转化为一个类
 */
public class OgnlClassResolver extends DefaultClassResolver {

  /**
   * 这样，OGNL在工作时可以使用 MyBatis中的 Resources类来完成类的读取
   * @param className
   * @return
   * @throws ClassNotFoundException
   */
  @Override
  protected Class toClassForName(String className) throws ClassNotFoundException {
    return Resources.classForName(className);
  }

}
