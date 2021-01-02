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
package org.eclipse.kapua.service.account;

import org.eclipse.kapua.model.KapuaNamedEntityAttributes;

/**
 * {@link AccountAttributes} attributes.
 *
 * @see org.eclipse.kapua.model.KapuaEntityAttributes
 * @since 1.0.0
 */
public class AccountAttributes extends KapuaNamedEntityAttributes {

    public static final String PARENT_ACCOUNT_PATH = "parentAccountPath";

    public static final String CHILD_ACCOUNTS = "childAccounts";

    public static final String ORGANIZATION = "organization";

    public static final String ORGANIZATION_NAME = ORGANIZATION + ".name";

    public static final String ORGANIZATION_EMAIL = ORGANIZATION + ".email";

    public static final String EXPIRATION_DATE = "expirationDate";

    public static final String CONTACT_NAME = ORGANIZATION + ".personName";

    public static final String PHONE_NUMBER = ORGANIZATION + ".phoneNumber";

    public static final String ADDRESS_1 = ORGANIZATION + ".addressLine1";

    public static final String ADDRESS_2 = ORGANIZATION + ".addressLine2";

    public static final String ZIP_POST_CODE = ORGANIZATION + ".zipPostCode";

    public static final String ORGANIZATION_CITY = ORGANIZATION + ".city";

    public static final String STATE_PROVINCE = ORGANIZATION + ".stateProvinceCounty";

    public static final String ORGANIZATION_COUNTRY = ORGANIZATION + ".country";
}
