package cn.xie.springframework.beans.factory.support;

import cn.xie.springframework.beans.factory.BeanFactory;
import cn.xie.springframework.beans.BeansException;
import cn.xie.springframework.beans.factory.config.BeanDefinition;

/**
 * @author xjh
 * @date 2022.10.20
 * @description 实现getBean方法，并继承DefaultSingletonBeanRegistry
 */

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

}
