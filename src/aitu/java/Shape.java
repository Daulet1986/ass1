package aitu.java;

public class Shape {
    private double[][] points = new double[10][2];
    private int k=0;
    private double almostPerimeter = 0;
    private double sides[] = new double[10];
    private double fullPerimeter;

    public void addPoint(Point point){
        points[k][0] = point.getX();
        points[k][1] = point.getY();
        k++;
    }
    public double getPoints(int i, int j) {
        return points[i][j];
    }
    public double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }
    public double calculatePerimeter(){
        for(int i = 0; i<k-1; i++){
            double x1 = getPoints(i, 0);
            double y1 = getPoints(i, 1);
            double x2 = getPoints(i+1, 0);
            double y2 = getPoints(i+1, 1);
            almostPerimeter+=distance(x1, y1, x2, y2);
            sides[i] = distance(x1, y1, x2, y2);
        }
        double x1 = getPoints(0, 0);
        double y1 = getPoints(0, 1);
        double x2 = getPoints(k-1, 0);
        double y2 = getPoints(k-1, 1);
        double distanceZero = distance(x1, y1, x2, y2);
        sides[k-1] = distanceZero;
        fullPerimeter = almostPerimeter + distanceZero;
        return fullPerimeter;
    }

    public double LongSide(){
        for(int i=1;i<k;i++){
            if(sides[0]<sides[i]){
                sides[0]=sides[i];
            }
        }
        return sides[0];
    }

    public double AvLength(){
        return fullPerimeter / k;
    }
}