package com.mzs.aptpro;

import java.lang.reflect.Proxy;

/**
 * Create by ldr
 * on 2019/12/10 15:17.
 */
public class TestPro {
    public static void main(String[] args) {
//        //静态代理使用
//        //高配电脑
//        HeightConfigurationComputer heightConfigurationComputer = new HeightConfigurationComputer();
//        ComputerStaticPro staticPro = new ComputerStaticPro();
//        staticPro.setProx(heightConfigurationComputer);
//        staticPro.graphicsCard();
//        staticPro.mainBoard();
//        staticPro.screen();
//        staticPro.memoryBank();
//
//        //低配电脑
//        staticPro.setProx(new LowConfigurationComputer());
//        staticPro.graphicsCard();
//        staticPro.mainBoard();
//        staticPro.screen();
//        staticPro.memoryBank();


        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
//        //使用动态代理
//        //高配电脑
        HeightConfigurationComputer heightConfigurationComputer = new HeightConfigurationComputer();
        ClassLoader classLoader = heightConfigurationComputer.getClass().getClassLoader();
        Class[] interfaces = heightConfigurationComputer.getClass().getInterfaces();
        ComputerDynamicPro computerDynamicPro = new ComputerDynamicPro(heightConfigurationComputer);
        //通过Proxy.newProxyInstance生成代理类对象
        Object newProxyInstance = Proxy.newProxyInstance(classLoader,interfaces,computerDynamicPro);
        Computer computer = (Computer) newProxyInstance;
        computer.graphicsCard();
        computer.mainBoard();
        computer.memoryBank();
        computer.screen();

        //低配电脑
        LowConfigurationComputer lowConfigurationComputer = new LowConfigurationComputer();
        ClassLoader classLoader1 = lowConfigurationComputer.getClass().getClassLoader();
        Class[] interfaces1 = lowConfigurationComputer.getClass().getInterfaces();
        ComputerDynamicPro computerDynamicPro1 = new ComputerDynamicPro(lowConfigurationComputer);
        //通过Proxy.newProxyInstance生成代理类对象
        Object newProxyInstance1 = Proxy.newProxyInstance(classLoader1,interfaces1,computerDynamicPro1);
        Computer computer1 = (Computer) newProxyInstance1;
        computer1.graphicsCard();
        computer1.mainBoard();
        computer1.memoryBank();
        computer1.screen();


    }

}
