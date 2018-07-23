package jvm;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * @author Wilder Gao
 * time:2018/7/20
 * description：
 * motto: All efforts are not in vain
 */
public class Use3DES {
    private static final String ALGORITHM = "DESede";

    /**
     * 进行加密操作
     * @param key   加密key
     * @param src   需要加密的字节数组
     * @return  加密后的字节数组
     */
    public static byte[] encrypt(byte[] key, byte[] src){
        byte[] value = null;
        SecretKey deskey = new SecretKeySpec(key, ALGORITHM);
        // 对目标数据进行加密操作
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            //指定操作为加密操作
            cipher.init(Cipher.ENCRYPT_MODE, deskey);
            value = cipher.doFinal(src);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }

    /**
     *
     * @param key
     * @param src
     * @return
     */
    public static byte[] decrypt(byte[] key, byte[] src){
        byte[] value = null;
        try {
            SecretKey deskey = new SecretKeySpec(key, ALGORITHM);
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            //指定操作为解密操作
            cipher.init(Cipher.DECRYPT_MODE, deskey);
            value = cipher.doFinal(src);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }


    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] key = "01234567899876543210abcd".getBytes();
        byte[] encoded = encrypt(key, "测试数据...".getBytes("UTF-8"));
        System.out.println("加密后的数据->"+new String(encoded));
        System.out.println("解密后的数据->"+new String(decrypt(key, encoded), "utf-8"));
    }
}
