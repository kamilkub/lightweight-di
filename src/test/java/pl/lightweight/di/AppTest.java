package pl.lightweight.di;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.platform.engine.support.descriptor.PackageSource;
import pl.lightweight.di.container.DIContainer;
import pl.lightweight.di.injector.DependencyInjector;
import pl.lightweight.di.injector.scanner.DependencyScanner;
import pl.lightweight.di.utils.ResourceUtils;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AppTest {

    private DependencyInjector dependencyInjector;

    @BeforeAll
    public void setUp() {
        this.dependencyInjector = new DependencyInjector(new DIContainer(), new DependencyScanner());
    }

    @Test
    @DisplayName("Create simple object with dependencies")
    public void testCase(){
        assertTrue(true);
    }


    @Test
    public void justTests() throws IOException {
        String rootPath = "test.sources".replace(".", "/");
        rootPath = "/" + rootPath;

        ResourceUtils.getProjectDirectories(rootPath);
    }
}
