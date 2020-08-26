/*******************************************************************************
 * Copyright (c) 2018, 2020 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.app.console.module.api.client.ui.grid;

import org.eclipse.kapua.app.console.module.api.client.messages.ConsoleMessages;
import org.eclipse.kapua.app.console.module.api.shared.model.GwtEntityModel;

import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.grid.ColumnData;
import com.extjs.gxt.ui.client.widget.grid.Grid;
import com.extjs.gxt.ui.client.widget.grid.GridCellRenderer;
import com.google.gwt.core.client.GWT;

public class CreatedByNameCellRenderer<M extends GwtEntityModel> implements GridCellRenderer<M> {

    private static final ConsoleMessages CMSGS = GWT.create(ConsoleMessages.class);

    @Override
    public Object render(M model, String property, ColumnData config, int rowIndex, int colIndex, ListStore<M> store,
            Grid<M> grid) {
        return model.getCreatedByName() != null ? model.getCreatedByName() : CMSGS.notAvailable();
    }
}
