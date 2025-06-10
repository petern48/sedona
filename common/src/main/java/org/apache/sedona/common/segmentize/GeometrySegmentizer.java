package org.apache.sedona.common.segmentize;

public class GeometrySegmentizer {
  public static Geometry[] segmentize(Geometry geometry, double maxSegmentLength) {
    return GeometrySegmentizer.segmentize(geometry, maxSegmentLength);
  }

  public static Geometry[] segmentize(Geometry geom, int maxSegmentLength) {
    if (geom == null) {
      return new Geometry[0];
    }
  }
}
    // return subDivideRecursive(geom, geom.getDimension(), maxVertices, 0, new Geometry[0]);