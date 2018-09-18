package my.study.repository.design.pattern.proxy;

/**
 * @author djh on  2018/9/7 13:43
 * @E-Mail 1544579459@qq.com
 */
public class UseDemo {
    public static void main(String[] args) {
        RealImp realImp = new RealImp();
        ProxyMen proxyMen = new ProxyMen(realImp);
        // Use the proxy men to visit the realImp someMethod.
        proxyMen.someMethod();
    }
}
