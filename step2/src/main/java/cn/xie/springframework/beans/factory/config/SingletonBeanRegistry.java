package cn.xie.springframework.beans.factory.config;

/**
 * @author xjh
 * @date 2022.10.20
 * @description 获取单例对象的接口
 */

public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
