package ch.ethz.vppserver.ippclient;

import java.util.List;

import org.cups4j.ipp.attributes.AttributeGroup;

/**
 * Copyright (C) 2008 ITS of ETH Zurich, Switzerland, Sarah Windler Burri
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 3 of the License, or (at your option) any
 * later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.
 * 
 * See the GNU Lesser General Public License for more details. You should have
 * received a copy of the GNU Lesser General Public License along with this
 * program; if not, see <http://www.gnu.org/licenses/>.
 */
public class IppResult {
  private String httpStatusResponse = null;
  private String ippStatusResponse = null;
  private List<AttributeGroup> attributeGroupList = null;
  private int httpStatusCode;

  public IppResult() {
  }

  /**
   * 
   * @return
   */
  public String getHttpStatusResponse() {
    return httpStatusResponse;
  }

  /**
   * 
   * @param statusResponse
   */
  public void setHttpStatusResponse(String statusResponse) {
    httpStatusResponse = statusResponse;
  }

  /**
   * 
   * @return
   */
  public String getIppStatusResponse() {
    return ippStatusResponse;
  }

  /**
   * 
   * @param statusResponse
   */
  public void setIppStatusResponse(String statusResponse) {
    ippStatusResponse = statusResponse;
  }

  /**
   * 
   * @return
   */
  public List<AttributeGroup> getAttributeGroupList() {
    return attributeGroupList;
  }

  /**
   * 
   * @param group
   */
  public void setAttributeGroupList(List<AttributeGroup> group) {
    attributeGroupList = group;
  }

  public int getHttpStatusCode() {
    return httpStatusCode;
  }

  public void setHttpStatusCode(int httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }
  
}
