/*******************************************************************************
 * Copyright (c) 2017, 2020 Red Hat Inc and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat Inc - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.kura.simulator.generator;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Payload {

    private final ByteBuffer body;
    private final Position position;
    private final Map<String, Object> metrics;

    private static ByteBuffer copy(final ByteBuffer source) {
        if (source == null || !source.hasRemaining()) {
            return null;
        }

        final ByteBuffer result = ByteBuffer.allocate(source.remaining());
        result.put(source);
        result.flip();
        return result.asReadOnlyBuffer();
    }

    public Payload(final ByteBuffer body, final Position position, final Map<String, Object> metrics) {
        this.body = copy(body);
        this.position = position;
        this.metrics = metrics != null ? Collections.unmodifiableMap(new HashMap<>(metrics)) : Collections.emptyMap();
    }

    public Payload(final Map<String, Object> metrics) {
        this(null, null, metrics);
    }

    public ByteBuffer getBody() {
        return this.body;
    }

    public Position getPosition() {
        return this.position;
    }

    public Map<String, Object> getMetrics() {
        return this.metrics;
    }
}
