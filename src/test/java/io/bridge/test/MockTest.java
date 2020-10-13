package io.bridge.test;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.core.classloader.annotations.SuppressStaticInitializationFor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Properties;

import static org.mockito.Matchers.anyString;

@PrepareForTest(PropertyUtil.class)
@SuppressStaticInitializationFor("io.bridge.test.PropertyUtil")
@PowerMockIgnore("java.lang.*")
public class MockTest {
    @Mock
    Properties properties;

    @BeforeClass
    public void beforeClass() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testQueryCodeStringExp() {
        PowerMockito.mockStatic(PropertyUtil.class);
        // mock静态方法，抛出异常
        try {
            PowerMockito.doThrow(new RuntimeException())
                    .when(PropertyUtil.class, "setConfig", anyString(), anyString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
