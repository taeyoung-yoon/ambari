/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ambari.server.controller;

import org.apache.ambari.server.actionmanager.HostRoleCommand;

public class ShortTaskStatus {
  protected long requestId;
  protected long taskId;
  protected long stageId;
  protected String hostName;
  protected String role;
  protected String command;
  protected String status;
  protected String customCommandName;
  protected String outputLog;
  protected String errorLog;

  public ShortTaskStatus() {
  }

  public ShortTaskStatus(int taskId, long stageId, String hostName, String role, String command, String status,
                         String customCommandName, String outputLog, String errorLog) {
    this.taskId = taskId;
    this.stageId = stageId;
    this.hostName = hostName;
    this.role = role;
    this.command = command;
    this.status = status;
    this.customCommandName = customCommandName;
    this.outputLog = outputLog;
    this.errorLog = errorLog;
  }

  public ShortTaskStatus(HostRoleCommand hostRoleCommand) {
    this.taskId = hostRoleCommand.getTaskId();
    this.stageId = hostRoleCommand.getStageId();
    this.command = hostRoleCommand.getRoleCommand().toString();
    this.hostName = hostRoleCommand.getHostName();
    this.role = hostRoleCommand.getRole().toString();
    this.status = hostRoleCommand.getStatus().toString();
    this.customCommandName = hostRoleCommand.getCustomCommandName();
    this.outputLog = hostRoleCommand.getOutputLog();
    this.errorLog = hostRoleCommand.getErrorLog();
  }

  public void setRequestId(long requestId) {
    this.requestId = requestId;
  }

  public long getRequestId() {
    return requestId;
  }

  public String getCustomCommandName() {
    return customCommandName;
  }

  public void setCustomCommandName(String customCommandName) {
    this.customCommandName = customCommandName;
  }

  public long getTaskId() {
    return taskId;
  }

  public void setTaskId(long taskId) {
    this.taskId = taskId;
  }

  public long getStageId() {
    return stageId;
  }

  public void setStageId(long stageId) {
    this.stageId = stageId;
  }

  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }

  public String getOutputLog() {
    return outputLog;
  }

  public void setOutputLog(String outputLog) {
    this.outputLog = outputLog;
  }

  public String getErrorLog() {
    return errorLog;
  }

  public void setErrorLog(String errorLog) {
    this.errorLog = errorLog;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("ShortTaskStatusDump "
        + ", stageId=" + stageId
        + ", taskId=" + taskId
        + ", hostname=" + hostName
        + ", role=" + role
        + ", command=" + command
        + ", status=" + status
        + ", outputLog=" + outputLog
        + ", errorLog=" + errorLog
    );
    return sb.toString();
  }

}
