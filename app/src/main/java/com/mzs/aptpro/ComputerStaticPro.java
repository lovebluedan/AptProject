package com.mzs.aptpro;

/**
 * Create by ldr
 * on 2019/12/10 15:14.
 * 静态代理
 */
public class ComputerStaticPro implements Computer {

    private Computer mComputer;

    public void setProx(Computer computer){
        mComputer = computer;
    }

    @Override
    public void screen() {
        System.out.println("代理类可先做共用一些逻辑~");
        mComputer.screen();
    }

    @Override
    public void memoryBank() {
        System.out.println("代理类可先做共用一些逻辑~");
        mComputer.memoryBank();
    }

    @Override
    public void mainBoard() {
        System.out.println("代理类可先做共用一些逻辑~");
        mComputer.mainBoard();
    }

    @Override
    public void graphicsCard() {
        System.out.println("代理类可先做共用一些逻辑~");
        mComputer.graphicsCard();
    }
}
