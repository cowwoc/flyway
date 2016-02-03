package org.flywaydb.core.api.migration.spring;

import org.flywaydb.core.api.configuration.ConfigurationAware;
import org.flywaydb.core.api.configuration.FlywayConfiguration;

/**
 * Convenience implementation if {@link SpringJdbcMigration}. {@link ConfigurationAware#setFlywayConfiguration(FlywayConfiguration)}
 * is implemented by storing the configuration in a field. It is encouraged to subclass this class instead of implementing
 * SpringJdbcMigration directly, to guard against possible API additions in future major releases of Flyway.
 */
public abstract class BaseSpringJdbcMigration implements SpringJdbcMigration, ConfigurationAware {

    protected FlywayConfiguration flywayConfiguration;

    @Override
    public void setFlywayConfiguration(FlywayConfiguration flywayConfiguration) {
        this.flywayConfiguration = flywayConfiguration;
    }
}
