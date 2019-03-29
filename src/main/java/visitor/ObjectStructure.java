package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wilder Gao
 * time:2018/7/9
 * description：
 * motto: All efforts are not in vain
 */
public class ObjectStructure {
    private List<Person> elements = new ArrayList<>();

    /**
     * 添加
     * @param element 成员元素
     */
    public void attach(Person element){
        elements.add(element);
    }

    /**
     * 移除
     * @param element 成员元素
     */
    public void detach(Person element){
        elements.remove(element);
    }

    /**
     * 遍历展示元素
     * @param action
     */
    public void display(BaseAction action){
        for (Person element : elements) {
            element.accept(action);
        }
    }

}
