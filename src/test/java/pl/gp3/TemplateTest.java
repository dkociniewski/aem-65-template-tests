package pl.gp3;

import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.apache.sling.testing.mock.sling.ResourceResolverType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;


@ExtendWith(AemContextExtension.class)
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class TemplateTest {

    private static final String EXISTING_SITE_PATH = "/content/site";

    private final AemContext context = new AemContext(ResourceResolverType.JCR_OAK);

    @BeforeEach
    void setUp() {
        context.load().json("/template-test/content.json", EXISTING_SITE_PATH);
        context.load().json("/template-test/templates.json", "/conf/site");
    }

    @Test
    void dumbTest() {
        Assertions.assertTrue(true);
    }

}
