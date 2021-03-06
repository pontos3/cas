package org.apereo.cas.configuration.model.support.passwordless.account;

import org.apereo.cas.configuration.model.SpringResourceProperties;
import org.apereo.cas.configuration.support.RequiresModule;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * This is {@link PasswordlessAuthenticationJsonAccountsProperties}.
 *
 * @author Misagh Moayyed
 * @since 6.2.0
 */
@RequiresModule(name = "cas-server-support-passwordless")
@Getter
@Setter
@Accessors(chain = true)
public class PasswordlessAuthenticationJsonAccountsProperties extends SpringResourceProperties {
    private static final long serialVersionUID = 8079027843747126083L;
}
