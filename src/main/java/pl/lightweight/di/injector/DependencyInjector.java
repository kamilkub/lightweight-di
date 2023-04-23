package pl.lightweight.di.injector;

import pl.lightweight.di.container.Container;
import pl.lightweight.di.exceptions.DependencyExistsException;
import pl.lightweight.di.injector.scanner.Scanner;

import java.nio.file.Path;
import java.util.List;

public class DependencyInjector {

    private Container container;
    private Scanner scanner;

    public DependencyInjector(Container container, Scanner scanner) {
        this.container = container;
        this.scanner = scanner;
    }

    public void createDependencies(String rootPath) {
        List<Path> dependencyCandidatesPaths = scanner.scan(rootPath);
        dependencyCandidatesPaths.forEach(dependecyPath -> {
            try {
                container.addDependency(createDependency(dependecyPath));
            } catch (DependencyExistsException e) {
                e.printStackTrace();
            }
        });

    }

    private Object createDependency(Path dependencyPath) {
        return new Object();
    }
}
