// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.TeamsAppDefinition;
import com.microsoft.graph.requests.extensions.ITeamsAppDefinitionCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Teams App Definition Collection Page.
 */
public class BaseTeamsAppDefinitionCollectionPage extends BaseCollectionPage<TeamsAppDefinition, ITeamsAppDefinitionCollectionRequestBuilder> implements IBaseTeamsAppDefinitionCollectionPage {

    /**
     * A collection page for TeamsAppDefinition
     *
     * @param response the serialized BaseTeamsAppDefinitionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseTeamsAppDefinitionCollectionPage(final BaseTeamsAppDefinitionCollectionResponse response, final ITeamsAppDefinitionCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
