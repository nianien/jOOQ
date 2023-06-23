/*
 * This file is generated by jOOQ.
 */
package org.jooq.impl;


import java.sql.Timestamp;

import org.jooq.Record1;
import org.jooq.impl.MigrationImpl.Resolution;
import org.jooq.impl.MigrationImpl.Status;


/**
 * The migration history of jOOQ Migrations.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
class HistoryRecord extends UpdatableRecordImpl<HistoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>JOOQ_MIGRATION_HISTORY.ID</code>. The database version
     * ID.
     */
    HistoryRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>JOOQ_MIGRATION_HISTORY.ID</code>. The database version
     * ID.
     */
    Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>JOOQ_MIGRATION_HISTORY.MIGRATED_AT</code>. The date/time
     * when the database version was migrated to.
     */
    HistoryRecord setMigratedAt(Timestamp value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>JOOQ_MIGRATION_HISTORY.MIGRATED_AT</code>. The date/time
     * when the database version was migrated to.
     */
    Timestamp getMigratedAt() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>JOOQ_MIGRATION_HISTORY.MIGRATED_FROM</code>. The
     * previous database version ID.
     */
    HistoryRecord setMigratedFrom(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>JOOQ_MIGRATION_HISTORY.MIGRATED_FROM</code>. The
     * previous database version ID.
     */
    String getMigratedFrom() {
        return (String) get(2);
    }

    /**
     * Setter for <code>JOOQ_MIGRATION_HISTORY.MIGRATED_TO</code>. The current
     * database version ID.
     */
    HistoryRecord setMigratedTo(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>JOOQ_MIGRATION_HISTORY.MIGRATED_TO</code>. The current
     * database version ID.
     */
    String getMigratedTo() {
        return (String) get(3);
    }

    /**
     * Setter for <code>JOOQ_MIGRATION_HISTORY.MIGRATED_TO_TAGS</code>. The
     * current database version tags, if any, in JSON array format.
     */
    HistoryRecord setMigratedToTags(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>JOOQ_MIGRATION_HISTORY.MIGRATED_TO_TAGS</code>. The
     * current database version tags, if any, in JSON array format.
     */
    String getMigratedToTags() {
        return (String) get(4);
    }

    /**
     * Setter for <code>JOOQ_MIGRATION_HISTORY.MIGRATION_TIME</code>. The time
     * in milliseconds it took to migrate to this database version.
     */
    HistoryRecord setMigrationTime(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>JOOQ_MIGRATION_HISTORY.MIGRATION_TIME</code>. The time
     * in milliseconds it took to migrate to this database version.
     */
    Long getMigrationTime() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>JOOQ_MIGRATION_HISTORY.JOOQ_VERSION</code>. The jOOQ
     * version used to migrate to this database version.
     */
    HistoryRecord setJooqVersion(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>JOOQ_MIGRATION_HISTORY.JOOQ_VERSION</code>. The jOOQ
     * version used to migrate to this database version.
     */
    String getJooqVersion() {
        return (String) get(6);
    }

    /**
     * Setter for <code>JOOQ_MIGRATION_HISTORY.SQL</code>. The SQL statements
     * that were run to install this database version.
     */
    HistoryRecord setSql(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>JOOQ_MIGRATION_HISTORY.SQL</code>. The SQL statements
     * that were run to install this database version.
     */
    String getSql() {
        return (String) get(7);
    }

    /**
     * Setter for <code>JOOQ_MIGRATION_HISTORY.SQL_COUNT</code>. The number of
     * SQL statements that were run to install this database version.
     */
    HistoryRecord setSqlCount(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>JOOQ_MIGRATION_HISTORY.SQL_COUNT</code>. The number of
     * SQL statements that were run to install this database version.
     */
    Integer getSqlCount() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>JOOQ_MIGRATION_HISTORY.STATUS</code>. The database
     * version installation status.
     */
    HistoryRecord setStatus(Status value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>JOOQ_MIGRATION_HISTORY.STATUS</code>. The database
     * version installation status.
     */
    Status getStatus() {
        return (Status) get(9);
    }

    /**
     * Setter for <code>JOOQ_MIGRATION_HISTORY.STATUS_MESSAGE</code>. Any info
     * or error message explaining the status.
     */
    HistoryRecord setStatusMessage(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>JOOQ_MIGRATION_HISTORY.STATUS_MESSAGE</code>. Any info
     * or error message explaining the status.
     */
    String getStatusMessage() {
        return (String) get(10);
    }

    /**
     * Setter for <code>JOOQ_MIGRATION_HISTORY.RESOLUTION</code>. The error
     * resolution, if any.
     */
    HistoryRecord setResolution(Resolution value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>JOOQ_MIGRATION_HISTORY.RESOLUTION</code>. The error
     * resolution, if any.
     */
    Resolution getResolution() {
        return (Resolution) get(11);
    }

    /**
     * Setter for <code>JOOQ_MIGRATION_HISTORY.RESOLUTION_MESSAGE</code>. Any
     * info or error message explaining the resolution.
     */
    HistoryRecord setResolutionMessage(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>JOOQ_MIGRATION_HISTORY.RESOLUTION_MESSAGE</code>. Any
     * info or error message explaining the resolution.
     */
    String getResolutionMessage() {
        return (String) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HistoryRecord
     */
    HistoryRecord() {
        super(History.HISTORY);
    }

    /**
     * Create a detached, initialised HistoryRecord
     */
    HistoryRecord(Integer id, Timestamp migratedAt, String migratedFrom, String migratedTo, String migratedToTags, Long migrationTime, String jooqVersion, String sql, Integer sqlCount, Status status, String statusMessage, Resolution resolution, String resolutionMessage) {
        super(History.HISTORY);

        setId(id);
        setMigratedAt(migratedAt);
        setMigratedFrom(migratedFrom);
        setMigratedTo(migratedTo);
        setMigratedToTags(migratedToTags);
        setMigrationTime(migrationTime);
        setJooqVersion(jooqVersion);
        setSql(sql);
        setSqlCount(sqlCount);
        setStatus(status);
        setStatusMessage(statusMessage);
        setResolution(resolution);
        setResolutionMessage(resolutionMessage);
        resetChangedOnNotNull();
    }
}