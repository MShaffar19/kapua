/*******************************************************************************
 * Copyright (c) 2016, 2020 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.service.datastore.internal.model;

import org.eclipse.kapua.service.datastore.model.ChannelInfo;
import org.eclipse.kapua.service.datastore.model.ChannelInfoListResult;
import org.eclipse.kapua.service.elasticsearch.client.model.ResultList;
import org.eclipse.kapua.service.storable.model.AbstractStorableListResult;

/**
 * Channel information query result list implementation
 *
 * @since 1.0.0
 */
public class ChannelInfoListResultImpl extends AbstractStorableListResult<ChannelInfo> implements ChannelInfoListResult {

    private static final long serialVersionUID = 1L;

    /**
     * Construct a channel info result list
     *
     * @since 1.0.0
     */
    public ChannelInfoListResultImpl() {
        super();
    }

    /**
     * Construct the channel info result list from the provided list
     *
     * @param resultList
     * @since 1.0.0
     */
    public ChannelInfoListResultImpl(ResultList<ChannelInfo> resultList) {
        super(resultList.getResult(), resultList.getTotalCount());
    }

}
