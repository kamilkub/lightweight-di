package pl.lightweight.di.container;

import pl.lightweight.di.exceptions.DependencyExistsException;

public interface Container {

    Object getQualifiedDependency(String dependencyName);
    void addDependency(Object dependency) throws DependencyExistsException;
}
