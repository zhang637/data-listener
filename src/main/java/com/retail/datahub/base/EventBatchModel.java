package com.retail.datahub.base;

import java.io.Serializable;

/**
 * Created by red on 2016/3/11.
 */
public class EventBatchModel implements Serializable{
    private Long batchId;

    private String dbName;

    private String logicTableName;

    private String realTableName;

    private long executionTime;

    private String eventType;

    private RowDataModel[] rowData;

    private String eventDate;

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getLogicTableName() {
        return logicTableName;
    }

    public void setLogicTableName(String logicTableName) {
        this.logicTableName = logicTableName;
    }

    public String getRealTableName() {
        return realTableName;
    }

    public void setRealTableName(String realTableName) {
        this.realTableName = realTableName;
    }

    public long getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(long executionTime) {
        this.executionTime = executionTime;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public RowDataModel[] getRowData() {
        return rowData;
    }

    public void setRowData(RowDataModel[] rowData) {
        this.rowData = rowData;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventBatchModel that = (EventBatchModel) o;

        if (!dbName.equals(that.dbName)) return false;
        if (!realTableName.equals(that.realTableName)) return false;
        if (!eventDate.equals(that.eventDate)) return false;
        return eventType.equals(that.eventType);

    }

    @Override
    public int hashCode() {
        int result = dbName.hashCode();
        result = 31 * result + realTableName.hashCode();
        result = 31 * result + eventType.hashCode();
        result = 31 * result + eventDate.hashCode();
        return result;
    }

}
