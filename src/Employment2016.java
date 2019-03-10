public class Employment2016 {
    private int totalLaborForce;
    private int employedLaborForce;
    private int unemployedLaborForce;
    private double unemployedPercent;

    public Employment2016(int totalLaborForce, int employedLaborForce, int unemployedLaborForce, double unemployedPercent) {
        this.totalLaborForce = totalLaborForce;
        this.employedLaborForce = employedLaborForce;
        this.unemployedLaborForce = unemployedLaborForce;
        this.unemployedPercent = unemployedPercent;
    }

    public double getUnemployedPercent() {
        return unemployedPercent;
    }

    public int getEmployedLaborForce() {
        return employedLaborForce;
    }

    public int getTotalLaborForce() {
        return totalLaborForce;
    }

    public int getUnemployedLaborForce() {
        return unemployedLaborForce;
    }

    public void setEmployedLaborForce(int employedLaborForce) {
        this.employedLaborForce = employedLaborForce;
    }

    public void setTotalLaborForce(int totalLaborForce) {
        this.totalLaborForce = totalLaborForce;
    }

    public void setUnemployedLaborForce(int unemployedLaborForce) {
        this.unemployedLaborForce = unemployedLaborForce;
    }

    public void setUnemployedPercent(double unemployedPercent) {
        this.unemployedPercent = unemployedPercent;
    }
}
