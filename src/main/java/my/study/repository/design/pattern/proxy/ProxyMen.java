package my.study.repository.design.pattern.proxy;

/**
 * @author djh on  2018/9/7 13:44
 * @E-Mail 1544579459@qq.com
 */
public class ProxyMen implements Subject {

    private RealImp mRealImp;

    ProxyMen(RealImp realImp) {
        mRealImp = realImp;
    }

    @Override
    public void someMethod() {
        mRealImp.someMethod();
    }
}
