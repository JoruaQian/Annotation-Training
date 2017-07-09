# Annotation-Training
Use annotations in the "spring-context" to learn how to configure without XML files.

@Bean:被此注解的方法返回值作为Spring容器的Bean对象

在 JavaConfig.java 中：
1.findBaseService() 方法生成一个BaseService类型的Bean.
2.findUseService() 方法中参数BaseService baseService，Spring容器会自动将BaseService类型的Bean作为参数进行传递，生成一个UseService类型的Bean.
3.此类用@Configuration注解，标识作为全局Java配置

在 MainTest.java 中：
1.new AnnotationConfigApplicationContext(JavaConfig.class) 表示使用JavaConfig这个配置类作为应用上下文
2.applicationContext.getBean(UseService.class) 表示获取该应用上下文的UserService Bean对象
3.调用UserService中的方法进行配置

#注：
@Configuration、@Bean完成全局配置，可以完全替代XML文件的配置方式，@Bean完成XML文件中<bean></bean>的工作，@Configuration则申明为一个配置类，相当于读取XML文件等操作。
