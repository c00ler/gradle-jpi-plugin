package org.jenkinsci.gradle.plugins.jpi.internal;

import org.gradle.api.provider.Property;
import org.gradle.api.provider.Provider;

import java.net.URI;

public interface JpiExtensionBridge {
    Property<String> getPluginId();
    Property<String> getHumanReadableName();
    Property<URI> getHomePage();
    Provider<String> getJenkinsCoreVersion();
    Property<String> getMinimumJenkinsCoreVersion();
    Property<Boolean> getSandboxed();
}
