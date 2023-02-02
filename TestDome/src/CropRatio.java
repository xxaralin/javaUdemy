public class CropRatio {
    public class Segment {
        public static Areas areas(double r, double a) {
            double area=Math.PI*r*r;
            double segArea=((r*r)/2)*((a*(Math.PI)/180)-Math.sin(a*(Math.PI/180)));
            System.out.println(area+" "+segArea);
            Areas areass=new Areas(segArea,area-segArea);

            return areass;
        }

        public static class Areas {
            public final double inside, outside;

            public Areas(double inside, double outside) {
                this.inside = inside;
                this.outside = outside;
            }
        }


    }   public static void main(String[] args) {
        Segment.Areas areas = Segment.areas(10, 90);
        System.out.println("Areas: " + areas.inside + ", " + areas.outside);
    }
}