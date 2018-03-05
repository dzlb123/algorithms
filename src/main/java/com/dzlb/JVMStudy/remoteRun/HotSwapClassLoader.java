package com.dzlb.JVMStudy.remoteRun;

/**
 * 为了多次载入执行类而加入的加载器<br>
 * 把defineClass方法开放出来 , 只有外部显示调用的时候才会用到loadByte方法
 * 由虚拟机调用时 , 仍然按照原有的双亲委派规则使用loadClass方法进行类加载
 * Created by wuhai on 2018/2/6.
 */
public class HotSwapClassLoader extends ClassLoader {

    public HotSwapClassLoader(){
        super(HotSwapClassLoader.class.getClassLoader());
    }

    public Class loadByte(byte[] classByte){
        return defineClass(null,classByte,0,classByte.length);
    }

}
