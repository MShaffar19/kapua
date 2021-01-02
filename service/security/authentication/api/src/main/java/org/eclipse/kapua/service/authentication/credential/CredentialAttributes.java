/*******************************************************************************
 * Copyright (c) 2016, 2021 Eurotech and/or its affiliates and others
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.service.authentication.credential;

import org.eclipse.kapua.model.KapuaUpdatableEntityAttributes;

/**
 * Credential predicates used to build query predicates.
 *
 * @since 1.0.0
 */
public class CredentialAttributes extends KapuaUpdatableEntityAttributes {

    public static final String USER_ID = "userId";
    public static final String CREDENTIAL_TYPE = "credentialType";
    public static final String CREDENTIAL_KEY = "credentialKey";
    public static final String EXPIRATION_DATE = "expirationDate";

}
