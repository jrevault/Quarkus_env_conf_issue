# Quarkus_env_conf_issue

Objective is to load the configuration from an external file.
Path of the file is given via an environment variable :
QUARKUS_CONF_FILE="application.properties"

Class issue.EnvCongigSource extends ConfigSource

An endpoint (IssueEndpoint) is just reading a property 'from.env' wich is :
- false in the ./src/main/resources/application.properties
- true in the ./application.properties (given by the env variable)

File org.eclipse.microprofile.config.spi.ConfigSource is declaring the EnvCongigSource class.

On startup here is the exception :
15:41:51,984 ERROR [io.qua.dev.DevModeMain] Failed to start quarkus: java.util.ServiceConfigurationError: org.eclipse.microprofile.config.spi.ConfigSource: Provider issue.EnvCongigSource could not be instantiated
        at java.util.ServiceLoader.fail(ServiceLoader.java:232)
        at java.util.ServiceLoader.access$100(ServiceLoader.java:185)
        at java.util.ServiceLoader$LazyIterator.nextService(ServiceLoader.java:384)
        at java.util.ServiceLoader$LazyIterator.next(ServiceLoader.java:404)
        at java.util.ServiceLoader$1.next(ServiceLoader.java:480)
        at java.lang.Iterable.forEach(Iterable.java:74)
        at io.smallrye.config.SmallRyeConfigBuilder.discoverSources(SmallRyeConfigBuilder.java:76)
        at io.smallrye.config.SmallRyeConfigBuilder.build(SmallRyeConfigBuilder.java:190)
        at io.quarkus.deployment.ExtensionLoader.loadStepsFrom(ExtensionLoader.java:213)
        at io.quarkus.deployment.ExtensionLoader.loadStepsFrom(ExtensionLoader.java:137)
        at io.quarkus.deployment.QuarkusAugmentor.run(QuarkusAugmentor.java:75)
        at io.quarkus.runner.RuntimeRunner.run(RuntimeRunner.java:107)
        at io.quarkus.dev.DevModeMain.doStart(DevModeMain.java:180)
        at io.quarkus.dev.DevModeMain.start(DevModeMain.java:94)
        at io.quarkus.dev.DevModeMain.main(DevModeMain.java:66)
Caused by: java.lang.InstantiationException
        at sun.reflect.InstantiationExceptionConstructorAccessorImpl.newInstance(InstantiationExceptionConstructorAccessorImpl.java:48)
        at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
        at java.lang.Class.newInstance(Class.java:442)
        at java.util.ServiceLoader$LazyIterator.nextService(ServiceLoader.java:380)
        ... 12 more
