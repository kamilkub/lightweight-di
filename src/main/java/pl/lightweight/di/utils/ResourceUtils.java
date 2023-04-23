package pl.lightweight.di.utils;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.List;

public class ResourceUtils {

    public static List<File> getProjectDirectories(String rootPath) throws IOException {
        List<File> classFiles = Files.walk(Path.of(rootPath))
                .map(Path::toFile)
                .filter(File::isFile)
                .filter(file -> file.getName().endsWith(".java"))
                .collect(Collectors.toList());


        return classFiles;
    }

}
