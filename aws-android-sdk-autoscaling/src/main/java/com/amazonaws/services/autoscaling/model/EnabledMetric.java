/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an enabled metric.
 * </p>
 */
public class EnabledMetric implements Serializable {
    /**
     * <p>
     * One of the following metrics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GroupMinSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupMaxSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalInstances</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String metric;

    /**
     * <p>
     * The granularity of the metric. The only valid value is
     * <code>1Minute</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String granularity;

    /**
     * <p>
     * One of the following metrics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GroupMinSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupMaxSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalInstances</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         One of the following metrics:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>GroupMinSize</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupMaxSize</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupDesiredCapacity</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupInServiceInstances</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupPendingInstances</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupStandbyInstances</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupTerminatingInstances</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupTotalInstances</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getMetric() {
        return metric;
    }

    /**
     * <p>
     * One of the following metrics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GroupMinSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupMaxSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalInstances</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param metric <p>
     *            One of the following metrics:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>GroupMinSize</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupMaxSize</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupDesiredCapacity</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupInServiceInstances</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupPendingInstances</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupStandbyInstances</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupTerminatingInstances</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupTotalInstances</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * One of the following metrics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GroupMinSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupMaxSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalInstances</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param metric <p>
     *            One of the following metrics:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>GroupMinSize</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupMaxSize</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupDesiredCapacity</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupInServiceInstances</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupPendingInstances</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupStandbyInstances</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupTerminatingInstances</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GroupTotalInstances</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnabledMetric withMetric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * <p>
     * The granularity of the metric. The only valid value is
     * <code>1Minute</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The granularity of the metric. The only valid value is
     *         <code>1Minute</code>.
     *         </p>
     */
    public String getGranularity() {
        return granularity;
    }

    /**
     * <p>
     * The granularity of the metric. The only valid value is
     * <code>1Minute</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param granularity <p>
     *            The granularity of the metric. The only valid value is
     *            <code>1Minute</code>.
     *            </p>
     */
    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }

    /**
     * <p>
     * The granularity of the metric. The only valid value is
     * <code>1Minute</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param granularity <p>
     *            The granularity of the metric. The only valid value is
     *            <code>1Minute</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnabledMetric withGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMetric() != null)
            sb.append("Metric: " + getMetric() + ",");
        if (getGranularity() != null)
            sb.append("Granularity: " + getGranularity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
        hashCode = prime * hashCode
                + ((getGranularity() == null) ? 0 : getGranularity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnabledMetric == false)
            return false;
        EnabledMetric other = (EnabledMetric) obj;

        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        if (other.getGranularity() == null ^ this.getGranularity() == null)
            return false;
        if (other.getGranularity() != null
                && other.getGranularity().equals(this.getGranularity()) == false)
            return false;
        return true;
    }
}
