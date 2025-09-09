package samsungtdd;

import org.junit.jupiter.api.*;

public class JUnitAnnotationTest {
    @Test
    @Order(2)
    @Tag("sprint1")
    @Tag("function")
    @DisplayName("Day la test case test vui vui thoi, dung vui qua")
    public void Test_vui_vui()
    {
        System.out.println("Test Vui Qua Di!");
    }

    @Test
    @Disabled
    @Order(1)
    @Tag("sprint2")
    @Tag("function")
    public void Lam_o_ss_vui_qua()
    {
        System.out.println("Vui qua ss oi!");
    }

    @BeforeEach
    public void Truoc_khi_test_vui_vui()
    {
        System.out.println("before test");
    }

    @AfterEach
    public void Sau_khi_thuc_hien_test()
    {
        System.out.println("after test");
    }

    @Nested
    class MoreAnnotation{
        @Test
        public void More_test_case()
        {
            System.out.println("More Test Case");
        }
    }
}
