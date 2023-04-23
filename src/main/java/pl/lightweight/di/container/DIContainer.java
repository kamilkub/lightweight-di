package pl.lightweight.di.container;

import pl.lightweight.di.exceptions.DependencyExistsException;
import pl.lightweight.di.utils.NameUtils;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DIContainer implements Container {

    private HashMap<String, Object> dependencies;

    public DIContainer() {
        this.dependencies = new HashMap<>();
    }

    public List<String> getAvailableDependenciesName() {
        return new ArrayList<>(dependencies.keySet());
    }

    @Override
    public Object getQualifiedDependency(String dependencyName) {
        return dependencies.getOrDefault(dependencyName, null);
    }

    @Override
    public void addDependency(Object dependency) throws DependencyExistsException {
        String camelCaseName = NameUtils.toCamelCase(dependency.getClass().getSimpleName());

        if(this.dependencies.containsKey(camelCaseName)) {
            throw new DependencyExistsException();
        }

        this.dependencies.put(NameUtils.toCamelCase(dependency.getClass().getSimpleName()), dependency);
    }


}
