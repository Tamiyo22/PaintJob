public class PaintJob {

    public static int getBucketCount(double width, double height,double areaPerBucket, int extraBuckets){

        if((width <= 0) || (height <= 0) || (areaPerBucket <=0) || (extraBuckets < 0)){
    return -1;
        }

        double area = (width * height);
        double totalBucketsNeeded = (area/areaPerBucket);
        double bucketsAfterSupplyCount = (Math.ceil((double)totalBucketsNeeded) - Math.ceil((double)extraBuckets));
       int finalCount = (int)bucketsAfterSupplyCount;

return finalCount;

    }

//part 2
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if((width <= 0) || (height <= 0) || (areaPerBucket <=0)){
            return -1;
        } else {
           return (getBucketCount(width, height, areaPerBucket,1) + 1);
        }

    }
//part 3
public static int getBucketCount(double area , double areaPerBucket){
        if( area <= 0  || areaPerBucket <= 0){
            return -1;
        } else {
            double total = Math.ceil(area/areaPerBucket);
            return (int)total;
        }
}


}
