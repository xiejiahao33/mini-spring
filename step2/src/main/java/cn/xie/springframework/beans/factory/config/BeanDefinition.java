package cn.xie.springframework.beans.factory.config;

/**
 * @author xjh
 * @date 2022.10.20
 * @description 定义 Bean 实例化信息
 */

public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
