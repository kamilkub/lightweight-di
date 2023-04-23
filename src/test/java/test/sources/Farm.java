package test.sources;

import pl.lightweight.di.annotations.Dependency;
import pl.lightweight.di.annotations.Inject;

@Dependency
public class Farm {

    @Inject
    private Cat cat;
}
