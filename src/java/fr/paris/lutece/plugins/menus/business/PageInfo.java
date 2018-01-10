/*
 * Copyright (c) 2002-2017, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */

package fr.paris.lutece.plugins.menus.business;

import java.io.Serializable;

import fr.paris.lutece.portal.business.page.Page;

/**
 * PageInfo
 */
public class PageInfo implements Serializable
{
	private static final long serialVersionUID = 1106190081472015466L;
	private int _nId;
    private String _strName;
    private String _strDescription;
    private int _nParentPageId;

    /**
     * Contructor
     * @param page the corresponding page instance
     */
    PageInfo( Page page )
    {
        _nId = page.getId();
        _strName = page.getName();
        _strDescription = page.getDescription();
        _nParentPageId = page.getParentPageId();
    }

    /**
     * @return the id
     */
    public int getId()
    {
        return _nId;
    }

    /**
     * @param id the id to set
     */
    public void setId( int id )
    {
        _nId = id;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return _strName;
    }

    /**
     * @param name the name to set
     */
    public void setName( String name )
    {
        _strName = name;
    }

    /**
     * @return the description
     */
    public String getDescription()
    {
        return _strDescription;
    }

    /**
     * @param description the description to set
     */
    public void setDescription( String description )
    {
        _strDescription = description;
    }
    
    /**
     * @return the id
     */
    public int getParentPageId()
    {
        return _nParentPageId;
    }

    /**
     * @param nParentPageId the id to set
     */
    public void setParentPageId( int nParentPageId )
    {
        _nParentPageId = nParentPageId;
    }

}
