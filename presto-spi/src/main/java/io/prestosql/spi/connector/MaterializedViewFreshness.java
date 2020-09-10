/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.prestosql.spi.connector;

import java.util.Objects;

/**
 * The class is used to determine the freshness of a materialized view. The flag
 * materializedViewFresh when false, indicates that the materialized view is fresh.
 */
public final class MaterializedViewFreshness
{
    private final boolean materializedViewFresh;

    public MaterializedViewFreshness(boolean materializedViewFresh)
    {
        this.materializedViewFresh = materializedViewFresh;
    }

    public boolean isMaterializedViewFresh()
    {
        return materializedViewFresh;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }
        MaterializedViewFreshness that = (MaterializedViewFreshness) obj;
        return Objects.equals(materializedViewFresh, that.materializedViewFresh);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(materializedViewFresh);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder("MaterializedViewFreshness{");
        sb.append("materializedViewFresh=").append(materializedViewFresh);
        sb.append('}');
        return sb.toString();
    }
}
