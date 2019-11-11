package cn.gwjjj.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;


@Component
@Aspect
public class TransactionManger {

    @Pointcut("execution(* cn.gwjjj.service.impl.*.*(..))")
    private void pt1(){};
    @Autowired
    private ConnectionUtils connectionUtils;


    public void beginTransaction(){
        try {
            connectionUtils.getConnection().setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void commit(){
        try {
            connectionUtils.getConnection().commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void rollback(){
        try {
            connectionUtils.getConnection().rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void remove(){
        try {
            connectionUtils.getConnection().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        connectionUtils.remove();
    }
    @Around("pt1()")
    public void aroundAdvice(ProceedingJoinPoint pjp){
        Object rtValue = null;
        try{
            System.out.println("aroundAdvice");
            Object[] args = pjp.getArgs();
            this.beginTransaction();
            rtValue = pjp.proceed(args);
            this.commit();
//            return rtValue;
        }
        catch (Throwable e){
            System.out.println("ExceptionAdvice");
            this.rollback();
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("RemoveAdvice");
            this.remove();
        }
    }

}
