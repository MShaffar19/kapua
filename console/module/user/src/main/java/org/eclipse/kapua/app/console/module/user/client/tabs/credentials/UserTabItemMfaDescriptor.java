/*******************************************************************************
 * Copyright (c) 2020, 2021 Eurotech and/or its affiliates and others
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
package org.eclipse.kapua.app.console.module.user.client.tabs.credentials;

import org.eclipse.kapua.app.console.module.api.client.ui.view.descriptor.AbstractEntityTabDescriptor;
import org.eclipse.kapua.app.console.module.api.shared.model.session.GwtSession;
import org.eclipse.kapua.app.console.module.authentication.shared.model.permission.CredentialSessionPermission;
import org.eclipse.kapua.app.console.module.user.client.UserView;
import org.eclipse.kapua.app.console.module.user.shared.model.GwtUser;

public class UserTabItemMfaDescriptor extends AbstractEntityTabDescriptor<GwtUser, UserTabItemMfa, UserView> {

    @Override
    public UserTabItemMfa getTabViewInstance(UserView view, GwtSession currentSession) {
        return new UserTabItemMfa(currentSession);
    }

    @Override
    public String getViewId() {
        return "user.mfa";
    }

    @Override
    public Integer getOrder() {
        return 250;
    }

    @Override
    public Boolean isEnabled(GwtSession currentSession) {
        return currentSession.hasPermission(CredentialSessionPermission.read());
    }
}
