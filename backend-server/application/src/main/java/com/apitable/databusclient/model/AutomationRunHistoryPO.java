/*
 * databus-server
 * databus-server APIs
 *
 * The version of the OpenAPI document: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.apitable.databusclient.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.apitable.databusclient.JSON;

/**
 * AutomationRunHistoryPO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AutomationRunHistoryPO {
  public static final String SERIALIZED_NAME_ACTION_IDS = "actionIds";
  @SerializedName(SERIALIZED_NAME_ACTION_IDS)
  private String actionIds;

  public static final String SERIALIZED_NAME_ACTION_TYPE_IDS = "actionTypeIds";
  @SerializedName(SERIALIZED_NAME_ACTION_TYPE_IDS)
  private String actionTypeIds;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_ERROR_STACKS = "errorStacks";
  @SerializedName(SERIALIZED_NAME_ERROR_STACKS)
  private String errorStacks;

  public static final String SERIALIZED_NAME_ROBOT_ID = "robotId";
  @SerializedName(SERIALIZED_NAME_ROBOT_ID)
  private String robotId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_TASK_ID = "taskId";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private String taskId;

  public AutomationRunHistoryPO() {
  }

  public AutomationRunHistoryPO actionIds(String actionIds) {
    
    this.actionIds = actionIds;
    return this;
  }

   /**
   * Get actionIds
   * @return actionIds
  **/
  @javax.annotation.Nullable
  public String getActionIds() {
    return actionIds;
  }


  public void setActionIds(String actionIds) {
    this.actionIds = actionIds;
  }


  public AutomationRunHistoryPO actionTypeIds(String actionTypeIds) {
    
    this.actionTypeIds = actionTypeIds;
    return this;
  }

   /**
   * Get actionTypeIds
   * @return actionTypeIds
  **/
  @javax.annotation.Nullable
  public String getActionTypeIds() {
    return actionTypeIds;
  }


  public void setActionTypeIds(String actionTypeIds) {
    this.actionTypeIds = actionTypeIds;
  }


  public AutomationRunHistoryPO createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public AutomationRunHistoryPO errorStacks(String errorStacks) {
    
    this.errorStacks = errorStacks;
    return this;
  }

   /**
   * Get errorStacks
   * @return errorStacks
  **/
  @javax.annotation.Nullable
  public String getErrorStacks() {
    return errorStacks;
  }


  public void setErrorStacks(String errorStacks) {
    this.errorStacks = errorStacks;
  }


  public AutomationRunHistoryPO robotId(String robotId) {
    
    this.robotId = robotId;
    return this;
  }

   /**
   * Get robotId
   * @return robotId
  **/
  @javax.annotation.Nonnull
  public String getRobotId() {
    return robotId;
  }


  public void setRobotId(String robotId) {
    this.robotId = robotId;
  }


  public AutomationRunHistoryPO status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * minimum: 0
   * @return status
  **/
  @javax.annotation.Nonnull
  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    this.status = status;
  }


  public AutomationRunHistoryPO taskId(String taskId) {
    
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @javax.annotation.Nonnull
  public String getTaskId() {
    return taskId;
  }


  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutomationRunHistoryPO automationRunHistoryPO = (AutomationRunHistoryPO) o;
    return Objects.equals(this.actionIds, automationRunHistoryPO.actionIds) &&
        Objects.equals(this.actionTypeIds, automationRunHistoryPO.actionTypeIds) &&
        Objects.equals(this.createdAt, automationRunHistoryPO.createdAt) &&
        Objects.equals(this.errorStacks, automationRunHistoryPO.errorStacks) &&
        Objects.equals(this.robotId, automationRunHistoryPO.robotId) &&
        Objects.equals(this.status, automationRunHistoryPO.status) &&
        Objects.equals(this.taskId, automationRunHistoryPO.taskId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionIds, actionTypeIds, createdAt, errorStacks, robotId, status, taskId);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomationRunHistoryPO {\n");
    sb.append("    actionIds: ").append(toIndentedString(actionIds)).append("\n");
    sb.append("    actionTypeIds: ").append(toIndentedString(actionTypeIds)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    errorStacks: ").append(toIndentedString(errorStacks)).append("\n");
    sb.append("    robotId: ").append(toIndentedString(robotId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("actionIds");
    openapiFields.add("actionTypeIds");
    openapiFields.add("createdAt");
    openapiFields.add("errorStacks");
    openapiFields.add("robotId");
    openapiFields.add("status");
    openapiFields.add("taskId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("robotId");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("taskId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AutomationRunHistoryPO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AutomationRunHistoryPO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutomationRunHistoryPO is not found in the empty JSON string", AutomationRunHistoryPO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AutomationRunHistoryPO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AutomationRunHistoryPO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AutomationRunHistoryPO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("actionIds") != null && !jsonObj.get("actionIds").isJsonNull()) && !jsonObj.get("actionIds").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actionIds` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actionIds").toString()));
      }
      if ((jsonObj.get("actionTypeIds") != null && !jsonObj.get("actionTypeIds").isJsonNull()) && !jsonObj.get("actionTypeIds").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actionTypeIds` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actionTypeIds").toString()));
      }
      if (!jsonObj.get("createdAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdAt").toString()));
      }
      if ((jsonObj.get("errorStacks") != null && !jsonObj.get("errorStacks").isJsonNull()) && !jsonObj.get("errorStacks").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorStacks` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorStacks").toString()));
      }
      if (!jsonObj.get("robotId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `robotId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("robotId").toString()));
      }
      if (!jsonObj.get("taskId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taskId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taskId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AutomationRunHistoryPO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutomationRunHistoryPO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutomationRunHistoryPO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutomationRunHistoryPO.class));

       return (TypeAdapter<T>) new TypeAdapter<AutomationRunHistoryPO>() {
           @Override
           public void write(JsonWriter out, AutomationRunHistoryPO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AutomationRunHistoryPO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AutomationRunHistoryPO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AutomationRunHistoryPO
  * @throws IOException if the JSON string is invalid with respect to AutomationRunHistoryPO
  */
  public static AutomationRunHistoryPO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutomationRunHistoryPO.class);
  }

 /**
  * Convert an instance of AutomationRunHistoryPO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

