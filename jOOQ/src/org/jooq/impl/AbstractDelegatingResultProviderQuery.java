/**
 * Copyright (c) 2010, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name of the "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.jooq.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.Select;
import org.jooq.Table;

abstract class AbstractDelegatingResultProviderQuery<R extends Record> extends AbstractQueryPart implements
    Select<R> {

    /**
     * Generated UID
     */
    private static final long              serialVersionUID = 3382400928803573548L;
    protected final Select<R> query;

    AbstractDelegatingResultProviderQuery(SQLDialect dialect, Select<R> query) {
        super(dialect);

        this.query = query;
    }

    @Override
    public final Class<? extends R> getRecordType() {
        return query.getRecordType();
    }

    @Override
    public final List<Field<?>> getSelect() {
        return query.getSelect();
    }

    @Override
    public final String toSQLDeclaration(boolean inlineParameters) {
        return query.getQueryPart().toSQLDeclaration(inlineParameters);
    }

    @Override
    public final String toSQLReference(boolean inlineParameters) {
        return query.getQueryPart().toSQLReference(inlineParameters);
    }

    @Override
    public final int bind(PreparedStatement stmt, int initialIndex) throws SQLException {
        return query.getQueryPart().bind(stmt, initialIndex);
    }

    @Override
    public final Result<R> getResult() {
        return query.getResult();
    }

    @Override
    public final Result<R> fetch() throws SQLException {
        return query.fetch();
    }

    @Override
    public final R fetchOne() throws SQLException {
        return query.fetchOne();
    }

    @Override
    public final R fetchAny() throws SQLException {
        return query.fetchAny();
    }

    @Override
    public final int execute() throws SQLException {
        return query.execute();
    }

    @Override
    public final Configuration getConfiguration() {
        return query.getConfiguration();
    }

    @Override
    public final Table<R> asTable() {
        return query.asTable();
    }

    @Override
    public final Table<R> asTable(String alias) {
        return query.asTable(alias);
    }

    @Override
    public final <T> Field<T> asField() {
        return query.asField();
    }

    @Override
    public final <T> Field<T> asField(String alias) {
        return query.asField(alias);
    }

    @Override
    public final <T> Field<T> getField(Field<T> field) {
        return query.asTable().getField(field);
    }

    @Override
    public final Field<?> getField(String name) {
        return query.asTable().getField(name);
    }

    @Override
    public final List<Field<?>> getFields() {
        return query.asTable().getFields();
    }
}
