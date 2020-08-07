Switch to branch v1.0\n
This is the basic version of a java-maven project.

In this version,  we program foundational services of an online mall, including
    userService, productService,cartService, orderService, shippingService.

For creating the framework, I used a plugin called My-batis generator.
I also used other dependencies, detailed in pom.xml.

Main coding is in src-main-java- com - mall, and there are 7 packages,
    common: public used package about https
    controller: to implement front-end and back-end function,
    service: service to implement function in 'controller'
    dao: Mappers interface about database operation, detailed in resources-mappers.xml
    pojo: cases created by my-batis generator.
    vo: value object, similar to 'pojo'
    util: some additional functions.

Switch to branch v2.0\n
In version 2.0, we update the program in v1.0 to dealt with concurrency

And we made the following improvement
    add payService(Alipay) to current program
    use Lombok: don't need to put declaration and args in constructor and loggers
    make environmental isolation in maven
