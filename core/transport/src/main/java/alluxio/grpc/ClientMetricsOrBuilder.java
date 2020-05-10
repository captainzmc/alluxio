// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/metric_master.proto

package alluxio.grpc;

public interface ClientMetricsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.metric.ClientMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string source = 1;</code>
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   * <code>optional string source = 1;</code>
   * @return The source.
   */
  java.lang.String getSource();
  /**
   * <code>optional string source = 1;</code>
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString
      getSourceBytes();

  /**
   * <code>repeated .alluxio.grpc.Metric metrics = 2;</code>
   */
  java.util.List<alluxio.grpc.Metric> 
      getMetricsList();
  /**
   * <code>repeated .alluxio.grpc.Metric metrics = 2;</code>
   */
  alluxio.grpc.Metric getMetrics(int index);
  /**
   * <code>repeated .alluxio.grpc.Metric metrics = 2;</code>
   */
  int getMetricsCount();
  /**
   * <code>repeated .alluxio.grpc.Metric metrics = 2;</code>
   */
  java.util.List<? extends alluxio.grpc.MetricOrBuilder> 
      getMetricsOrBuilderList();
  /**
   * <code>repeated .alluxio.grpc.Metric metrics = 2;</code>
   */
  alluxio.grpc.MetricOrBuilder getMetricsOrBuilder(
      int index);
}