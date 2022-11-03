package cn.xie.springframework.beans.factory;

import cn.xie.springframework.beans.BeansException;

/**
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}
