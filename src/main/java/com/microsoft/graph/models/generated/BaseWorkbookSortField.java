// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.WorkbookIcon;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Sort Field.
 */
public class BaseWorkbookSortField implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Ascending.
     * Represents whether the sorting is done in an ascending fashion.
     */
    @SerializedName("ascending")
    @Expose
    public Boolean ascending;

    /**
     * The Color.
     * Represents the color that is the target of the condition if the sorting is on font or cell color.
     */
    @SerializedName("color")
    @Expose
    public String color;

    /**
     * The Data Option.
     * Represents additional sorting options for this field. The possible values are: Normal, TextAsNumber.
     */
    @SerializedName("dataOption")
    @Expose
    public String dataOption;

    /**
     * The Icon.
     * Represents the icon that is the target of the condition if the sorting is on the cell's icon.
     */
    @SerializedName("icon")
    @Expose
    public WorkbookIcon icon;

    /**
     * The Key.
     * Represents the column (or row, depending on the sort orientation) that the condition is on. Represented as an offset from the first column (or row).
     */
    @SerializedName("key")
    @Expose
    public Integer key;

    /**
     * The Sort On.
     * Represents the type of sorting of this condition. The possible values are: Value, CellColor, FontColor, Icon.
     */
    @SerializedName("sortOn")
    @Expose
    public String sortOn;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
