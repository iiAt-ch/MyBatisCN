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
 * The MyBatis data mapper framework makes it easier to use a relational database with object-oriented applications.
 * 第1篇为背景介绍，包括第1～4章。
 * 第1章介绍了源码阅读的意义和方法。
 *
 * 第2章对 MyBatis的背景和快速上手方法进行了介绍。这一章的内容是简单但重要的。对于任何一个软件，其背景对应于软件的“设计需求”，
 * 其使用对应于软件的“主要功能”。把握一个软件的设计需求和主要功能对于阅读软件的源码很有帮助。
 *
 * 第3章中使用断点调试方法对 MyBatis的执行过程进行了追踪。该章内容有助于我们了解整个 MyBatis的内部框架。
 *
 * 第4章对 MyBatis源码结构进行了介绍，并根据源码包的功能对包进行了分类。
 *
 *
 * 第2篇为基础功能包源码阅读，包括第5～11章。在这一篇中，我们对基础功能包中的源码进行了阅读。基础功能包相对独立，
 * 与MyBatis的核心逻辑耦合小，比较适合作为源码阅读的切入点。在阅读这些源码时，我们也会逐步介绍一些阅读源码常用的方法和技巧。
 * 第5章介绍了 exceptions包的源码，可以通过该包了解 MyBatis的整个异常体系。
 *
 * 第6章介绍了 reflection包的源码。该包基于反射提供了创建对象、修改对象属性、调用对象方法等功能。这些功能在 MyBatis的参数处理、
 * 结果处理等环节都发挥了重要的作用。
 *
 * 第7章介绍了 annotations包与 lang包的源码。这两个包中全是注解类。我们将通过对 Java注解的学习详细了解每个注解类的含义。
 * 最后，我们还通过源码分析了注解类如何在 MyBatis的运行中发挥作用。
 *
 * 第8章介绍了 type包的源码。通过这一章将了解 MyBatis如何组织和实现类型处理器，以完成对各种类型数据的处理。
 *
 * 第9章介绍了 io包的源码。通过该包将了解到 MyBatis如何完成外部类的筛选和载入。
 *
 * 第10章介绍了 logging包的源码。logging包不仅为 MyBatis提供了日志记录功能，还提供了获取和记录 JDBC中日志的功能。
 * 通过这一章将了解这些功能的实现细节。第11章介绍了 parsing包的源码。通过这一章将了解 MyBatis如何完成 XML文件的解析。
 *
 * 第11章介绍了 parsing包的源码。通过这一章将了解 MyBatis如何完成 XML文件的解析。
 *
 *
 * 第3篇为配置解析包源码阅读，包括第12～17章。
 * 第12 章介绍了配置解析相关类的分类方法。配置解析相关类可以按照类的功能划分为解析器类和解析实体类。
 *
 * 第13章介绍了 binding包的源码。该包负责将 SQL语句接入映射接口。
 *
 * 第14章介绍了 builder包的源码。该包中的建造者基类和工具类为 MyBatis基于建造者模式建造对象提供了基础。
 * 此外，该包还完成了 XML文件和注解映射的解析工作。
 *
 * 第15章介绍了 mapping包的源码。该包完成了 SQL语句的处理、输入参数的处理、输出结果的处理等功能，
 * 并为 MyBatis提供了多数据库支持的能力。
 *
 * 第16章介绍了 scripting包的源码。就是在这个包中，复杂的 SQL节点被逐步解析为纯粹的 SQL语句，
 * 该章将详细讲解这一解析过程。
 *
 * 第17章介绍了 datasource包的源码。该包包含了 MyBatis中与数据源相关的类，包括非池化数据源、池化数据源、数据源工厂等。
 * 也正是通过该包，MyBatis完成了和数据库的对接。
 *
 *
 * 第4篇为核心操作包源码阅读，包括第18～24章。在这一篇中，将详细介绍 MyBatis的核心操作包。
 * 第18章介绍了 jdbc包的源码。该包仅使用六个类便为 MyBatis提供了运行 SQL语句和脚本的能力。
 *
 * 第19章介绍了 cache包的源码。该包向我们展示了 MyBatis如何使用装饰器模式为用户提供丰富的、可配置的缓存，
 * 并且该章还从功能维度出发详细介绍了 MyBatis的两级缓存机制。
 *
 * 第20章介绍了 transaction包的源码。该包为 MyBatis提供了内部和外部的事务支持。
 *
 * 第21章介绍了 cursor包的源码。通过该包，MyBatis能将查询结果封装为游标形式返回。
 *
 * 第22章介绍了 executor包的源码。executor包是 MyBatis中最为重要也是最复杂的包。在这一章中，
 * 首先，以子包为单位分别介绍了 MyBatis的主键自增功能、懒加载功能、语句处理功能、参数处理功能、结果处理功能和结果集处理功能。
 * 然后，在此基础上对 MyBatis中执行器的源码进行了阅读。最后，阅读了 MyBatis中错误上下文的源码，
 * 了解 MyBatis如何及时地保留错误发生时的现场环境。
 *
 * 第23章介绍了 session包的源码。session包是一个对外接口包，是用户在使用MyBatis时接触最多的包。
 *
 * 第24 章介绍了 plugin 包的源码。在该章中我们编写了一个插件，然后通过源码详细了解了 MyBatis插件的实现原理及
 * MyBatis插件平台的架构。
 *
 * 第5篇为总结与展望，包括第25、26章。
 * 第25章对阅读 MyBatis源码过程中的方法和技巧进行了总结。
 *
 * 第26 章从项目的成熟度、涉及面、应用广度和规模等角度综合考量，为大家推荐了一些优秀的开源项目。
 * 学习完本书后，大家可以从这些项目中挑选一些进行源码阅读。
 *
 */
package org.apache.ibatis;
