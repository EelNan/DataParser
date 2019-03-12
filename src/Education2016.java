public class Education2016 {
    private double noHighSchool;
    private double onlyHighSchool;
    private double someCollege;
    private double bachelorsOrMore;

    public Education2016(double noHighSchool, double onlyHighSchool, double someCollege, double bachelorsOrMore) {
        this.noHighSchool = noHighSchool;
        this.onlyHighSchool = onlyHighSchool;
        this.someCollege = someCollege;
        this.bachelorsOrMore = bachelorsOrMore;
    }

    public double getBachelorsOrMore() {
        return bachelorsOrMore;
    }

    public double getNoHighSchool() {
        return noHighSchool;
    }

    public double getOnlyHighSchool() {
        return onlyHighSchool;
    }

    public double getSomeCollege() {
        return someCollege;
    }

    public void setBachelorsOrMore(double bachelorsOrMore) {
        this.bachelorsOrMore = bachelorsOrMore;
    }

    public void setNoHighSchool(double noHighSchool) {
        this.noHighSchool = noHighSchool;
    }

    public void setOnlyHighSchool(double onlyHighSchool) {
        this.onlyHighSchool = onlyHighSchool;
    }

    public void setSomeCollege(double someCollege) {
        this.someCollege = someCollege;
    }
}
