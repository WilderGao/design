import sun.text.resources.ar.CollationData_ar;

/**
 * @author Wilder Gao
 * time:2018/7/19
 * description：
 * motto: All efforts are not in vain
 */
public class ClassLoaderTest{
    public static void main(String[] args) {
        ClassLoader loader = System.class.getClassLoader();
        System.out.println(null != loader? loader.getClass().getName():null);

        // etc目录下的类型由 ExtClassLoader 负责加载
        System.out.println(CollationData_ar.class.getClassLoader().getClass().getName());

        //自定义的类由 AppClassLoader 负责加载
        System.out.println(ClassLoaderTest.class.getClassLoader().getParent().getClass().getName());
    }

}
