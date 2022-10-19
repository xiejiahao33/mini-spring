package cn.xie.springframework;

/**
 * @author xjh
 * @date 2022.10.19
 * @description 用于定义 Bean 实例化信息
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
