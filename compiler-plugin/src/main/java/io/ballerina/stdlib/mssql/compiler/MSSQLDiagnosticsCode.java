/*
 * Copyright (c) 2021, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.ballerina.stdlib.mssql.compiler;

import io.ballerina.tools.diagnostics.DiagnosticSeverity;

import static io.ballerina.tools.diagnostics.DiagnosticSeverity.ERROR;
import static io.ballerina.tools.diagnostics.DiagnosticSeverity.HINT;

/**
 * Enum class to hold MSSQL module diagnostic codes.
 */
public enum MSSQLDiagnosticsCode {

    //SQL ConnectionPool Validations at init
    // todo See if this can be taken from the dependency.
    SQL_101("SQL_101", "invalid value: expected value is greater than one", ERROR),
    SQL_102("SQL_102", "invalid value: expected value is greater than zero", ERROR),
    SQL_103("SQL_103", "invalid value: expected value is greater than or equal to 30", ERROR),

    MSSQL_101("MSSQL_101", "invalid value: expected value is greater than or equal to zero", ERROR),
    MSSQL_102("MSSQL_102", "invalid value: expected value is greater than or equal to -1", ERROR),

    MSSQL_901("MSSQL_901", "parameter 'rowType' should be explicitly passed when the return data is ignored", HINT),
    MSSQL_902("MSSQL_902", "parameter 'returnType' should be explicitly passed when the return data is ignored", HINT);

    private final String code;
    private final String message;
    private final DiagnosticSeverity severity;

    MSSQLDiagnosticsCode(String code, String message, DiagnosticSeverity severity) {
        this.code = code;
        this.message = message;
        this.severity = severity;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public DiagnosticSeverity getSeverity() {
        return severity;
    }
}
