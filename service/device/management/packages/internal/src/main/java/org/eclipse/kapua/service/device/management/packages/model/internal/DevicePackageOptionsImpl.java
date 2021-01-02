/*******************************************************************************
 * Copyright (c) 2019, 2021 Eurotech and/or its affiliates and others
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
package org.eclipse.kapua.service.device.management.packages.model.internal;

import org.eclipse.kapua.service.device.management.packages.model.DevicePackageOptions;

/**
 * {@link DevicePackageOptions} {@code abstract} implementation.
 *
 * @since 1.1.0
 */
public abstract class DevicePackageOptionsImpl implements DevicePackageOptions {

    private Long timeout;

    @Override
    public Long getTimeout() {
        return timeout;
    }

    @Override
    public void setTimeout(Long timeout) {
        this.timeout = timeout;
    }
}
