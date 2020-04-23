public class Main {
    public static void main(String[] args) {

        System.out.println(PaintJob.getBucketCount(-3.4,2.1,1.5,2));
        //expected be -1
        System.out.println(PaintJob.getBucketCount(3.4,2.1,1.5,2));
        //expected 3
        System.out.println(PaintJob.getBucketCount(2.75,3.25,2.5,1));
        // expected 3
        //part 2
        System.out.println(PaintJob.getBucketCount(-3.4,2.1,1.5));
        //expected -1
        System.out.println(PaintJob.getBucketCount(3.4,2.1,1.5));
        //expected 5
        System.out.println(PaintJob.getBucketCount(7.25,4.3,2.35));
        //expected 14
       //part 3
        System.out.println(PaintJob.getBucketCount(3.4,1.5));
        //expected 3
        System.out.println(PaintJob.getBucketCount(6.26,2.2));
          //expected 3
        System.out.println(PaintJob.getBucketCount(3.26,0.75));
        //expected 5
        System.out.println(PaintJob.getBucketCount(0.75,0.75,0.5,0));
        //expected 2

    }
}
