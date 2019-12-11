package com.mzs.aptpro;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Create by ldr
 * on 2019/12/10 15:55.
 * 动态代理
 */
public class ComputerDynamicPro implements InvocationHandler {
    //动态代理类需要被代理的实例
    private Computer mComputer;

    public ComputerDynamicPro(Computer computer){
        mComputer = computer;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //执行被代理的方法的类  方法被调用时就会自动调用
        Object invoke =  method.invoke(mComputer,args);
        String name = method.getName();
        if (name.equals("screen")){
            System.out.println(mComputer.getClass().getSimpleName()+"  screen()" );
        }else if (name.equals("memoryBank")){
            System.out.println(mComputer.getClass().getSimpleName()+"  memoryBank()" );
        }else if (name.equals("mainBoard")){
            System.out.println(mComputer.getClass().getSimpleName()+"  mainBoard()" );
        }else if(name.equals("graphicsCard")){
            System.out.println(mComputer.getClass().getSimpleName()+"  graphicsCard()" );
        }
        return invoke;
    }
}
