public class Point3D extends Point2D{
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] array2 = {super.getX(),super.getY(),getZ()};
        return array2;

    }

    public void setXYZ(float x,float y,float z) {
        super.setXY(x,y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                ", array= (" + getXYZ()[0] +"," +getXYZ()[1] +"," + getXYZ()[2] +
                ")}";
    }
}
