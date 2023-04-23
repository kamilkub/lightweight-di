package pl.lightweight.di.injector.scanner;

import java.nio.file.Path;

import java.util.List;

public interface Scanner {
    List<Path> scan(String rootPath);
}
