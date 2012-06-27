/**
 * DynamicReports - Free Java reporting library for creating reports dynamically
 *
 * Copyright (C) 2010 - 2012 Ricardo Mariaca
 * http://dynamicreports.sourceforge.net
 *
 * This file is part of DynamicReports.
 *
 * DynamicReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * DynamicReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with DynamicReports. If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.dynamicreports.report.base.chart.plot;

import net.sf.dynamicreports.report.constant.Constants;
import net.sf.dynamicreports.report.definition.chart.plot.DRIBar3DPlot;

/**
 * @author Ricardo Mariaca (dynamicreports@gmail.com)
 */
public class DRBar3DPlot extends DRAxisPlot implements DRIBar3DPlot {
	private static final long serialVersionUID = Constants.SERIAL_VERSION_UID;
	
	private Double xOffset;
	private Double yOffset;
	private Boolean showLabels;

	public void setXOffset(Double xOffset) {
		this.xOffset = xOffset;
	}

	@Override
	public Double getXOffset() {
		return xOffset;
	}

	public void setYOffset(Double yOffset) {
		this.yOffset = yOffset;
	}

	@Override
	public Double getYOffset() {
		return yOffset;
	}

	public void setShowLabels(Boolean showLabels) {
		this.showLabels = showLabels;
	}

	@Override
	public Boolean getShowLabels() {
		return showLabels;
	}
}
