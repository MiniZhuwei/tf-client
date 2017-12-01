// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/config.proto

package org.tensorflow.framework;

public final class ConfigProtos {
  private ConfigProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GPUOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GPUOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_OptimizerOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_OptimizerOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GraphOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GraphOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_ThreadPoolOptionProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_ThreadPoolOptionProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_RPCOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_RPCOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_ConfigProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_ConfigProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_ConfigProto_DeviceCountEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_ConfigProto_DeviceCountEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_RunOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_RunOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_RunMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_RunMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%tensorflow/core/protobuf/config.proto\022" +
      "\ntensorflow\032*tensorflow/core/framework/c" +
      "ost_graph.proto\032%tensorflow/core/framewo" +
      "rk/graph.proto\032*tensorflow/core/framewor" +
      "k/step_stats.proto\032$tensorflow/core/prot" +
      "obuf/debug.proto\032&tensorflow/core/protob" +
      "uf/cluster.proto\032.tensorflow/core/protob" +
      "uf/rewriter_config.proto\"\211\002\n\nGPUOptions\022" +
      "\'\n\037per_process_gpu_memory_fraction\030\001 \001(\001" +
      "\022\026\n\016allocator_type\030\002 \001(\t\022\037\n\027deferred_del",
      "etion_bytes\030\003 \001(\003\022\024\n\014allow_growth\030\004 \001(\010\022" +
      "\033\n\023visible_device_list\030\005 \001(\t\022\"\n\032polling_" +
      "active_delay_usecs\030\006 \001(\005\022$\n\034polling_inac" +
      "tive_delay_msecs\030\007 \001(\005\022\034\n\024force_gpu_comp" +
      "atible\030\010 \001(\010\"\337\002\n\020OptimizerOptions\022+\n#do_" +
      "common_subexpression_elimination\030\001 \001(\010\022\033" +
      "\n\023do_constant_folding\030\002 \001(\010\022\034\n\024do_functi" +
      "on_inlining\030\004 \001(\010\0225\n\topt_level\030\003 \001(\0162\".t" +
      "ensorflow.OptimizerOptions.Level\022E\n\020glob" +
      "al_jit_level\030\005 \001(\0162+.tensorflow.Optimize",
      "rOptions.GlobalJitLevel\" \n\005Level\022\006\n\002L1\020\000" +
      "\022\017\n\002L0\020\377\377\377\377\377\377\377\377\377\001\"C\n\016GlobalJitLevel\022\013\n\007D" +
      "EFAULT\020\000\022\020\n\003OFF\020\377\377\377\377\377\377\377\377\377\001\022\010\n\004ON_1\020\001\022\010\n\004" +
      "ON_2\020\002\"\356\002\n\014GraphOptions\022\036\n\026enable_recv_s" +
      "cheduling\030\002 \001(\010\0227\n\021optimizer_options\030\003 \001" +
      "(\0132\034.tensorflow.OptimizerOptions\022\030\n\020buil" +
      "d_cost_model\030\004 \001(\003\022\036\n\026build_cost_model_a" +
      "fter\030\t \001(\003\022\024\n\014infer_shapes\030\005 \001(\010\022\032\n\022plac" +
      "e_pruned_graph\030\006 \001(\010\022 \n\030enable_bfloat16_" +
      "sendrecv\030\007 \001(\010\022\025\n\rtimeline_step\030\010 \001(\005\0223\n",
      "\017rewrite_options\030\n \001(\0132\032.tensorflow.Rewr" +
      "iterConfigJ\004\010\001\020\002R%skip_common_subexpress" +
      "ion_elimination\"A\n\025ThreadPoolOptionProto" +
      "\022\023\n\013num_threads\030\001 \001(\005\022\023\n\013global_name\030\002 \001" +
      "(\t\"2\n\nRPCOptions\022$\n\034use_rpc_for_inproces" +
      "s_master\030\001 \001(\010\"\376\004\n\013ConfigProto\022>\n\014device" +
      "_count\030\001 \003(\0132(.tensorflow.ConfigProto.De" +
      "viceCountEntry\022$\n\034intra_op_parallelism_t" +
      "hreads\030\002 \001(\005\022$\n\034inter_op_parallelism_thr" +
      "eads\030\005 \001(\005\022\037\n\027use_per_session_threads\030\t ",
      "\001(\010\022G\n\034session_inter_op_thread_pool\030\014 \003(" +
      "\0132!.tensorflow.ThreadPoolOptionProto\022\030\n\020" +
      "placement_period\030\003 \001(\005\022\026\n\016device_filters" +
      "\030\004 \003(\t\022+\n\013gpu_options\030\006 \001(\0132\026.tensorflow" +
      ".GPUOptions\022\034\n\024allow_soft_placement\030\007 \001(" +
      "\010\022\034\n\024log_device_placement\030\010 \001(\010\022/\n\rgraph" +
      "_options\030\n \001(\0132\030.tensorflow.GraphOptions" +
      "\022\037\n\027operation_timeout_in_ms\030\013 \001(\003\022+\n\013rpc" +
      "_options\030\r \001(\0132\026.tensorflow.RPCOptions\022+" +
      "\n\013cluster_def\030\016 \001(\0132\026.tensorflow.Cluster",
      "Def\0322\n\020DeviceCountEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005" +
      "value\030\002 \001(\005:\0028\001\"\245\002\n\nRunOptions\0226\n\013trace_" +
      "level\030\001 \001(\0162!.tensorflow.RunOptions.Trac" +
      "eLevel\022\025\n\rtimeout_in_ms\030\002 \001(\003\022\034\n\024inter_o" +
      "p_thread_pool\030\003 \001(\005\022\037\n\027output_partition_" +
      "graphs\030\005 \001(\010\022/\n\rdebug_options\030\006 \001(\0132\030.te" +
      "nsorflow.DebugOptions\"R\n\nTraceLevel\022\014\n\010N" +
      "O_TRACE\020\000\022\022\n\016SOFTWARE_TRACE\020\001\022\022\n\016HARDWAR" +
      "E_TRACE\020\002\022\016\n\nFULL_TRACE\020\003J\004\010\004\020\005\"\226\001\n\013RunM" +
      "etadata\022)\n\nstep_stats\030\001 \001(\0132\025.tensorflow",
      ".StepStats\022,\n\ncost_graph\030\002 \001(\0132\030.tensorf" +
      "low.CostGraphDef\022.\n\020partition_graphs\030\003 \003" +
      "(\0132\024.tensorflow.GraphDefB-\n\030org.tensorfl" +
      "ow.frameworkB\014ConfigProtosP\001\370\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.tensorflow.framework.CostGraphProtos.getDescriptor(),
          org.tensorflow.framework.GraphProtos.getDescriptor(),
          org.tensorflow.framework.StepStatsProtos.getDescriptor(),
          org.tensorflow.framework.DebugProtos.getDescriptor(),
          org.tensorflow.distruntime.ClusterProtos.getDescriptor(),
          org.tensorflow.framework.RewriterConfigProtos.getDescriptor(),
        }, assigner);
    internal_static_tensorflow_GPUOptions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_GPUOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GPUOptions_descriptor,
        new java.lang.String[] { "PerProcessGpuMemoryFraction", "AllocatorType", "DeferredDeletionBytes", "AllowGrowth", "VisibleDeviceList", "PollingActiveDelayUsecs", "PollingInactiveDelayMsecs", "ForceGpuCompatible", });
    internal_static_tensorflow_OptimizerOptions_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_OptimizerOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_OptimizerOptions_descriptor,
        new java.lang.String[] { "DoCommonSubexpressionElimination", "DoConstantFolding", "DoFunctionInlining", "OptLevel", "GlobalJitLevel", });
    internal_static_tensorflow_GraphOptions_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_GraphOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GraphOptions_descriptor,
        new java.lang.String[] { "EnableRecvScheduling", "OptimizerOptions", "BuildCostModel", "BuildCostModelAfter", "InferShapes", "PlacePrunedGraph", "EnableBfloat16Sendrecv", "TimelineStep", "RewriteOptions", });
    internal_static_tensorflow_ThreadPoolOptionProto_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tensorflow_ThreadPoolOptionProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_ThreadPoolOptionProto_descriptor,
        new java.lang.String[] { "NumThreads", "GlobalName", });
    internal_static_tensorflow_RPCOptions_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tensorflow_RPCOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_RPCOptions_descriptor,
        new java.lang.String[] { "UseRpcForInprocessMaster", });
    internal_static_tensorflow_ConfigProto_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_tensorflow_ConfigProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_ConfigProto_descriptor,
        new java.lang.String[] { "DeviceCount", "IntraOpParallelismThreads", "InterOpParallelismThreads", "UsePerSessionThreads", "SessionInterOpThreadPool", "PlacementPeriod", "DeviceFilters", "GpuOptions", "AllowSoftPlacement", "LogDevicePlacement", "GraphOptions", "OperationTimeoutInMs", "RpcOptions", "ClusterDef", });
    internal_static_tensorflow_ConfigProto_DeviceCountEntry_descriptor =
      internal_static_tensorflow_ConfigProto_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_ConfigProto_DeviceCountEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_ConfigProto_DeviceCountEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_RunOptions_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_tensorflow_RunOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_RunOptions_descriptor,
        new java.lang.String[] { "TraceLevel", "TimeoutInMs", "InterOpThreadPool", "OutputPartitionGraphs", "DebugOptions", });
    internal_static_tensorflow_RunMetadata_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_tensorflow_RunMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_RunMetadata_descriptor,
        new java.lang.String[] { "StepStats", "CostGraph", "PartitionGraphs", });
    org.tensorflow.framework.CostGraphProtos.getDescriptor();
    org.tensorflow.framework.GraphProtos.getDescriptor();
    org.tensorflow.framework.StepStatsProtos.getDescriptor();
    org.tensorflow.framework.DebugProtos.getDescriptor();
    org.tensorflow.distruntime.ClusterProtos.getDescriptor();
    org.tensorflow.framework.RewriterConfigProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
