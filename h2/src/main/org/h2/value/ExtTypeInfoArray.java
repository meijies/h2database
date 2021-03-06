/*
 * Copyright 2004-2020 H2 Group. Multiple-Licensed under the MPL 2.0,
 * and the EPL 1.0 (https://h2database.com/html/license.html).
 * Initial Developer: H2 Group
 */
package org.h2.value;

import java.util.Objects;

/**
 * Extended parameters of the ARRAY data type.
 */
public final class ExtTypeInfoArray extends ExtTypeInfo {

    private final TypeInfo componentType;

    /**
     * Creates new instance of extended parameters of the ARRAY data type.
     *
     * @param componentType
     *            the type of elements
     */
    public ExtTypeInfoArray(TypeInfo componentType) {
        this.componentType = componentType;
    }

    @Override
    public int hashCode() {
        return (componentType == null) ? 0 : componentType.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != ExtTypeInfoArray.class) {
            return false;
        }
        return Objects.equals(componentType, ((ExtTypeInfoArray) obj).componentType);
    }

    @Override
    public String getCreateSQL() {
        return componentType.toString();
    }

    /**
     * Returns the type of elements.
     *
     * @return the type of elements
     */
    public TypeInfo getComponentType() {
        return componentType;
    }

}
