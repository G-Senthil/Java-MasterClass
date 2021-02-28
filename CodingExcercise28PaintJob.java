package Senthil.Java;

public class CodingExcercise28PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(0.75,0.75,0.5,0));
    }
    public static int getBucketCount(double width,double height,double  areaPerBucket, int extraBuckets){

       int bucketAreaTotal=0;
       double area;

        if ((width<=0)||(height <=0)||(areaPerBucket<=0)||(extraBuckets<0)){
            return -1;
        }else{
            area=width*height;
            area = Math.ceil((area/areaPerBucket));
            bucketAreaTotal=(int) (area);
        }return bucketAreaTotal-extraBuckets;
    }
    public static int getBucketCount(double width,double height,double  areaPerBucket){
        double area;
        int bucket;
        if ((width<=0)||(height <=0)||(areaPerBucket<=0)){
            return -1;
        }else{
            area=width*height;
            return getBucketCount(area,areaPerBucket);
        }
    }
    public static int getBucketCount(double area,double  areaPerBucket){
        int bucket;
        if ((area<=0)||(areaPerBucket<=0)){
            return -1;
        }else{
          bucket=(int)Math.ceil(area/areaPerBucket);
        }return bucket;
    }
}
