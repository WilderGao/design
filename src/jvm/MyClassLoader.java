package jvm;

import java.io.*;

/**
 * @author Wilder Gao
 * time:2018/7/20
 * description：字节码进行编码解码
 *
 * motto: All efforts are not in vain
 */
public class MyClassLoader extends ClassLoader {
    private String byteCode_Path;
    private byte[] key;

    public MyClassLoader(String byteCode_Path, byte[] key) {
        this.byteCode_Path = byteCode_Path;
        this.key = key;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte value[] = null;
        BufferedInputStream in = null;

        try {
            in = new BufferedInputStream(new FileInputStream(byteCode_Path + name + ".class"));
            value = new byte[in.available()];
            in.read(value);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (null != in){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //对加密后的文字进行解密操作
        value = Use3DES.decrypt(key, value);
        return defineClass(value, 0, value.length);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BufferedInputStream in = null;
        in = new BufferedInputStream(new FileInputStream("D:/ClassLoaderTest.class"));
        byte[] src = new byte[in.available()];
        in.read(src);
        in.close();

        //加密
        byte[] key = "01234567899876543210abcd".getBytes();
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("D:/ClassLoaderTest.class"));
        out.write(Use3DES.encrypt(key, src));
        out.close();
        MyClassLoader classLoader = new MyClassLoader("D:/", key);
        System.out.println(classLoader.loadClass("ClassLoaderTest").getClassLoader().getClass().getName());
    }
}
