package S5_Control_Flow_Statements;

public class Coding17_PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        double sumOfArea;
        int sumOfBuckets;

        if (width <= 0.0 || height <= 0.0 || areaPerBucket <= 0.0 || extraBuckets < 0) {
            return -1;
        } else {
            sumOfArea = width * height;
            sumOfBuckets = (int) (Math.ceil(sumOfArea / areaPerBucket));
        }
        return (sumOfBuckets - extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        double sumOfArea;
        int sumOfBuckets;
        if (width <= 0.0 || height <= 0.0 || areaPerBucket <= 0.0) {
            return -1;
        } else {
            sumOfArea = width * height;
            sumOfBuckets = (int) (Math.ceil(sumOfArea / areaPerBucket));
        }
        return sumOfBuckets;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        int countOfBuckets;

        if (area <= 0.0 || areaPerBucket <= 0.0) {
            return -1;
        } else {
            countOfBuckets = (int) (Math.ceil(area / areaPerBucket));
        }

        return countOfBuckets;
    }


    public static void main(String[] args) {
        System.out.println(getBucketCount(0.0, 2.1, 1.5, 7));
    }
}