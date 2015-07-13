/*
 *  Copyright 2015 LG CNS.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); 
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License. 
 */

package scouter.lang.counters;

public class CounterConstants {

	public final static String FAMILY_HOST = "host";
	public final static String FAMILY_JAVAEE = "javaee";
	public final static String FAMILY_DATABASE = "database";
	public final static String FAMILY_DATASOURCE = "datasource";
	public final static String FAMILY_REQUEST_PROCESS = "reqproc";
	public final static String FAMILY_MARIA = "maria";

	public final static String HOST = "host";
	public final static String WINDOWS = "windows";
	public final static String LINUX = "linux";
	public final static String OSX = "osx";
	public static final String AIX = "aix";
	public static final String HPUX = "hpux";
	
	public final static String JAVA = "java";
	public final static String TOMCAT = "tomcat";
	public final static String VERTX = "vertx";
	public final static String JBOSS = "jboss";
	public final static String JETTY = "jetty";

	public final static String DATASOURCE = "datasource";
	public final static String CONTEXT = "context";
	public final static String REQUESTPROCESS = "reqproc";

	public final static String MARIA_DB = "mariadb";
	public final static String MARIA_PLUGIN  = "mariaplugin";
	
	public final static String WAS_TPS            = "TPS";
	public final static String WAS_ACTIVE_SPEED   = "ActiveSpeed";
	public final static String WAS_ELAPSED_TIME   = "ElapsedTime";
	public final static String WAS_SERVICE_COUNT  = "ServiceCount";
	public final static String WAS_ERROR_RATE     = "ErrorRate";
	public final static String WAS_ACTIVE_SERVICE = "ActiveService";
	public final static String WAS_USER_5M = "User5M";
	
	public final static String JAVA_GC_COUNT        = "GcCount";
	public final static String JAVA_GC_TIME         = "GcTime";
	public final static String JAVA_HEAP_TOT_USAGE  = "HeapTotUsage";
	public final static String JAVA_HEAP_USED       = "HeapUsed";
	public final static String JAVA_CPU_TIME        = "CpuTime";
	
	public final static String REQUESTPROCESS_BYTES_RECEIVED    = "BytesReceived";
	public final static String REQUESTPROCESS_BYTES_SENT        = "BytesSent";
	public final static String REQUESTPROCESS_ERROR_COUNT       = "ErrorCount";
	public final static String REQUESTPROCESS_PROCESSING_TIME   = "ProcessingTime";
	public final static String REQUESTPROCESS_REQUEST_COUNT     = "RequestCount";
	
	public final static String CONTEXT_ACTIVE_SESSIONS      = "ActiveSessions";
	public final static String CONTEXT_SESSION_CREATE_RATE  = "SessionCreateRate";
	public final static String CONTEXT_SESSION_EXPIRED_RATE = "SessionExpiredRate";
	
	public final static String DATASOURCE_CONN_ACTIVE = "ConnActive";
	public final static String DATASOURCE_CONN_IDLE   = "ConnIdle";
	
	public final static String HOST_CPU       = "Cpu";
	public final static String HOST_MEM = "Mem";
	public final static String HOST_MEM_AVALIABLE = "MemA";
	public final static String HOST_MEM_USED = "MemU";
	public final static String HOST_MEM_TOTAL = "MemT";
	public final static String HOST_SWAP = "Swap";
	public final static String HOST_SWAP_USED = "SwapU";
	public final static String HOST_SWAP_TOTAL = "SwapT";
	public final static String HOST_READ_COUNT = "ReadCount";
	public final static String HOST_WRITE_COUNT = "WriteCount";
	public final static String HOST_READ_BYTES = "ReadBytes";
	public final static String HOST_WRITE_BYTES = "WriteBytes";
	public final static String HOST_READ_TIME = "ReadTime";
	public final static String HOST_WRITE_TIME = "WriteTime";
	
	public final static String REAL_TIME_ALL                 = "rt-all";
	public final static String REAL_TIME_TOTAL               = "rt-tot";
	public final static String TODAY_ALL                     = "td-all";
	public final static String TODAY_TOTAL                   = "td-tot";
	
	public final static String PAST_TIME_ALL                 = "pt-all";
	public final static String PAST_TIME_TOTAL               = "pt-tot";
	public final static String PAST_DATE_ALL                 = "pd-all";
	public final static String PAST_DATE_TOTAL               = "pd-tot";
	
	public final static String REAL_TIME                     = "rt";
	public final static String TODAY                         = "td";
	public final static String PAST_TIME                     = "pt";
	public final static String PAST_DATE                     = "pd";
	
	public final static String TOTAL_ACTIVE_SPEED            = "totactsp";
	public final static String  ACTIVE_EQ            				= "acteq";
	public final static String TRANX_REALTIME                = "txreal";
	public final static String TRANX_LOADTIME                = "txload";
	public final static String ACTIVE_THREAD_LIST            = "actthrli";
	public final static String TODAY_SERVICE_COUNT           = "tdservcnt";
	public final static String DAILY_SERVICE_COUNT           = "dservcnt";
	public final static String SERVICE_GROUP            				= "svcgrp";
	
	public final static String[] COUNTER_MENU_ARRAY = {REAL_TIME_ALL, REAL_TIME_TOTAL, TODAY_ALL, TODAY_TOTAL,
			PAST_TIME_ALL, PAST_TIME_TOTAL, PAST_DATE_ALL, PAST_DATE_TOTAL};

}