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
package org.eclipse.kapua.service.device.management.message.notification;

import org.eclipse.kapua.message.KapuaPayload;
import org.eclipse.kapua.model.id.KapuaId;

/**
 * {@link KapuaNotifyMessage} {@link KapuaPayload} definition.
 *
 * @since 1.0.0
 */
public interface KapuaNotifyPayload extends KapuaPayload {

    /**
     * @return
     * @since 1.0.0
     */
    KapuaId getOperationId();

    /**
     * @since 1.0.0
     */
    void setOperationId(KapuaId operationId);

    /**
     * @return
     * @since 1.0.0
     * @deprecated Since 1.2.0. Please make use of {@link KapuaNotifyChannel#getResources()}
     */
    @Deprecated
    String getResource();

    /**
     * @since 1.0.0
     * @deprecated Since 1.2.0. Please make use of {@link KapuaNotifyChannel#setResources(String[])}
     */
    @Deprecated
    void setResource(String resource);

    /**
     * @since 1.0.0
     */
    OperationStatus getStatus();

    /**
     * @since 1.0.0
     */
    void setStatus(OperationStatus status);

    /**
     * @since 1.0.0
     */
    Integer getProgress();

    /**
     * @since 1.0.0
     */
    void setProgress(Integer progress);

    /**
     * @since 1.2.0
     */
    String getMessage();

    /**
     * @since 1.2.0
     */
    void setMessage(String message);
}
