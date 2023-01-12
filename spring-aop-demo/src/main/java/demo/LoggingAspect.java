package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* demo.ShoppingCart.checkOut(..))")
    public void beforeLogger(JoinPoint jp){
        String status =jp.getArgs()[0].toString();
        System.out.println("Before Loggers:"+status);
    }
    @After("execution(* *.*.checkOut(..))")
    public void afterLogger(){
        System.out.println("After Loggers");
    }

    @Pointcut("execution(* demo.ShoppingCart.quantity(..))")
    public void afterReturningPointCut(){}

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(int retVal){
        System.out.println("After Returning:"+ retVal);
    }
}
