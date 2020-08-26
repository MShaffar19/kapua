/*******************************************************************************
 * Copyright (c) 2017, 2020 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.app.console.module.data.client;

import org.eclipse.kapua.app.console.module.api.client.resources.icons.IconSet;
import org.eclipse.kapua.app.console.module.api.client.ui.view.View;
import org.eclipse.kapua.app.console.module.api.client.ui.view.descriptor.AbstractMainViewDescriptor;
import org.eclipse.kapua.app.console.module.api.shared.model.session.GwtSession;
import org.eclipse.kapua.app.console.module.data.shared.model.permission.DatastoreSessionPermission;

public class DataViewDescriptor extends AbstractMainViewDescriptor {

    @Override
    public String getViewId() {
        return "data";
    }

    @Override
    public IconSet getIcon() {
        return IconSet.DATABASE;
    }

    @Override
    public Integer getOrder() {
        return 500;
    }

    @Override
    public String getName() {
        return DataView.getName();
    }

    @Override
    public View getViewInstance(GwtSession currentSession) {
        return new DataView(currentSession);
    }

    @Override
    public Boolean isEnabled(GwtSession currentSession) {
        return !currentSession.isDatastoreDisabled() && currentSession.hasPermission(DatastoreSessionPermission.read());
    }
}
