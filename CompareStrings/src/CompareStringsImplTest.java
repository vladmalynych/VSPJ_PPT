import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class CompareStringsImplTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(CompareStringsImpl.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @org.junit.Test
    public void compare() {
    }

    @org.junit.Test
    public void getStr1() {
    }

    @org.junit.Test
    public void getStr2() {
    }

    @org.junit.Test
    public void setStr1() {
    }

    @org.junit.Test
    public void setStr2() {
    }

    @org.junit.Test
    public void toString() {
    }

    @org.junit.Test
    public void getBiggerStr() {
    }

    @org.junit.Test
    public void getSmallerStr() {
    }

    @org.junit.Test
    public void checkEqualStr() {
    }
}
