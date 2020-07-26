This is a java-maven project to create an online mall.

For the framework, I used My-batis generator.

I also used other dependencies, detailed in pom.xml.

In com.mall, there are 7 packages,
    common: public used package about https
    controller: to implement front-end and back-end function,
    service: service to implement function in 'controller'
    dao: Mappers interface about database operation, detailed in resources-mappers.xml
    pojo: cases created by my-batis generator.
    vo: value object, similar to 'pojo'
    util: some additional functions.



